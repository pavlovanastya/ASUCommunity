package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/WEB-INF/jspf/header.jspf");
    _jspx_dependants.add("/WEB-INF/jspf/footer.jspf");
  }

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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>??????? ???????? ASUCommunity</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header>\n");
      out.write("            <a href=\"/\"><img alt=\"???????\" id=\"top-image\" src=\"#\"/></a>\n");
      out.write("            <div id=\"user-panel\">\n");
      out.write("                <a href=\"#\"><img alt=\"?????? ?????\" scr=\"\"/></a>\n");
      out.write("                <a href=\"javascript:void(0);\">[?????? ??? ?????]</a>\n");
      out.write("            </div>\n");
      out.write("        </header>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.0 Transitional//EN\" \"http://www.w3.org/TR/REC-html40/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("        <div id=\"main\">\n");
      out.write("            <aside class=\"leftAside\">\n");
      out.write("                <h2>Темы статей</h2>\n");
      out.write("                <ul>\n");
      out.write("                    <li><a href=\"#\">Тема 1</a></li>\n");
      out.write("                    <li><a href=\"#\">Тема 2</a></li>\n");
      out.write("                    <li><a href=\"#\">Тема 3</a></li>\n");
      out.write("                    <li><a href=\"#\">Тема 3</a></li>\n");
      out.write("                    \n");
      out.write("                </ul>\n");
      out.write("            </aside>\n");
      out.write("            <section>\n");
      out.write("                <article>\n");
      out.write("                    <h1>Статья</h1>\n");
      out.write("                    <div class=\"text-article\">\n");
      out.write("                        Текст статьи\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"fotter-article\">\n");
      out.write("                        <span class=\"autor\">Автор статьи: <a href=\"#\">автор</a></span>\n");
      out.write("                        <span class=\"read\"><a href=\"javascript:void(0);\">Читать...</a></span>\n");
      out.write("                        <span class=\"date-article\">Дата статьи: 20.12.2012</span>\n");
      out.write("                    </div>\n");
      out.write("                </article>\n");
      out.write("                <article>\n");
      out.write("                    <h1>Статья</h1>\n");
      out.write("                    <div class=\"text-article\">\n");
      out.write("                        Текст статьи\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"fotter-article\">\n");
      out.write("                        <span class=\"autor\">Автор статьи: <a href=\"#\">автор</a></span>\n");
      out.write("                        <span class=\"read\"><a href=\"javascript:void(0);\">Читать...</a></span>\n");
      out.write("                        <span class=\"date-article\">Дата статьи: 20.12.2012</span>\n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                </article>\n");
      out.write("            </section>\n");
      out.write("        </div>\n");
      out.write("    </html>\n");
      out.write("\n");
      out.write("\n");
      out.write("<footer>\n");
      out.write("            <div>\n");
      out.write("                <span>Developers:Pavlova Nastya,Dzubka Sergiy</span>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("    </body>\n");
      out.write("</html>   \n");
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
