<%-- 
    Document   : registrabaj1
    Created on : 30 oct 2023, 15:26:14
    Author     : brigi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/registrabaj1.css">
    <title>Registrar trabajador</title>

<!--Import Google Icon Font-->
<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">

<!-- Compiled and minified CSS -->
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
    </head>
    <body>
        <main class="main">

<!--Encabezado-->
<div class="primero">
<header class="cabecera">
    <h3>SISTEMA DE INVENTARIOS TIMCO S.A.S.</h3>
</header>

<!--Menú de navegación-->
<nav class="navegacion">
    <div class="rectangulo">
        <a href="index.jsp">Inicio</a>
        <a href="1Modulos.jsp">Módulos</a>
        <a href="2Contacto.jsp">Contacto</a>
        <a href="3PQRSF.jsp">PQRSF</a>
    </div>
</nav>
</div>

<!--CONTENIDO-->
<!--Sección 1-->
<section class="registro">
    <p><h1><b>Registrar</b></h1></p>
</section>
<br>

<!--Seccion 2-->
<section class="parraf">
    <p>A continuación, registre los datos del trabajador que ingresa a la compañía</p>
</section>
<br><br>

<!--Sección 3: Formulario-->
<section class="formu">
    <article class="izqui">
    <form action="SvRegistrabaj1" method="POST">
        <input type="text" name="nombreCompleto" placeholder="Nombre completo"><br>
        <input type="text" name="tipoDeIdentificacion" placeholder="Tipo de identificación"><br>
        <input type="date" name="fechaDeExpedicion" placeholder="Fecha de expedición">
        <input type="date" name="fechaDeNacimiento" placeholder="Fecha de nacimiento">
        <input type="number" name="edad" placeholder="Edad">
        <input type="text" name="genero" placeholder="Género">
    </form>
    </article>
    <aside class="der">
    <form action="SvRegistrabaj1" method="POST">
        <input type="email" name="correoElectronico" placeholder="Correo electrónico">
        <input type="number" name="noDeIdentificacion" placeholder="No de identificación">
        <input type="text" name="ciudadDeExpedicion" placeholder="Ciudad de expedición">
        <input type="text" name="lugarDeNacimiento" placeholder="Lugar de nacimiento">
        <input type="number" name="estatura" placeholder="Estatura">
        <input type="text" name="estadoCivil" placeholder="Estado civil">
    </form>
    </aside>
</section>
<br><br>
<!--Sección 4: Boton-->
<section class="botones">
    <div class="boton">
        <a href="registrabaj2.jsp">Continuar</a><br><br>
    </div>
</section>
<br><br>

<!--Pie de página-->
<!--Sección de título-->
<section class="seccion">
    <hr>
    <p><h4><b>Transporte, Ingeniería y Maquinaria de Colombia S.A.S.</b></h4></p>
</section>

<!--Sección de imágenes y datos de la empresa-->
<section class="seccion-1">
    <article class="bloque-izq">
        <div class="izq-img">
            <a href="https://www.youtube.com/"><img src="img/2.png" width="5%"></a>
            <a href="https://www.facebook.com/"><img src="img/3.png" width="5%"></a>
            <a href="https://www.gmail.com/"><img src="img/4.png" width="5%"></a>
            <a href="https://www.google.com/maps/?hl=es"><img src="img/5.png" width="5%"></a>
        </div>
    </article>
    <aside class="bloque-der">
        <div>
            <p><h4><b>Contacto</b></h4></p>
            <p><h4>Timcosas@gmail.com</h4></p>
            <p><h4>3142221847</h4></p>
            <p><h4>Bogotá D.C.</h4></p>
            <P><h4>Lun - Vie 08:00am a 5:00pm</h4></P>
        </div>
    </aside>
</section>
<footer></footer>
</main>

<!-- Compiled and minified JavaScript -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>

    </body>
</html>
