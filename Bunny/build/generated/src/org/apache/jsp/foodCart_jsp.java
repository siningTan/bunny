package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class foodCart_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <script src=\"resources/js/dabao.js\"></script> \n");
      out.write("    <script src=\"resources/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <title>DABAO Food Cart</title>\n");
      out.write("    <link href=\"resources/css/dabao.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"resources/css/bootstap.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"resources/css/starter-template.css\" rel=\"stylesheet\">\n");
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
      out.write("        <li><a href=\"#\">Food Menu</a></li>\n");
      out.write("        <li class=\"active\"><a href=\"#\">Cart <span class=\"sr-only\">(current)</span></a></li>\n");
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
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"row center\">\n");
      out.write("            <div class=\"col-xs-8 center\">\n");
      out.write("                <div class=\"panel panel-info\">\n");
      out.write("                    <div class=\"panel-heading\">\n");
      out.write("                        <div class=\"panel-title\">\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-xs-6\">\n");
      out.write("                                    <h4><span class=\"glyphicon glyphicon-shopping-cart\"></span> Food Cart        </h4>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-xs-4\">\n");
      out.write("                                    <button type=\"button\" class=\"btn btn-primary btn-sm btn-block\">\n");
      out.write("                                        <span class=\"glyphicon glyphicon-share-alt\"></span> <u>Continue</u>\n");
      out.write("                                    </button>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"panel-body\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-xs-2\"><img class=\"img-responsive\" src=\"http://placehold.it/100x70\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-xs-4\">\n");
      out.write("                                <h4 class=\"product-name\"><strong>Product name</strong></h4><h4><small>Product description</small></h4>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-xs-6\">\n");
      out.write("                                <div class=\"col-xs-6 text-right\">\n");
      out.write("                                    <h6><strong>25.00 <span class=\"text-muted\">x</span></strong></h6>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-xs-4\">\n");
      out.write("                                    <input type=\"text\" class=\"form-control input-sm\" value=\"1\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-xs-2\">\n");
      out.write("                                    <button type=\"button\" class=\"btn btn-link btn-xs\">\n");
      out.write("                                        <span class=\"glyphicon glyphicon-trash\"> </span>\n");
      out.write("                                    </button>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <hr>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-xs-2\"><img class=\"img-responsive\" src=\"http://placehold.it/100x70\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-xs-4\">\n");
      out.write("                                <h4 class=\"product-name\"><strong>Product name</strong></h4><h4><small>Product description</small></h4>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-xs-6\">\n");
      out.write("                                <div class=\"col-xs-6 text-right\">\n");
      out.write("                                    <h6><strong>25.00 <span class=\"text-muted\">x</span></strong></h6>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-xs-4\">\n");
      out.write("                                    <input type=\"text\" class=\"form-control input-sm\" value=\"1\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-xs-2\">\n");
      out.write("                                    <button type=\"button\" class=\"btn btn-link btn-xs\">\n");
      out.write("                                        <span class=\"glyphicon glyphicon-trash\"> </span>\n");
      out.write("                                    </button>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <hr>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"text-center\">\n");
      out.write("                                <div class=\"col-xs-9\">\n");
      out.write("                                    <h6 class=\"text-right\">Added items?</h6>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-xs-3\">\n");
      out.write("                                    <button type=\"button\" class=\"btn btn-danger btn-block\">\n");
      out.write("                                        Update cart\n");
      out.write("                                    </button>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"panel-footer\">\n");
      out.write("                        <div class=\"row text-center\">\n");
      out.write("                            <div class=\"col-xs-9\">\n");
      out.write("                                <h4 class=\"text-right\">Total <strong>$50.00</strong></h4>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-xs-3\">\n");
      out.write("                                <button type=\"button\" class=\"btn btn-success btn-block\">\n");
      out.write("                                    Confirm\n");
      out.write("                                </button>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
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