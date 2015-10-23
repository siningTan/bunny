package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class signup_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("    <title>DABAO Sign Up</title>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap core CSS -->\n");
      out.write("    <link href=\"resources/css/dabao.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Custom styles for this template -->\n");
      out.write("    <link href=\"resources/css/signin.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->\n");
      out.write("    <!--[if lt IE 9]><script src=\"../../assets/js/ie8-responsive-file-warning.js\"></script><![endif]-->\n");
      out.write("    <script src=\"resources/js/ie-emulation-modes-warning.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->\n");
      out.write("    <!--[if lt IE 9]>\n");
      out.write("      <script src=\"https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js\"></script>\n");
      out.write("      <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\n");
      out.write("    <![endif]-->\n");
      out.write("  </head>\n");
      out.write("\n");
      out.write("  <body>\n");
      out.write("\n");
      out.write("      <div class=\"container\">\n");
      out.write("          <form class=\"form-signin\">\n");
      out.write("              <h2 class=\"form-signin-heading\">Create an account:</h2><br><br>\n");
      out.write("              <form class=\"form-signin\" action ='SignUpServlet'>\n");
      out.write("                  <div class=\"table\">\n");
      out.write("                      <br>\n");
      out.write("                      <input type=\"text\" name=\"inputUsername\" class=\"form-control-table\" placeholder=\"Username\" required autofocus>\n");
      out.write("                      <input type=\"text\" name=\"inputName\" class=\"form-control-table\" placeholder=\"Name\" required autofocus>\n");
      out.write("                      <input type=\"text\" name=\"inputPassword\" class=\"form-control-table\" placeholder=\"Password\" required autofocus>\n");
      out.write("                      <center><p style=\"color:white\"><font face=\"verdana\" size='1'>*Password must be no shorter than 7 characters</font></p></center>\n");
      out.write("                      <input type=\"text\" name=\"inputconfirmPassword\" class=\"form-control-table\" placeholder=\"Confirm Password\" required autofocus>\n");
      out.write("                      <input type=\"text\" name=\"inputContactNumber\" class=\"form-control-table\" placeholder=\"Contact Number\" required autofocus>\n");
      out.write("                      <center><p style=\"color:white\"><font face=\"verdana\" size='1'>*No spacing between numbers</font></p></center>\n");
      out.write("                      <input type=\"text\" name=\"inputCompanyCode\" class=\"form-control-table\" placeholder=\"Company Code\" required autofocus>\n");
      out.write("                  </div>\n");
      out.write("                  <br>\n");
      out.write("                  <button class=\"btn btn-primary btn-block\" type=\"submit\" name=\"sign-up\"><font face=\"verdana\">Register</font></button>\n");
      out.write("                  <button class=\"btn btn-primary btn-block\" type=\"submit\" name=\"sign-up\"><font face=\"verdana\">Back to Sign In Page</font></button>\n");
      out.write("              </form>\n");
      out.write("      </div> <!-- /container -->\n");
      out.write("\n");
      out.write("\n");
      out.write("      <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->\n");
      out.write("      <script src=\"../../assets/js/ie10-viewport-bug-workaround.js\"></script>\n");
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
