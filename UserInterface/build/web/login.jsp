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


                            <input type="email" name="inputEmail" class="form-control" placeholder="Username" required autofocus>

                            <input type="password" name="inputPassword" class="form-control" placeholder="Password" required>



                            <button class="btn btn-primary btn-block" type="submit" name="sign-in"><font face="verdana">Sign in</font></button>
                            <button class="btn btn-primary btn-block" type="submit" name="sign-up" ><font face="verdana">Register as a New User</font></button>
                        </form>
                        <br>
                        <div class="alert alert-success" role="alert">
                        <span class="sr-only">Success:</span>
                        Hi there! Your account has been created.
                        </div>

                        <div class="alert alert-danger" role="alert">
                        <span class="sr-only">Error:</span>
                        Invalid Username/password!
                        </div>
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
