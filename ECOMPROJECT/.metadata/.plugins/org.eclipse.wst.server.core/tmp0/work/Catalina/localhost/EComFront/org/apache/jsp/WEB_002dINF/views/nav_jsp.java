/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.12
 * Generated at: 2018-12-12 08:49:00 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class nav_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("<style>\r\n");
      out.write("nav {\r\n");
      out.write("\tbackground-color: #fcc99b;\r\n");
      out.write("\tcolor: #b03c3c;\r\n");
      out.write("\tpadding: 15px 0px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("nav .menu li a {\r\n");
      out.write("\tcolor: #2b2927;\r\n");
      out.write("\tpadding: 10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("nav .menu li a:hover {\r\n");
      out.write("\tcolor: #d9d3cd;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<nav>\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t<div class=\"navbar-header\">\r\n");
      out.write("\t\t\t<button button type=\"button\" class=\"navbar-toggle collapsed\"\r\n");
      out.write("\t\t\t\tdata-toggle=\"collapse\" data-target=\"#navbar\" aria-expanded=\"false\"\r\n");
      out.write("\t\t\t\taria-controls=\"navbar\">\r\n");
      out.write("\t\t\t\t<span class=\"sr-only\">Toggle navigation</span> <span\r\n");
      out.write("\t\t\t\t\tclass=\"icon-bar\"></span> <span class=\"icon-bar\"></span> <span\r\n");
      out.write("\t\t\t\t\tclass=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t</button>\r\n");
      out.write("\t\t\t<a class=\"navbar-brand\" rel=\"home\" href=\"#\"\r\n");
      out.write("\t\t\t\ttitle=\"Making beautiful flowers a part of your life.\"> <img\r\n");
      out.write("\t\t\t\tstyle=\"max-width: 120px; margin-top: -28px;\"\r\n");
      out.write("\t\t\t\tsrc=\"resources/images/logo.png\">\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"navbar\"\r\n");
      out.write("\t\t\tclass=\"collapse navbar-collapse navbar-responsive-collapse\">\r\n");
      out.write("\t\t\t<ul class=\"nav navbar-nav\">\r\n");
      out.write("\t\t\t\t<li class=\"active\"><a href=\"index\">Home</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"aboutus\">About</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"contactus\">Contact</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"dropdown\"><a href=\"#\" class=\"dropdown-toggle\"\r\n");
      out.write("\t\t\t\t\tdata-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\"\r\n");
      out.write("\t\t\t\t\taria-expanded=\"false\">Flowers <span class=\"caret\"></span></a>\r\n");
      out.write("\t\t\t\t\t<ul class=\"dropdown-menu\">\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Roses</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Carnations</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Orchids</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Lilies</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Gerberas</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li role=\"separator\" class=\"divider\"></li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"dropdown-header\"></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Special Flowers</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">One more separated link</a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t<li><a href=\"login\">Login</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"reg\">Sign Up</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"category\">Category</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"product\">Product</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"showoneproduct\">oneProduct</a></li>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<li><a href=\"productdisplay\">Productdisplay</a></li>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</nav>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}