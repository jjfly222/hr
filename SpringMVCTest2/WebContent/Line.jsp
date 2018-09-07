<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<table border="1">
				<tr>
					<td>订单编号：</td>
					<td>${order.odrCustmoerId}</td>
					<td>下单日期：</td>
					<td>${order.odrOrderDate}</td>
				</tr>
				<tr>
					<td>客户名称：</td>
					<td>${order.odrCustomerName}</td>
					<td>送货时间：</td>
					<td>${order.odrDeliverDate}<input type="text"></td>
				</tr>
				<tr>
					<td>送货地址：</td>
					<td colspan="3">${order.odrCustomerAddr}</td>
				</tr>
			</table>
			<table border="1">
				<tr>
					<td>产品名称</td>
					<td>单价</td>
					<td>数量</td>
					<td>总价</td>
					<td>操作</td>
				</tr>
				<tr>
					<td><input type="text" name="odrDeliverDate" ></td>
					<td><input type="text" name="odrDeliverDate" ></td>
					<td><input type="text" name="odrDeliverDate" ></td>
					<td><input type="text" name="odrDeliverDate" ></td>
				</tr>
				
			</table>
			
	
</body>
</html>