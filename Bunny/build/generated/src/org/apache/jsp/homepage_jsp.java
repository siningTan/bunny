package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class homepage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta name=\"author\" content=\"\">\n");
      out.write("        <link rel=\"icon\" href=\"../../favicon.ico\">\n");
      out.write("        <script src=\"resources/js/jquery-1.11.3.js\"></script>  \n");
      out.write("        <script src=\"resources/js/jquery-1.11.3.min.js\"></script>  \n");
      out.write("        <script src=\"resources/js/ie-emulation-modes-warning.js\"></script> \n");
      out.write("        <script src=\"resources/js/dabao.js\"></script> \n");
      out.write("        <script src=\"resources/js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"resources/js/transition.js\"></script> \n");
      out.write("        <script src=\"resources/js/carousel.js\"></script> \n");
      out.write("        <script src=\"resources/js/collapse.js\"></script> \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <title>DABAO Home Page</title>\n");
      out.write("        <!-- Bootstrap core CSS -->\n");
      out.write("        <link href=\"resources/css/dabao.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <link href=\"resources/css/carousel.css\" rel=\"stylesheet\">\n");
      out.write("        <!-- Custom styles for this template -->\n");
      out.write("        <link href=\"resources/css/starter-template.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->\n");
      out.write("        <!--[if lt IE 9]><script src=\"../../assets/js/ie8-responsive-file-warning.js\"></script><![endif]-->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->\n");
      out.write("        <!--[if lt IE 9]>\n");
      out.write("          <script src=\"https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js\"></script>\n");
      out.write("          <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\n");
      out.write("        <![endif]-->\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <nav class=\"navbar navbar-fixed-top\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("                    <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\" aria-expanded=\"false\">\n");
      out.write("                        <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                    </button>\n");
      out.write("                    <a class=\"navbar-brand\" href=\"#\">DABAO</a>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <!-- Collect the nav links, forms, and other content for toggling -->\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("                    <ul class=\"nav navbar-nav\">\n");
      out.write("                        <li class=\"active\"><a href=\"#\">Food Menu <span class=\"sr-only\">(current)</span></a></li>\n");
      out.write("                        <li><a href=\"#\">Cart</a></li>\n");
      out.write("                        <li><a href=\"#\">Payment</a></li>\n");
      out.write("                        <li><a href=\"#\">History</a></li>\n");
      out.write("                        <li><a href=\"#\">Settings</a></li>\n");
      out.write("                        <li><a href=\"#\">Userguide</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                    <form class=\"navbar-form navbar-left\" role=\"search\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <input type=\"text\" class=\"form-control\" placeholder=\"Search\">\n");
      out.write("                        </div>\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-default\">Submit</button>\n");
      out.write("                    </form>\n");
      out.write("                    <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("\n");
      out.write("                        <li><a href=\"#\">Logout</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div><!-- /.navbar-collapse -->\n");
      out.write("            </div><!-- /.container-fluid -->\n");
      out.write("        </nav>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div id=\"carousel-example-generic\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("                <!-- Indicators -->\n");
      out.write("                <ol class=\"carousel-indicators\">\n");
      out.write("                    <li data-target=\"#carousel-example-generic\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("                    <li data-target=\"#carousel-example-generic\" data-slide-to=\"1\"></li>\n");
      out.write("                    <li data-target=\"#carousel-example-generic\" data-slide-to=\"2\"></li>\n");
      out.write("                </ol>\n");
      out.write("\n");
      out.write("                <!-- Wrapper for slides -->\n");
      out.write("                <div class=\"carousel-inner\" role=\"listbox\">\n");
      out.write("                    <div class=\"item active\">\n");
      out.write("                        <img src=\"resources/pictures/1.png\" alt=\"...\">\n");
      out.write("                        <div class=\"carousel-caption\">\n");
      out.write("                            ...\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"item\">\n");
      out.write("                        <img src=\"resources/pictures/2.png\" alt=\"...\">\n");
      out.write("                        <div class=\"carousel-caption\">\n");
      out.write("                            ...\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    ...\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <!-- Controls -->\n");
      out.write("                <a class=\"left carousel-control\" href=\"#carousel-example-generic\" role=\"button\" data-slide=\"prev\">\n");
      out.write("                    <span class=\"glyphicon glyphicon-chevron-left\" aria-hidden=\"true\"></span>\n");
      out.write("                    <span class=\"sr-only\">Previous</span>\n");
      out.write("                </a>\n");
      out.write("                <a class=\"right carousel-control\" href=\"#carousel-example-generic\" role=\"button\" data-slide=\"next\">\n");
      out.write("                    <span class=\"glyphicon glyphicon-chevron-right\" aria-hidden=\"true\"></span>\n");
      out.write("                    <span class=\"sr-only\">Next</span>\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"panel-group\" id=\"accordion\" role=\"tablist\" aria-multiselectable=\"true\">\n");
      out.write("                <div class=\"panel panel-default\">\n");
      out.write("                    <div class=\"panel-heading\" role=\"tab\" id=\"headingOne\">\n");
      out.write("                        <h4 class=\"panel-title\">\n");
      out.write("                            <a role=\"button\" data-toggle=\"collapse\" data-parent=\"#accordion\" href=\"#collapseOne\" aria-expanded=\"true\" aria-controls=\"collapseOne\">\n");
      out.write("                                Chomp Chomp\n");
      out.write("                            </a>\n");
      out.write("                        </h4>\n");
      out.write("                    </div>\n");
      out.write("                    <div id=\"collapseOne\" class=\"panel-collapse collapse in\" role=\"tabpanel\" aria-labelledby=\"headingOne\">\n");
      out.write("                        <div class=\"panel-body\">\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"thumbnail\">\n");
      out.write("                                    <img src=\"resources/pictures/chickenRiceStall.jpg\" alt=\"...\">\n");
      out.write("                                    <div class=\"caption\">\n");
      out.write("                                        <a class=\"button\" href=\"\">Chicken Rice Stall</a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"thumbnail\">\n");
      out.write("                                    <img src=\"resources/pictures/chickenRiceStall.jpg\" alt=\"...\">\n");
      out.write("                                    <div class=\"caption\">\n");
      out.write("                                        <a class=\"button\" href=\"\">Chicken Rice Stall</a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"thumbnail\">\n");
      out.write("                                    <img src=\"resources/pictures/chickenRiceStall.jpg\" alt=\"...\">\n");
      out.write("                                    <div class=\"caption\">\n");
      out.write("                                        <a class=\"button\" href=\"\">Chicken Rice Stall</a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"thumbnail\">\n");
      out.write("                                    <img src=\"resources/pictures/chickenRiceStall.jpg.jpg\" alt=\"...\">\n");
      out.write("                                    <div class=\"caption\">\n");
      out.write("                                        <a class=\"button\" href=\"\">Chicken Rice Stall</a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"thumbnail\">\n");
      out.write("                                    <img src=\"resources/pictures/chickenRiceStall.jpg.jpg\" alt=\"...\">\n");
      out.write("                                    <div class=\"caption\">\n");
      out.write("                                        <a class=\"button\" href=\"\">Chicken Rice Stall</a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"thumbnail\">\n");
      out.write("                                    <img src=\"resources/pictures/chickenRiceStall.jpg.jpg\" alt=\"...\">\n");
      out.write("                                    <div class=\"caption\">\n");
      out.write("                                        <a class=\"button\" href=\"\">Chicken Rice Stall</a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"thumbnail\">\n");
      out.write("                                    <img src=\"resources/pictures/chickenRiceStall.jpg\" alt=\"...\">\n");
      out.write("                                    <div class=\"caption\">\n");
      out.write("                                        <a class=\"button\" href=\"\">Chicken Rice Stall</a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"thumbnail\">\n");
      out.write("                                    <img src=\"resources/pictures/chickenRiceStall.jpg\" alt=\"...\">\n");
      out.write("                                    <div class=\"caption\">\n");
      out.write("                                        <a class=\"button\" href=\"\">Chicken Rice Stall</a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"panel panel-default\">\n");
      out.write("                    <div class=\"panel-heading\" role=\"tab\" id=\"headingTwo\">\n");
      out.write("                        <h4 class=\"panel-title\">\n");
      out.write("                            <a class=\"collapsed\" role=\"button\" data-toggle=\"collapse\" data-parent=\"#accordion\" href=\"#collapseTwo\" aria-expanded=\"false\" aria-controls=\"collapseTwo\">\n");
      out.write("                                Bedok 85\n");
      out.write("                            </a>\n");
      out.write("                        </h4>\n");
      out.write("                    </div>\n");
      out.write("                    <div id=\"collapseTwo\" class=\"panel-collapse collapse\" role=\"tabpanel\" aria-labelledby=\"headingTwo\">\n");
      out.write("                        <div class=\"panel-body\">\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"thumbnail\">\n");
      out.write("                                    <img src=\"resources/pictures/chickenRiceStall.jpg\" alt=\"...\">\n");
      out.write("                                    <div class=\"caption\">\n");
      out.write("                                        <a class=\"button\" href=\"\">Chicken Rice Stall</a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"thumbnail\">\n");
      out.write("                                    <img src=\"resources/pictures/chickenRiceStall.jpg\" alt=\"...\">\n");
      out.write("                                    <div class=\"caption\">\n");
      out.write("                                        <a class=\"button\" href=\"\">Chicken Rice Stall</a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"thumbnail\">\n");
      out.write("                                    <img src=\"resources/pictures/chickenRiceStall.jpg\" alt=\"...\">\n");
      out.write("                                    <div class=\"caption\">\n");
      out.write("                                        <a class=\"button\" href=\"\">Chicken Rice Stall</a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"thumbnail\">\n");
      out.write("                                    <img src=\"resources/pictures/chickenRiceStall.jpg\" alt=\"...\">\n");
      out.write("                                    <div class=\"caption\">\n");
      out.write("                                        <a class=\"button\" href=\"\">Chicken Rice Stall</a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"thumbnail\">\n");
      out.write("                                    <img src=\"resources/pictures/chickenRiceStall.jpg\" alt=\"...\">\n");
      out.write("                                    <div class=\"caption\">\n");
      out.write("                                        <a class=\"button\" href=\"\">Chicken Rice Stall</a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"thumbnail\">\n");
      out.write("                                    <img src=\"resources/pictures/chickenRiceStall.jpg\" alt=\"...\">\n");
      out.write("                                    <div class=\"caption\">\n");
      out.write("                                        <a class=\"button\" href=\"\">Chicken Rice Stall</a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"thumbnail\">\n");
      out.write("                                    <img src=\"resources/pictures/chickenRiceStall.jpg\" alt=\"...\">\n");
      out.write("                                    <div class=\"caption\">\n");
      out.write("                                        <a class=\"button\" href=\"\">Chicken Rice Stall</a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"thumbnail\">\n");
      out.write("                                    <img src=\"resources/pictures/chickenRiceStall.jpg\" alt=\"...\">\n");
      out.write("                                    <div class=\"caption\">\n");
      out.write("                                        <a class=\"button\" href=\"\">Chicken Rice Stall</a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div> \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"panel panel-default\">\n");
      out.write("                    <div class=\"panel-heading\" role=\"tab\" id=\"headingThree\">\n");
      out.write("                        <h4 class=\"panel-title\">\n");
      out.write("                            <a class=\"collapsed\" role=\"button\" data-toggle=\"collapse\" data-parent=\"#accordion\" href=\"#collapseThree\" aria-expanded=\"false\" aria-controls=\"collapseThree\">\n");
      out.write("                                Collapsible Group Item #3\n");
      out.write("                            </a>\n");
      out.write("                        </h4>\n");
      out.write("                    </div>\n");
      out.write("                    <div id=\"collapseThree\" class=\"panel-collapse collapse\" role=\"tabpanel\" aria-labelledby=\"headingThree\">\n");
      out.write("                        <div class=\"panel-body\">\n");
      out.write("                            Anim pariatur cliche reprehenderit, enim eiusmod high life accusamus terry richardson ad squid. 3 wolf moon officia aute, non cupidatat skateboard dolor brunch. Food truck quinoa nesciunt laborum eiusmod. Brunch 3 wolf moon tempor, sunt aliqua put a bird on it squid single-origin coffee nulla assumenda shoreditch et. Nihil anim keffiyeh helvetica, craft beer labore wes anderson cred nesciunt sapiente ea proident. Ad vegan excepteur butcher vice lomo. Leggings occaecat craft beer farm-to-table, raw denim aesthetic synth nesciunt you probably haven't heard of them accusamus labore sustainable VHS.\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- Bootstrap core JavaScript\n");
      out.write("        ================================================== -->\n");
      out.write("        <!-- Placed at the end of the document so the pages load faster -->\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js\"></script>\n");
      out.write("        <script src=\"../../dist/js/bootstrap.min.js\"></script>\n");
      out.write("        <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->\n");
      out.write("        <script src=\"../../assets/js/ie10-viewport-bug-workaround.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
