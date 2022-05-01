$(function () {
    $(".btn-del-cart").click(function () {
        var delCartGoodsL = new Array();

        $.each($('input:checked'),function (k,v) {
            alert($(this).siblings(".cart-title").data("gid"));
            delCartGoodsL.push($(this).siblings(".cart-title").data("gid"));
        });

        console.log(delCartGoodsL);
        alert();
        $.ajax({
            type:"get",
            url:"/delCartAGoods",
            data:{"delCartGoodsList": JSON.stringify(delCartGoodsL)},
            dataType:"JSON",
            success:function (data) {
                alert("取消成功！");
                window.location.reload();
            },
            error(data){
                // alert(data.message);
            }
        })
    });


    $(".btn-settleAccount").click(function () {
        alert("get");
        var GoodsId = new Array();

        $.each($('input:checked'),function (k,v) {
            alert($(this).siblings(".cart-title").data("gid"));
            GoodsId.push($(this).siblings(".cart-title").data("gid"));
        });
        //
        console.log(GoodsId);
        alert();
        // $.ajax({
        //     type: "get",
        //
        //
        // })
    });
});