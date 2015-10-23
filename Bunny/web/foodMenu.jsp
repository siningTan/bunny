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
         <script src="resources/js/transition.js"></script> 
     <script src="resources/js/dabao.js"></script> 
     <script src="resources/js/bootstrap.min.js"></script>
 

    

    <title>DABAO Food Menu</title>
    <!-- Bootstrap core CSS -->
    <link href="resources/css/dabao.css" rel="stylesheet">
    <!-- Custom styles for this template -->
    <link href="resources/css/starter-template.css" rel="stylesheet">
    <link href="resources/css/bootstap.theme.css" rel="stylesheet">
    <link href="resources/css/bootstap.min.css" rel="stylesheet">

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
        <li><a href="#">Cart <span class="badge">1</span></a></li>
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
    <br>
    <div class="container">
        <ol class="left breadcrumb">
            <li><a href="#">Home</a></li>
            <li class="active">Chomp Chomp</li>
        </ol>
        <br>

        <div class="jumbotron">
            <div class="row">
                <div class="thumbnail">
                    <img src="resources/pictures/chickenrice.jpg" alt="...">
                    <div class="caption">
                        <!-- Button trigger modal -->
                        <button type="button" class="button" data-toggle="modal" data-target="#myModal">
                            Chicken Rice
                        </button>

                        <!-- Modal -->
                        <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
                            <div class="modal-dialog" role="document">
                                <div class="modal-content">
                                    <div class="modal-header">
                                        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                                        <h4 class="modal-title" id="myModalLabel">Modal title</h4>
                                    </div>
                                    <div class="modal-body">
                                        ...
                                    </div>
                                    <div class="modal-footer">
                                        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                                        <button type="button" class="btn btn-primary">Save changes</button>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="thumbnail">
                    <img src="resources/pictures/chickenrice.jpg" alt="...">
                    <div class="caption">
                        <a class="button" href="">Chicken Rice</a>
                    </div>
                </div>
                <div class="thumbnail">
                    <img src="resources/pictures/chickenrice.jpg" alt="...">
                    <div class="caption">
                        <a class="button" href="">Chicken Rice</a>
                    </div>
                </div>
                <div class="thumbnail">
                    <img src="resources/pictures/chickenrice.jpg" alt="...">
                    <div class="caption">
                        <a class="button" href="">Chicken Rice</a>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="thumbnail">
                    <img src="resources/pictures/chickenrice.jpg" alt="...">
                    <div class="caption">
                        <a class="button" href="">Chicken Rice</a>
                    </div>
                </div>
                <div class="thumbnail">
                    <img src="resources/pictures/chickenrice.jpg" alt="...">
                    <div class="caption">
                        <a class="button" href="">Chicken Rice</a>
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