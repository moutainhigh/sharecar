package com.dower.product.utils;

import com.alibaba.fastjson.JSONObject;

/**
 * @param
 * @Author: wangwei
 * @Description:
 * @Date: Created in 21:55   2018/7/25
 */

public class CommUtil {
    public synchronized static String getVcRouteNo(){

        return "RN"+System.currentTimeMillis();
    }

    public  static void main(String[] args) {
        Object o = "10";
        System.out.println(Integer.parseInt(o.toString()));
    }

    /**
     * 生成商户订单编号
     * @return
     */
    public static String getOrderNo(JSONObject seatDetail){


        //订单id（用户座位关系id一一对应）
        //String NUM_ORDER_ID = seatDetail.getString("NUM_ORDER_ID");
        //用户座位关系id
        String NUM_NNT_USER_JOURNEY_ID = seatDetail.getString("NUM_NNT_USER_JOURNEY_ID");
        //司机发布的行程id
        String NUM_ROUTE_ID = seatDetail.getString("NUM_ROUTE_ID");
        //开始城市id
        String start_city_id = seatDetail.getString("start_city_id");
        //结束城市id
        String end_city_id = seatDetail.getString("end_city_id");
        //司机用户id
        String NUM_USER_ID = seatDetail.getString("NUM_USER_ID");

        String orderNo = "PC"+autoGenericCode(NUM_NNT_USER_JOURNEY_ID,6)
                +autoGenericCode(NUM_ROUTE_ID,6)
                +autoGenericCode(start_city_id,3)
                +autoGenericCode(end_city_id,3)
                +autoGenericCode(NUM_USER_ID,4)
                +String.valueOf(System.currentTimeMillis()).substring(8);
        return orderNo;
    }

    /**
     * 不够位数的在前面补0，保留num的长度位数字
     * @param code
     * @return
     */
    public static String autoGenericCode(String code, int num) {
        String result = "";
        result = String.format("%0" + num + "d", Integer.parseInt(code) + 1);

        return result;
    }
}
