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
    
    <title>修改个人信息</title>
    
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
  <form name="changeInfoForm" action="<%=path%>/users/Users_ChangeInfo.action" method="post">
   <table>
    <tr>
       <td colspan="2">用户个人信息</td>
    </tr>
    <tr>
       <!--<td> 用户编号：</td> -->
       <td><input type="hidden" name="users.uid" value='<s:property value="#session.users.uid"/>' readonly = "readonly"></td>
    </tr>
    <tr>
       <td>用户名：</td>
       <td><input type="text" name="users.username" value='<s:property value="#session.users.username"/>'></td>
    </tr>
    <tr>
       <td>密码：</td>
       <td><input type="text" name="users.password" value='<s:property value="#session.users.password"/>'></td>
    </tr>
    <tr>
       <td>真实姓名：</td>
       <td><input type="text" name="users.truename" value='<s:property value="#session.users.truename"/>'></td>
    </tr>
    <s:if test='%{#session.users.gender=="男"}'>
    <tr>
       <td>性别：</td>
       <td> <input type="radio" checked="checked" name="users.gender" value="男"/>男
            <input type="radio" name="users.gender" value="女" />女</td>
    </tr>
    </s:if>
    <s:else>
    <tr>
       <td>性别：</td>
       <td> <input type="radio" name="users.gender" value="男"/>男
            <input type="radio" name="users.gender" value="女" checked="checked" />女</td>
    </tr>
    </s:else>
    <tr>
       <td>联系电话:</td>
       <td><input type="text" name="users.phone" value='<s:property value="#session.users.phone"/>'/></td>
    </tr>
    <tr>
       <td>E-Mail:</td>
       <td><input type="text" name="users.email" value='<s:property value="#session.users.email"/>'/></td>
    </tr>
    <tr>
       <td>出生日期:</td>
       <td><input type="text" name="users.birthday" value='<s:property value="#session.users.birthday"/>'/></td>
    </tr>
    <tr>
       <td>默认地址：</td>
       <!-- 以下两种方法都可以 -->
       <!-- <td><input type="text" size="20" maxlength="50" name="address" value='<s:property value="#session.users.address"/>/></td> -->
       <td><input type="text" size="20" maxlength="50" name="users.address" value="${sessionScope.users.address}"/></td>
    </tr>
    <tr>
       <td></td>
       <td><input type="submit" value="修改" name="submit"/>
       <!-- 点击取消按钮返回到前面的页面中 -->
       <input type="button" value="取消" onclick="javascript:history.go(-1);"/></td>
    </tr>              
     </table>
    </form>
  </div>
  <body>
   
  </body>
</html>
