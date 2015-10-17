package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class testingHomePage_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>DABAO</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <script src=\"bootstrap.js\"></script>\n");
      out.write("        <script src=\"bootstrap-switch.js\"></script>\n");
      out.write("        <script src=\"jquery-1.11.3.js\"></script>\n");
      out.write("        \n");
      out.write("        <link rel=\"stylesheet\" href =\"bootstrap.css\" />\n");
      out.write("        <link rel=\"stylesheet\" href =\"cover.css\" />\n");
      out.write("        <link rel=\"stylesheet\" href =\"bootstrap-switch.css\"/>\n");
      out.write("\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         <nav class=\"navbar navbar-default\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("                    <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#navbar\" aria-expanded=\"false\" aria-controls=\"navbar\">\n");
      out.write("                        <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                    </button>\n");
      out.write("                    <a class=\"navbar-brand\" href=\"#\"><center><font face=\"verdana\">DABAO</font></center></a>\n");
      out.write("                </div>\n");
      out.write("                <div id=\"navbar\" class=\"navbar-collapse collapse\">\n");
      out.write("                    <ul class=\"nav navbar-nav\">\n");
      out.write("                        <li class=\"active\"><a href=\"#\"><font face=\"verdana\">Food Menu</font></a></li>\n");
      out.write("                        <li><a href=\"#\"><font face=\"verdana\">Cart</font></a></li>\n");
      out.write("                        <li><a href=\"#\"><font face=\"verdana\">Payment</font></a></li>\n");
      out.write("                        <li><a href=\"#\"><font face=\"verdana\">History</font></a></li>\n");
      out.write("                        <li><a href=\"#\"><font face=\"verdana\">Settings</font></a></li>\n");
      out.write("                        <li><a href=\"#\"><font face=\"verdana\">User Guide</font></a></li>\n");
      out.write("                        <li><a href=\"#\"><font face=\"verdana\">Logout</font></a></li>\n");
      out.write("                        <li><input type=\"text\" class=\"smallform-control\" placeholder=\"Search for...\"></li>\n");
      out.write("                        <li><button class=\"button\" type=\"button\"><font face=\"verdana\">Search</font></button></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div><!--/.nav-collapse -->\n");
      out.write("            </div><!--/.container-fluid -->\n");
      out.write("         </nav>\n");
      out.write("         <div class=\"container\">\n");
      out.write("             <div class=\"minitron\">\n");
      out.write("                 <a href=\"\">Macdonalds</a>\n");
      out.write("             </div>\n");
      out.write("             <div class=\"minitron\">\n");
      out.write("                 <a href=\"\">Kentucky Fried Chicken</a>\n");
      out.write("             </div>\n");
      out.write("             <div class=\"jumbotron\">\n");
      out.write("\n");
      out.write("                     <div class=\"row\">\n");
      out.write("                             <div class=\"thumbnail\">\n");
      out.write("                                 <img src=\"chickenrice.jpg\" alt=\"...\">\n");
      out.write("                                 <div class=\"caption\">\n");
      out.write("                                     <a class=\"button\" href=\"\">Chicken Rice Stall</a>\n");
      out.write("                                 </div>\n");
      out.write("                             </div>\n");
      out.write("                             <div class=\"thumbnail\">\n");
      out.write("                                 <img src=\"chickenrice.jpg\" alt=\"...\">\n");
      out.write("                                 <div class=\"caption\">\n");
      out.write("                                     <a class=\"button\" href=\"\">Chicken Rice Stall</a>\n");
      out.write("                                 </div>\n");
      out.write("                             </div>\n");
      out.write("                         <div class=\"thumbnail\">\n");
      out.write("                                 <img src=\"chickenrice.jpg\" alt=\"...\">\n");
      out.write("                                 <div class=\"caption\">\n");
      out.write("                                     <a class=\"button\" href=\"\">Chicken Rice Stall</a>\n");
      out.write("                                 </div>\n");
      out.write("                             </div>\n");
      out.write("                         <div class=\"thumbnail\">\n");
      out.write("                                 <img src=\"chickenrice.jpg\" alt=\"...\">\n");
      out.write("                                 <div class=\"caption\">\n");
      out.write("                                     <a class=\"button\" href=\"\">Chicken Rice Stall</a>\n");
      out.write("                                 </div>\n");
      out.write("                             </div>\n");
      out.write("                    </div>\n");
      out.write("                     <div class=\"row\">\n");
      out.write("                             <div class=\"thumbnail\">\n");
      out.write("                                 <img src=\"chickenrice.jpg\" alt=\"...\">\n");
      out.write("                                 <div class=\"caption\">\n");
      out.write("                                     <a class=\"button\" href=\"\">Chicken Rice Stall</a>\n");
      out.write("                                 </div>\n");
      out.write("                             </div>\n");
      out.write("                             <div class=\"thumbnail\">\n");
      out.write("                                 <img src=\"chickenrice.jpg\" alt=\"...\">\n");
      out.write("                                 <div class=\"caption\">\n");
      out.write("                                     <a class=\"button\" href=\"\">Chicken Rice Stall</a>\n");
      out.write("                                 </div>\n");
      out.write("                             </div>\n");
      out.write("                         <div class=\"thumbnail\">\n");
      out.write("                                 <img src=\"chickenrice.jpg\" alt=\"...\">\n");
      out.write("                                 <div class=\"caption\">\n");
      out.write("                                     <a class=\"button\" href=\"\">Chicken Rice Stall</a>\n");
      out.write("                                 </div>\n");
      out.write("                             </div>\n");
      out.write("                         <div class=\"thumbnail\">\n");
      out.write("                                 <img src=\"chickenrice.jpg\" alt=\"...\">\n");
      out.write("                                 <div class=\"caption\">\n");
      out.write("                                     <a class=\"button\" href=\"\">Chicken Rice Stall</a>\n");
      out.write("                                 </div>\n");
      out.write("                             </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("             </div>\n");
      out.write("         </div>\n");
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
