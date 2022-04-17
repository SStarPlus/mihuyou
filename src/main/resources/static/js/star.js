$(function () {
    // 以下为商品搜索页面收藏功能js

    // 点击收藏
    $(".star").click(function () {
        var starGoodId = $(this).data("gid");
        var mySelf = $(this);
        $.ajax({
            type:"get",
            url:"/starAGood",
            dataType:"json",
            data:{"StarGoodId": starGoodId},
            success:function (data) {
                // 收藏隐藏，取消收藏显示
                var show = mySelf.css('display');
                mySelf.css("display", show=='block'?'none':show);
                mySelf.siblings(".cancel-star").css('display', 'block');
            },
            error:function (data) {
                // alert(data.message);
            }
        })
    })
    // 点击取消收藏
    $(".cancel-star").click(function () {
        var cancelStarGoodId = $(this).data("gid");
        var mySelf = $(this);
        $.ajax({
            type:"get",
            url:"/cancelStarAGood",
            dataType:"json",
            data:{"CancelStarGoodId": cancelStarGoodId},
            success:function (data) {
                alert("取消收藏成功！");
                // 取消收藏隐藏，收藏显示
                var show = mySelf.css("display");
                mySelf.css("display", show=='block'?'none':show);
                mySelf.siblings(".star").css('display', 'block');
            },
            error(data){
                // alert(data.message);
            }
        })
    })

    // 以下为收藏详情页面收藏js


    $(".star-page-cancel-star").click(function () {
        var cancelStarGoodId = $(this).data("gid");
        $.ajax({
            type:"get",
            url:"/cancelStarAGood",
            dataType:"json",
            data:{"CancelStarGoodId": cancelStarGoodId},
            success:function (data) {
                alert("取消收藏成功！");
                // 刷新网页
                window.location.reload();
            },
            error(data){
                // alert(data.message);
            }
        })
    })

    $(".fast-cancel-star-btn").click(function () {
        $(".item-check").css("display", "block");
    })

    $(".item-mask").click(function () {
        if($(this).siblings("i").hasClass("z-item-checked")){
            $(this).siblings("i").removeClass("z-item-checked");
            $(this).siblings("i").css("background-color", "#2b2b2b");
        }else {
            $(this).siblings("i").addClass("z-item-checked");
            $(this).siblings("i").css("background-color", "rgba(255, 0, 9, 0.67)");
        }
    })

    $(".confirm-fast-cancel-star-btn").click(function () {
        var cancelStarList = new Array();
        var obj = $(".z-item-checked");
        for (var i = 0; i < obj.length; i++) {
            cancelStarList[i] = $(".z-item-checked:eq(" + i + ")").data("gid");
        }
        console.log(cancelStarList);

        $.ajax({
                type:"get",
                url:"/cancelStarGoods",
                data:{"CancelStarGoodIdList": JSON.stringify(cancelStarList)},
                dataType:"JSON",
            success:function (data) {
                alert("取消收藏成功！");
                window.location.reload();
            },
            error(data){
                // alert(data.message);
            }
        })
    })
})