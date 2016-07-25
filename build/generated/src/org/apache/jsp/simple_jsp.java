package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class simple_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!doctype html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("  <title>Employee Details</title>\n");
      out.write("  <link rel=\"stylesheet\" href=\"//code.jquery.com/ui/1.12.0/themes/base/jquery-ui.css\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"/resources/demos/style.css\">\n");
      out.write("  <script src=\"https://code.jquery.com/jquery-1.12.4.js\"></script>\n");
      out.write("  <script src=\"https://code.jquery.com/ui/1.12.0/jquery-ui.js\"></script>\n");
      out.write("   <script type=\"text/javascript\">\n");
      out.write("\n");
      out.write("$(document).ready(function() {\n");
      out.write("    $('#tabs').tabs({\n");
      out.write("        load: function(event, ui) {\n");
      out.write("            alert(event.id)\n");
      out.write("            $(ui.panel).delegate('a', 'click', function(event) {\n");
      out.write("                alert(this.href)\n");
      out.write("                $(ui.panel).load(this.href);\n");
      out.write("                event.preventDefault();\n");
      out.write("            });\n");
      out.write("        }\n");
      out.write("    });\n");
      out.write("\n");
      out.write("    $(\"#tabs\").bind('tabsselect', function(event, ui) {\n");
      out.write("        window.location.href=ui.tab;\n");
      out.write("    });\n");
      out.write("\n");
      out.write("});\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write(" \n");
      out.write("<div id=\"tabs\">\n");
      out.write("  <ul>\n");
      out.write("    <li><a href=\"employee.jsp\">Add Employee Details</a></li>\n");
      out.write("    <li><a href=\"getdetails.jsp\">Get Employee Details</a></li>\n");
      out.write("    <li><a href=\"update.jsp\">Update Employee Details</a></li>\n");
      out.write("  </ul>\n");
      out.write("  <div id=\"employee.jsp\">\n");
      out.write("    \n");
      out.write("  </div>\n");
      out.write("  <div id=\"getdetails.jsp\">\n");
      out.write("    \n");
      out.write("  \n");
      out.write("  </div>\n");
      out.write("  <div id=\"update.jsp\">\n");
      out.write("    \n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write(" \n");
      out.write(" \n");
      out.write("</body>\n");
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
