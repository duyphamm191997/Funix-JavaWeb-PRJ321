package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Articles_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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

      out.write('\n');
      out.write('\n');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../fragment/header.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("<body id=\"page-top\">\n");
      out.write("\n");
      out.write("  ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../fragment/navIndex.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("  <div class=\"container-fluid p-0\">\n");
      out.write("    <hr class=\"m-0\">\n");
      out.write("\n");
      out.write("    <section class=\"resume-section p-3 p-lg-5 d-flex flex-column\" id=\"experience\">\n");
      out.write("      <div class=\"my-auto\">\n");
      out.write("        <h2 class=\"mb-5\">My Articles</h2>\n");
      out.write("\n");
      out.write("        ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("      </div>\n");
      out.write("    </section>\n");
      out.write("\n");
      out.write("    <hr class=\"m-0\">\n");
      out.write("\n");
      out.write("    <section class=\"resume-section p-3 p-lg-5 d-flex flex-column\" id=\"education\">\n");
      out.write("      <div class=\"my-auto\">\n");
      out.write("        <h2 class=\"mb-5\">Education</h2>\n");
      out.write("\n");
      out.write("        <div class=\"resume-item d-flex flex-column flex-md-row mb-5\">\n");
      out.write("          <div class=\"resume-content mr-auto\">\n");
      out.write("            <h3 class=\"mb-0\">University of Colorado Boulder</h3>\n");
      out.write("            <div class=\"subheading mb-3\">Bachelor of Science</div>\n");
      out.write("            <div>Computer Science - Web Development Track</div>\n");
      out.write("            <p>GPA: 3.23</p>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"resume-date text-md-right\">\n");
      out.write("            <span class=\"text-primary\">August 2006 - May 2010</span>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"resume-item d-flex flex-column flex-md-row\">\n");
      out.write("          <div class=\"resume-content mr-auto\">\n");
      out.write("            <h3 class=\"mb-0\">James Buchanan High School</h3>\n");
      out.write("            <div class=\"subheading mb-3\">Technology Magnet Program</div>\n");
      out.write("            <p>GPA: 3.56</p>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"resume-date text-md-right\">\n");
      out.write("            <span class=\"text-primary\">August 2002 - May 2006</span>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("      </div>\n");
      out.write("    </section>\n");
      out.write("\n");
      out.write("    <hr class=\"m-0\">\n");
      out.write("\n");
      out.write("    <section class=\"resume-section p-3 p-lg-5 d-flex flex-column\" id=\"skills\">\n");
      out.write("      <div class=\"my-auto\">\n");
      out.write("        <h2 class=\"mb-5\">Skills</h2>\n");
      out.write("\n");
      out.write("        <div class=\"subheading mb-3\">Programming Languages &amp; Tools</div>\n");
      out.write("        <ul class=\"list-inline dev-icons\">\n");
      out.write("          <li class=\"list-inline-item\">\n");
      out.write("            <i class=\"fab fa-html5\"></i>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"list-inline-item\">\n");
      out.write("            <i class=\"fab fa-css3-alt\"></i>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"list-inline-item\">\n");
      out.write("            <i class=\"fab fa-js-square\"></i>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"list-inline-item\">\n");
      out.write("            <i class=\"fab fa-angular\"></i>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"list-inline-item\">\n");
      out.write("            <i class=\"fab fa-react\"></i>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"list-inline-item\">\n");
      out.write("            <i class=\"fab fa-node-js\"></i>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"list-inline-item\">\n");
      out.write("            <i class=\"fab fa-sass\"></i>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"list-inline-item\">\n");
      out.write("            <i class=\"fab fa-less\"></i>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"list-inline-item\">\n");
      out.write("            <i class=\"fab fa-wordpress\"></i>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"list-inline-item\">\n");
      out.write("            <i class=\"fab fa-gulp\"></i>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"list-inline-item\">\n");
      out.write("            <i class=\"fab fa-grunt\"></i>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"list-inline-item\">\n");
      out.write("            <i class=\"fab fa-npm\"></i>\n");
      out.write("          </li>\n");
      out.write("        </ul>\n");
      out.write("\n");
      out.write("        <div class=\"subheading mb-3\">Workflow</div>\n");
      out.write("        <ul class=\"fa-ul mb-0\">\n");
      out.write("          <li>\n");
      out.write("            <i class=\"fa-li fa fa-check\"></i>\n");
      out.write("            Mobile-First, Responsive Design</li>\n");
      out.write("          <li>\n");
      out.write("            <i class=\"fa-li fa fa-check\"></i>\n");
      out.write("            Cross Browser Testing &amp; Debugging</li>\n");
      out.write("          <li>\n");
      out.write("            <i class=\"fa-li fa fa-check\"></i>\n");
      out.write("            Cross Functional Teams</li>\n");
      out.write("          <li>\n");
      out.write("            <i class=\"fa-li fa fa-check\"></i>\n");
      out.write("            Agile Development &amp; Scrum</li>\n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("    </section>\n");
      out.write("\n");
      out.write("    <hr class=\"m-0\">\n");
      out.write("\n");
      out.write("    <section class=\"resume-section p-3 p-lg-5 d-flex flex-column\" id=\"interests\">\n");
      out.write("      <div class=\"my-auto\">\n");
      out.write("        <h2 class=\"mb-5\">Interests</h2>\n");
      out.write("        <p>Apart from being a web developer, I enjoy most of my time being outdoors. In the winter, I am an avid skier and novice ice climber. During the warmer months here in Colorado, I enjoy mountain biking, free climbing, and kayaking.</p>\n");
      out.write("        <p class=\"mb-0\">When forced indoors, I follow a number of sci-fi and fantasy genre movies and television shows, I am an aspiring chef, and I spend a large amount of my free time exploring the latest technology advancements in the front-end web development world.</p>\n");
      out.write("      </div>\n");
      out.write("    </section>\n");
      out.write("\n");
      out.write("    <hr class=\"m-0\">\n");
      out.write("\n");
      out.write("    <section class=\"resume-section p-3 p-lg-5 d-flex flex-column\" id=\"awards\">\n");
      out.write("      <div class=\"my-auto\">\n");
      out.write("        <h2 class=\"mb-5\">Awards &amp; Certifications</h2>\n");
      out.write("        <ul class=\"fa-ul mb-0\">\n");
      out.write("          <li>\n");
      out.write("            <i class=\"fa-li fa fa-trophy text-warning\"></i>\n");
      out.write("            Google Analytics Certified Developer</li>\n");
      out.write("          <li>\n");
      out.write("            <i class=\"fa-li fa fa-trophy text-warning\"></i>\n");
      out.write("            Mobile Web Specialist - Google Certification</li>\n");
      out.write("          <li>\n");
      out.write("            <i class=\"fa-li fa fa-trophy text-warning\"></i>\n");
      out.write("            1<sup>st</sup>\n");
      out.write("            Place - University of Colorado Boulder - Emerging Tech Competition 2009</li>\n");
      out.write("          <li>\n");
      out.write("            <i class=\"fa-li fa fa-trophy text-warning\"></i>\n");
      out.write("            1<sup>st</sup>\n");
      out.write("            Place - University of Colorado Boulder - Adobe Creative Jam 2008 (UI Design Category)</li>\n");
      out.write("          <li>\n");
      out.write("            <i class=\"fa-li fa fa-trophy text-warning\"></i>\n");
      out.write("            2<sup>nd</sup>\n");
      out.write("            Place - University of Colorado Boulder - Emerging Tech Competition 2008</li>\n");
      out.write("          <li>\n");
      out.write("            <i class=\"fa-li fa fa-trophy text-warning\"></i>\n");
      out.write("            1<sup>st</sup>\n");
      out.write("            Place - James Buchanan High School - Hackathon 2006</li>\n");
      out.write("          <li>\n");
      out.write("            <i class=\"fa-li fa fa-trophy text-warning\"></i>\n");
      out.write("            3<sup>rd</sup>\n");
      out.write("            Place - James Buchanan High School - Hackathon 2005</li>\n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("    </section>\n");
      out.write("\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("art");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listArticles}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("          <div class=\"resume-item d-flex flex-column flex-md-row mb-5\">\n");
          out.write("            <div class=\"resume-content mr-auto\">\n");
          out.write("              <h3 class=\"mb-0\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${art.getTitle()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h3>\n");
          out.write("              <h3 class=\"mb-0\"><a href=\"./EditArticle?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${art.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">Edit</a></h3>\n");
          out.write("              <div class=\"subheading mb-3\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${art.getTopic()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</div>\n");
          out.write("              <p>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${art.getContents()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\n");
          out.write("            </div>\n");
          out.write("            <div class=\"resume-date text-md-right\">\n");
          out.write("              <span class=\"text-primary\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${art.getCreatedAt()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</span>\n");
          out.write("            </div>\n");
          out.write("          </div>\n");
          out.write("        ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
