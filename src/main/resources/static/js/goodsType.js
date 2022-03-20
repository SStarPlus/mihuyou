$(function () {
    // $(".test-btn").click(function () {
    //     alert("进入");
    //     $.ajax({
    //         type:"GET",
    //         url:"/backInfo",
    //         dataType:"json",
    //         success:function (data) {
    //             alert("成功");
    //             alert(data.message);
    //         }
    //     })
    // })

    $(".goods-type-del").click(function () {
        if(window.confirm("你确定要删除吗？")){
            var goodsTypeId = $(this).closest("tr").find(".goods-type-id").text();
            $.ajax({
                type:"GET",
                url:"/confirmRemoveGoodsType",
                dataType:"json",
                data:{"GoodsTypeId": goodsTypeId},
                success:function (data) {
                    alert("删除成功！");
                }
            })
        }else {

        }
    })
})