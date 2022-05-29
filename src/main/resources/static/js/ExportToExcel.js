// 导出excel
$(function () {
    $('body').on('click', '.clickToExport', function () {
        alert();
        // 使用outerHTML属性获取整个table元素的HTML代码（包括<table>标签），然后包装成一个完整的HTML文档，设置charset为urf-8以防止中文乱码
        //获取表格
        var tableHtml = $('.data-table');
        //不能显示class的样式，所以自己重新添加样式 主要为设置边框 格子大小
        $(tableHtml).css({
            'border': '1px solid #d5d5d2',
            'text-align': 'center',
            'border-collapse': 'collapse',
        });
        $(tableHtml).find('tr td').css({
            'text-align': 'center',
            'border': '1px solid #d5d5d2',
            'line-height': '30px',
            'padding': '0px 10px',
            'min-width': '100px'
        });

        var html = "<html><head><meta charset='utf-8' /></head><body>" + tableHtml[0].outerHTML + "</body></html>";
        // 实例化一个Blob对象，其构造函数的第一个参数是包含文件内容的数组，第二个参数是包含文件类型属性的对象
        var blob = new Blob([html], {type: "application/vnd.ms-excel"});
        var urlA = document.createElement('a');
        // 利用URL.createObjectURL()方法为a元素生成blob URL
        $('.table-btn-group').append(urlA);
        urlA.href = URL.createObjectURL(blob);
        // 设置文件名，目前只有Chrome和FireFox支持此属性
        urlA.download = "年度销售报表.xls";
        urlA.click();
    });
});