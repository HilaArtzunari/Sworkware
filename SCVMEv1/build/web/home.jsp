
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
			
<div class="w3-row-padding w3-margin-top w3-center">
  <div class="w3-third w3-center">
    <div class="w3-card w3-center" style="width: 380px;">
      <img src="img/5-led.jpg" style="width: 320px; height: 250px;" class="w3-round w3-center">
		<div class="w3-container w3-blue-grey">
        <h5>LED`s </h5>
		<table class="w3-table">
<tr >
  <th class="w3-center">Precio $</th>
  <th> <a href="producto.html"><img src="img/ver.png"></a></th>
</tr>
</table>
		</div>
		
      </div>
    </div>
 

 <div class="w3-third">
    <div class="w3-card w3-center" style="width: 380px;">
      <img src="img/capacitor.jpg" style="width: 320px; height: 250px;" class="w3-round w3-center">
		<div class="w3-container w3-blue-grey">
        <h5>Capacitor 1000uF 25v</h5>
		<table class="w3-table">
<tr >
  <th class="w3-center">Precio $</th>
  <th> <a href="producto.html"><img src="img/ver.png"></a></th>
</tr>
</table>
	</div>
 </div>
</div>
 

  <div class="w3-third">
    <div class="w3-card w3-center" style="width: 380px;">
      <img src="img/motor.jpg" style="width: 320px; height: 250px;" class="w3-round w3-center">
      <div class="w3-container w3-blue-grey">
        <h5>Motor cd 12v</h5>
		<table class="w3-table">
	<tr >
  <th class="w3-center">Precio $</th>
  <th> <a href="producto.html"><img src="img/ver.png"></a></th>
</tr>
</table>
      </div>
    </div>
  </div>



  <div class="w3-third">
    <div class="w3-card w3-center" style="width: 380px;">
      <img src="img/resistencias.jpeg" style="width: 320px; height: 250px;" class="w3-round w3-center" >
      <div <div class="w3-container w3-blue-grey">
        <h5>Resistencias 2 kΩ </h5>
		<table class="w3-table">
<tr >
  <th class="w3-center">Precio $</th>
  <th> <a href="producto.html"><img src="img/ver.png"></a></th>
</tr>
</table>
      </div> 
    </div>
    </div>

  <div class="w3-third">
    <div class="w3-card w3-center" style="width: 380px;">
      <img src="img/gal22v10b.jpg" style="width: 320px; height: 250px;" class="w3-round w3-center">
      <div class="w3-container w3-blue-grey">
        <h5>GAL22V10B</h5>
		<table class="w3-table">
<tr >
  <th class="w3-center">Precio $</th>
  <th> <a href="producto.html"><img src="img/ver.png"></a></th>
</tr>
</table>
      </div>
    </div>
  </div>

  <div class="w3-third">
    <div class="w3-card w3-center" style="width: 380px;">
      <img src="img/ledir.jpg" style="width: 320px; height: 250px;" class="w3-round w3-center">
      <div class="w3-container w3-blue-grey">
        <h5>LED`s Ultrabrillantes</h5>
		<table class="w3-table">
<tr >
  <th class="w3-center">Precio $</th>
  <th> <a href="producto.html"><img src="img/ver.png"></a></th>
</tr>
</table>
      </div>
    </div>
  </div>
</div>

</body>
</html>

			
			
			
            <!-- Codigo para el modal del formulario -->
            <div id="id01" class="w3-modal">
                <div class="w3-modal-content w3-animate-zoom w3-card-4" style="width: 500px">
                    <header class="w3-container w3-teal"> 
                        <span onclick="document.getElementById('id01').style.display = 'none'" 
                              class="w3-button w3-display-topright">&times;</span>
                        <h2>Registrate</h2>
                    </header>
                    <div class="w3-container">
                        <div class="w3-col l12 m12 w3-padding">
                            <p>
                                <label>Los campos marcados con * son obligatorios.</label>
                                <input class="w3-input" name="email" type="email" placeholder="Email*"><br>
                                <input class="w3-input" name="user" type="text" placeholder="Usuario*"><br>
                                <input class="w3-input" name="pwd" type="password" placeholder="Contraseña (max. 8 caracteres)*"><br>
                                <input class="w3-input" name="user" type="password" placeholder="Confirmar contraseña*"><br>
                                <label>Información personal</label>
                                <input class="w3-input" name="nombre" type="text" placeholder="Nombre(s)*"><br>
                                <input class="w3-input" name="pApellido" type="text" placeholder="Apellido paterno*"><br>
                                <input class="w3-input" name="sApellido" type="text" placeholder="Apellido materno*"><br>
                                <select class="w3-select" name="uniAca">
                                    <option value="" disabled selected>Selecciona tú unidad académica</option>
                                    <option value="1">Option 1</option>
                                    <option value="2">Option 2</option>
                                    <option value="3">Option 3</option>
                                </select>
                                <br><br>
                                <label>Subir foto de perfil:</label>
                                <input class="w3-input" name="foto" type="file"><br>
                                <button type="submit" class="w3-bar-item w3-button w3-round w3-blue w3-mobile w3-right">Registarme</button><br>
                                                                
                            </p>
                        </div>

                    </div>
                </div>
            </div>
            <!-- Fin modal -->

        </div>
    </body>
</html>