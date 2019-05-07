<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>校园二手交易论坛—商品信息</title>
    <style>
        * {
            margin: 0;
            padding: 0;
            list-style: none;
            text-decoration: none;
            color: #000;
        }
        html, body {
            width: 100%;
            height: 100%;
            background: lavenderblush;
        }
        #header{
            background: #DCDCFF;
            margin: 0 auto;
            height: 100px;
        }
        #header  h2{
            font-size: 56px;
            font-family: 华文楷体;
            vertical-align:bottom;
        }
        #header img{
            width: 66px;
            hight:66px;
            border-radius: 8px;
        }
        #login-nav{
            position: absolute;
            width: 100px;
            text-align: center;
            line-height: 26px;
            left: 1066px;
            top: 26px;
            color: #31c27c;
            border-radius: 5px;
            cursor: pointer;
        }
        #box{
            width: 100%;
            hight:100%;
        }
        #left-box{
            width:40%;
            height:500px;
            border:1px solid #000;
            float:left;
        }
        #right-box{
            width:50%;
            height:500px;
            border:1px solid #000;
            float:right;
            font-size: 20px;
        }
        #right-box span{
            width: auto;
            hight:auto;
        }
        #right-box select{
            height:30px;
            line-height:30px;
            background:#f4f4f4;
        }
        #right-box input[type="text1"]{
            width: 300px;
            line-height:26px;
        }
        #right-box input[type="text2"]{
            width: 500px;
            line-height:260px;
        }
        #right-box textarea{
            width: 300px;
            line-height:26px;
        }
        #right-box input[type="button"]{
            width: 100px;
            line-height:50px;
        }
    </style>
</head>
<body>
<div id="header">
    <h2>校园二手交易论坛</h2>
    <div id="login-nav">
        <input type="text" id="yn"  >
    </div>
</div>
<div id="box">
    <div id="left-box"></div>
    <input type="button" name="image" value="上传图片">
    <div id="right-box">
        <span></span>
        名称：<input type="text1" name="title"><br>
        分类：<select name="classify">
        <option value="电子产品"selected>电子产品</option>
        <option value="书籍教材">书籍教材</option>
        <option value="手工饰品">手工饰品</option>
        <option value="运动器材">运动器材</option>
        <option value="乐器">乐器</option>
    </select>
        <br>
        商品简介:</br>
        <textarea name="classify" cols="30" rows="6"></textarea><br>
        价格:<input type="text3" name="price" ><br>
        <input type="button" name="right" value="确定">
    </div>
</div>
</body>
</html>
