$(function () {
    personalCenter.init();
})
var personalCenter = {
    init:function () {
        util.checkToken();
        $(".orderIcon").click(function () {
            location.href= ctxPath + 'jump/weichat/orderList';
        })
        personalCenter.getUserInfo();
    },
    getUserInfo:function () {

        var userId = getQueryString("userId");
        var openId = getQueryString("openId");
        sessionStorage['openId'] = openId;
        var param = {
            'userId':userId
        }
        param.timeStamp = util.createTimeStamp();
        $.ajax({
            type: 'POST',
            url: ctxPath + "securityService/getUserInfo",
            timeout:8000,
            data : param,
            headers: util.initHeaders(param),
            contentType: 'application/json',
            dataType: 'json',
            success: function(data){
                console.log("==========="+JSON.stringify(data));
                if(data.code==200){
                    var userInfo = data.data;
                    var VC_HEAD_IMG_URL = userInfo.VC_HEAD_IMG_URL;
                    $("#VC_HEAD_IMG_URL").attr("src",VC_HEAD_IMG_URL);
                    var VC_NICKNAME = userInfo.VC_NICKNAME;
                    $("#VC_NICKNAME").html(VC_NICKNAME);
                    sessionStorage["userInfo"] = JSON.stringify(userInfo);
                }else {
                    mui.toast(data.msg);
                }
            },
            error: function(xhr, type){
            }
        });
    }
}