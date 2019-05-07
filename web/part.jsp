<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>贴子</title>
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

        #header {
            background: #DCDCFF;
            margin: 0 auto;
            height: 100px;
        }

        #header h2 {
            font-size: 56px;
            font-family: 华文楷体;
            vertical-align: bottom;
        }

        #header img {
            width: 66px;
            hight: 66px;
            border-radius: 8px;
        }

        #box {
            width: 100%;
            hight: 100%;
        }

        #left-box {
            width: 20%;
            height: 300px;
            border: 1px solid #000;
            float: left;
        }

        #right-box {
            width: 70%;
            height: 300px;
            border: 1px solid #000;
            float: right;
            font-size: 20px;
        }

        #right-box input[type="text1"] {
            text-align: center;
            line-height: 30px;
            width: 200px;
        }

        #right-box textarea {
            width: 500px;
            hight: 100px;
        }

        #right-box input[type="text2"] {
            line-height: 20px;
            width: 200px;
        }

        #right-box button {
        }

        #footer {
            clear: both;
            border: 2px solid #000;
            border-radius: 2px;
            width: 400px;
            hight: 30px;
        }

        #footer textarea {
            width: 300px;
            hight: 200px;
        }

        #footer input {
            width: 100px;
            hight: 100px;
        }
    </style>
</head>
<body>
<div id="header">
    <h2><img src="../bbs/images/logo.jpg" alt="lost" style="vertical-align:middle">
        校园二手交易论坛
    </h2>
</div>
<div id="box">
    <div id="left-box">
        <ul>
            贴子状态：
            <input type="text1" id="part-now">
        </ul>
        <ul>
            <img src="">
            <li align="center">用户名：<input type="text" id="name"></li>
            <li align="center">性别：<input type="text" id="sex"></li>
            <li align="center">系别：<input type="text" id="dept"></li>
            <li align="center">tel：<input type="text" id="phone"></li>
        </ul>
    </div>
    <div id="right-box">
        <form action="" method="post">
            <input type="text1" id="title"><br>
            <img src=""><br>
            简介：<br>
            <textarea name="con" cols="10" rows="10"></textarea><br>
            价格：<input type="text2" id="price"><br>
            <input type="button" name="want" value="我需要">
        </form>
    </div>
</div>
<div id="footer">
    发表回复
    <form action="" method="post">
        <textarea name="answer" rows="10" cols="20"></textarea>
        <br>
        <input type="button" name="show" value="发表">
    </form>
</div>
</body>
</html>
