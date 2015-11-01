<%-- 
    Document   : homepage
    Created on : Oct 20, 2015, 7:18:53 PM
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
        <script src="resources/js/jquery-1.11.3.js"></script>  
        <script src="resources/js/jquery-1.11.3.min.js"></script>   
        <script src="resources/js/dabao.js"></script> 
        <script src="resources/js/bootstrap.min.js"></script>




        <title>DABAO Payment</title>
        <link href="resources/css/dabao.css" rel="stylesheet">
        <link href="resources/css/bootstap.min.css" rel="stylesheet">
        <link href="resources/css/starter-template.css" rel="stylesheet">

        <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
        <!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->



        <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
        <!--[if lt IE 9]>
          <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
          <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
        <![endif]-->
    </head>

    <body>
        <nav class="navbar navbar-fixed-top">
            <div class="container-fluid">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="#">DABAO</a>
                </div>

                <!-- Collect the nav links, forms, and other content for toggling -->
                <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                    <ul class="nav navbar-nav">
                        <li><a href="#">Food Menu</a></li>
                        <li><a href="#">Cart</a></li>
                        <li class="active"><a href="#">Payment <span class="sr-only">(current)</span></a></li>
                        <li><a href="#">History</a></li>
                        <li><a href="#">Settings</a></li>
                        <li><a href="#">Userguide</a></li>
                    </ul>
                    <form class="navbar-form navbar-left" role="search">
                        <div class="form-group">
                            <input type="text" class="form-control" placeholder="Search">
                        </div>
                        <button type="submit" class="btn btn-default">Submit</button>
                    </form>
                    <ul class="nav navbar-nav navbar-right">

                        <li><a href="#">Logout</a></li>
                    </ul>
                </div><!-- /.navbar-collapse -->
            </div><!-- /.container-fluid -->
        </nav>
        <br>
        <br>
        <br>
        <div class="container">
            <div class="row center">
                <div class="col-xs-8 center">
                    <div class="panel panel-info">
                        <!-- Default panel contents -->
                        <div class="panel-heading">
                            <div class="panel-title">
                                <div class="row">
                                    <div class="col-xs-12">
                                        <h4><span class="glyphicon glyphicon-credit-card"></span> Outstanding Payment</h4>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="panel-body">
                            <div class="row">
                                <div class="col-md-4"><h4><strong>Date</strong></h4></div>
                                <div class="col-md-4 text-left"><h4><strong>Food Order</strong></h4></div>
                                <div class="col-md-2 text-left"><h4><strong>Price</strong></h4></div>
                                <div class="col-md-2"><h4><strong>Sub-Total</strong></h4></div>
                            </div>
                            <hr>
                            <div class="row">
                                <div class="col-md-12">
                                    <div class="col-md-4">
                                        <h4><strong>Monday<br>19th Oct 2015 </strong></h4>
                                    </div>
                                    <div class="col-md-4 text-left">
                                        <h4 class="product-name">1.&emsp;Chicken Rice <br>2.&emsp;Coke</h4>
                                    </div>

                                    <div class="col-md-2 text-left">
                                        <h4>$2.50 <br> $0.90</h4>
                                    </div>
                                    <div class="col-md-2">
                                        <h3>$3.40</h3>
                                    </div>
                                </div>
                            </div>
                            <hr>
                            <div class="row">
                                <div class="col-md-12">
                                    <div class="col-md-4">
                                        <h4><strong>Tuesday<br>20th Oct 2015 </strong></h4>
                                    </div>
                                    <div class="col-md-4 text-left">
                                        <h4 class="product-name">1.&emsp;Chicken Rice <br>2.&emsp;Coke</h4>
                                    </div>

                                    <div class="col-md-2 text-left">
                                        <h4>$2.50 <br> $0.90</h4>
                                    </div>
                                    <div class="col-md-2">
                                        <h3>$3.40</h3>
                                    </div>
                                </div>
                            </div>
                            <hr>
                            <div class="row">
                                <div class="col-md-12">
                                    <div class="col-md-4">
                                        <h4><strong>Wednesday<br>21st Oct 2015 </strong></h4>
                                    </div>
                                    <div class="col-md-4 text-left">
                                        <h4 class="product-name">1.&emsp;Chicken Rice <br>2.&emsp;Coke</h4>
                                    </div>

                                    <div class="col-md-2 text-left">
                                        <h4>$2.50 <br> $0.90</h4>
                                    </div>
                                    <div class="col-md-2">
                                        <h3>$3.40</h3>
                                    </div>
                                </div>
                            </div>
                            <hr>
                            <div class="row">
                                <div class="col-md-12">
                                    <div class="col-md-4">
                                        <h4><strong>Thursday<br>22nd Oct 2015 </strong></h4>
                                    </div>
                                    <div class="col-md-4 text-left">
                                        <h4 class="product-name">1.&emsp;Chicken Rice <br>2.&emsp;Coke</h4>
                                    </div>

                                    <div class="col-md-2 text-left">
                                        <h4>$2.50 <br> $0.90</h4>
                                    </div>
                                    <div class="col-md-2">
                                        <h3>$3.40</h3>
                                    </div>
                                </div>
                            </div>
                            <hr>
                            <div class="row">
                                <div class="col-md-12">
                                    <div class="col-md-4">
                                        <h4><strong>Friday<br>23rd Oct 2015 </strong></h4>
                                    </div>
                                    <div class="col-md-4 text-left">
                                        <h4 class="product-name">1.&emsp;Chicken Rice <br>2.&emsp;Coke</h4>
                                    </div>

                                    <div class="col-md-2 text-left">
                                        <h4>$2.50 <br> $0.90</h4>
                                    </div>
                                    <div class="col-md-2">
                                        <h3>$3.40</h3>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="panel-footer">
                            <div class="row ">
                                <div class="col-md-12">
                                    <h4>Total: <strong><u>$17.00</u></strong></h4>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <br>
            </div>
        </div>
    </body>
</html>