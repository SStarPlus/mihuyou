$(function () {
    $(".ATCart").click(function () {

        var GoodsId = $(".hideD").data("gid");
        var Num = $(".Detail-num-main").val();


        alert("加入购物车成功");
        $.ajax({
            type: "get",
            url: "/ATShopCart",
            dataType: "json",
            data: {"GoodsId": GoodsId,"Num":Num},

            success:function (data) {
                window.location.reload();
            },
        })
    })

    $(".d-4-2").click(function () {
        this.style.border="1px solid red";
    })
});