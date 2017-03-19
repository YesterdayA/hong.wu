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
    
    <title>商品信息一览</title>
    
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
					<strong><span
						style="font-size: 20px;">网上购物系统</span> </strong>
				</td>
				<td width="640" style="padding-left: 40px;">
					
				</td>
			</tr>
			<tr>
			    <td valign="top" align="center">
			       商品类型：
					<p>
						   <s:iterator id ="goodsType" value="#request.GoodsType">
						   <s:property value ="goodsType.goodsTypeId}"/>
						   </s:iterator>
						<!-- 菜商品类型循环结束 -->
						
				</td>
				<td valign="top" align="center">
				商品信息：
				<table cellpadding="5" cellspacing="1" style="font-size: 12px;">
					    <!-- 餐品循环开始 -->
						<s:iterator id="mealItem" value="#request.mealList" status="st">
								<s:if test="#st.getIndex()%3==0">
						<tr>
						</s:if>
							<td>
								<!-- <a href="/Restrant/toShowDetails?meal.mealId=${mealItem.mealId}"></a> -->
							</td>
							<td>
								<div>
									${ mealItem.mealId}
									:
									${ mealItem.mealName}
									<br />
									<span style="text-decoration: line-through; color: gray;">原价：人民币${ mealItem.mealPrice}元</span>
									<br />
									现价：人民币
									${ mealItem.mealPrice*0.9}
									元
								</div>
								<a href="/Restrant/toShowDetails?meal.mealId=${mealItem.mealId}"><img src="images/detail_cn.gif" border="0" width="60" height="20" /></a>
								<a href="/Restrant/addtoshopcart?mealId=${mealItem.mealId }"><img src="images/buy_cn.gif" border="0" width="60" height="20" /></a>
							</td>
							<s:if test="#st.getIndex()%3==2">
						</tr>
						</s:if>
						</s:iterator>
						<!-- 餐品循环开始 -->
				</td>		
			</tr>
 
    </table>
  </body>
</html>
