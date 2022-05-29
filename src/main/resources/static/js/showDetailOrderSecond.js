$(function () {
    $(".btn-settleAccounts").click(function () {
        var GoodsId = new Array();

        $.each($('input:checked'), function (k, v) {
            // alert($(this).siblings(".cart-title").data("gid"));
            GoodsId.push($(this).siblings(".cart-title").data("gid"));
        });
        //

        $.ajax({
            type: "get",
            url: "/pushOrderFinally",
            xhrFields: {withCredentials: true},
            data: {"GoodsIdToOrderFin": JSON.stringify(GoodsId)},

            success: function (data) {
                alert();
                $(document.body).html(data);
            },
            error(data) {
                // alert("");
            }
        });

    });
});