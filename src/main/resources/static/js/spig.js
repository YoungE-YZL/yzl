//右键菜单
jQuery(document).ready(function ($) {
    $("#spig").mousedown(function (e) {
        if(e.which==3){
           /* showMessage('秘密通道:<br /><a href="http://laypc.cn" title="敬请期待!">敬请期待!</a><br/>' +
                '<a onclick="removeBaiJiang()">隐藏浮动小人</a>',10000);*/
        }
    });
    $("#spig").bind("contextmenu", function(e) {
        //双击事件
        return false;
    });
});

function removeBaiJiang(){
    $("#spig").hide();
}

//鼠标在消息上时
jQuery(document).ready(function ($) {
    $("#message").hover(function () {
        $("#message").fadeTo("100", 1);
    });
});


//鼠标在上方时
jQuery(document).ready(function ($) {
    //$(".mumu").jrumble({rangeX: 2,rangeY: 2,rangeRot: 1});
    $(".mumu").mouseover(function () {
        $(".mumu").fadeTo("300", 0.3);
        msgs = ["我隐身了，你看不到我", "我会隐身哦！嘿嘿！", "别动手动脚的，把手拿开！", "把手拿开我才出来！"];
        var i = Math.floor(Math.random() * msgs.length);
        showMessage(msgs[i]);
    });
    $(".mumu").mouseout(function () {
        $(".mumu").fadeTo("300", 1)
    });
});


//开始
jQuery(document).ready(function ($) {
    if (isindex) { //如果是主页
        var now = (new Date()).getHours();
        if (now > 0 && now <= 6) {
            showMessage(visitor + '注意休息哦,我是月挣零 你是夜猫子呀？还不睡觉，明天起的来么你？', 6000);
        } else if (now > 6 && now <= 11) {
            showMessage(visitor + ' 我是月挣零, 早上好，早起的鸟儿有虫吃噢！早起的虫儿被鸟吃，你是鸟儿还是虫儿？嘻嘻！', 6000);
        } else if (now > 11 && now <= 14) {
            showMessage(visitor + ' 我是月挣零, 中午了，吃饭了么？不要饿着了', 6000);
        } else if (now > 14 && now <= 18) {
            showMessage(visitor + ' 我是月挣零, 中午的时光真难熬！还好有你在！', 6000);
        } else {
            showMessage(visitor + ' 我是月挣零, 晚上好，快来逗我玩吧！', 6000);
        }
    }
    else {
        showMessage('欢迎' + visitor + '来到《' + title + '》', 6000);
    }
    $(".spig").animate({
            top: $(".spig").offset().top + 100,
            left: document.body.offsetWidth - 155
        },
        {
            queue: false,
            duration: 1000
        });
});


//无聊讲点什么
jQuery(document).ready(function ($) {

    window.setInterval(function () {
        msgs = [ "陪我聊天吧！", "好无聊哦，你都不陪我玩！", "∑(っ°Д°;)っ卧槽，不见了", "๑Ő௰Ő๑)曾经瘦过，你也是厉害！", "我可爱吧！嘻嘻!~^_^!~~","๑乛◡乛๑卡在了奇怪的地方","(=￣ω￣=)喵了个咪"];
        var i = Math.floor(Math.random() * msgs.length);
        showMessage(msgs[i], 8000);
    }, 15000);
});
var spig_top = 50;
//滚动条移动
jQuery(document).ready(function ($) {
    var f = $(".spig").offset().top;
    $(window).scroll(function () {
        $(".spig").animate({
                top: $(window).scrollTop() + f +100
            },
            {
                queue: false,
                duration: 1000
            });
    });
});

//鼠标点击时
jQuery(document).ready(function ($) {
    var stat_click = 0;
    $(".mumu").click(function () {
        stat_click++;
        if (stat_click > 4) {
            msgs = ["你有完没完呀？", "你已经摸我" + stat_click + "次了","专心工作哦", "非礼呀！救命！OH，My ladygaga","拖动我头上的消息窗体可以改变我的位置哦~"/*,"右键可以召唤隐藏功能哦!"*/];
            var i = Math.floor(Math.random() * msgs.length);
            //showMessage(msgs[i]);
        } else {
            msgs = ["筋斗云！~我飞！", "我跑呀跑呀跑！~~","拖动我头上的消息窗体可以改变我的位置哦~"/*,"右键可以召唤隐藏功能哦!"*/, "专心工作哦", "干嘛动我呀！小心我咬你！"];
            var i = Math.floor(Math.random() * msgs.length);
            //showMessage(msgs[i]);
        }
        s = [0.1, 0.2, 0.3, 0.4, 0.5, 0.6,0.7,0.75,-0.1, -0.2, -0.3, -0.4, -0.5, -0.6,-0.7,-0.75];
        var i1 = Math.floor(Math.random() * s.length);
        var i2 = Math.floor(Math.random() * s.length);
        $(".spig").animate({
                left: document.body.offsetWidth/2*(1+s[i1]),
                top:  document.body.offsetheight/2*(1+s[i1])
            },
            {
                duration: 500,
                complete: showMessage(msgs[i])
            });

    });
});


//显示消息函数
function showMessage(a, b) {
        if (b == null) b = 10000;
        jQuery("#message").hide().stop();
        jQuery("#message").html(a);
        jQuery("#message").fadeIn();
        jQuery("#message").fadeTo("1", 1);
        jQuery("#message").fadeOut(b);
};

function moveTo(id) {
    $(".spig").animate({
            top: $("#"+id).offset().top - 70,
            left: $("#"+id).offset().left+$("#"+id).width()
        },
        {
            queue: false,
            duration: 1000
        });
}

//拖动
var _move = false;
var ismove = false; //移动标记
var _x, _y; //鼠标离控件左上角的相对位置
jQuery(document).ready(function ($) {
    $("#spig").mousedown(function (e) {
        _move = true;
        _x = e.pageX - parseInt($("#spig").css("left"));
        _y = e.pageY - parseInt($("#spig").css("top"));
    });
    $(document).mousemove(function (e) {
        if (_move) {
            var x = e.pageX - _x;
            var y = e.pageY - _y;
            var wx = $(window).width() - $('#spig').width();
            var dy = $(document).height() - $('#spig').height();
            if(x >= 0 && x <= wx && y > 0 && y <= dy) {
                $("#spig").css({
                    top: y,
                    left: x
                }); //控件新位置
                ismove = true;
            }
        }
    }).mouseup(function () {
        _move = false;
    });
});