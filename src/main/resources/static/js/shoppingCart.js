$(function () {
    $(".btn-del-cart").click(function () {
        var delCartGoodsL = new Array();

        $.each($('input:checked'), function (k, v) {
            // alert($(this).siblings(".cart-title").data("gid"));
            delCartGoodsL.push($(this).siblings(".cart-title").data("gid"));
        });

        console.log(delCartGoodsL);
        $.ajax({
            type: "get",
            url: "/delCartAGoods",
            data: {"delCartGoodsList": JSON.stringify(delCartGoodsL)},
            dataType: "JSON",
            success: function (data) {
                alert("取消成功！");
                window.location.reload();
            },
            error(data) {
                alert("data.wrong");
            }
        })
    });


    $(".btn-settleAccount").click(function () {
            alert("get");
            var GoodsId = new Array();

            $.each($('input:checked'), function (k, v) {
                alert($(this).siblings(".cart-title").data("gid"));
                GoodsId.push($(this).siblings(".cart-title").data("gid"));
            });
            //

            $.ajax({
                type: "get",
                url: "/pushOrderFst",
                xhrFields: {withCredentials: true},
                data: {"GoodsIdToOrder": JSON.stringify(GoodsId)},

                success: function (data) {
                    alert();
                    $(document.body).html(data);
                },
                error(data) {
                    alert("1");
                }
            });

        // $.ajax({
        //     type: "get",
        //     url: "/pushOrderFst",
        //     xhrFields: {withCredentials: true},
        //     data: {"GoodsIdToOrder": JSON.stringify(GoodsId)},
        //     success: function (data) {
        //         alert();
        //         $(document.body).html(data);
        //     },
        //     error(data) {
        //         alert("1");
        //     }
        // });
    });
});