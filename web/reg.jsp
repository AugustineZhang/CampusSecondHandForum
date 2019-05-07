<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>校园二手交易论坛——注册</title>
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

        #body-nav {
            width: 100%;
            hight: 100%;
            font-size: 20px;
            font-family: 宋体;
        }
        #body-nav input[type="text"]{
            width: 260px;
            line-height: 10px;
        }
        #body-nav input[type="password"]{
            width: 260px;
            line-height: 10px;
        }
        #body-nav input[type="radio"]{
            width: 30px;
            line-hight:10px;
        }
        #body-nav input[type="submit"]{
            width: 50px;
            line-height: 30px;
        }
    </style>
</head>
<body>
<div id="header">
    <h2><img src="../images/logo.jpg"/>校园二手交易论坛</h2>
</div>
<div id="body-nav">
    <form  name="RegForm" action="RegServlet" method="post">
        <table>
            <tr>
                <td>用户名：</td>
                <td><input type="text" name="username"></td>
            </tr>
            <tr>
                <td>密码：</td>
                <td><input type="password" name="upwd" placeholder="密码长度至少为6位"></td>
            </tr>
            <tr>
                <td> 性别：</td>
                <td><input type="radio" name="sex"  checked>男</td>
                <td><input type="radio" name="sex" >女</td>
            </tr>
            <tr>
                <td>系别：</td>
                <td><input type="text" name="dept"></td>
            </tr>
            <tr>
                <td>联系方式：</td>
                <td><input type="text" name="tel" placeholder="请输入长度为11位的电话号码"></td>
            </tr>
            <tr>
                <td> QQ：</td>
                <td><input type="text" name="qq"></td>
            </tr
            <tr>
                <td> 邮箱:</td>
                <td><input type="text" name="email"></td>
            </tr>
            <tr>
                <td><input type="button" name="upload" value="上传图片"  ></td>
                <td><input type="submit" value="确定" onclick="check1()"></td>
            </tr>

        </table>

    </form>
</div>
</body>
<script  type="text/javascript">
    $(function () {
    })
    function check1() {
     if (document.RegForm.username.value=="") {
         alert("请输入用户名");
         document.RegForm.username.focus();
         return false;
     }
        if (document.RegForm.password.value=="") {
            alert("请输入密码");
            document.RegForm.password.focus();
            return false;
        }
        if(document.RegForm.password.value.length<6){
            alert("密码长度至少为六位");
            document.RegForm.password.focus();
            return false;
        }
        if(document.RegForm.tel.value.length<11){
            alert("手机号码长度至少为11位");
            document.RegForm.tel.focus();
            return false;
        }
    }
</script>
</html>
