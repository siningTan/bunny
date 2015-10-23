package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class foodMenu_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"\">\n");
      out.write("    <link rel=\"icon\" href=\"../../favicon.ico\">\n");
      out.write("    <script src=\"resources/js/jquery-1.11.3.js\"></script>  \n");
      out.write("    <script src=\"resources/js/jquery-1.11.3.min.js\"></script>   \n");
      out.write("         <script src=\"resources/js/transition.js\"></script> \n");
      out.write("     <script src=\"resources/js/dabao.js\"></script> \n");
      out.write("     <script src=\"resources/js/bootstrap.min.js\"></script>\n");
      out.write(" \n");
      out.write("\n");
      out.write("    \n");
      out.write("\n");
      out.write("    <title>DABAO Food Menu</title>\n");
      out.write("    <!-- Bootstrap core CSS -->\n");
      out.write("    <link href=\"resources/css/dabao.css\" rel=\"stylesheet\">\n");
      out.write("    <!-- Custom styles for this template -->\n");
      out.write("    <link href=\"resources/css/starter-template.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"resources/css/bootstap.theme.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"resources/css/bootstap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->\n");
      out.write("    <!--[if lt IE 9]><script src=\"../../assets/js/ie8-responsive-file-warning.js\"></script><![endif]-->\n");
      out.write("\n");
      out.write("    \n");
      out.write("   \n");
      out.write("    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->\n");
      out.write("    <!--[if lt IE 9]>\n");
      out.write("      <script src=\"https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js\"></script>\n");
      out.write("      <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\n");
      out.write("    <![endif]-->\n");
      out.write("  </head>\n");
      out.write("\n");
      out.write("  <body>\n");
      out.write("    <nav class=\"navbar navbar-fixed-top\">\n");
      out.write("  <div class=\"container-fluid\">\n");
      out.write("    <div class=\"navbar-header\">\n");
      out.write("      <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\" aria-expanded=\"false\">\n");
      out.write("        <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("        <span class=\"icon-bar\"></span>\n");
      out.write("        <span class=\"icon-bar\"></span>\n");
      out.write("        <span class=\"icon-bar\"></span>\n");
      out.write("      </button>\n");
      out.write("      <a class=\"navbar-brand\" href=\"#\">DABAO</a>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- Collect the nav links, forms, and other content for toggling -->\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("      <ul class=\"nav navbar-nav\">\n");
      out.write("        <li class=\"active\"><a href=\"#\">Food Menu <span class=\"sr-only\">(current)</span></a></li>\n");
      out.write("        <li><a href=\"#\">Cart <span class=\"badge\">1</span></a></li>\n");
      out.write("        <li><a href=\"#\">Payment</a></li>\n");
      out.write("        <li><a href=\"#\">History</a></li>\n");
      out.write("        <li><a href=\"#\">Settings</a></li>\n");
      out.write("        <li><a href=\"#\">Userguide</a></li>\n");
      out.write("      </ul>\n");
      out.write("        <form class=\"navbar-form navbar-left\" role=\"search\">\n");
      out.write("        <div class=\"form-group\">\n");
      out.write("          <input type=\"text\" class=\"form-control\" placeholder=\"Search\">\n");
      out.write("        </div>\n");
      out.write("        <button type=\"submit\" class=\"btn btn-default\">Submit</button>\n");
      out.write("      </form>\n");
      out.write("      <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("              \n");
      out.write("          <li><a href=\"#\">Logout</a></li>\n");
      out.write("      </ul>\n");
      out.write("    </div><!-- /.navbar-collapse -->\n");
      out.write("  </div><!-- /.container-fluid -->\n");
      out.write("    </nav>\n");
      out.write("    <br>\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <ol class=\"left breadcrumb\">\n");
      out.write("            <li><a href=\"#\">Home</a></li>\n");
      out.write("            <li class=\"active\">Chomp Chomp</li>\n");
      out.write("        </ol>\n");
      out.write("        <br>\n");
      out.write("\n");
      out.write("        <div class=\"jumbotron\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"thumbnail\">\n");
      out.write("                    <img src=\"resources/pictures/chickenrice.jpg\" alt=\"...\">\n");
      out.write("                    <div class=\"caption\">\n");
      out.write("                        <!-- Button trigger modal -->\n");
      out.write("                        <button type=\"button\" class=\"button\" data-toggle=\"modal\" data-target=\"#myModal\">\n");
      out.write("                            Chicken Rice\n");
      out.write("                        </button>\n");
      out.write("\n");
      out.write("                        <!-- Modal -->\n");
      out.write("                        <div class=\"modal fade\" id=\"myModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\">\n");
      out.write("                            <div class=\"modal-dialog\" role=\"document\">\n");
      out.write("                                <div class=\"modal-content\">\n");
      out.write("                                    <div class=\"modal-header\">\n");
      out.write("                                        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>\n");
      out.write("                                        <h4 class=\"modal-title\" id=\"myModalLabel\">Modal title</h4>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"modal-body\">\n");
      out.write("                                        ...\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"modal-footer\">\n");
      out.write("                                        <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Close</button>\n");
      out.write("                                        <button type=\"button\" class=\"btn btn-primary\">Save changes</button>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"thumbnail\">\n");
      out.write("                    <img src=\"resources/pictures/chickenrice.jpg\" alt=\"...\">\n");
      out.write("                    <div class=\"caption\">\n");
      out.write("                        <a class=\"button\" href=\"\">Chicken Rice</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"thumbnail\">\n");
      out.write("                    <img src=\"resources/pictures/chickenrice.jpg\" alt=\"...\">\n");
      out.write("                    <div class=\"caption\">\n");
      out.write("                        <a class=\"button\" href=\"\">Chicken Rice</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"thumbnail\">\n");
      out.write("                    <img src=\"resources/pictures/chickenrice.jpg\" alt=\"...\">\n");
      out.write("                    <div class=\"caption\">\n");
      out.write("                        <a class=\"button\" href=\"\">Chicken Rice</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"thumbnail\">\n");
      out.write("                    <img src=\"resources/pictures/chickenrice.jpg\" alt=\"...\">\n");
      out.write("                    <div class=\"caption\">\n");
      out.write("                        <a class=\"button\" href=\"\">Chicken Rice</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"thumbnail\">\n");
      out.write("                    <img src=\"resources/pictures/chickenrice.jpg\" alt=\"...\">\n");
      out.write("                    <div class=\"caption\">\n");
      out.write("                        <a class=\"button\" href=\"\">Chicken Rice</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap core JavaScript\n");
      out.write("    ================================================== -->\n");
      out.write("    <!-- Placed at the end of the document so the pages load faster -->\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js\"></script>\n");
      out.write("    <script src=\"../../dist/js/bootstrap.min.js\"></script>\n");
      out.write("    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->\n");
      out.write("    <script src=\"../../assets/js/ie10-viewport-bug-workaround.js\"></script>\n");
      out.write("  </body>\n");
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
