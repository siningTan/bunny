<%-- 
    Document   : login.jsp
    Created on : Oct 20, 2015, 4:38:40 PM
    Author     : Si Ning
--%>

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../../favicon.ico">

    <title>DABAO Sign Up</title>

    <!-- Bootstrap core CSS -->
    <link href="resources/css/dabao.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="resources/css/signin.css" rel="stylesheet">

    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
    <!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
    <script src="resources/js/ie-emulation-modes-warning.js"></script>

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>

  <body>

      <div class="container">
          <form class="form-signin">
              <h2 class="form-signin-heading">Create an account:</h2><br><br>
              <form class="form-signin" action ='SignUpServlet'>
                  <div class="table">
                      <br>
                      <input type="text" name="inputUsername" class="form-control-table" placeholder="Username" required autofocus>
                      <input type="text" name="inputName" class="form-control-table" placeholder="Name" required autofocus>
                      <input type="text" name="inputPassword" class="form-control-table" placeholder="Password" required autofocus>
                      <center><p style="color:white"><font face="verdana" size='1'>*Password must be no shorter than 7 characters</font></p></center>
                      <input type="text" name="inputconfirmPassword" class="form-control-table" placeholder="Confirm Password" required autofocus>
                      <input type="text" name="inputContactNumber" class="form-control-table" placeholder="Contact Number" required autofocus>
                      <center><p style="color:white"><font face="verdana" size='1'>*No spacing between numbers</font></p></center>
                      <input type="text" name="inputCompanyCode" class="form-control-table" placeholder="Company Code" required autofocus>
                  </div>
                  <br>
                  <button class="btn btn-primary btn-block" type="submit" name="sign-up"><font face="verdana">Register</font></button>
                  <button class="btn btn-primary btn-block" type="submit" name="sign-up"><font face="verdana">Back to Sign In Page</font></button>
              </form>
      </div> <!-- /container -->


      <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
      <script src="../../assets/js/ie10-viewport-bug-workaround.js"></script>
  </body>
</html>