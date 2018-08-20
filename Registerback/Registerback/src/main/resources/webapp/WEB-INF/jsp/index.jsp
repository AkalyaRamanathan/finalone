<!DOCTYPE html>
<html>
<head>
<title>Capstore registration</title>
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
<h1>Capstore Registration Form</h1>
<div class="form-w3ls">
	<div class="form-head-w3l">
		<img src="capgemini.svg"   height="42" width="42" >
	</div>
    <ul class="tab-group cl-effect-4">
        <li class="tab active"><a href="http://localhost:4441/savecustomers">Customer</a></li>
		<li class="tab"><a href="#signup-agile">Merchant</a></li>        
    </ul>
    <div class="tab-content">
        <div id="signin-agile">   
			<form action="http://localhost:4441/savecustomers
			" method="post">
				<p class="header">User id</p>
				<input type="email" name="id" placeholder="Your email" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Your Full Name';}" required="required">
				
				<p class="header">User Name</p>
				<input type="text" name="userName" placeholder="User Name" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'User Name';}" required="required">
				
				
				<p class="header">Age</p>
				<input type="text" name="age" placeholder="Your Age" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Your Age';}" required="required">
				<p class="header">Phone Number</p>
				<input type="tel" name="phonenumber" placeholder="Your Phonenumber" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Your phonenumber';}" required="required">
				<p class="header">Address</p>
				<input type="text" name="address" placeholder="Your Address" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Your Address';}" required="required">
			    <p class="header">Gender</p><br>	
                <input type="radio" value="None" id="male" name="gender" checked/>
               <label for="male" class="radio" >Male</label>
                <input type="radio" value="None" id="female" name="gender" />
                <label for="female" class="radio">Female</label>
  
				<p class="header">Password</p>
				<input type="password" name="password" placeholder="Password" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Password';}" required="required">
				<p class="header">Confirm Password</p>
				<input type="password" name="confirmpassword" placeholder="Confirm Password" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Confirm Password';}" required="required">
				
				<input type="checkbox" id="brand" value="">
				
				
				<input type="submit" class="sign-in" value="Sign Up">
			</form>
			 <p>Already have an account? <a href="http://localhost:4441/savecustomers">Sign IN</a>.</p>
		</div>
		<div id="signup-agile">   
			<form action="login.jsp" method="post">
				<p class="header">Merchant Id</p>
				<input type="email" name="id" placeholder="Email" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Email';}" required="required">
				<p class="header">Merchant Name</p>
				<input type="text" name="merchantName" placeholder="Your Full Name" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Your Full Name';}" required="required">

				<p class="header">Phone Number</p>
				<input type="tel" name="phonenumber" placeholder="Your Phonenumber" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Your phonenumber';}" required="required">
				<p class="header">Address</p>
				<input type="text" name="address" placeholder="Your Address" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Your Address';}" required="required">
			    
				<p class="header">Gender</p><br>	
    <input type="radio" value="None" id="male" name="gender" checked/>
    <label for="male" class="radio" >Male</label>
    <input type="radio" value="None" id="female" name="gender" />
    <label for="female" class="radio">Female</label>
  
				<p class="header">Product type</p>
				<input type="text" name="producttype" placeholder="Your Product type" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Your ProductType';}" required="required">
				
				<p class="header">Password</p>
				<input type="password" name="password" placeholder="Password" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Password';}" required="required">
				
				<p class="header">Confirm Password</p>
				<input type="password" name="password" placeholder="Confirm Password" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Confirm Password';}" required="required">
				
				<input type="submit" class="register" value="Sign up">
			</form>
			 <p>Already have an account? <a href="#">LOG IN</a>.</p>
		</div> 
    </div><!-- tab-content -->
</div> <!-- /form -->	  

<!-- js files -->
<script src='js/jquery.min.js'></script>
<script src="js/index.js"></script>
<!-- /js files -->
</body>
</html>
