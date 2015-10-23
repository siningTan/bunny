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
        <script src="resources/js/ie-emulation-modes-warning.js"></script> 
        <script src="resources/js/dabao.js"></script> 
        <script src="resources/js/bootstrap.min.js"></script>
        <script src="resources/js/transition.js"></script> 
        <script src="resources/js/carousel.js"></script> 
        <script src="resources/js/collapse.js"></script> 



        <title>DABAO Home Page</title>
        <!-- Bootstrap core CSS -->
        <link href="resources/css/dabao.css" rel="stylesheet">

        <link href="resources/css/carousel.css" rel="stylesheet">
        <!-- Custom styles for this template -->
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
                        <li class="active"><a href="#">Food Menu <span class="sr-only">(current)</span></a></li>
                        <li><a href="#">Cart</a></li>
                        <li><a href="#">Payment</a></li>
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
        <div class="container">
            <div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
                <!-- Indicators -->
                <ol class="carousel-indicators">
                    <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
                    <li data-target="#carousel-example-generic" data-slide-to="1"></li>
                    <li data-target="#carousel-example-generic" data-slide-to="2"></li>
                </ol>

                <!-- Wrapper for slides -->
                <div class="carousel-inner" role="listbox">
                    <div class="item active">
                        <img src="resources/pictures/1.png" alt="...">
                        <div class="carousel-caption">
                            ...
                        </div>
                    </div>
                    <div class="item">
                        <img src="resources/pictures/2.png" alt="...">
                        <div class="carousel-caption">
                            ...
                        </div>
                    </div>
                    ...
                </div>

                <!-- Controls -->
                <a class="left carousel-control" href="#carousel-example-generic" role="button" data-slide="prev">
                    <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
                    <span class="sr-only">Previous</span>
                </a>
                <a class="right carousel-control" href="#carousel-example-generic" role="button" data-slide="next">
                    <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
                    <span class="sr-only">Next</span>
                </a>
            </div>

            <div class="panel-group" id="accordion" role="tablist" aria-multiselectable="true">
                <div class="panel panel-default">
                    <div class="panel-heading" role="tab" id="headingOne">
                        <h4 class="panel-title">
                            <a role="button" data-toggle="collapse" data-parent="#accordion" href="#collapseOne" aria-expanded="true" aria-controls="collapseOne">
                                Chomp Chomp
                            </a>
                        </h4>
                    </div>
                    <div id="collapseOne" class="panel-collapse collapse in" role="tabpanel" aria-labelledby="headingOne">
                        <div class="panel-body">
                            <div class="row">
                                <div class="thumbnail">
                                    <img src="resources/pictures/chickenRiceStall.jpg" alt="...">
                                    <div class="caption">
                                        <a class="button" href="">Chicken Rice Stall</a>
                                    </div>
                                </div>
                                <div class="thumbnail">
                                    <img src="resources/pictures/chickenRiceStall.jpg" alt="...">
                                    <div class="caption">
                                        <a class="button" href="">Chicken Rice Stall</a>
                                    </div>
                                </div>
                                <div class="thumbnail">
                                    <img src="resources/pictures/chickenRiceStall.jpg" alt="...">
                                    <div class="caption">
                                        <a class="button" href="">Chicken Rice Stall</a>
                                    </div>
                                </div>
                                <div class="thumbnail">
                                    <img src="resources/pictures/chickenRiceStall.jpg.jpg" alt="...">
                                    <div class="caption">
                                        <a class="button" href="">Chicken Rice Stall</a>
                                    </div>
                                </div>
                            </div>
                            <div class="row">
                                <div class="thumbnail">
                                    <img src="resources/pictures/chickenRiceStall.jpg.jpg" alt="...">
                                    <div class="caption">
                                        <a class="button" href="">Chicken Rice Stall</a>
                                    </div>
                                </div>
                                <div class="thumbnail">
                                    <img src="resources/pictures/chickenRiceStall.jpg.jpg" alt="...">
                                    <div class="caption">
                                        <a class="button" href="">Chicken Rice Stall</a>
                                    </div>
                                </div>
                                <div class="thumbnail">
                                    <img src="resources/pictures/chickenRiceStall.jpg" alt="...">
                                    <div class="caption">
                                        <a class="button" href="">Chicken Rice Stall</a>
                                    </div>
                                </div>
                                <div class="thumbnail">
                                    <img src="resources/pictures/chickenRiceStall.jpg" alt="...">
                                    <div class="caption">
                                        <a class="button" href="">Chicken Rice Stall</a>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="panel panel-default">
                    <div class="panel-heading" role="tab" id="headingTwo">
                        <h4 class="panel-title">
                            <a class="collapsed" role="button" data-toggle="collapse" data-parent="#accordion" href="#collapseTwo" aria-expanded="false" aria-controls="collapseTwo">
                                Bedok 85
                            </a>
                        </h4>
                    </div>
                    <div id="collapseTwo" class="panel-collapse collapse" role="tabpanel" aria-labelledby="headingTwo">
                        <div class="panel-body">
                            <div class="row">
                                <div class="thumbnail">
                                    <img src="resources/pictures/chickenRiceStall.jpg" alt="...">
                                    <div class="caption">
                                        <a class="button" href="">Chicken Rice Stall</a>
                                    </div>
                                </div>
                                <div class="thumbnail">
                                    <img src="resources/pictures/chickenRiceStall.jpg" alt="...">
                                    <div class="caption">
                                        <a class="button" href="">Chicken Rice Stall</a>
                                    </div>
                                </div>
                                <div class="thumbnail">
                                    <img src="resources/pictures/chickenRiceStall.jpg" alt="...">
                                    <div class="caption">
                                        <a class="button" href="">Chicken Rice Stall</a>
                                    </div>
                                </div>
                                <div class="thumbnail">
                                    <img src="resources/pictures/chickenRiceStall.jpg" alt="...">
                                    <div class="caption">
                                        <a class="button" href="">Chicken Rice Stall</a>
                                    </div>
                                </div>
                            </div>
                            <div class="row">
                                <div class="thumbnail">
                                    <img src="resources/pictures/chickenRiceStall.jpg" alt="...">
                                    <div class="caption">
                                        <a class="button" href="">Chicken Rice Stall</a>
                                    </div>
                                </div>
                                <div class="thumbnail">
                                    <img src="resources/pictures/chickenRiceStall.jpg" alt="...">
                                    <div class="caption">
                                        <a class="button" href="">Chicken Rice Stall</a>
                                    </div>
                                </div>
                                <div class="thumbnail">
                                    <img src="resources/pictures/chickenRiceStall.jpg" alt="...">
                                    <div class="caption">
                                        <a class="button" href="">Chicken Rice Stall</a>
                                    </div>
                                </div>
                                <div class="thumbnail">
                                    <img src="resources/pictures/chickenRiceStall.jpg" alt="...">
                                    <div class="caption">
                                        <a class="button" href="">Chicken Rice Stall</a>
                                    </div>
                                </div>
                            </div> 
                        </div>
                    </div>
                </div>
                <div class="panel panel-default">
                    <div class="panel-heading" role="tab" id="headingThree">
                        <h4 class="panel-title">
                            <a class="collapsed" role="button" data-toggle="collapse" data-parent="#accordion" href="#collapseThree" aria-expanded="false" aria-controls="collapseThree">
                                Collapsible Group Item #3
                            </a>
                        </h4>
                    </div>
                    <div id="collapseThree" class="panel-collapse collapse" role="tabpanel" aria-labelledby="headingThree">
                        <div class="panel-body">
                            Anim pariatur cliche reprehenderit, enim eiusmod high life accusamus terry richardson ad squid. 3 wolf moon officia aute, non cupidatat skateboard dolor brunch. Food truck quinoa nesciunt laborum eiusmod. Brunch 3 wolf moon tempor, sunt aliqua put a bird on it squid single-origin coffee nulla assumenda shoreditch et. Nihil anim keffiyeh helvetica, craft beer labore wes anderson cred nesciunt sapiente ea proident. Ad vegan excepteur butcher vice lomo. Leggings occaecat craft beer farm-to-table, raw denim aesthetic synth nesciunt you probably haven't heard of them accusamus labore sustainable VHS.
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <!-- Bootstrap core JavaScript
        ================================================== -->
        <!-- Placed at the end of the document so the pages load faster -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
        <script src="../../dist/js/bootstrap.min.js"></script>
        <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
        <script src="../../assets/js/ie10-viewport-bug-workaround.js"></script>
    </body>
</html>