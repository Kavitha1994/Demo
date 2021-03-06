<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<c:url value='/productdisplay' var="url"></c:url>

<style>

* {

    box-sizing: border-box;}
</style>
<div class="container">
<div class="row">

	<c:forEach items="${listproduct}" var="p">
	<div class="col-sm-3 col-md-3 col-">
		<div class="thumbnail w3-container w3-center w3-animate-bottom">
		<img class="zoom" src="resources/productimage/${p.productId}.jpg" height="200" width="200">
	<div class="row">
		<div class="text-center">
			<h3>${p.productName}</h3>
			<h3>Rs. ${p.price}</h3>
		</div>
	</div>
	</div>
	</div>
</c:forEach>
</div>
</div>
