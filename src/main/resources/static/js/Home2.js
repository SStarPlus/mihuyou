$(function () {
    //图片轮转定时触发器
    var interval;

    //点击中间图片切换图片
    var index=0;
    //初始化图片轮转切换点的样式
    $(".img-point-"+index+"").css("background", "rgba(255, 255, 255, 1)");

    var img_data=["../static/pictures/home1.jpg",'../static/pictures/home2.jpg','../static/pictures/home3.jpg']
    // 获得相应元素对象
    var rright=document.getElementsByClassName("rright")[0];
    var llef=document.getElementsByClassName("lleft")[0];
    var img=document.getElementById("imgs");
    // 通过对象的单击事件触动函数调用函数实现图片切换
    rright.onclick=function(){
        //上一个图片轮转切换点样式恢复
        $(".img-point-"+index+"").css("background", "rgba(255, 255, 255, 0.4)");
        index++;
        if(index==img_data.length) index=0;
        img.setAttribute('src',img_data[index]);
        //当前图片轮转切换点样式改变
        $(".img-point-"+index+"").css("background", "rgba(255, 255, 255, 1)");
        //定时器重置时间
        clearInterval(interval);
        timer();
    }
    llef.onclick=function(){
        $(".img-point-"+index+"").css("background", "rgba(255, 255, 255, 0.4)");
        if(index==0) index=img_data.length;
        index--;
        img.setAttribute('src',img_data[index]);
        $(".img-point-"+index+"").css("background", "rgba(255, 255, 255, 1)");
        clearInterval(interval);
        timer();
    }
    //根据图片数量添加对应数量的图片轮转切换点
    var picPoints = "";
    for (var i = 0; i < img_data.length; i++){
        picPoints += "<i class='tran-point img-point-"+i+"'></i>"
    }
    $(".ccenter").html(picPoints);
    //当有指定经过时，判断是哪个图片轮转切换点触发，并转换至图片以及该图片轮转切换点样式改变，上一个图片轮转切换点样式恢复
    $(".tran-point").hover(function () {
        $(".img-point-"+index+"").css("background", "rgba(255, 255, 255, 0.4)");
        for (var i = 0; i < img_data.length; i++){
            if($(this).hasClass("img-point-" + i)){
                index = i;
                break;
            }
        }
        img.setAttribute('src',img_data[index]);
        $(".img-point-"+index+"").css("background", "rgba(255, 255, 255, 1)");
        clearInterval(interval);
        timer();
    })

    //图片定时转换
    function turnToNextImg() {
        $(".rright").click();
    }
    var timer = function(){
        interval = setInterval(turnToNextImg, 5000);
    };
    //定时器加载触发
    clearInterval(interval);
    timer();

    //替换原来的文本，将超出指定字符长度用省略号代替
    // function replaceText() {
    //     $(".s-information").each(function () {
    //         var str = $.trim($(this).text());
    //         if(str.length >= 10){
    //             str = str.substring(0, 39) + "...";
    //         }
    //         $(this).text(str);
    //     })
    // };
    // replaceText();

    $(".hot-rank-item").hover(function () {

    })

    // $(".hot-rank-item").click(function () {
    //     var goodId = $(this).data("gid");
    //
    //     $.ajax({
    //         type: "get",
    //         url: "ShowGoodsDetail",
    //         dataType: "html",
    //         data: {"GoodsId": goodId},
    //         async:false,
    //         success:function (data) {
    //             var result = window.open("about:blank", "_blank");
    //             result.document.write(data);
    //         },
    //     })
    // })
})