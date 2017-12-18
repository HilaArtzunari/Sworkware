package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/w3.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/icon?family=Material+Icons\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("        <title>SCVME-ESCOM</title>\r\n");
      out.write("    </head>\r\n");
      out.write("\t<style>\r\n");
      out.write("\tbody{\r\n");
      out.write("    background-position: center;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\t\r\n");
      out.write("    <body background=\"img/fondo1.jpg\">\r\n");
      out.write("        <div class=\"w3-container\">\r\n");
      out.write("            <nav>\r\n");
      out.write("                <div class=\"w3-bar w3-light-grey w3-border w3-padding\">\r\n");
      out.write("                    <button type=\"submit\" class=\"w3-bar-item w3-button w3-round w3-blue w3-mobile w3-right\">Login</button>\r\n");
      out.write("                    <input type=\"password\" name=\"pwdLogin\" class=\"w3-bar-item w3-input w3-white w3-mobile w3-right\" placeholder=\"ContraseÃ±a\" style=\"margin-left: 5px\">\r\n");
      out.write("                    <input type=\"text\" name=\"usuario\" class=\"w3-bar-item w3-input w3-white w3-mobile w3-right\" placeholder=\"Usuario\" style=\"margin-left: 5px\">\r\n");
      out.write("                    <button class=\"w3-button w3-round w3-blue w3-mobile w3-right\" onclick=\"document.getElementById('id01').style.display = 'block'\">RegÃ­strate</button>\r\n");
      out.write("                    <a href=\"home.jsp\" class=\"w3-bar-item w3-button w3-mobile w3-right\">Inicio</a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </nav>\r\n");
      out.write("            <div class=\"w3-row\">\r\n");
      out.write("                <div class=\"w3-col l12 m12 w3-center\">\r\n");
      out.write("                    <h1 class=\"w3-text-white\" style=\"text-shadow:5px 5px 0 #4e6479; font-size: 50px;    \">SISTEMA DE COMPRA Y VENTA DE MATERIAL ELECTRÃNICO</h1>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <buscador>\r\n");
      out.write("                <div class=\"w3-row w3-center\">\r\n");
      out.write("                    <div class=\"w3-col l12 m12\">\r\n");
      out.write("                        <div class=\"w3-bar\">\r\n");
      out.write("                            <input type=\"text\" name=\"buscador\" class=\"w3-bar-item w3-input w3-white w3-mobile\" placeholder=\"Buscar...\">                     \r\n");
      out.write("                            <button type=\"submit\" class=\"w3-bar-item w3-button w3-round w3-blue w3-mobile material-icons\">search</button>\r\n");
      out.write("                        </div> \r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"w3-col l12 m12\">\r\n");
      out.write("                        <div class=\"w3-bar\">\r\n");
      out.write("                            <input class=\"w3-radio\" type=\"radio\" name=\"busqueda\" value=\"1\">\r\n");
      out.write("                            <label class=\"w3-text-white\">Componente</label>\r\n");
      out.write("                            <input class=\"w3-radio\" type=\"radio\" name=\"busqueda\" value=\"2\">\r\n");
      out.write("                            <label class=\"w3-text-white\">Usuario</label>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>                    \r\n");
      out.write("                </div>\r\n");
      out.write("            </buscador>\r\n");
      out.write("\t\t\t\r\n");
      out.write("<div class=\"w3-row-padding w3-margin-top w3-center\">\r\n");
      out.write("  <div class=\"w3-third w3-center\">\r\n");
      out.write("    <div class=\"w3-card w3-center\" style=\"width: 380px;\">\r\n");
      out.write("      <img src=\"img/5-led.jpg\" style=\"width: 320px; height: 250px;\" class=\"w3-round w3-center\">\r\n");
      out.write("\t\t<div class=\"w3-container w3-blue-grey\">\r\n");
      out.write("        <h5>LED`s </h5>\r\n");
      out.write("\t\t<table class=\"w3-table\">\r\n");
      out.write("<tr >\r\n");
      out.write("  <th class=\"w3-center\">Precio $</th>\r\n");
      out.write("  <th> <a href=\"producto.html\"><img src=\"img/ver.png\"></a></th>\r\n");
      out.write("</tr>\r\n");
      out.write("</table>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write(" <div class=\"w3-third\">\r\n");
      out.write("    <div class=\"w3-card w3-center\" style=\"width: 380px;\">\r\n");
      out.write("      <img src=\"img/capacitor.jpg\" style=\"width: 320px; height: 250px;\" class=\"w3-round w3-center\">\r\n");
      out.write("\t\t<div class=\"w3-container w3-blue-grey\">\r\n");
      out.write("        <h5>Capacitor 1000uF 25v</h5>\r\n");
      out.write("\t\t<table class=\"w3-table\">\r\n");
      out.write("<tr >\r\n");
      out.write("  <th class=\"w3-center\">Precio $</th>\r\n");
      out.write("  <th> <a href=\"producto.html\"><img src=\"img/ver.png\"></a></th>\r\n");
      out.write("</tr>\r\n");
      out.write("</table>\r\n");
      out.write("\t</div>\r\n");
      out.write(" </div>\r\n");
      out.write("</div>\r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("  <div class=\"w3-third\">\r\n");
      out.write("    <div class=\"w3-card w3-center\" style=\"width: 380px;\">\r\n");
      out.write("      <img src=\"img/motor.jpg\" style=\"width: 320px; height: 250px;\" class=\"w3-round w3-center\">\r\n");
      out.write("      <div class=\"w3-container w3-blue-grey\">\r\n");
      out.write("        <h5>Motor cd 12v</h5>\r\n");
      out.write("\t\t<table class=\"w3-table\">\r\n");
      out.write("\t<tr >\r\n");
      out.write("  <th class=\"w3-center\">Precio $</th>\r\n");
      out.write("  <th> <a href=\"producto.html\"><img src=\"img/ver.png\"></a></th>\r\n");
      out.write("</tr>\r\n");
      out.write("</table>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  <div class=\"w3-third\">\r\n");
      out.write("    <div class=\"w3-card w3-center\" style=\"width: 380px;\">\r\n");
      out.write("      <img src=\"img/resistencias.jpeg\" style=\"width: 320px; height: 250px;\" class=\"w3-round w3-center\" >\r\n");
      out.write("      <div <div class=\"w3-container w3-blue-grey\">\r\n");
      out.write("        <h5>Resistencias 2 kÎ© </h5>\r\n");
      out.write("\t\t<table class=\"w3-table\">\r\n");
      out.write("<tr >\r\n");
      out.write("  <th class=\"w3-center\">Precio $</th>\r\n");
      out.write("  <th> <a href=\"producto.html\"><img src=\"img/ver.png\"></a></th>\r\n");
      out.write("</tr>\r\n");
      out.write("</table>\r\n");
      out.write("      </div> \r\n");
      out.write("    </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("  <div class=\"w3-third\">\r\n");
      out.write("    <div class=\"w3-card w3-center\" style=\"width: 380px;\">\r\n");
      out.write("      <img src=\"img/gal22v10b.jpg\" style=\"width: 320px; height: 250px;\" class=\"w3-round w3-center\">\r\n");
      out.write("      <div class=\"w3-container w3-blue-grey\">\r\n");
      out.write("        <h5>GAL22V10B</h5>\r\n");
      out.write("\t\t<table class=\"w3-table\">\r\n");
      out.write("<tr >\r\n");
      out.write("  <th class=\"w3-center\">Precio $</th>\r\n");
      out.write("  <th> <a href=\"producto.html\"><img src=\"img/ver.png\"></a></th>\r\n");
      out.write("</tr>\r\n");
      out.write("</table>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("  <div class=\"w3-third\">\r\n");
      out.write("    <div class=\"w3-card w3-center\" style=\"width: 380px;\">\r\n");
      out.write("      <img src=\"img/ledir.jpg\" style=\"width: 320px; height: 250px;\" class=\"w3-round w3-center\">\r\n");
      out.write("      <div class=\"w3-container w3-blue-grey\">\r\n");
      out.write("        <h5>LED`s Ultrabrillantes</h5>\r\n");
      out.write("\t\t<table class=\"w3-table\">\r\n");
      out.write("<tr >\r\n");
      out.write("  <th class=\"w3-center\">Precio $</th>\r\n");
      out.write("  <th> <a href=\"producto.html\"><img src=\"img/ver.png\"></a></th>\r\n");
      out.write("</tr>\r\n");
      out.write("</table>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("            <!-- Codigo para el modal del formulario -->\r\n");
      out.write("            <div id=\"id01\" class=\"w3-modal\">\r\n");
      out.write("                <div class=\"w3-modal-content w3-animate-zoom w3-card-4\" style=\"width: 500px\">\r\n");
      out.write("                    <header class=\"w3-container w3-teal\"> \r\n");
      out.write("                        <span onclick=\"document.getElementById('id01').style.display = 'none'\" \r\n");
      out.write("                              class=\"w3-button w3-display-topright\">&times;</span>\r\n");
      out.write("                        <h2>Registrate</h2>\r\n");
      out.write("                    </header>\r\n");
      out.write("                    <div class=\"w3-container\">\r\n");
      out.write("                        <div class=\"w3-col l12 m12 w3-padding\">\r\n");
      out.write("                            <p>\r\n");
      out.write("                                <label>Los campos marcados con * son obligatorios.</label>\r\n");
      out.write("                                <input class=\"w3-input\" name=\"email\" type=\"email\" placeholder=\"Email*\"><br>\r\n");
      out.write("                                <input class=\"w3-input\" name=\"user\" type=\"text\" placeholder=\"Usuario*\"><br>\r\n");
      out.write("                                <input class=\"w3-input\" name=\"pwd\" type=\"password\" placeholder=\"ContraseÃ±a (max. 8 caracteres)*\"><br>\r\n");
      out.write("                                <input class=\"w3-input\" name=\"user\" type=\"password\" placeholder=\"Confirmar contraseÃ±a*\"><br>\r\n");
      out.write("                                <label>InformaciÃ³n personal</label>\r\n");
      out.write("                                <input class=\"w3-input\" name=\"nombre\" type=\"text\" placeholder=\"Nombre(s)*\"><br>\r\n");
      out.write("                                <input class=\"w3-input\" name=\"pApellido\" type=\"text\" placeholder=\"Apellido paterno*\"><br>\r\n");
      out.write("                                <input class=\"w3-input\" name=\"sApellido\" type=\"text\" placeholder=\"Apellido materno*\"><br>\r\n");
      out.write("                                <select class=\"w3-select\" name=\"uniAca\">\r\n");
      out.write("                                    <option value=\"\" disabled selected>Selecciona tÃº unidad acadÃ©mica</option>\r\n");
      out.write("                                    <option value=\"1\">Option 1</option>\r\n");
      out.write("                                    <option value=\"2\">Option 2</option>\r\n");
      out.write("                                    <option value=\"3\">Option 3</option>\r\n");
      out.write("                                </select>\r\n");
      out.write("                                <br><br>\r\n");
      out.write("                                <label>Subir foto de perfil:</label>\r\n");
      out.write("                                <input class=\"w3-input\" name=\"foto\" type=\"file\"><br>\r\n");
      out.write("                                <button type=\"submit\" class=\"w3-bar-item w3-button w3-round w3-blue w3-mobile w3-right\">Registarme</button><br>\r\n");
      out.write("                                                                \r\n");
      out.write("                            </p>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- Fin modal -->\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("    </body>\r\n");
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
