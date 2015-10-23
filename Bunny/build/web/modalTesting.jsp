
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>Modal</title>
  <link href="resources/css/dabao.css" rel="stylesheet">
  <link href="resources/css/starter-template.css" rel="stylesheet">
  <link rel="stylesheet" href="resources/css/bootstrap.min.css">
  

  <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
  <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
  <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
  <![endif]-->

  <style>
    #tall {
      height: 1500px;
      width: 100px;
      background-color: black;
      color: white;
    }
  </style>
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

<div class="container">

  <div id="myModal1" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
    <div class="modal-dialog">
      <div class="modal-content">

        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
          <h4 class="modal-title" id="myModalLabel">Fried Chicken Cutlet</h4>
        </div>
        <div class="modal-body">
          <h4>Fried Chicken Cutlet</h4>
          <p>Duis mollis, est non commodo luctus, nisi erat porttitor ligula.</p>

          <h4>Popover in a modal</h4>
          <p>This <a href="#" role="button" class="btn btn-default js-popover" title="A Title" data-content="And here's some amazing content. It's very engaging. right?" data-placement="left">button</a> should trigger a popover on click.</p>

          <h4>Tooltips in a modal</h4>
          <p><a href="#" class="js-tooltip" title="Tooltip">This link</a> and <a href="#" class="js-tooltip" title="Tooltip">that link</a> should have tooltips on hover.</p>

          <hr>

          <h4>Overflowing text to show scroll behavior</h4>
          <p>Cras mattis consectetur purus sit amet fermentum. Cras justo odio, dapibus ac facilisis in, egestas eget quam. Morbi leo risus, porta ac consectetur ac, vestibulum at eros.</p>
          <p>Praesent commodo cursus magna, vel scelerisque nisl consectetur et. Vivamus sagittis lacus vel augue laoreet rutrum faucibus dolor auctor.</p>
          <p>Aenean lacinia bibendum nulla sed consectetur. Praesent commodo cursus magna, vel scelerisque nisl consectetur et. Donec sed odio dui. Donec ullamcorper nulla non metus auctor fringilla.</p>
        </div>
        <div class="modal-footer">
          <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
          <button type="button" class="btn btn-primary">Confirm Order</button>
        </div>

      </div>
    </div>
  </div>
      <div id="myModal2" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
    <div class="modal-dialog">
      <div class="modal-content">

        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
          <h4 class="modal-title" id="myModalLabel">Black Pepper Chicken Chop</h4>
        </div>
        <div class="modal-body">
          <h4>Black Pepper Chicken Chop</h4>
          <p>Quantity:</p>

          <h4>Popover in a modal</h4>
          <p>This <a href="#" role="button" class="btn btn-default js-popover" title="A Title" data-content="And here's some amazing content. It's very engaging. right?" data-placement="left">button</a> should trigger a popover on click.</p>

          <h4>Tooltips in a modal</h4>
          <p><a href="#" class="js-tooltip" title="Tooltip">This link</a> and <a href="#" class="js-tooltip" title="Tooltip">that link</a> should have tooltips on hover.</p>

          <hr>

          <h4>Overflowing text to show scroll behavior</h4>
          <p>Cras mattis consectetur purus sit amet fermentum. Cras justo odio, dapibus ac facilisis in, egestas eget quam. Morbi leo risus, porta ac consectetur ac, vestibulum at eros.</p>
          <p>Praesent commodo cursus magna, vel scelerisque nisl consectetur et. Vivamus sagittis lacus vel augue laoreet rutrum faucibus dolor auctor.</p>
          <p>Aenean lacinia bibendum nulla sed consectetur. Praesent commodo cursus magna, vel scelerisque nisl consectetur et. Donec sed odio dui. Donec ullamcorper nulla non metus auctor fringilla.</p>
        </div>
        <div class="modal-footer">
          <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
          <button type="button" class="btn btn-primary">Confirm Order</button>
        </div>

      </div>
    </div>
  </div>

<br>
    <div class="container">
        <ol class="left breadcrumb">
            <li><a href="#">Home</a></li>
            <li><a href="#">Chomp Chomp</a></li>
            <li class="active">Western Food</li>
        </ol>
        <br>
        <br>
        <br>
            <div class="panel panel-default">
            <div class="panel-body">
                <div class="col-xs-13">
               <div class="thumbnail">
                    <img src="resources/pictures/ChickenCutlet.png" alt="...">
                    <div class="caption">
                        <a class="button" data-toggle="modal" data-target="#myModal1">
                            Fried Chicken Cutlet
                        </a>
                    </div>
                </div>
                 <div class="thumbnail">
                    <img src="resources/pictures/BlackPepperChickenChop.png" alt="...">
                   <div class="caption">
                        <a class="button" data-toggle="modal" data-target="#myModal2">
                            Black Pepper Chicken Chop
                        </a>
                    </div>
                </div>
                 <div class="thumbnail">
                    <img src="resources/pictures/DoryFish.png" alt="...">
                   <div class="caption">
                        <a class="button" data-toggle="modal" data-target="#myModal2">
                            Dory Fish
                        </a>
                    </div>
                </div>
                 <div class="thumbnail">
                    <img src="resources/pictures/fishAndChips.png" alt="...">
                    <div class="caption">
                        <a class="button" data-toggle="modal" data-target="#myModal2">
                            Fish and Chips
                        </a>
                    </div>
                </div>
                </div>
                
                                <div class="col-xs-13">
               <div class="thumbnail">
                    <img src="resources/pictures/Steak.png" alt="...">
                    <div class="caption">
                        <a class="button" data-toggle="modal" data-target="#myModal1">
                            Steak
                        </a>
                    </div>
                </div>
                 <div class="thumbnail">
                    <img src="resources/pictures/Pork Chop with Mushroom Sauce.png" alt="...">
                   <div class="caption">
                        <a class="button" data-toggle="modal" data-target="#myModal2">
                            Pork Chop w Mushroom Sauce
                        </a>
                    </div>
                </div>
                 <div class="thumbnail">
                    <img src="resources/pictures/Spaghetti with Tomato Sauce.png" alt="...">
                   <div class="caption">
                        <a class="button" data-toggle="modal" data-target="#myModal2">
                            Tomato Sauce Spaghetti
                        </a>
                    </div>
                </div>
                 <div class="thumbnail">
                    <img src="resources/pictures/Spaghetti Carbonara.png" alt="...">
                    <div class="caption">
                        <a class="button" data-toggle="modal" data-target="#myModal2">
                           Sphagetti Carbonara
                        </a>
                    </div>
                </div>
                </div>
        </div>
    </div>
</div>
</div>
<!-- JavaScript Includes -->
<script src="resources/js/jquery-1.11.3.min.js"></script>
<script src="resources/js/transition.js"></script>
<script src="resources/js/modal.js"></script>
<script src="resources/js/tooltip.js"></script>
<script src="resources/js/popover.js"></script>
<script src="resources/js/collapse.js"></script>

<!-- JavaScript Test -->
<script>
$(function () {
  $('.js-popover').popover()
  $('.js-tooltip').tooltip()
  $('#tall-toggle').click(function () {
    $('#tall').toggle()
  })
})
</script>

</body>
</html>