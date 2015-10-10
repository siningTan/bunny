<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
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
        <link rel="stylesheet" href ="bootstrap-switch.css"/>

        
    </head>
    <body>
        <div class="site-wrapper">

            <div class="site-wrapper-inner">

                <div class="cover-container">
                    <div class="inner cover">
                        <h3>Create an account:</h3> 
                        <form class="form-signin" action ='SignUpServlet'>

                            <div class="table">
                                <br>
                                <label for="inputUsername" class="sr-only-table">Username</label>
                                <input type="text" name="inputUsername" class="form-control-table" placeholder="Username" required autofocus>
                                <label for="inputName" class="sr-only-table">Name</label>
                                <input type="text" name="inputName" class="form-control-table" placeholder="Name" required autofocus>
                                <label for="inputPassword" class="sr-only-table">Password</label>
                                <input type="password" name="inputPassword" class="form-control-table" placeholder="Password" required autofocus>
                                <label for="inputConfirmPassword" class="sr-only-table">Confirm Password</label>
                                <input type="password" name="inputConfirmPassword" class="form-control-table" placeholder="Confirm Password" required autofocus>
                                <label for="inputCOntactNumber" class="sr-only-table">Contact Number</label>
                                <input type="text" name="inputContactNumber" class="form-control-table" placeholder="Contact Number" required autofocus>
                                <label for="inputBankAccountNumber" class="sr-only-table">Bank Account Number</label>
                                <input type="text" name="inputBankAccountNumber" class="form-control-table" placeholder="Bank Account Number" required autofocus>
                                <br>
                            </div>
                            <br>
                            
                            <div class="dropdown">
                                <button class="btn btn-default dropdown-toggle" type="button" id="dropdownMenu2" data-toggle="dropdown" >
                                    Company
                                </button><span class="caret"></span>
                                <ul class="dropdown-menu" aria-labelledby="dropdownMenu2">
                                    <li><a href="#">Action</a></li>
                                    <li><a href="#">Another action</a></li>
                                    <li><a href="#">Something else here</a></li>
                                    <li><a href="#">Separated link</a></li>
                                </ul>
                                    
                            </div>
                            <button class="btn btn-primary btn-block" type="submit" name="sign-up">Register</button>
                    </div> <!-- /container -->

                    <div class="mastfoot">
                        <div class="inner">
                            <p>Created by Eureka!</p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>