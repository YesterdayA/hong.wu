<%@ page language="java" import="java.util.*" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>登录成功</title>
    
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
  
  <table width="95%" height="170" border="0" cellpadding="0"
			cellspacing="0" align="center">
			<tr>
				<td width="200" height="101">
					网上购物系统
				</td>
				<td width="640" style="padding-left: 40px;">	
				
				</td>
			</tr>
			<tr>
				<td height="41" colspan="2" align="center">
					|
					<a href="<%=path%>/users/modify_info.jsp">修改资料</a>|
					<a href="#">我的购物车</a> |
					<a href="#">我的订单</a> |
					<a href="<%=path%>/goods/Goods_Info.action">查看商品</a> |
					<a href="<%=path%>/users/Users_Logout.action">注销 </a> &nbsp;&nbsp; &nbsp;&nbsp;
					<font style="color: red"> 欢迎<span style="color: red">${sessionScope.users.username}</span>登录成功</font>
				</td>
	       <%--<tr>
			    <td valign="top" align="center">
					<p>
						<!-- 商品类别循环开始 -->
					    <s:iterator id="goodsType" value="#request.goodsTypeList">
						<br>
						<a href="/bysj/toShowMeal?meal.mealseries.seriesId=${mealSeries.seriesId}">${mealSeries.seriesName }</a>
						<br>
						</s:iterator>
						<!--  商品类别循环结束 -->	 
				</td>
			</tr>
			--%>										
  </table>
 
  <!-- 欢迎<span style="color: red">${sessionScope.users.username}</span>登录成功
      <a href="<%=path%>/users/Users_Logout.action">注销 </a>
      <a href="<%=path%>/users/modify_info.jsp">修改资料</a><br>
      <form name=""> -->
             
      
  </body>
</html>
