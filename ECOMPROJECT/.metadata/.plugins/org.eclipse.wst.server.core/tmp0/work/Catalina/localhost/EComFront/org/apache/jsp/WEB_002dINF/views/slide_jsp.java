/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.12
 * Generated at: 2018-12-04 16:29:34 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class slide_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write(" <script src=\"https://jssors8.azureedge.net/script/jssor.slider-27.5.0.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("        jssor_1_slider_init = function() {\r\n");
      out.write("\r\n");
      out.write("            var jssor_1_SlideshowTransitions = [\r\n");
      out.write("              {$Duration:800,y:0.3,$During:{$Top:[0.3,0.7]},$Easing:{$Top:$Jease$.$InCubic,$Opacity:$Jease$.$Linear},$Opacity:2},\r\n");
      out.write("              {$Duration:800,y:0.3,$SlideOut:true,$Easing:{$Top:$Jease$.$InCubic,$Opacity:$Jease$.$Linear},$Opacity:2},\r\n");
      out.write("              {$Duration:800,y:0.3,$During:{$Top:[0.3,0.7]},$Easing:{$Top:$Jease$.$InCubic,$Opacity:$Jease$.$Linear},$Opacity:2,$Outside:true}\r\n");
      out.write("            ];\r\n");
      out.write("\r\n");
      out.write("            var jssor_1_options = {\r\n");
      out.write("              $AutoPlay: 1,\r\n");
      out.write("              $DragOrientation: 2,\r\n");
      out.write("              $PlayOrientation: 2,\r\n");
      out.write("              $SlideshowOptions: {\r\n");
      out.write("                $Class: $JssorSlideshowRunner$,\r\n");
      out.write("                $Transitions: jssor_1_SlideshowTransitions\r\n");
      out.write("              },\r\n");
      out.write("              $BulletNavigatorOptions: {\r\n");
      out.write("                $Class: $JssorBulletNavigator$,\r\n");
      out.write("                $Orientation: 2\r\n");
      out.write("              }\r\n");
      out.write("            };\r\n");
      out.write("\r\n");
      out.write("            var jssor_1_slider = new $JssorSlider$(\"jssor_1\", jssor_1_options);\r\n");
      out.write("\r\n");
      out.write("            /*#region responsive code begin*/\r\n");
      out.write("\r\n");
      out.write("            var MAX_WIDTH = 1600;\r\n");
      out.write("\r\n");
      out.write("            function ScaleSlider() {\r\n");
      out.write("                var containerElement = jssor_1_slider.$Elmt.parentNode;\r\n");
      out.write("                var containerWidth = containerElement.clientWidth;\r\n");
      out.write("\r\n");
      out.write("                if (containerWidth) {\r\n");
      out.write("\r\n");
      out.write("                    var expectedWidth = Math.min(MAX_WIDTH || containerWidth, containerWidth);\r\n");
      out.write("\r\n");
      out.write("                    jssor_1_slider.$ScaleWidth(expectedWidth);\r\n");
      out.write("                }\r\n");
      out.write("                else {\r\n");
      out.write("                    window.setTimeout(ScaleSlider, 30);\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            ScaleSlider();\r\n");
      out.write("\r\n");
      out.write("            $Jssor$.$AddEvent(window, \"load\", ScaleSlider);\r\n");
      out.write("            $Jssor$.$AddEvent(window, \"resize\", ScaleSlider);\r\n");
      out.write("            $Jssor$.$AddEvent(window, \"orientationchange\", ScaleSlider);\r\n");
      out.write("            /*#endregion responsive code end*/\r\n");
      out.write("        };\r\n");
      out.write("    </script>\r\n");
      out.write("    <style>\r\n");
      out.write("        /*jssor slider loading skin spin css*/\r\n");
      out.write("        .jssorl-009-spin img {\r\n");
      out.write("            animation-name: jssorl-009-spin;\r\n");
      out.write("            animation-duration: 1.6s;\r\n");
      out.write("            animation-iteration-count: infinite;\r\n");
      out.write("            animation-timing-function: linear;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        @keyframes jssorl-009-spin {\r\n");
      out.write("            from { transform: rotate(0deg); }\r\n");
      out.write("            to { transform: rotate(360deg); }\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        /*jssor slider bullet skin 031 css*/\r\n");
      out.write("        .jssorb031 {position:absolute;}\r\n");
      out.write("        .jssorb031 .i {position:absolute;cursor:pointer;}\r\n");
      out.write("        .jssorb031 .i .b {fill:#000;fill-opacity:0.5;stroke:#fff;stroke-width:1200;stroke-miterlimit:10;stroke-opacity:0.3;}\r\n");
      out.write("        .jssorb031 .i:hover .b {fill:#fff;fill-opacity:.7;stroke:#000;stroke-opacity:.5;}\r\n");
      out.write("        .jssorb031 .iav .b {fill:#fff;stroke:#000;fill-opacity:1;}\r\n");
      out.write("        .jssorb031 .i.idn {opacity:.3;}\r\n");
      out.write("    </style>\r\n");
      out.write("    <div id=\"jssor_1\" style=\"position:relative;margin:0 auto;top:0px;left:0px;width:1600px;height:500px;overflow:hidden;visibility:hidden;\">\r\n");
      out.write("        <!-- Loading Screen -->\r\n");
      out.write("        <div data-u=\"loading\" class=\"jssorl-009-spin\" style=\"position:absolute;top:0px;left:0px;width:100%;height:100%;text-align:center;background-color:rgba(0,0,0,0.7);\">\r\n");
      out.write("            <img style=\"margin-top:-19px;position:relative;top:50%;width:38px;height:38px;\" src=\"//jssorcdn7.azureedge.net/theme/svg/loading/static-svg/spin.svg\" />\r\n");
      out.write("        </div>\r\n");
      out.write("        <div data-u=\"slides\" style=\"cursor:default;position:relative;top:0px;left:0px;width:1600px;height:500px;overflow:hidden;\">\r\n");
      out.write("            <div>\r\n");
      out.write("                <img data-u=\"image\" src=\"resources/images/1.jpg\" />\r\n");
      out.write("            </div>\r\n");
      out.write("            <div>\r\n");
      out.write("                <img data-u=\"image\" src=\"resources/images/2.jpg\" />\r\n");
      out.write("            </div>\r\n");
      out.write("            <div>\r\n");
      out.write("                <img data-u=\"image\" src=\"resources/images/4.jpg\" />\r\n");
      out.write("            </div>\r\n");
      out.write("            <div>\r\n");
      out.write("                <img data-u=\"image\" src=\"resources/images/3.jpg\" />\r\n");
      out.write("            </div>\r\n");
      out.write("            <div>\r\n");
      out.write("                <img data-u=\"image\" src=\"resources/images/5.jpg\" />\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- Bullet Navigator -->\r\n");
      out.write("        <div data-u=\"navigator\" class=\"jssorb031\" style=\"position:absolute;bottom:12px;right:12px;\" data-autocenter=\"2\" data-scale=\"0.5\" data-scale-right=\"0.75\">\r\n");
      out.write("            <div data-u=\"prototype\" class=\"i\" style=\"width:12px;height:12px;\">\r\n");
      out.write("                <svg viewbox=\"0 0 16000 16000\" style=\"position:absolute;top:0;left:0;width:100%;height:100%;\">\r\n");
      out.write("                    <circle class=\"b\" cx=\"8000\" cy=\"8000\" r=\"5800\"></circle>\r\n");
      out.write("                </svg>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <script type=\"text/javascript\">jssor_1_slider_init();</script>\r\n");
      out.write("   ");
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