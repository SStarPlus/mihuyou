$(function () {
    // 验证码
    var checkCode="";

    $("#get-mailBox-verify").click(function () {
        var email = $("#email").val();
        alert(email);
        if(email == null || email == ""){
            alert("请输入邮箱！！！");
            return;
        }

        $.ajax({
            url:"/getCheckCode?email="+email,
            type:"get",
            success:function (text) {
                if(text != null && text != ""){
                    alert("已发送！");
                    checkCode = text;
                    countDown();
                }else {
                    alert("获取失败！");
                }
            }
        })
    })

    var maxTime =60;
    function countDown() {
        if(maxTime == 0){
            checkCode = "";
            $("#get-mailBox-verify").html("获取验证码");
        }else {
            $("#get-mailBox-verify").html(maxTime+"秒后重新获取");
            maxTime--;
            setTimeout(countDown,1000);
        }
    }

    $("#registration-confirm-btn").click(function () {
        var inputVerifyCode = $("#input-mailBox-verifyCode").val();
        if(inputVerifyCode == checkCode){
            $("#verify-result").val("1");
        }
    })
})