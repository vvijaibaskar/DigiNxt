<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
 <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
  <style>
    /* Add a gray background color and some padding to the footer */
    footer {
      background-color: #f2f2f2;
      padding: 25px;
    }

    .carousel-inner img {
      width: 100%; /* Set width to 100% */
      min-height: 200px;
    }

    /* Hide the carousel text when the screen is less than 600 pixels wide */
    @media (max-width: 600px) {
      .carousel-caption {
        display: none; 
      }
    }
  </style>
</head>
<body background="<c:url value="/resources/images/background2.jpg" />" >

<div class="container">
	<div class="row">
	        <div class="col-sm-2">
			<figure class="figure">
						<img src="<c:url value="/resources/images/logo4.jpg"/>" class="img-responsive" style="width:100%" alt="Image">
						<div class="carousel-caption">
						<h2 > VIJAI MOBILES</h2>
						</div>
			</figure>
			</div>
			
			<div class="col-sm-8">
			   <h1>  <p class="text-center">VIJAI Mobiles </h1>
			   <h2> <p class="text-center">One click away from get connected to the whole world</h2>
			   <h2> <p class="text-center">Click once and bring the earth in your hand </h2>
			</div>
	        <div class="col-sm-2">
			<figure class="figure">
						<img src="<c:url value="/resources/images/logo4.jpg"/>" class="img-responsive" style="width:100%" alt="Image">
						<div class="carousel-caption">
						<h2 > VIJAI MOBILES</h2>
						</div>
			</figure>
			</div>
	</div>
</div>
<nav background="<c:url value="/resources/images/green.png"/>" class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
      <a class="navbar-brand" href="#">Search by</a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
        <li class="active"><a href="#">Price</a></li>
        <li><a href="#" class="bg-danger">Brands</a></li>
        <li><a href="#" >Size</a></li>
      </ul>
      <ul class="nav navbar-nav navbar-right">
       <li><a href="#" class="bg-danger">Accessories</a></li>
         <li><a href="#"class= "bg-info">Lucky Draw</a></li>
        <li><a href="login"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
      </ul>
    </div>
  </div>
</nav>



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
		
				<div class="item">
					<img src="<c:url value="/resources/images/image4.jpg"/>" alt="Image" width="152" height="118">
					<div class="carousel-caption">
						<h3>Buy for 5000</h3>
						<p>Sony</p>
					</div>      
				</div>

				<div class="item">
					<img src="<c:url value="/resources/images/image5.jpg"/>" alt="Image" width="152" height="118">
					<div class="carousel-caption">
						<h3>Buy for 2000</h3>
						<p>Sony</p>
					</div>      
				</div>

				<div class="item">
					<img src="<c:url value="/resources/images/image6.jpg"/>" alt="Image" width="152" height="118">
					<div class="carousel-caption">
						<h3>Buy for 5000</h3>
						<p>Buy 1 get 1 free</p>
					</div>      
				</div>
		
	
				<div class="item">
					<img src="<c:url value="/resources/images/image8.jpg"/>" alt="Image" width="152" height="118">
					<div class="carousel-caption">
						<h3>Buy for 20000</h3>
						<p>iPhone</p>
					</div>      
				</div>
		
				<div class="item">
					<img src="<c:url value="/resources/images/image9.jpg"/>" alt="Image" width="152" height="118">
					<div class="carousel-caption">
						<h3>Buy for 5000</h3>
						<p>Sony</p>
					</div>      
				</div>

				<div class="item">
					<img src="<c:url value="/resources/images/image10.jpg"/>" alt="Image" width="152" height="118">
					<div class="carousel-caption">
						<h3>Buy for 2000</h3>
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
		
	
				<div class="item">
					<img src="<c:url value="/resources/images/image14.jpg"/>" alt="Image" width="152" height="118">
					<div class="carousel-caption">
						<h3>Buy for 5000</h3>
						<p>Sony</p>
					</div>      
				</div>

				<div class="item">
					<img src="<c:url value="/resources/images/image15.jpg"/>" alt="Image" width="152" height="118">
					<div class="carousel-caption">
						<h3>Buy for 2000</h3>
						<p>Sony</p>
					</div>      
				</div>

				<div class="item">
					<img src="<c:url value="/resources/images/image16.jpg"/>" alt="Image" width="152" height="118">
					<div class="carousel-caption">
						<h3>Buy for 5000</h3>
						<p>Buy 1 get 1 free</p>
					</div>      
				</div>
		
				<div class="item">
					<img src="<c:url value="/resources/images/image17.jpg"/>" alt="Image" width="152" height="118">
					<div class="carousel-caption">
						<h3>Buy for Rs.9990</h3>
						<p>Sony</p>
					</div>      
				</div>
		
				<div class="item">
					<img src="<c:url value="/resources/images/image18.jpg"/>" alt="Image" width="152" height="118">
					<div class="carousel-caption">
						<h3>Buy for 20000</h3>
						<p>iPhone</p>
					</div>      
				</div>
		
				<div class="item">
					<img src="<c:url value="/resources/images/image11.jpg"/>" alt="Image" width="152" height="118">
					<div class="carousel-caption">
						<h3>Buy for 5000</h3>
						<p>Sony</p>
					</div>      
				</div>

				<div class="item">
					<img src="<c:url value="/resources/images/image12.jpg"/>" alt="Image" width="152" height="118">
					<div class="carousel-caption">
						<h3>Buy for 2000</h3>
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

<div class="container text-center">    
	<h3>Our partners</h3>
	<br>
	<div class="row">
		<div class="col-sm-2">
			<img src="<c:url value="/resources/images/samsunggalaxylogo.png"/>" class="img-responsive" style="width:100%" alt="Image">
		</div>
		<div class="col-sm-2"> 
			<img src="<c:url value="/resources/images/multiple_companies.png"/>" class="img-responsive" style="width:100%" alt="Image">
		</div>
		<div class="col-sm-2"> 
			<img src="<c:url value="/resources/images/htc.jpg"/>" class="img-responsive" style="width:100%" alt="Image">
		</div>
		<div class="col-sm-2"> 
			<img src="<c:url value="/resources/images/Blackberry.png"/>" class="img-responsive" style="width:100%" alt="Image">
		</div> 
		<div class="col-sm-2"> 
			<img src="<c:url value="/resources/images/lg.jpg"/>" class="img-responsive" style="width:100%" alt="Image">
		</div>     
		<div class="col-sm-2"> 
			<img src="<c:url value="/resources/images/micromax_advt.png"/>" class="img-responsive" style="width:100%" alt="Image">
		</div> 
	</div>
</div><br>

<footer class="container-fluid text-center">
					<p class="bg-danger"><h3>Number 1 Website for Selling mobiles for the past 10 years</h3> </p>
					<p class="bg-danger" > <h2>Got the award for best seller from Mobile Associations of India</h2></p>
</footer>


</body>
</html>