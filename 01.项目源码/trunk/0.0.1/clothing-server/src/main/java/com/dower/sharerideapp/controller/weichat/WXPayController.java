package com.dower.sharerideapp.controller.weichat;

import com.alibaba.fastjson.JSONObject;
import com.dower.sharerideapp.core.serverdb.model.ClProduct;
import com.dower.sharerideapp.core.serverdb.model.NntOrder;
import com.dower.sharerideapp.domain.config.weixin.sdk.MyConfig;
import com.dower.sharerideapp.domain.config.weixin.WeixinConfig;
import com.dower.sharerideapp.domain.config.weixin.sdk.WXPay;
import com.dower.sharerideapp.domain.config.weixin.sdk.WXPayConstants;
import com.dower.sharerideapp.domain.config.weixin.sdk.WXPayUtil;
import com.dower.sharerideapp.service.SeatExtService;
import com.dower.sharerideapp.service.clothing.ClothingService;
import com.dower.sharerideapp.service.payment.PaymentService;
import com.dower.sharerideapp.utils.CommUtil;
import com.dower.sharerideapp.utils.DateUtils;
import com.dower.sharerideapp.utils.Result;
import com.dower.sharerideapp.utils.ret.RetResult;
import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * @param
 * @Author: wangwei
 * @Description:
 * @Date: Created in 16:52   2018/7/17
 */
@Slf4j
@RequestMapping("/weichat")
@RestController
public class WXPayController {
    @Autowired
    SeatExtService seatService;
    @Autowired
    WeixinConfig weixinConfig;
    @Autowired
    ClothingService clothingService;
    @Autowired
    PaymentService paymentService;
    @RequestMapping("/notify")
    public String notify(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String result;//返回给微信的处理结果
        String inputLine;
        String notityXml = "";
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        response.setHeader("Access-Control-Allow-Origin", "*");
        //微信给返回的东西
        try {
            while ((inputLine = request.getReader().readLine()) != null) {
                notityXml += inputLine;
            }
            request.getReader().close();
        } catch (Exception e) {
            e.printStackTrace();
            result = setXml("fail","xml获取失败");
        }
        if (StringUtils.isEmpty(notityXml)) {
            result = setXml("fail","xml为空");
        }


        MyConfig config = new MyConfig();
        WXPay wxpay = new WXPay(config);
        //WXPay wxpay = new WXPay(config,WXPayConstants.SignType.MD5, true);
        //notityXml = "<xml><appid><![CDATA[wx9e9b0787da65bc0f]]></appid><bank_type><![CDATA[OTHERS]]></bank_type><cash_fee><![CDATA[100]]></cash_fee><fee_type><![CDATA[CNY]]></fee_type><is_subscribe><![CDATA[Y]]></is_subscribe><mch_id><![CDATA[1601077297]]></mch_id><nonce_str><![CDATA[uld1fryE3i25VGNlKn0JnEvs5PQQVRLd]]></nonce_str><openid><![CDATA[oQy89v0fihIxc5cjkNVTkwVlUWds]]></openid><out_trade_no><![CDATA[CU0729211649089]]></out_trade_no><result_code><![CDATA[SUCCESS]]></result_code><return_code><![CDATA[SUCCESS]]></return_code><sign><![CDATA[6DDBFD240C2982D8F8B23FE827E2BCFEA7E18FA91A0A2FA9261C4C113FD7DCD0]]></sign><time_end><![CDATA[20200729212214]]></time_end><total_fee>100</total_fee><trade_type><![CDATA[JSAPI]]></trade_type><transaction_id><![CDATA[4200000715202007290651302542]]></transaction_id></xml>";
        log.info("微信支付异步回调 reqXml="+notityXml);
        Map<String, String> notifyMap = WXPayUtil.xmlToMap(notityXml);  // 转换成map
        String out_trade_no = notifyMap.get("out_trade_no");
        //微信支付订单号：transaction_id
        String transaction_id = notifyMap.get("transaction_id");
        log.info("微信支付异步回调:1、微信订单号："+transaction_id+"；2、商户订单号："+out_trade_no+";notifyMap="+notifyMap);
        if (wxpay.isPayResultNotifySignatureValid(notifyMap)) {
            log.info("微信支付异步回调签名验证成功！");
            JSONObject params = new JSONObject();
            params.put("vcOrderNo",out_trade_no);
            params.put("transaction_id",transaction_id);
            RetResult retResult = paymentService.updataPaymentResult(params);
            if(retResult.code==200){
                result = setXml("SUCCESS", "OK");
                log.info("***微信支付异步回调结果：：SUCCESS");
            }else {
                result = setXml("fail", retResult.getMsg());
                log.info("***微信支付异步回调结果：：{}",retResult.getMsg());
            }
        } else {
            log.info("微信支付异步回调签名验证失败！");
            result = setXml("fail", "签名不一致！");
        }



        log.info("----返回给微信的xml：" + result);

        return result;
    }

