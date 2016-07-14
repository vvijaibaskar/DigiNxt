<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<!-- <meta http-equiv="refresh" content="0; URL=./onLoad" /> -->
<spring:url value="resources/menu.css" var="menuCSS" />
<link href="${menuCSS}" rel="stylesheet" />
<title>Shopping Cart</title>

<style>

#head{
color:blue
}
/* Main */
#menu {
	width: 100%;
	margin: 0;
	padding: 10px 0 0 0;
	list-style: none;
	background-color: #111;
	background-image: linear-gradient(#444, #111);
	border-radius: 50px;
	box-shadow: 0 2px 1px #9c9c9c;
}

#menu li {
	float: left;
	padding: 0 0 10px 0;
	position: relative;
}

#menu a {
	float: left;
	height: 25px;
	padding: 0 25px;
	color: #999;
	text-transform: uppercase;
	font: bold 12px/25px Arial, Helvetica;
	text-decoration: none;
	text-shadow: 0 1px 0 #000;
}

#menu li:hover>a {
	color: #fafafa;
}

* html #menu li a:hover { /* IE6 */
	color: #fafafa;
}

#menu li:hover>ul {
	display: block;
}

/* Sub-menu */
#menu ul {
	list-style: none;
	margin: 0;
	padding: 0;
	display: none;
	position: absolute;
	top: 35px;
	left: 0;
	z-index: 99999;
	background-color: #444;
	background-image: linear-gradient(#444, #111);
	-moz-border-radius: 5px;
	border-radius: 5px;
}

#menu ul li {
	float: none;
	margin: 0;
	padding: 0;
	display: block;
	box-shadow: 0 1px 0 #111111, 0 2px 0 #777777;
}

#menu ul li:last-child {
	box-shadow: none;
}

#menu ul a {
	padding: 10px;
	height: auto;
	line-height: 1;
	display: block;
	white-space: nowrap;
	float: none;
	text-transform: none;
}

* html #menu ul a { /* IE6 */
	height: 10px;
	width: 150px;
}

*:first-child+html #menu ul a { /* IE7 */
	height: 10px;
	width: 150px;
}

#menu ul a:hover {
	background-color: #0186ba;
	background-image: linear-gradient(#04acec, #0186ba);
}

#menu ul li:first-child a {
	border-radius: 5px 5px 0 0;
}

#menu ul li:first-child a:after {
	content: '';
	position: absolute;
	left: 30px;
	top: -8px;
	width: 0;
	height: 0;
	border-left: 5px solid transparent;
	border-right: 5px solid transparent;
	border-bottom: 8px solid #444;
}

#menu ul li:first-child a:hover:after {
	border-bottom-color: #04acec;
}

#menu ul li:last-child a {
	border-radius: 0 0 5px 5px;
}

/* Clear floated elements */
#menu:after {
	visibility: hidden;
	display: block;
	font-size: 0;
	content: " ";
	clear: both;
	height: 0;
}

* html #menu {
	zoom: 1;
} /* IE6 */
*:first-child+html #menu {
	zoom: 1;
} /* IE7 */
</style>
</head>
<%@include file="Header.jsp" %>
<body background="<c:url value="/resources/images/background2.jpg" />" >

<div>


	<ul id="menu">
		<c:forEach items="${categoryList}" var="category">
			<li><a style="color:blue;" href=${category.name} > ${category.name}</a>
				<ul>
					<c:forEach items="${category.products}" var="product">
						<li><a style="background-color:#00FF00" href="<c:url value='product/get/${product.id}'/>">${product.name}</a></li>
					</c:forEach>
				</ul></li>
		</c:forEach>
	</ul>

</div>

