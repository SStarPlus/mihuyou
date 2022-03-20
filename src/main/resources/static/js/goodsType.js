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

    // 商品类型删除按钮交互及将删除请求发送至后台
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
                    // window.location.href = "/removeGoodsType";
                    var url = 'updateGoodsTypeList';
                    $('.whole-page').load(url);
                }
            })
        }else {

        }
    })
    // 编辑dialog配置
    $("#edit-goodsType-dialog").dialog({
        autoOpen:false,
        title:"编辑商品类型信息",
        buttons:{
            "确认":function () {

                var GoodsTypeId = $(".edit-goodsTypeId").val();
                var GoodsTypeName = $(".edit-goodsTypeName").val();
                $.ajax({
                    type:"POST",
                    url:"/confirmEditGoodsType",
                    dataType:"json",
                    data:{"GoodsTypeId": GoodsTypeId, "GoodsTypeName": GoodsTypeName},
                    success:function (data) {
                        alert("修改成功");
                        var url = 'updateGoodsTypeList';
                        $(".whole-page").load(url);
                    }
                })
                $("#edit-goodsType-dialog").dialog("close");
            },
            "取消":function () {
                $("#edit-goodsType-dialog").dialog("close");
            }
        }
    })
    // 点击编辑按钮弹出编辑dialog
    $(".goods-type-edit").click(function () {
        var GoodsTypeId = $(this).closest("tr").find(".goods-type-id").text();
        var GoodsTypeName = $(this).closest("tr").find(".goods-type-name").text();
        $(".edit-goodsTypeId").val(GoodsTypeId);
        $(".edit-goodsTypeName").val(GoodsTypeName);
        $("#edit-goodsType-dialog").dialog("open");
    })

})