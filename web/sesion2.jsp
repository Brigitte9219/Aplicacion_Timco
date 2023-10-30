<%-- 
    Document   : sesion2
    Created on : 30 oct 2023, 13:59:10
    Author     : brigi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/sesion2.css">
    <title>Inicia sesión</title>

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
<section class="fila1">
<article class="iz">
    <form action="">
        <input type="text" placeholder="Buscar">
    </form>
</article>
<aside class="dere">
    <a href="1Modulos.jsp">Salir</a>
</aside>
</section>

<!--Seccion 2: links barra horizontal-->
<section class="fila2">
<a href="">Eliminar</a>
<a href="">Archivar</a>
<a href="">Mover a</a>
<a href="">Marcar todos como leídos</a>
</section>

<!--Sección 3: Botones de la izquierda-->
<section class="secci">
    <article class="izquier">
    <a href="">Bandeja de entrada</a>
    <a href="">Correo no deseado</a>
    <a href="">Borradores</a>
    <a href="">Elementos enviados</a>
    <a href="">Elementos eliminados</a>
    <a href="">Archivo</a>
    <a href="">Notas</a>
</article>
<aside class="der">
    <table class="tabla">
        <tr>
            <th class="th">De</th>
            <th class="th">Asunto</th>
            <th class="th">Recibido</th>
        </tr>
        <tr>
            <td>SENA</td>
            <td>Formación ADSO</td>
            <td>Vie</td>
        </tr>
        <tr>
            <td>Scrum Master</td>
            <td>Reunión del spprint</td>
            <td>Jue</td>
        </tr>
        <tr>
            <td>Product Owner</td>
            <td>Reunión del sprint</td>
            <td>Mie</td>
        </tr>
        <tr>
            <td>Team Scrum</td>
            <td>Reunión del sprint</td>
            <td>Mar</td>
        </tr>
        <tr>
            <td>SENA</td>
            <td>Sesión sincrónica</td>
            <td>Lun</td>
        </tr>
        <tr>
            <td>Recursos humanos</td>
            <td>Solicitud</td>
            <td>Dom</td>
        </tr>
        <tr>
            <td>Seguridad y salud</td>
            <td>Capacitación</td>
            <td>Sáb</td>
        </tr>
    </table>
</aside>
</section>

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