<div class="container">
	<div class="row">
		<div class="col-sm-4">
			<div id="myCarousel" class="carousel slide" data-ride="carousel">
				<!-- Indicators -->
				<ol class="carousel-indicators">
					<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
					<li data-target="#myCarousel" data-slide-to="1"></li>
				</ol>

			<!-- Wrapper for slides -->
			<div class="carousel-inner" role="listbox">
				<div class="item active">
					<img src="<c:url value="/resources/images/image3.jpg"/>"  alt="Image" width="152" height="118">
					<div class="carousel-caption">
						<h3>Buy for 20000</h3>
						<p>iPhone</p>
					</div>      
				</div>
		
				<div class="item">
					<img src="<c:url value="/resources/images/image2.jpg"/>"  alt="Image" width="152" height="118">
					<div class="carousel-caption">
						<h3>Buy for Rs.9990</h3>
						<p>Sony</p>
					</div>      
				</div>
		
				<div class="item">
					<img src="<c:url value="/resources/images/image1.jpg"/>"  alt="Image" width="152" height="118">
					<div class="carousel-caption">
						<h3>Buy for 5000</h3>
						<p>Buy 1 get 1 free</p>
					</div>      
				</div>
			</div>

			<!-- Left and right controls -->
			<a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
				<span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
				<span class="sr-only">Previous</span>
			</a>
			<a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
				<span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
				<span class="sr-only">Next</span>
			</a>
		</div>
	</div>

	<div class="col-sm-3">
			<button type ="button" class="btn-btn-info  btn-md">Hot Deals </button>
			<hr>
			<button type ="button" class="btn-btn-info  btn-md">Easy EMI options - Buy now Pay later </button>
			<hr>
			<button type ="button" class="btn-btn-info  btn-md">Attractive Exchange Offers</button>
			<hr>
			<button type ="button" class="btn-btn-info  btn-md">New Arrivals </button>
	</div>

	<div class="col-sm-4">
		<div id="myCarousel" class="carousel slide" data-ride="carousel">
			<!-- Indicators -->
			<ol class="carousel-indicators">
				<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
				<li data-target="#myCarousel" data-slide-to="1"></li>
			</ol>

			<!-- Wrapper for slides -->
			<div class="carousel-inner" role="listbox">
				<div class="item active">
					<img src="<c:url value="/resources/images/image20.jpg"/>" alt="Image" width="152" height="118">
					<div class="carousel-caption">
						<h3 class="bg-danger">Buy for 5000</h3>
						<p class="bg-danger">Buy 1 get 1 free</p>
					</div>      
				</div>
		
				<div class="item">
					<img src="<c:url value="/resources/images/image19.jpg"/>" alt="Image" width="152" height="118">
					<div class="carousel-caption">
						<h3>Buy for Rs.9990</h3>
						<p>Sony</p>
					</div>      
				</div>
			</div>

			<!-- Left and right controls -->
			<a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
				<span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
				<span class="sr-only">Previous</span>
			</a>
			<a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
				<span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
				<span class="sr-only">Next</span>
			</a>
		</div>
	</div>
	</div>
		<hr>
	</div>

</div> 
<div class="container ">    
	<ul class="text-left"> <h3>Latest models</h3>
	<ul class="text-right">	<h3> Feedbacks </h3>

	<br>
	<div class="row">
		<div class="col-sm-3">
			<img src="<c:url value="/resources/images/multiple_companies.png"/>" class="img-responsive" style="width:100%" alt="Image">
		</div>
		<div class="col-sm-3"> 
			<img src="<c:url value="/resources/images/image_Best_Buy_Smart_phones.png"/>" class="img-responsive" style="width:100%" alt="Image">
		</div>
		<div class="col-sm-3">
			<div class="well">
				<p><h6>I bought the mobile from VIJAI mobiles for 50% off in 2012. Still it is working fine. Great website to buy mobiles - Ram	</h6> </p>
			</div>
			<div class="well">
				<p> <h6>I ordered the mobile on monday. The next day itself I received the mobile. Unbelievable service - Ragoth </h6> </p>
			</div>
		</div>
		<div class="col-sm-3">
			<div class="well">
				<p> <h6>The packaging of the phone was very good. I recommend this site for my friends-Vyas</h6> </p>
			</div>
			<div class="well">
				<p><h6>No websites can sell as cheap as VIJAI mobiles. The most trusted website by the customers-Ganguly</h6> </p>
			</div>
		</div>  
	</div>
	<hr>
</div>
<footer class="container-fluid text-center">
					<p class="bg-danger"><h3>Number 1 Website for Selling mobiles for the past 10 years</h3> </p>
					<p class="bg-danger" > <h2>Got the award for best seller from Mobile Associations of India</h2></p>
</footer>
</body>
</html>