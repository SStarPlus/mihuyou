$(function () {
    $().ready(
        function createPictureTable() {

            var goodNames = [];
            var goodSoldNum = [];
            var goodTotalPrice = [];
            var goodADDL = [];

            $(".data-table").find('tr').each(function (index) {
                if (index != 0) {
                    goodNames.push($(this).find("td").eq(2).text());
                    goodSoldNum.push($(this).find("td").eq(3).text());
                    goodTotalPrice.push($(this).find("td").eq(4).text());
                    goodADDL.push($(this).find("td").eq(5).text());
                }
            })

            // 基于准备好的dom，初始化echarts实例
            var myChart1 = echarts.init(document.getElementById("table-num"));
            var myChart2 = echarts.init(document.getElementById("table-price"));
            var myChart3 = echarts.init(document.getElementById("table-addL"));

            var title = "";
            if($("#table-num").hasClass("year-table")){
                title = "年度";
            }else if($("#table-num").hasClass("month-table")){
                title = "月度";
            }else{
                title = "日";
            }

            // 指定图表的配置项和数据
            var option1 = {
                title: {
                    text: title+'销售量'
                },
                tooltip: {},
                legend: {
                    data: ['销售量']
                },
                xAxis: {
                    // data: ["衬衫","短袖","皮鞋","裤子","高跟鞋","袜子"]
                    data: goodNames,
                    axisLabel: {
                        interval: 0,
                        rotate: 40
                    }
                },
                yAxis: {},
                series: [{
                    name: '销售量',
                    type: 'line',
                    // data: [9, 10, 36, 19, 14, 20]
                    data: goodSoldNum
                }],
                toolbox: {
                    show: true,
                    feature: {
                        dataZoom: {
                            yAxisIndex: 'none'
                        }, //区域缩放，区域缩放还原
                        dataView: {
                            readOnly: false
                        }, //数据视图
                        magicType: {
                            type: ['line', 'bar']
                        },  //切换为折线图，切换为柱状图
                        restore: {},  //还原
                        saveAsImage: {}   //保存为图片
                    }
                },

            };

            var option2 = {
                title: {
                    text: title+'销售额'
                },
                tooltip: {},
                legend: {
                    data: ['销售额']
                },
                xAxis: {
                    // data: ["衬衫","短袖","皮鞋","裤子","高跟鞋","袜子"]
                    data: goodNames,
                    axisLabel: {
                        interval: 0,
                        rotate: 40
                    }
                },
                yAxis: {},
                series: [{
                    name: '销售额',
                    type: 'line',
                    // data: [9, 10, 36, 19, 14, 20]
                    data: goodTotalPrice
                }],
                toolbox: {
                    show: true,
                    feature: {
                        dataZoom: {
                            yAxisIndex: 'none'
                        }, //区域缩放，区域缩放还原
                        dataView: {
                            readOnly: false
                        }, //数据视图
                        magicType: {
                            type: ['line', 'bar']
                        },  //切换为折线图，切换为柱状图
                        restore: {},  //还原
                        saveAsImage: {}   //保存为图片
                    }
                },

            };

            var option3 = {
                title: {
                    text: '同比增加'
                },
                tooltip: {},
                legend: {
                    data: ['百分比']
                },
                xAxis: {
                    // data: ["衬衫","短袖","皮鞋","裤子","高跟鞋","袜子"]
                    data: goodNames,
                    axisLabel: {
                        interval: 0,
                        rotate: 40
                    }
                },
                yAxis: {},
                series: [{
                    name: '百分比',
                    type: 'line',
                    // data: [9, 10, 36, 19, 14, 20]
                    data: goodADDL
                }],
                toolbox: {
                    show: true,
                    feature: {
                        dataZoom: {
                            yAxisIndex: 'none'
                        }, //区域缩放，区域缩放还原
                        dataView: {
                            readOnly: false
                        }, //数据视图
                        magicType: {
                            type: ['line', 'bar']
                        },  //切换为折线图，切换为柱状图
                        restore: {},  //还原
                        saveAsImage: {}   //保存为图片
                    }
                },

            };

            // 使用刚指定的配置项和数据显示图表。
            myChart1.setOption(option1);
            myChart2.setOption(option2);
            myChart3.setOption(option3);
        }
    )

})