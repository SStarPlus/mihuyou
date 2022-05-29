$(function () {
    $(".unPaidUrl").click(function () {
        $.ajax({
            type: "get",
            url: "/showUnpaid",
            xhrFields: {withCredentials: true},
            success: function (data) {
                $(document.body).html(data);
            },
        });
    });

    $(".myOrder").click(function () {
        $.ajax({
            type: "get",
            url:"/ShowOrder",
            xhrFields: {withCredentials: true},
            success: function (data) {
                // alert();
                $(document.body).html(data);
            },
        })
    });

    $(".cancelOrder").click(function () {
        // alert();
        var GoodsId;
        GoodsId = $(this).parents(".cart-oprate").siblings(".cart-title").data("gid");
        // alert(GoodsId);
        $.ajax({
            type:"get",
            url:"/cancelOrder",
            data: {"GoodsId": JSON.stringify(GoodsId)},
            xhrFields: {withCredentials: true},
            success: function (data) {
                // alert();
                $(document.body).html(data);
            },
            error(data) {
                // alert("1");
            }
        })
    });

    $(".goPaid").click(function () {
        alert();
        var GoodsId;
        GoodsId = $(this).parents(".cart-oprate").siblings(".cart-title").data("gid");
        alert(GoodsId);
        $.ajax({
            type:"get",
            url:"/PayForOrder",
            data: {"GoodsId": JSON.stringify(GoodsId)},
            xhrFields: {withCredentials: true},
            success: function (data) {
                alert();
                $(document.body).html(data);
            },
            error(data) {
                alert("1");
            }
        })
    });
});