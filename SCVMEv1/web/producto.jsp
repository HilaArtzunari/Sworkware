<%-- 
    Document   : home
    Created on : 10/12/2017, 10:01:53 AM
    Author     : I.S.C. Roberto Mendoza Saavedra(isc.robertomendoza@gmail.com) - ESCOM
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/w3.css">
        <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
		
		
        <title>SCVME-ESCOM</title>
    </head>
	<style>
	body{
    background-position: center;
}
</style>
	
    <body background="img/fondo1.jpg">
        <div class="w3-container">
            <nav>
                <div class="w3-bar w3-light-grey w3-border w3-padding">
                    <button type="submit" class="w3-bar-item w3-button w3-round w3-blue w3-mobile w3-right">Login</button>
                    <input type="password" name="pwdLogin" class="w3-bar-item w3-input w3-white w3-mobile w3-right" placeholder="Contraseña" style="margin-left: 5px">
                    <input type="text" name="usuario" class="w3-bar-item w3-input w3-white w3-mobile w3-right" placeholder="Usuario" style="margin-left: 5px">
                    <button class="w3-button w3-round w3-blue w3-mobile w3-right" onclick="document.getElementById('id01').style.display = 'block'">Regístrate</button>
                    <a href="home.jsp" class="w3-bar-item w3-button w3-mobile w3-right">Inicio</a>
                </div>
            </nav>
            <div class="w3-row">
                <div class="w3-col l12 m12 w3-center">
                    <h1 class="w3-text-white" style="text-shadow:5px 5px 0 #4e6479; font-size: 50px;    ">SISTEMA DE COMPRA Y VENTA DE MATERIAL ELECTRÓNICO</h1>
                </div>
            </div>
            <buscador>
                <div class="w3-row w3-center">
                    <div class="w3-col l12 m12">
                        <div class="w3-bar">
                            <input type="text" name="buscador" class="w3-bar-item w3-input w3-white w3-mobile" placeholder="Buscar...">                     
                            <button type="submit" class="w3-bar-item w3-button w3-round w3-blue w3-mobile material-icons">search</button>
                        </div> 
                    </div>
                    <div class="w3-col l12 m12">
                        <div class="w3-bar">
                            <input class="w3-radio" type="radio" name="busqueda" value="1">
                            <label class="w3-text-white">Componente</label>
                            <input class="w3-radio" type="radio" name="busqueda" value="2">
                            <label class="w3-text-white">Usuario</label>
                        </div>
                    </div>                    
                </div>
            </buscador>

<table class="w3-table" background="img/fondo.jpg" >
<tr>
<th>
<div class="w3-row-padding w3-margin-top w3-right">

  <div class="w3-third">
    <div class="w3-card w3-center w3-with" style="width: 600px;">
	 
      <img src="img/gal22v10b.jpg" style="width: 600px; height: 450px;" class="w3-round w3-center">
      <div class="w3-container w3-blue-grey">
       <h5>GAL22V10D</h5>
		
      </div>
    </div>
  </div>
</div>
</th>

<th>


<table class="w3-table w3-center"  background="img/fondo.jpg">
<tr>
<h5 class="w3-center">DESCRIPCIÓN </h5>
<p class="w3-center"> Valores Máximos de Operación 
Tensión de Alimentación VCC....................................... -0.5 a +7V <br>
Voltaje de Entrada Aplicado.......................... -2.5 a VCC +1.0V <br>
Tensión de salida fuera de estado aplicado.......... -2.5 a VCC +1.0V <br>
Temperatura de almacenamiento................................. -65 a 150°C <br>
Temperatura Caso con Potencia Aplicada.............. -55 a 125°C <br>
 Temperatura de caso (TC)............................... -55 A 125 ° C <br>
Voltaje de alimentación (VCC)..................... 4,50 a 5,50 V <br> <br><br><br>
</p>
</tr>

<tr>Unidades de aprendizaje relacionadas <br>
<p class="fa fa-joomla"> Fundamentos de Diseño Digital <br>
<i class="fa fa-joomla"></i>Diseño de Sistemas Digitales</i> </p>
</tr>
<table class="w3-table-all">
<tr >
  <th class="w3-center">Tipo</th>
  <th class="w3-center">Precio</th>
  <th class="w3-center">Piezas</th>
  <th class="w3-center">Existencia</th>
  <th class="w3-center">Datasheet</th>
</tr>
<tr>
  <td class="w3-center">VENTA</td>
  <td class="w3-center">$35.00</td>
  <td class="w3-center"> <input type="number" class="form-control" min="1" value="1" step="1" style="width:50px; margin-left:6px;"></td>
  <td class="w3-center">18</td>
  <td class="w3-center"><a href="#"><img src="img/pdf.png" style="width: 30px; height: 35px;" ></a></td>
</tr>
</table>
</table>

</th>
<tr>
<td> 
<div class="w3-row-padding w3-margin-top w3-center w3-white">
  <div class="w3-third w3-center">
    <div class="w3-card w3-center">
<h3>Información del usuario</h3><br>

<label>Usuario:  </label><label>  </label> <br>
<label><i class="fa fa- fa-map-marker"> </i>Unidad académica: </label><label>  </label><br>

<label><a href="#">Ver mas publicaciones del usuario</a></label><br><br>
<button class="w3-bar-item w3-button w3-round w3-blue w3-mobile material-icons" onclick="document.getElementById('id02').style.display = 'block'">
Contactar</button>
 
    </div>
	    </div>

		    </div>

  </td>
</tr>
</tr>
</table>		
<div id="id02" class="w3-modal">
<div class="w3-modal-content w3-animate-zoom w3-card-4"  style="width: 450px">
<header class="w3-container w3-teal"> 
                        <span onclick="document.getElementById('id02').style.display = 'none'" 
                              class="w3-button w3-display-topright">&times;</span>
                        <h2>Contactar</h2> 
						</header>
                    <div class="w3-container">
                        <div class="w3-col l12 m12 w3-padding">

                                 <input class="w3-input" name="email" type="email" placeholder="@Correo de contacto"><br>
								<textarea class="w3-textarea" name="mensaje" type="text" placeholder="Escribe un mensaje..."  style="width: 400px"></textarea><br>
                             </div>
                                <button type="submit" class="w3-bar-item w3-button w3-round w3-blue w3-mobile w3-right">Enviar</button>
								
								
								</div>
								</div>
								</div>			
          

        </div>
    </body>
</html>