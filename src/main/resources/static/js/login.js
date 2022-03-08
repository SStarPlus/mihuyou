$(function () {
    // 鼠标经过注册按钮时按钮边框变化
    $(".login-registration-btn-input").hover(function () {
        $(this).css("border-color", "#2ca5fc");
    }, function () {
        $(this).css("border-color", "#1d93fc");
    })
    // 鼠标经过登录按钮时按钮颜色变化
    $(".login-submit-btn-input").hover(function () {
        $(this).css("background-color", "#2ca5fc");
    }, function () {
        $(this).css("background-color", "#1d93fc");
    })
    // 鼠标经过人脸识别按钮时按钮颜色变化
    $(".login-face-recognition-btn-input").hover(function () {
        $(this).css("background-color", "#2ca5fc");
    }, function () {
        $(this).css("background-color", "#1d93fc");
    })

    // 用户和管理员登陆界面切换js
    $("#user-login-swap-btn").click(function () {
        // 界面变化
        $(".login-user-box").css("display", "block");
        $(".login-manager-box").css("display", "none");
        // 点击的部分颜色变黑
        $("#user-login-swap-btn").css("color", "black");
        $("#manager-login-swap-btn").css("color", "#525153");
    })

    $("#manager-login-swap-btn").click(function () {
        // 界面变化
        $(".login-user-box").css("display", "none");
        $(".login-manager-box").css("display", "block");
        // 点击的部分颜色变黑
        $("#user-login-swap-btn").css("color", "#525153");
        $("#manager-login-swap-btn").css("color", "black");
    })

    // 点击输入框时对应的box边框边明显
    $("#user-num-input").focus(function () {
        $("#user-num-box").css("border-color", "black");
    })
    $("#user-num-input").blur(function () {
        $("#user-num-box").css("border-color", "#6b6b6b");
    })

    $("#user-pwd-input").focus(function () {
        $("#user-pwd-box").css("border-color", "black");
    })
    $("#user-pwd-input").blur(function () {
        $("#user-pwd-box").css("border-color", "#6b6b6b");
    })

    $("#user-verify-input").focus(function () {
        $("#user-verify-box").css("border-color", "black");
    })
    $("#user-verify-input").blur(function () {
        $("#user-verify-box").css("border-color", "#6b6b6b");
    })

    $("#manager-num-input").focus(function () {
        $("#manager-num-box").css("border-color", "black");
    })
    $("#manager-num-input").blur(function () {
        $("#manager-num-box").css("border-color", "#6b6b6b");
    })

    // 点击注册按钮跳转至注册页面
    $(".login-registration-btn-input").click(function () {
        alert();
        window.location.href='/user_registration';
    })
})