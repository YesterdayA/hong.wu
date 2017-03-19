<%@ page language="java" import="java.util.*" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri='/struts-tags' prefix='s' %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<script language="javascript"> 
</script>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>用户注册功能</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  <div type="center">
  <form name="registerForm" action="<%=path%>/users/Users_Register.action" method="post">
  <table>
    <!--  <tr>
       <td>用户编号：</td>
       <td><input type="text" name="uid"></td>
    </tr>
    -->
    <tr>
       <td>请输入用户名：</td>
       <td><input type="text" name="username"></td>
    </tr>
    <tr>
       <td>请输入昵称：</td>
       <td><input type="text" name="nickname"></td>
    </tr>
    <tr>
       <td>请输入密码：</td>
       <td><input type="password" name="password"></td>
    </tr>
    <tr>
       <td>请确认密码：</td>
       <td><input type="password" name="password2"></td>
    </tr>
    <tr>
       <td>性别：</td>
       <td> <input type="radio" checked="checked" name="gender" value="男" />男
            <input type="radio" name="gender" value="女" />女</td>
    </tr>
    <tr>
       <td> 出生日期:</td>
       <td><input type="text" name="birthday"/></td>
    </tr>
    <tr>
       <td>你的地址：</td>
       <td><input type="text" size="20" maxlength="50" name="address"/></td>
    </tr>
    <tr>
       <td></td>
       <td><input type="submit" value="提交"/>
       <input type="reset" value="重置"/></td>
    </tr>
              
</table>
  </form>
  </div>
  <body>
   
  </body>
</html>
