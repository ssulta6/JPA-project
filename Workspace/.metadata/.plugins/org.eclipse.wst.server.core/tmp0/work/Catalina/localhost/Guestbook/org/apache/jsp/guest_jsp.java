package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import guest.Guest;

public final class guest_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\r\n");
      out.write("    \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write(" \r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>Snigdha's Web Application</title>\r\n");
      out.write("    </head>\r\n");
      out.write(" \r\n");
      out.write("    <body>\r\n");
      out.write("        <form method=\"POST\" action=\"GuestServlet\">\r\n");
      out.write("            Name: <input type=\"text\" name=\"name\" />\r\n");
      out.write("            <input type=\"submit\" value=\"Add\" />\r\n");
      out.write("        </form>\r\n");
      out.write(" \r\n");
      out.write("        <hr><ol> ");

            @SuppressWarnings("unchecked") 
            List<Guest> guests = (List<Guest>)request.getAttribute("guests");
            for (Guest guest : guests) { 
      out.write("\r\n");
      out.write("                <li> ");
      out.print( guest );
      out.write(" </li> ");

            } 
      out.write("\r\n");
      out.write("        </ol><hr>\r\n");
      out.write(" \r\n");
      out.write("        <iframe src=\"http://www.objectdb.com/pw.html?web-eclipse\"\r\n");
      out.write("            frameborder=\"0\" scrolling=\"no\" width=\"100%\" height=\"30\"> </iframe>\r\n");
      out.write("     </body>\r\n");
      out.write(" </html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else log(t.getMessage(), t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
