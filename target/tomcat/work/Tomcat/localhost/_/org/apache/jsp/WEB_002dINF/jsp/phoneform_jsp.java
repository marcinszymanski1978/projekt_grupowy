/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-12-04 09:03:40 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class phoneform_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/WEB-INF/css/style.css", Long.valueOf(1575450139535L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005fform_0026_005fmethod_005fclass_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005fhidden_0026_005fpath_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005finput_0026_005fplaceholder_005fpath_005fclass_005fautocomplete_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005finput_0026_005fplaceholder_005fpath_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005fbutton_0026_005fvalue_005ftype_005fclass;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fform_005fform_0026_005fmethod_005fclass_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005fhidden_0026_005fpath_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005finput_0026_005fplaceholder_005fpath_005fclass_005fautocomplete_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005finput_0026_005fplaceholder_005fpath_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005fbutton_0026_005fvalue_005ftype_005fclass = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fform_005fform_0026_005fmethod_005fclass_005faction.release();
    _005fjspx_005ftagPool_005fform_005fhidden_0026_005fpath_005fnobody.release();
    _005fjspx_005ftagPool_005fform_005finput_0026_005fplaceholder_005fpath_005fclass_005fautocomplete_005fnobody.release();
    _005fjspx_005ftagPool_005fform_005finput_0026_005fplaceholder_005fpath_005fnobody.release();
    _005fjspx_005ftagPool_005fform_005fbutton_0026_005fvalue_005ftype_005fclass.release();
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

      out.write("<style>");
      out.write("@import 'https://fonts.googleapis.com/css?family=Dosis|Roboto:300,400';\r\n");
      out.write("* {\r\n");
      out.write("    margin: 0;\r\n");
      out.write("    padding: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("body {\r\n");
      out.write("    background: -webkit-linear-gradient(left, #25c481, #25b7c4);\r\n");
      out.write("    background: linear-gradient(to right, #25c481, #25b7c4);\r\n");
      out.write("    font-family: 'Roboto', sans-serif;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".container{\r\n");
      out.write("    position:absolute;\r\n");
      out.write("    width: auto;\r\n");
      out.write("    height:auto;\r\n");
      out.write("    top: calc(50% - 240px);\r\n");
      out.write("    left: calc(50% - 160px);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("form {\r\n");
      out.write("    position: absolute;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("    background: transparent;\r\n");
      out.write("    width: 310px;\r\n");
      out.write("    height: 440px;\r\n");
      out.write("    border-radius: 5px;\r\n");
      out.write("    padding: 30px 20px 0 20px;\r\n");
      out.write("    box-shadow: 0 10px 50px 0 rgba(0, 0, 0, 0.25);\r\n");
      out.write("    box-sizing: border-box;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("p {\r\n");
      out.write("    font-family: 'Roboto', sans-serif;\r\n");
      out.write("    font-weight: 100;\r\n");
      out.write("    text-transform: uppercase;\r\n");
      out.write("    font-size: 12px;\r\n");
      out.write("    color: #fff;\r\n");
      out.write("    margin-bottom: 40px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("p > span {\r\n");
      out.write("    padding-top: 3px;\r\n");
      out.write("    display: block;\r\n");
      out.write("    font-weight: 400;\r\n");
      out.write("    font-size: 9px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("h3 {\r\n");
      out.write("    font-family: 'Dosis';\r\n");
      out.write("    font-size: 35px;\r\n");
      out.write("    text-transform: uppercase;\r\n");
      out.write("    color: #fff;\r\n");
      out.write("    margin-bottom: 30px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("input,\r\n");
      out.write("button{\r\n");
      out.write("    outline: none !important;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("button.fb {\r\n");
      out.write("    border: none;\r\n");
      out.write("    background: #3b5998;\r\n");
      out.write("    width: 160px;\r\n");
      out.write("    height: 25px;\r\n");
      out.write("    font-family: 'Roboto', sans-serif;\r\n");
      out.write("    font-size: 12px;\r\n");
      out.write("    color: #fff;\r\n");
      out.write("    text-transform: uppercase;\r\n");
      out.write("    border-radius: 4px;\r\n");
      out.write("    border: 1px solid #29487d;\r\n");
      out.write("    cursor: pointer;\r\n");
      out.write("    margin-bottom: 20px;\r\n");
      out.write("    transition:all 0.3s linear;\r\n");
      out.write("}\r\n");
      out.write("button.fb:hover {\r\n");
      out.write("    background: #fff;\r\n");
      out.write("    color: #3b5998;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("button.form-btn {\r\n");
      out.write("    position: absolute;\r\n");
      out.write("    width: 50%;\r\n");
      out.write("    height: 60px;\r\n");
      out.write("    bottom: 0;\r\n");
      out.write("    border: 0;\r\n");
      out.write("    font-family: 'Dosis';\r\n");
      out.write("    font-size: 24px;\r\n");
      out.write("    text-transform: uppercase;\r\n");
      out.write("    cursor: pointer;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("button.form-btn.sx {\r\n");
      out.write("    left: 0;\r\n");
      out.write("    border-radius: 0 0 0 5px;\r\n");
      out.write("    background-color: rgba(255, 125, 0, 0.35);\r\n");
      out.write("    color: #fff;\r\n");
      out.write("    transition:all 0.3s linear;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("button.form-btn.sx:hover {\r\n");
      out.write("    background-color:rgba(255, 125, 0, 0.65);\r\n");
      out.write("    color: #fff;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("button.form-btn.sx.back {\r\n");
      out.write("    background-color: rgba(0, 0, 0, 0.15);\r\n");
      out.write("    transition:all 0.3s linear;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("button.form-btn.sx.back:hover {\r\n");
      out.write("    background-color: rgba(0, 0, 0, 0.35);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("button.form-btn.dx {\r\n");
      out.write("    right: 0;\r\n");
      out.write("    border-radius: 0 0 5px 0;\r\n");
      out.write("    background: transparent;\r\n");
      out.write("    color: #fff;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("input {\r\n");
      out.write("    border: none;\r\n");
      out.write("    border-bottom: 1px solid #fff;\r\n");
      out.write("    width: 85%;\r\n");
      out.write("    font-family: 'Roboto';\r\n");
      out.write("    color: #fff;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("    font-size: 21px;\r\n");
      out.write("    font-weight:100;\r\n");
      out.write("    margin-bottom:25px;\r\n");
      out.write("    background: transparent;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("::-webkit-input-placeholder {\r\n");
      out.write("    color: #fff;\r\n");
      out.write("    font-family: 'Roboto';\r\n");
      out.write("    font-weight:100;\r\n");
      out.write("    opacity: 0.5;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(":-moz-placeholder {\r\n");
      out.write("    color: #ffc185;\r\n");
      out.write("    font-family: 'Roboto';\r\n");
      out.write("    font-weight:100;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("::-moz-placeholder {\r\n");
      out.write("    color: #ffc185;\r\n");
      out.write("    font-family: 'Roboto';\r\n");
      out.write("    font-weight:100;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(":-ms-input-placeholder {\r\n");
      out.write("    color: #ffc185;\r\n");
      out.write("    font-family: 'Roboto';\r\n");
      out.write("    font-weight:100;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".signIn input,\r\n");
      out.write(".signUp .w100 {\r\n");
      out.write("    width: 100%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".signIn{\r\n");
      out.write("    z-index: 1;\r\n");
      out.write("    transform: perspective(100px) translate3d(100px, 0px, -30px);\r\n");
      out.write("    opacity: 0.5;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".signUp {\r\n");
      out.write("    z-index: 2;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".active-dx{\r\n");
      out.write("    animation-name: foregrounding-dx;\r\n");
      out.write("    animation-duration: 0.9s;\r\n");
      out.write("    animation-fill-mode: forwards;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".active-sx{\r\n");
      out.write("    animation-name: foregrounding-sx;\r\n");
      out.write("    animation-duration: 0.9s;\r\n");
      out.write("    animation-fill-mode: forwards;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".inactive-dx{\r\n");
      out.write("    animation-name: overshadowing-dx;\r\n");
      out.write("    animation-duration: 0.9s;\r\n");
      out.write("    animation-fill-mode: forwards;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".inactive-sx{\r\n");
      out.write("    animation-name: overshadowing-sx;\r\n");
      out.write("    animation-duration: 0.9s;\r\n");
      out.write("    animation-fill-mode: forwards;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("@keyframes overshadowing-dx {\r\n");
      out.write("    0%{\r\n");
      out.write("        z-index:2;\r\n");
      out.write("        transform: perspective(100px) translate3d(0px, 0px, 0px);\r\n");
      out.write("        opacity: 1;\r\n");
      out.write("        box-shadow: 0 10px 50px 0 rgba(0, 0, 0, 0.25);\r\n");
      out.write("    }\r\n");
      out.write("    100%{\r\n");
      out.write("        z-index: 1;\r\n");
      out.write("        transform: perspective(100px) translate3d(100px, 0px, -30px);\r\n");
      out.write("        opacity: 0.5;\r\n");
      out.write("        box-shadow: 0 10px 20px 0 rgba(0, 0, 0, 0.25);\r\n");
      out.write("    }\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("@keyframes overshadowing-sx {\r\n");
      out.write("    0%{\r\n");
      out.write("        z-index:2;\r\n");
      out.write("        transform: perspective(100px) translate3d(0px, 0px, 0px);\r\n");
      out.write("        opacity: 1;\r\n");
      out.write("        box-shadow: 0 10px 50px 0 rgba(0, 0, 0, 0.25);\r\n");
      out.write("    }\r\n");
      out.write("    100%{\r\n");
      out.write("        z-index: 1;\r\n");
      out.write("        transform: perspective(100px) translate3d(-100px, 0px, -30px);\r\n");
      out.write("        opacity: 0.5;\r\n");
      out.write("        box-shadow: 0 10px 20px 0 rgba(0, 0, 0, 0.25);\r\n");
      out.write("    }\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("@keyframes foregrounding-dx {\r\n");
      out.write("    0%{\r\n");
      out.write("        z-index:1;\r\n");
      out.write("        transform: perspective(100px) translate3d(100px, 0px, -30px);\r\n");
      out.write("        opacity: 0.5;\r\n");
      out.write("    }\r\n");
      out.write("    50%{\r\n");
      out.write("        z-index:2;\r\n");
      out.write("        transform: perspective(100px) translate3d(400px, 0px, -30px);\r\n");
      out.write("    }\r\n");
      out.write("    100%{\r\n");
      out.write("        z-index:2;\r\n");
      out.write("        transform: perspective(100px) translate3d(0px, 0px, 0px);\r\n");
      out.write("        opacity: 1;\r\n");
      out.write("    }\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("@keyframes foregrounding-sx {\r\n");
      out.write("    0%{\r\n");
      out.write("        z-index:1;\r\n");
      out.write("        transform: perspective(100px) translate3d(-100px, 0px, -30px);\r\n");
      out.write("        opacity: 0.5;\r\n");
      out.write("    }\r\n");
      out.write("    50%{\r\n");
      out.write("        z-index:2;\r\n");
      out.write("        transform: perspective(100px) translate3d(-400px, 0px, -30px);\r\n");
      out.write("    }\r\n");
      out.write("    100%{\r\n");
      out.write("        z-index:2;\r\n");
      out.write("        transform: perspective(100px) translate3d(0px, 0px, 0px);\r\n");
      out.write("        opacity: 1;\r\n");
      out.write("    }\r\n");
      out.write("}");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>Dodaj telefon</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"container\">\r\n");
      if (_jspx_meth_form_005fform_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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

  private boolean _jspx_meth_form_005fform_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  form:form
    org.springframework.web.servlet.tags.form.FormTag _jspx_th_form_005fform_005f0 = (org.springframework.web.servlet.tags.form.FormTag) _005fjspx_005ftagPool_005fform_005fform_0026_005fmethod_005fclass_005faction.get(org.springframework.web.servlet.tags.form.FormTag.class);
    _jspx_th_form_005fform_005f0.setPageContext(_jspx_page_context);
    _jspx_th_form_005fform_005f0.setParent(null);
    // /WEB-INF/jsp/phoneform.jsp(10,0) name = method type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fform_005f0.setMethod("post");
    // /WEB-INF/jsp/phoneform.jsp(10,0) name = action type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fform_005f0.setAction("savePhone");
    // /WEB-INF/jsp/phoneform.jsp(10,0) null
    _jspx_th_form_005fform_005f0.setDynamicAttribute(null, "class", "signUp");
    int[] _jspx_push_body_count_form_005fform_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_form_005fform_005f0 = _jspx_th_form_005fform_005f0.doStartTag();
      if (_jspx_eval_form_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("    <h3>Dodaj telefon</h3>\r\n");
          out.write("    <p>i wprowadź ID pracownika</p>\r\n");
          out.write("    ");
          if (_jspx_meth_form_005fhidden_005f0(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
            return true;
          out.write("\r\n");
          out.write("    ");
          if (_jspx_meth_form_005finput_005f0(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
            return true;
          out.write("\r\n");
          out.write("    ");
          if (_jspx_meth_form_005finput_005f1(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
            return true;
          out.write("\r\n");
          out.write("    ");
          if (_jspx_meth_form_005finput_005f2(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
            return true;
          out.write("\r\n");
          out.write("\r\n");
          out.write("    ");
          if (_jspx_meth_form_005fbutton_005f0(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
            return true;
          out.write('\r');
          out.write('\n');
          int evalDoAfterBody = _jspx_th_form_005fform_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_form_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005fform_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005fform_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005fform_005f0.doFinally();
      _005fjspx_005ftagPool_005fform_005fform_0026_005fmethod_005fclass_005faction.reuse(_jspx_th_form_005fform_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_form_005fhidden_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  form:hidden
    org.springframework.web.servlet.tags.form.HiddenInputTag _jspx_th_form_005fhidden_005f0 = (org.springframework.web.servlet.tags.form.HiddenInputTag) _005fjspx_005ftagPool_005fform_005fhidden_0026_005fpath_005fnobody.get(org.springframework.web.servlet.tags.form.HiddenInputTag.class);
    _jspx_th_form_005fhidden_005f0.setPageContext(_jspx_page_context);
    _jspx_th_form_005fhidden_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/jsp/phoneform.jsp(13,4) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fhidden_005f0.setPath("id");
    int[] _jspx_push_body_count_form_005fhidden_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_form_005fhidden_005f0 = _jspx_th_form_005fhidden_005f0.doStartTag();
      if (_jspx_th_form_005fhidden_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005fhidden_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005fhidden_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005fhidden_005f0.doFinally();
      _005fjspx_005ftagPool_005fform_005fhidden_0026_005fpath_005fnobody.reuse(_jspx_th_form_005fhidden_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_form_005finput_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_005finput_005f0 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fform_005finput_0026_005fplaceholder_005fpath_005fclass_005fautocomplete_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_005finput_005f0.setPageContext(_jspx_page_context);
    _jspx_th_form_005finput_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/jsp/phoneform.jsp(14,4) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f0.setPath("name");
    // /WEB-INF/jsp/phoneform.jsp(14,4) null
    _jspx_th_form_005finput_005f0.setDynamicAttribute(null, "class", "w100");
    // /WEB-INF/jsp/phoneform.jsp(14,4) null
    _jspx_th_form_005finput_005f0.setDynamicAttribute(null, "placeholder", "Marka telefonu");
    // /WEB-INF/jsp/phoneform.jsp(14,4) name = autocomplete type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f0.setAutocomplete("off");
    int[] _jspx_push_body_count_form_005finput_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_form_005finput_005f0 = _jspx_th_form_005finput_005f0.doStartTag();
      if (_jspx_th_form_005finput_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005finput_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005finput_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005finput_005f0.doFinally();
      _005fjspx_005ftagPool_005fform_005finput_0026_005fplaceholder_005fpath_005fclass_005fautocomplete_005fnobody.reuse(_jspx_th_form_005finput_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_form_005finput_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_005finput_005f1 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fform_005finput_0026_005fplaceholder_005fpath_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_005finput_005f1.setPageContext(_jspx_page_context);
    _jspx_th_form_005finput_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/jsp/phoneform.jsp(15,4) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f1.setPath("model");
    // /WEB-INF/jsp/phoneform.jsp(15,4) null
    _jspx_th_form_005finput_005f1.setDynamicAttribute(null, "placeholder", "Model");
    int[] _jspx_push_body_count_form_005finput_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_form_005finput_005f1 = _jspx_th_form_005finput_005f1.doStartTag();
      if (_jspx_th_form_005finput_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005finput_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005finput_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005finput_005f1.doFinally();
      _005fjspx_005ftagPool_005fform_005finput_0026_005fplaceholder_005fpath_005fnobody.reuse(_jspx_th_form_005finput_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_form_005finput_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_005finput_005f2 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fform_005finput_0026_005fplaceholder_005fpath_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_005finput_005f2.setPageContext(_jspx_page_context);
    _jspx_th_form_005finput_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/jsp/phoneform.jsp(16,4) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f2.setPath("employees.id");
    // /WEB-INF/jsp/phoneform.jsp(16,4) null
    _jspx_th_form_005finput_005f2.setDynamicAttribute(null, "placeholder", "Numer pracownika");
    int[] _jspx_push_body_count_form_005finput_005f2 = new int[] { 0 };
    try {
      int _jspx_eval_form_005finput_005f2 = _jspx_th_form_005finput_005f2.doStartTag();
      if (_jspx_th_form_005finput_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005finput_005f2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005finput_005f2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005finput_005f2.doFinally();
      _005fjspx_005ftagPool_005fform_005finput_0026_005fplaceholder_005fpath_005fnobody.reuse(_jspx_th_form_005finput_005f2);
    }
    return false;
  }

  private boolean _jspx_meth_form_005fbutton_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  form:button
    org.springframework.web.servlet.tags.form.ButtonTag _jspx_th_form_005fbutton_005f0 = (org.springframework.web.servlet.tags.form.ButtonTag) _005fjspx_005ftagPool_005fform_005fbutton_0026_005fvalue_005ftype_005fclass.get(org.springframework.web.servlet.tags.form.ButtonTag.class);
    _jspx_th_form_005fbutton_005f0.setPageContext(_jspx_page_context);
    _jspx_th_form_005fbutton_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/jsp/phoneform.jsp(18,4) null
    _jspx_th_form_005fbutton_005f0.setDynamicAttribute(null, "class", "form-btn dx");
    // /WEB-INF/jsp/phoneform.jsp(18,4) null
    _jspx_th_form_005fbutton_005f0.setDynamicAttribute(null, "type", "submit");
    // /WEB-INF/jsp/phoneform.jsp(18,4) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fbutton_005f0.setValue("savePhone");
    int[] _jspx_push_body_count_form_005fbutton_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_form_005fbutton_005f0 = _jspx_th_form_005fbutton_005f0.doStartTag();
      if (_jspx_eval_form_005fbutton_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("Dodaj");
          int evalDoAfterBody = _jspx_th_form_005fbutton_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_form_005fbutton_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005fbutton_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005fbutton_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005fbutton_005f0.doFinally();
      _005fjspx_005ftagPool_005fform_005fbutton_0026_005fvalue_005ftype_005fclass.reuse(_jspx_th_form_005fbutton_005f0);
    }
    return false;
  }
}
