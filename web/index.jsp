<%@ page contentType="text/html;charset=UTF-8" %>
<jsp:include page="common.jsp"/>
<html>
<head>
    <title>校园二手交易论坛</title>
    <link rel="icon" type="image/jpg" href="./images/logo.jpg">
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

        #login-nav {
            position: absolute;
            width: 70px;
            text-align: center;
            line-height: 26px;
            left: 1166px;
            top: 36px;
            color: #31c27c;
            border-radius: 5px;
            cursor: pointer;
        }

        #login-nav input {
            width: 50px;
            hight: 30px;
        }

        #two {
            width: 100%;
            height: 36px;
            border: 3px solid lightskyblue;
        }

        #two input {
            text-indent: 6px;
            width: 100px;
            line-height: 36px;
            font-size: 16px;
        }

        #content {
            width: 100%;
            height: 50%;
            border: 3px solid lightskyblue;
        }

        #footer {
            width: 600px;
            height: 300px;
            border: 3px solid lightskyblue;
            background: lavenderblush;
        }

        #footer h1 {
            width: 50px;
            border: 2px solid #66fffd;
            border-radius: 5px;
            font-size: large;
            font-family: 宋体;
        }

        #footer input[type="text"] {
            width: 300px;
            hight: 50px;
        }

        #footer input[type="button"] {
            border-radius: 3px;
            width: 50px;
            line-height: 26px;
        }

        .white_content {
            display: none;
            position: absolute;
            top: 15%;
            left: 55%;
            width: 300px;
            height: 65%;
            padding: 20px;
            border: 3px solid #DCDCFF;
            background-color: white;
            z-index: 1002;
            overflow: auto;
        }

        #light a {
            color: aqua;
        }
    </style>
    <script type="text/javascript">
        function openDialog() {
            document.getElementById('light').style.display = 'block';
            document.getElementById('fade').style.display = 'block'
        }

        function closeDialog() {
            document.getElementById('light').style.display = 'none';
            document.getElementById('fade').style.display = 'none'
        }

        function register() {
            window.location = "reg.jsp";
        }

        function check() {
            if (document.ThisForm.username.value === "") {
                alert("请输入用户名");
                document.ThisForm.username.focus();
                return false;
            }
            if (document.ThisForm.password.value === "") {
                alert("请输入密码");
                document.ThisForm.password.focus();
                return false;
            }
            $("#ThisForm").submit();
        }
    </script>
</head>
<body>
<div id="header">
    <h2><img src="${pageContext.request.contextPath}/images/logo.jpg"/>校园二手交易论坛</h2>
    <div id="login-nav">
        <input type="button" value="登录" onclick="openDialog()">
    </div>
</div>
<div id="light" class="white_content">
    <form name="ThisForm" id="ThisForm" action="${pageContext.request.contextPath}/LoginServlet" method="get">
        <table>
            用户名：<input type="text" name="username"><br>
            密码：<input type="password" name="password"><br>
            <input type="button" value="登录" onclick="check()">
        </table>
    </form>
    <p>还没有账号?点击<a href="javascript:void(0)" onclick="register()">注册</a></p>
    <input type="button" value="退出" onclick="closeDialog()">
</div>
<div id="fade" class="black_overlay"></div>
<div id="two">
    <form action="" method="post">
        <input type="button" name="classify" value="分类">
        <input type="button" name="electronic" value="电子产品">
        <input type="button" name="book" value="书籍教材">
        <input type="button" name="hand" value="手工饰品">
        <input type="button" name="sport" value="运动器材">
        <input type="button" name="music" value="乐器">
    </form>
</div>
<div id="content">
    <table>
        <tr>
            <th>标题</th>
            <th>发帖人</th>
            <th>发帖时间</th>
            <th>回复人数</th>
        </tr>
    </table>
</div>
<div id="footer">
    <h1>发帖</h1>
    <form action="" method="post">
        标题：<input type="text" name="title">
        <br>
        <input type="button" name="show" value="发表">
    </form>
</div>

</body>

</html>
