<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" ></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
</head>

<body>
<button type="button" class="btn btn-primary position-relative">
  Inbox
  <span class="position-absolute top-0 start-100 translate-middle badge rounded-pill bg-danger">
    99+
    <span class="visually-hidden">unread messages</span>
  </span>
</button>
<div id="carouselExampleControls" class="carousel slide" data-bs-ride="carousel">
  <div class="carousel-inner">
    <div class="carousel-item active" style="width:500px;height:500px;">
      <img src="https://upload.wikimedia.org/wikipedia/it/thumb/c/c9/Francobollo_Pokemon_Pikachu.jpg/640px-Francobollo_Pokemon_Pikachu.jpg" class="d-block w-100" alt="..." style="width:500px;height:500px;">
    </div>
    <div class="carousel-item" style="width:500px;height:500px;">
      <img src="https://i.pinimg.com/originals/87/a1/3e/87a13ebe6b5e4f100b84b0e68bc994d5.jpg" class="d-block w-100" alt="...">
    </div>
    <div class="carousel-item" style="width:500px;height:500px;">
      <img src="https://i.pinimg.com/originals/4a/db/f3/4adbf33b038233f79e5570adb859fc7c.png" class="d-block w-100" alt="...">
    </div>
  </div>
  <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleControls" data-bs-slide="prev">
    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
    <span class="visually-hidden">Previous</span>
  </button>
  <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleControls" data-bs-slide="next">
    <span class="carousel-control-next-icon" aria-hidden="true"></span>
    <span class="visually-hidden">Next</span>
  </button>
</div>


<button type="button" class="btn btn-lg btn-danger" data-bs-toggle="popover" title="Popover title" data-bs-content="And here's some amazing content. It's very engaging. Right?">Click to toggle popover</button>
<div class="alert alert-primary" role="alert">
  Prova Messaggio !!!!!
</div>
<button type="button" class="btn btn-outline-primary">Pulsante1</button>
<button type="button" class="btn btn-outline-secondary">Pulsante2</button>
<button type="button" class="btn btn-outline-success">Success</button>
<button type="button" class="btn btn-outline-danger">Danger</button>
<button type="button" class="btn btn-outline-warning">Warning</button>
<button  id="btn03" type="button" class="btn btn-outline-info">Info</button>
<button id="btn02" type="button" class="btn btn-outline-light">Light</button>
<button id="btn01" type="button" class="btn btn-outline-dark">Testo Originale</button>


<div class="dropdown">
  <button class="btn btn-secondary dropdown-toggle" type="button" id="dropdownMenuButton1" data-bs-toggle="dropdown" aria-expanded="false">
    Dropdown button
  </button>
  <ul class="dropdown-menu" aria-labelledby="dropdownMenuButton1">
    <li><a class="dropdown-item" href="#">Action</a></li>
    <li><a class="dropdown-item" href="#">Another action</a></li>
    <li><a class="dropdown-item" href="#">Something else here</a></li>
  </ul>
</div>

<div class="accordion" id="accordionExample">
  <div class="accordion-item">
    <h2 class="accordion-header" id="headingOne">
      <button class="accordion-button" type="button" data-bs-toggle="collapse" data-bs-target="#collapseOne" aria-expanded="true" aria-controls="collapseOne">
        Titolo del primo Accordiojn
      </button>
    </h2>
    <div id="collapseOne" class="accordion-collapse collapse show" aria-labelledby="headingOne" data-bs-parent="#accordionExample">
      <div class="accordion-body">
        Prova COntenuto Primo Accordion
      </div>
    </div>
  </div>
  <div id="accordion2" class="accordion-item">
    <h2 class="accordion-header" id="headingTwo">
      <button class="accordion-button collapsed" type="button" data-bs-toggle="collapse" data-bs-target="#collapseTwo" aria-expanded="false" aria-controls="collapseTwo">
        Accordion Item #2
      </button>
    </h2>
    <div id="collapseTwo" class="accordion-collapse collapse" aria-labelledby="headingTwo" data-bs-parent="#accordionExample">
      <div class="accordion-body">
        <strong>This is the second item's accordion body.</strong> It is hidden by default, until the collapse plugin adds the appropriate classes that we use to style each element. These classes control the overall appearance, as well as the showing and hiding via CSS transitions. You can modify any of this with custom CSS or overriding our default variables. It's also worth noting that just about any HTML can go within the <code>.accordion-body</code>, though the transition does limit overflow.
      </div>
    </div>
  </div>
  <div class="accordion-item">
    <h2 class="accordion-header" id="headingThree">
      <button class="accordion-button collapsed" type="button" data-bs-toggle="collapse" data-bs-target="#collapseThree" aria-expanded="false" aria-controls="collapseThree">
        Accordion Item #3
      </button>
    </h2>
    </div>
  </div>
  </div>
</div>
</body>
<script>
$(document).ready(function(){
/*
    $("#btn01").html("Ho cambiato il testo di un pulsante");	
    $("#accordion2").hide();
    $("#collapseTwo").hide();
    $(".accordion-header").hide();
  */  
  var a=1;
  
    $("#btn01").click(function() { 
    	 if (a==1) {
    		 $("#btn01").html("Ho cambiato il testo di un pulsante");	
    		 a=2;
    	 }
    	    else {
    	    	$("#btn01").html("Testo Originale");
    	    	a=1;
    	    }
    });    

});

</script>

</html>