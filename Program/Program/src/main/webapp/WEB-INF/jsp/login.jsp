<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>

<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="stylish Sign in and Sign up Form A Flat Responsive widget, Login form web template,Flat Pricing tables,Flat Drop downs  Sign up Web Templates, Flat Web Templates, Login signup Responsive web template, Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!--online_fonts-->
	<link href="//fonts.googleapis.com/css?family=Sansita:400,400i,700,700i,800,800i,900,900i&amp;subset=latin-ext" rel="stylesheet">
	<link href="//fonts.googleapis.com/css?family=Poiret+One" rel="stylesheet">
<!--//online_fonts-->
	<link href="css/style1.css" rel='stylesheet' type='text/css' media="all" /><!--stylesheet-->
</head>
<body>
<h1>Capstore sign in Form</h1>
<div class="form-w3ls">
	<div class="form-head-w3l">
		<img src="tick.png"  width="100" style="width:50%">
	</div>
    <ul class="tab-group cl-effect-4">
        <li class="tab active"><a href="#signin-agile">Sign-In</a></li>
		    
    </ul>
     <%
        String userid=(String)session.getAttribute("userid");
        
        //redirect user to home page if already logged in
        if(userid!=null){
            response.sendRedirect("home.jsp");
        }
 
        String password=request.getParameter("password");
        
        if(password!=null){
            if(password.equals("false")){
                   out.print("Incorrect login details!");                       
            }
            else{
                out.print("Some error occurred!");
            }
        }
        %>
    
    <div class="tab-content">
        <div id="signin-agile">   
			<form action="\Admin" method="post">
				
					<p class="header">User Id</p>
				<input type="text" name="user" placeholder="User Name" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'User Name';}" required="required">
				
				<p class="header">Password</p>
				<input type="password" name="password" placeholder="Password" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Password';}" required="required">
				
				<input type="checkbox" id="brand" value="">
				<label for="brand"><span></span> Remember me?</label>
				
				<input type="submit" class="sign-in" value="Sign In">
				<div class="container" style="background-color:#f1f1f1">
     
     
   <div class="adminpanel-span" id="approved-users">
  <span class="psw">Forgot<a href="#">password</a></span>
  <a href="#" style="clear:both;float:right; font-size: 18px;" target="_blank">sign in</a>
</div>
    </div>
		
		</form>
    </div><!-- tab-content -->
</div> <!-- /form -->	

  
 
</div>
 

<!-- js files -->
<script src='js/jquery.min.js'></script>
<script src="js/index.js"></script>
<!-- /js files -->





</body>
</html>