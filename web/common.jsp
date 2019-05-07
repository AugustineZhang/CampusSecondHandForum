<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
<%@ page import="java.util.*"%>
<link href="<%=basePath %>css/init.css" rel="stylesheet" type="text/css">
<link href="<%=basePath %>css/crud.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="<%=basePath %>My97DatePicker/WdatePicker.js"></script>
<script src="http://code.jquery.com/jquery-latest.js"></script>
<style>
    body{
        background-color: #F8F8FF
    }
</style>