<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
	<jsp:useBean id="now" class="java.util.Date" />
	<fmt:formatDate value="${now}" type="both" dateStyle="long" pattern="yyyy-MM-dd" var="currentdate" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
#aa{
 margin:auto;
 width: 200px;
  
}

</style>
</head>
<body>

	<form action="Order.action">
		<table border="1">
			<thead>
				<tr>
					<td>订单编号：</td>
					<td><input type="text" name="odrCustmoerId" value="15" readonly=”true”> </td>
					<td>下单日期：</td>
					<td><input type="text" name="odrOrderDate" value="${currentdate}" readonly=”true”></td>
				</tr>
				<tr>
					<td>客户名称：</td>
					<td><input type="text" name="odrCustomerName" >
					</td>
					<td>送货时间：</td>
					<td><input type="date" name="odrDeliverDate" ></td>
				</tr>
				<tr>
					<td>送货地址：</td>
					<td colspan="3"><input type="text" name="odrCustomerAddr"></td>
				</tr>
				<tr>
					<td colspan="4">
					<div id="aa">
					<input type="button" value="保存"> 
					<input type="submit" value="提交">
					</div>
					</td>
				</tr>
			</thead>
			</form>
</body>
</html>