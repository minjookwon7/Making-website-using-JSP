/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.62
 * Generated at: 2015-07-21 14:42:37 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

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
      response.setContentType("text/html; charset=EUC-KR");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=EUC-KR\">\r\n");
      out.write("<title>Welcome to Minjoo's Website!</title>\r\n");
      out.write("<link href=\"style.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write("<script language=\"JavaScript\" src=\"script.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body><br><br>\r\n");
      out.write("<div>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("<img src=\"");
      out.print(request.getContextPath() );
      out.write("/images/basicInfo.JPG\"/></div>\r\n");
      out.write("<hr>\r\n");
      out.write("<table border=\"1\" cellpadding=\"18\" cellspacing=\"1\" width=\"80%\" align=\"center\">\r\n");
      out.write("<form name=\"regForm\" method=\"post\" action=\"RegisterProc.jsp\">\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td width=\"13%\" align=\"center\" bgcolor=\"#EFEFEF\">\r\n");
      out.write("\t\tID\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t\t<td width=\"60%\"><input type=\"text\" name=\"mem_id\" size=\"18\">\r\n");
      out.write("\t\t<input type=\"button\" value=\"ID 중복확인\" onClick=\"idCheck(this.form.mem_id.value)\"></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td width=\"13%\" align=\"center\" bgcolor=\"#EFEFEF\">Password\r\n");
      out.write("</td>\r\n");
      out.write("\t\t<td width=\"60%\"><input type=\"password\" name=\"mem_passwd\" size=\"18\">\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td width=\"13%\" align=\"center\" bgcolor=\"#EFEFEF\">Confirm Password</td>\r\n");
      out.write("\t\t<td width=\"60%\"><input type=\"password\" name=\"mem_repasswd\" size=\"18\">\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td width=\"13%\" align=\"center\" bgcolor=\"#EFEFEF\">First Name</td>\r\n");
      out.write("\t\t<td width=\"60%\"><input type=\"text\" name=\"mem_firstname\" size=\"18\"></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td width=\"13%\" align=\"center\" bgcolor=\"#EFEFEF\">Last Name</td>\r\n");
      out.write("\t\t<td width=\"60%\"><input type=\"text\" name=\"mem_lastname\" size=\"18\"></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td width=\"13%\" align=\"center\" bgcolor=\"#EFEFEF\">EMAIL ADDRESS</td>\r\n");
      out.write("\t\t<td width=\"60%\"><input type=\"text\" name=\"mem_email\" size=\"27\">\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td width=\"13%\" align=\"center\" bgcolor=\"#EFEFEF\">PHONE NUMBER</td>\r\n");
      out.write("\t\t<td width=\"30%\"><input type=\"text\" name=\"mem_phone1\" size=\"9\">&nbsp;-&nbsp;\r\n");
      out.write("\t\t<input type=\"text\" name=\"mem_phone2\" size=\"10\">&nbsp;-&nbsp;<input type=\"text\" name=\"mem_phone3\" size=\"10\"></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t\r\n");
      out.write("</table>\r\n");
      out.write("<br><br>\r\n");
      out.write("<div>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("<img src=\"");
      out.print(request.getContextPath() );
      out.write("/images/additional.JPG\"/></div>\r\n");
      out.write("<hr>\r\n");
      out.write("<table border=\"1\" cellpadding=\"18\" cellspacing=\"1\" width=\"80%\" align=\"center\">\r\n");
      out.write("<tr>\r\n");
      out.write("\t\t<td width=\"13%\" align=\"center\" bgcolor=\"#EFEFEF\">BIRTHDAY</td>\r\n");
      out.write("\t\t<td width=\"60%\"><input type=\"text\" name=\"mem_bday\" size=\"18\">\r\n");
      out.write("\t\t(YYYYMMDD)</td>\r\n");
      out.write("</tr>\r\n");
      out.write("</table>\r\n");
      out.write("</form>\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("<div align=\"center\">\r\n");
      out.write("<img src=\"");
      out.print(request.getContextPath() );
      out.write("/images/submit.JPG\"/>\r\n");
      out.write("<img src=\"");
      out.print(request.getContextPath() );
      out.write("/images/goback.JPG\"/></div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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