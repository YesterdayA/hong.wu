<%@ page language="java" import="java.util.*" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri='/struts-tags' prefix='s' %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>用户登录</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <form name="loginForm" action="<%=path%>/users/Users_Login.action" method="post">  
     <center>
     <table>
        <tr> 
        <td>用户名：  </td>
        <td><input type="text" name="username"/></td>
        </tr>
        <tr> 
        <td>密  &nbsp 码：</td>
        <td><input type="password" name ="password"/></td>
        </tr>
        <tr> 
        <td></td>
        <td><input type="submit" value="登录"/>
            <input type="reset" value="重置"/></td>
        </tr>
        <tr>
        <td></td>
        <td>如果你没有账号，请点击<a href=<%=path%>/users/users_register.jsp>这里</a></td>
        </tr>
        <!--<input type=hidden name="uid"/>-->          
        <div color=#F00><h5><s:fielderror/> <!-- 显示错误信息 -->
        </h5></div>
     
     </table>
     </center>    
    </form>
  </body>
</html>
