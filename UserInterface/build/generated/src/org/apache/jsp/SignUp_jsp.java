package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class SignUp_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\n");
      out.write("<!--\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
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
      out.write("        <div class=\"site-wrapper\">\n");
      out.write("\n");
      out.write("            <div class=\"site-wrapper-inner\">\n");
      out.write("\n");
      out.write("                <div class=\"cover-container\">\n");
      out.write("                    <div class=\"inner cover\">\n");
      out.write("                        <h3>Create an account:</h3> \n");
      out.write("                        <form class=\"form-signin\" action ='SignUpServlet'>\n");
      out.write("\n");
      out.write("                            <div class=\"table\">\n");
      out.write("                                <br>\n");
      out.write("                                <label for=\"inputUsername\" class=\"sr-only-table\">Username</label>\n");
      out.write("                                <input type=\"text\" name=\"inputUsername\" class=\"form-control-table\" placeholder=\"Username\" required autofocus>\n");
      out.write("                                <label for=\"inputName\" class=\"sr-only-table\">Name</label>\n");
      out.write("                                <input type=\"text\" name=\"inputName\" class=\"form-control-table\" placeholder=\"Name\" required autofocus>\n");
      out.write("                                <label for=\"inputPassword\" class=\"sr-only-table\">Password</label>\n");
      out.write("                                <input type=\"password\" name=\"inputPassword\" class=\"form-control-table\" placeholder=\"Password\" required autofocus>\n");
      out.write("                                <label for=\"inputConfirmPassword\" class=\"sr-only-table\">Confirm Password</label>\n");
      out.write("                                <input type=\"password\" name=\"inputConfirmPassword\" class=\"form-control-table\" placeholder=\"Confirm Password\" required autofocus>\n");
      out.write("                                <label for=\"inputCOntactNumber\" class=\"sr-only-table\">Contact Number</label>\n");
      out.write("                                <input type=\"text\" name=\"inputContactNumber\" class=\"form-control-table\" placeholder=\"Contact Number\" required autofocus>\n");
      out.write("                                <label for=\"inputBankAccountNumber\" class=\"sr-only-table\">Bank Account Number</label>\n");
      out.write("                                <input type=\"text\" name=\"inputBankAccountNumber\" class=\"form-control-table\" placeholder=\"Bank Account Number\" required autofocus>\n");
      out.write("                                <br>\n");
      out.write("                            </div>\n");
      out.write("                            <br>\n");
      out.write("                            \n");
      out.write("                            <div class=\"dropdown\">\n");
      out.write("                                <button class=\"btn btn-default dropdown-toggle\" type=\"button\" id=\"dropdownMenu2\" data-toggle=\"dropdown\" >\n");
      out.write("                                    Company\n");
      out.write("                                </button><span class=\"caret\"></span>\n");
      out.write("                                <ul class=\"dropdown-menu\" aria-labelledby=\"dropdownMenu2\">\n");
      out.write("                                    <li><a href=\"#\">Action</a></li>\n");
      out.write("                                    <li><a href=\"#\">Another action</a></li>\n");
      out.write("                                    <li><a href=\"#\">Something else here</a></li>\n");
      out.write("                                    <li><a href=\"#\">Separated link</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                                    \n");
      out.write("                            </div>\n");
      out.write("                            <button class=\"btn btn-primary btn-block\" type=\"submit\" name=\"sign-up\">Register</button>\n");
      out.write("                    </div> <!-- /container -->\n");
      out.write("\n");
      out.write("                    <div class=\"mastfoot\">\n");
      out.write("                        <div class=\"inner\">\n");
      out.write("                            <p>Created by Eureka!</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
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
