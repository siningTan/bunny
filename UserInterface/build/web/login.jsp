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
                        <h1>DABAO</h1>
                        <form class="form-signin" action ='(loginservlet)'>
                            
                            <label for="inputEmail" class="sr-only"><font face="verdana">Username</font></label>
                           <input type="email" name="inputEmail" class="form-control" placeholder="Username" required autofocus>
                           <label for="inputPassword" class="sr-only"><font face="verdana">Password</font></label>
                           <input type="password" name="inputPassword" class="form-control" placeholder="Password" required>

                           <div class="checkbox">
                               <label>
                                   <input type="checkbox" value="remember-me"> <font face="verdana" size="2">Remember me</font>
                               </label>
                           </div>

                           <button class="btn btn-primary btn-block" type="submit" name="sign-in"><font face="verdana">Sign in</font></button>
                           <button class="btn btn-primary btn-block" type="submit" name="sign-up" ><font face="verdana">Register as a New User</font></button>

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
