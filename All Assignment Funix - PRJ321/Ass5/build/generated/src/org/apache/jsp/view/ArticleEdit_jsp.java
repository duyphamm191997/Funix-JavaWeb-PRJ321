package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ArticleEdit_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../fragment/header.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("<body id=\"page-top\">\n");
      out.write("\n");
      out.write("  ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../fragment/navIndex.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("  <div class=\"container\" style=\"margin-top: 2rem;\">\n");
      out.write("    <form action=\"preUpdate\" method=\"POST\">\n");
      out.write("      <input type=\"hidden\" class=\"form-control\" name=\"id\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${thisArt.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("      <div class=\"form-group\">\n");
      out.write("        <label for=\"\">Title</label>\n");
      out.write("        <input type=\"text\" class=\"form-control\" name=\"title\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${thisArt.getTitle()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("      </div>\n");
      out.write("      <div class=\"form-group\">\n");
      out.write("        <label for=\"\">Author</label>\n");
      out.write("        <input type=\"hidden\" class=\"form-control\" name=\"author\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${thisArt.getAuthor()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("      </div>\n");
      out.write("      <div class=\"form-group\">\n");
      out.write("        <label for=\"\">Topic</label>\n");
      out.write("        <textarea class=\"form-control\" name=\"topic\" rows=\"=2\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${thisArt.getTopic()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</textarea>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"form-group\">\n");
      out.write("        <label for=\"\">Content</label>\n");
      out.write("        <textarea class=\"form-control\" name=\"contents\" rows=\"4\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${thisArt.getContents()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</textarea>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"form-check\">\n");
      out.write("        <input type=\"checkbox\" class=\"form-check-input\" name=\"status\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${(thisArt.getStatus() == 0) ? \"\" : \"checked\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" value=\"Published\">\n");
      out.write("        <label class=\"form-check-label\" for=\"\">Published</label>\n");
      out.write("      </div>\n");
      out.write("      <a href=\"Articles\" class=\"btn btn-warning btn-lg\">Cancel</a>\n");
      out.write("      <button type=\"submit\" class=\"btn btn-lg btn-info\">Submit</button>\n");
      out.write("    </form>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("  ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../fragment/footer.jsp", out, false);
      out.write('\n');
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
