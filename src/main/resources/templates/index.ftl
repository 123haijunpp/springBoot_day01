<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <#include "common/head.ftl"/>
    <script src="js/index.js"></script>
    <script>
        // $(document).ready(function () {
        //     for (var i = 0; i < 500; i++) {
        //         window.location.href = "http://localhost:8888/springBoot/";
        //     }
        // });
    </script>
</head>
<body>
<div class="layui-layout layui-layout-admin">
    <div class="layui-header">
        <div class="layui-logo">姐政家务管理系统</div>
        <!-- 头部区域（可配合layui已有的水平导航） -->
        <ul class="layui-nav layui-layout-left">
            <li class="layui-nav-item"><a href="">控制台</a></li>
            <li class="layui-nav-item"><a href="">商品管理</a></li>
            <li class="layui-nav-item"><a href="">用户</a></li>
            <li class="layui-nav-item">
                <a href="javascript:;">其它系统</a>
                <dl class="layui-nav-child">
                    <dd><a href="">邮件管理</a></dd>
                    <dd><a href="">消息管理</a></dd>
                    <dd><a href="">授权管理</a></dd>
                </dl>
            </li>
        </ul>
        <ul class="layui-nav layui-layout-right">
            <li class="layui-nav-item">
                <a href="javascript:void(0);">
                    <img src="http://t.cn/RCzsdCq" class="layui-nav-img">
                    贤心
                </a>
            </li>
            <li class="layui-nav-item"><a href="">网站首页</a></li>
            <li class="layui-nav-item"><a href="">安全退出</a></li>
            <li class="layui-nav-item"><a href="">基本资料</a></li>
            <li class="layui-nav-item"><a href="">安全设置</a></li>

        </ul>
    </div>
    <div class="layui-side layui-bg-black">
        <div class="layui-side-scroll">
            <!-- 左侧导航区域（可配合layui已有的垂直导航） -->
            <ul class="layui-nav layui-nav-tree" lay-filter="test">
                <li class="layui-nav-item layui-nav-itemed">
                    <a class="" href="javascript:void(0);">人员管理</a>
                    <form class="layui-form">
                        <div id="xtree1" style="width:400px;border:1px solid black;padding: 10px 0 25px 5px;"></div>
                    </form>
                </li>
            </ul>
        </div>
    </div>
    <div class="layui-tab">
    <#--<ul class="layui-tab-title"></ul>-->
        <div class="layui-body">
            <div class="demoTable" style="margin-top: 15px">
                名称搜索：
                <div class="layui-inline">
                    <input class="layui-input" id="demoReload" autocomplete="off">
                </div>
                <button class="layui-btn" data-type="reload">搜索</button>
            </div>
            <!-- 内容主体区域 -->
            <div style="padding: 15px;">
                <div>
                    <table class="layui-hide" id="demo" lay-filter="demo"></table>
                </div>
                <script type="text/html" id="barDemo">
                    <a class="layui-btn layui-btn-xs" lay-event="edit">编辑</a>
                    <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
                    <a class="layui-btn layui-btn-xs" lay-event="imgUpload">图片上传</a>
                    <a class="layui-btn layui-btn-xs" lay-event="view-details">查看详情</a>
                </script>
                <script type="text/html" id="toolbarDemo">
                    <div class="layui-btn-group">
                        <button class="layui-btn layui-btn-sm" id="but-add">
                            <i class="layui-icon">&#xe654;</i>
                        </button>
                        <button class="layui-btn layui-btn-sm" id="addUser">
                            <i class="layui-icon">&#xe602;</i>
                        </button>
                    </div>
                </script>
            </div>
        </div>
    </div>
    <div class="layui-footer">
        <!-- 底部固定区域 -->
        <center>©姐政家务</center>
    </div>
</div>
</body>
</html>