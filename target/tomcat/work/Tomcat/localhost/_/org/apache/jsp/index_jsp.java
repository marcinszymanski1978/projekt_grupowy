/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-12-03 13:48:18 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/WEB-INF/css/index.css", Long.valueOf(1575380864498L));
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("<html>\r\n");
      out.write("<style>");
      out.write("h1{\r\n");
      out.write("    font-size: 30px;\r\n");
      out.write("    color: #fff;\r\n");
      out.write("    text-transform: uppercase;\r\n");
      out.write("    font-weight: 300;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("    margin-bottom: 15px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".button1\r\n");
      out.write("{\r\n");
      out.write("    background: -webkit-linear-gradient(left, #25c481, #25b7c4);\r\n");
      out.write("    background: linear-gradient(to right, #25c481, #25b7c4);\r\n");
      out.write("    font-family: 'Roboto', sans-serif;\r\n");
      out.write("    font-size: 24px;\r\n");
      out.write("    color: #fff;\r\n");
      out.write("    border: 1px solid #fff;\r\n");
      out.write("    cursor: pointer;\r\n");
      out.write("    width: 300px;\r\n");
      out.write("    height: 200px;\r\n");
      out.write("    padding: 10px;\r\n");
      out.write("    margin: 30px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#content{\r\n");
      out.write("    margin-left: auto;\r\n");
      out.write("    margin-right: auto;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("body{\r\n");
      out.write("    background: -webkit-linear-gradient(left, #25c481, #25b7c4);\r\n");
      out.write("    background: linear-gradient(to right, #25c481, #25b7c4);\r\n");
      out.write("    font-family: 'Roboto', sans-serif;\r\n");
      out.write("}\r\n");
      out.write(".button1:hover\r\n");
      out.write("{\r\n");
      out.write("    box-shadow: 0 12px 16px 0 rgba(0,0,0,0.24), 0 17px 50px 0 rgba(0,0,0,0.19);\r\n");
      out.write("}");
      out.write("</style>\r\n");
      out.write("<body>\r\n");
      out.write("<h1>\r\n");
      out.write("    Company Data Base\r\n");
      out.write("</h1>\r\n");
      out.write("<div id=\"content\">\r\n");
      out.write("    <a href=\"empform\"><button class=\"button1\">Dodaj pracownika</button></a>\r\n");
      out.write("    <a href=\"viewemp\"><button class=\"button1\">Lista pracowników</button></a>\r\n");
      out.write("    <a href=\"phoneform\"><button class=\"button1\">Dodaj telefon</button></a>\r\n");
      out.write("    <a href=\"printerform\"><button class=\"button1\">Dodaj drukarkę</button></a>\r\n");
      out.write("    <a href=\"carform\"><button class=\"button1\">Dodaj samochód</button></a>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