    /**
     * params
     * 1.订单id
     * 2.用户id
     * 3.商品金额
     * 4.实付金额
     * 5.优惠金额
     * 6.余额抵扣金额
     * 7.优惠券id
     * 8.团购id
     * 9.砍价id
     * @param numId
     * @param openId
     * @param request
     * @param response
     * @return
     */
    @RequestMapping("/wxpay")
    public Map<String, String> wxpay(String numId,String openId,HttpServletRequest request, HttpServletResponse response) {
        Map<String, String> resp = new HashMap<>();
        Map<String, String> resultMap = new HashMap<String, String>();
        try {

            JSONObject params = new JSONObject();
            params.put("numId",numId);
            Result clothing = clothingService.getClothing(params.toJSONString());
            //根据orderId，查询记录详情。
            //订单支付状态
            /**
             * 一.待支付状态,
             * 1.调取订单预支付接口生产预支付单
             * 2.调取微信统一下单接口
             * 3.生成微信支付流水
             * 4.更新订单状态为预支付状态
             * 二.预支付状态
             * 1.调取微信统一下单接口
             */
            if(clothing.success){
                ClProduct cloth = (ClProduct) clothing.getResultInfo();
                String vcExpireTime = cloth.getVcExpireTime();
                String vcOrderNo = cloth.getVcOrderNo();
                Long numPrice = cloth.getNumPrice();

                MyConfig config = new MyConfig();
                WXPay wxpay = new WXPay(config);

                Map<String, String> data = new HashMap<String, String>();
                data.put("body", weixinConfig.body);
                data.put("out_trade_no", vcOrderNo);
                data.put("fee_type", weixinConfig.feeType);
                //data.put("total_fee", String.valueOf(numPrice.longValue()*100));
                data.put("total_fee", "1");
                data.put("spbill_create_ip", weixinConfig.spbillCreateIp);
                data.put("notify_url", weixinConfig.notifyrl);
                data.put("trade_type", weixinConfig.tradeType);  // 此处指定为公众号支付
                data.put("openid", openId);
                if(org.apache.commons.lang3.StringUtils.isBlank(vcExpireTime)){
                    String expireTime = DateUtils.getExpireTime();
                    data.put("time_expire", expireTime);
                    JSONObject paramJson = new JSONObject();
                    paramJson.put("NUM_ID",numId);
                    paramJson.put("VC_EXPIRE_TIME",expireTime);
                    Result result = clothingService.updateProduct(paramJson.toString());
                    log.info("微信支付更新time_expire结果:：{}",JSONObject.toJSON(result) );
                }
                resp = wxpay.unifiedOrder(data);
                log.info("微信支付模拟resultMap:：{}",JSONObject.toJSON(resp) );

                if(resp.containsKey("return_code")){
                    String return_code = String.valueOf(resp.get("return_code"));
                    if ("SUCCESS".equals(return_code)){
                        resultMap.put("appId",config.getAppID());
                        resultMap.put("timeStamp",System.currentTimeMillis()/1000+"");
                        resultMap.put("nonceStr", WXPayUtil.generateNonceStr());
                        resultMap.put("package", "prepay_id="+resp.get("prepay_id"));
                        resultMap.put("signType", "HMAC-SHA256");
                        resultMap.put("paySign",  WXPayUtil.generateSignature(resultMap, config.getKey(), WXPayConstants.SignType.HMACSHA256));
                    }
                }else {
                    throw new Exception(String.format(resp.toString()));
                }
                System.out.println("微信支付模拟resultMap="+resultMap);
            }else {
                return resultMap;
            }



        } catch (Exception e) {
            e.printStackTrace();
        }


        log.info("微信支付模拟测试结束。");
        return resultMap;
    }


    //通过xml 发给微信消息
    public static String setXml(String return_code, String return_msg) {
        SortedMap<String, String> parameters = new TreeMap<String, String>();
        parameters.put("return_code", return_code);
        parameters.put("return_msg", return_msg);
        return "<xml><return_code><![CDATA[" + return_code + "]]>" +
                "</return_code><return_msg><![CDATA[" + return_msg + "]]></return_msg></xml>";
    }

    public static void main(String[] args) throws Exception {



        MyConfig config = new MyConfig();
        WXPay wxpay = new WXPay(config);

        Map<String, String> data = new HashMap<String, String>();
        data.put("body", "王伟平车费用！");
        data.put("out_trade_no", "2016090910595900000012");
        data.put("device_info", "");
        data.put("fee_type", "CNY");
        data.put("total_fee", "1");
        data.put("spbill_create_ip", "59.110.243.138");
        data.put("notify_url", "http://demo.doweryouxia.com/shareride-app/");
        data.put("trade_type", "JSAPI");  // 此处指定为公众号支付
        data.put("openid", "o_1At0Te0Bq3R0VDOkGV6qrOay60");

        try {
            Map<String, String> resp = wxpay.unifiedOrder(data);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
