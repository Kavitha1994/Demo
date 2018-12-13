<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">

<div class="container">
<div class="row"><c:forEach items="${listproduct}" var="p">
<div class="col-sm-5 ">
<div>
<img src="resources/productimage/${p.productId}.jpg" width="50" height="50"/>
</div>
</div>
<div class="col-sm-7">
<div class="card-body p-5">
<h3 class="title mb-3">${p.productName}</h3>
<p class="price-detail-wrap">
<span class="price h3 text-warning"> 
<span class="currency">&#8377</span>
<span class="num">${p.price}</span>
</span>
</p>
<!-- price-detail-wrap .// -->
<dl class="item-property">
<dt>Description</dt>
<dd>
<p>${p.productDesc}</p>
</dd>
</dl>
<br>
<hr>
<c:if test="${p.quantity == 0 }">
<span class="btn btn-primary btn-product ">Out of Stock</span>
</c:if>
<a href="productdisplay" class="btn btn-success btn-product"><span class="glyphicon glyphicon-shopping-cart"></span>BACK</a>
</div>
</div></c:forEach>
</div>
</div>


