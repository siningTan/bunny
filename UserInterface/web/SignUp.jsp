<html>
    <head>
        <title>DABAO</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <script src="bootstrap.js"></script>
        <script src="bootstrap-switch.js"></script>
        <script src="jquery-1.11.3.js"></script>
        
        <link rel="stylesheet" href ="bootstrap.css" />
        <link rel="stylesheet" href ="cover.css" />
        
    </head>
    <body>
        <div class="site-wrapper">
            <div class="site-wrapper-inner">
                <div class="cover-container">
                    <h3>Create an account:</h3> 
                    <form class="form-signin" action ='SignUpServlet'>
                        <div class="table">
                            <br>
                                <input type="text" name="inputUsername" class="form-control-table" placeholder="Username" required autofocus>
                                 <input type="text" name="inputName" class="form-control-table" placeholder="Name" required autofocus>
                                  <input type="text" name="inputPassword" class="form-control-table" placeholder="Password" required autofocus>
                                  <p style="color:white"><font face="verdana" size='1'>*Password must be no shorter than 7 characters</font></p>
                                  <input type="text" name="inputconfirmPassword" class="form-control-table" placeholder="Confirm Password" required autofocus>
                                  <input type="text" name="inputContactNumber" class="form-control-table" placeholder="Contact Number" required autofocus>
                                  <p style="color:white"><font face="verdana" size='1'>*No spacing between numbers</font></p>
                                  <input type="text" name="inputCompanyCode" class="form-control-table" placeholder="Company Code" required autofocus>
                        </div>
                        <br>
                        <button class="btn btn-primary btn-block" type="submit" name="sign-up"><font face="verdana">Register</font></button>
                        <button class="btn btn-primary btn-block" type="submit" name="sign-up"><font face="verdana">Back to Sign In Page</font></button>
                    </form>
                </div>
            </div>

        </div>
    </body>
</html>