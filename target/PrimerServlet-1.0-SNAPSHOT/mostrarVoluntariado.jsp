<%-- 
    Document   : mostrarVoluntariado
    Created on : 9/04/2024, 2:59:09 p. m.
    Author     : barbo
--%>

<%@page import="logica.Voluntariado"%>
<%@page import="java.util.List"%>
<%@page import="logica.Donaciones"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mostrar Voluntariado</title>
    </head>
    
    <body>
        <h1>Lista de Donaciones registradas</h1>
        <%
          List<Voluntariado> listaVoluntariado = (List) request.getSession().getAttribute("listaVoluntariado");
            int cont = 1;
          for(Voluntariado vol : listaVoluntariado){                  
         %>
            <p><b>Donacion Numero <%=cont%></b></p>
            <p>Nombre: <%=vol.getNombre_voluntario()%></p>
            <p>Identificacion: <%=vol.getIdentificacion_voluntario()%></p>
            <p>Edad: <%=vol.getEdad()%></p>
            <p>Ocupacion: <%=vol.getOcupacion()%></p>
            <p>Disponibilidad: <%=vol.getDisponibilidad()%></p>
            <p>''''''''''''''''''''''''''''''''''''''</p>
            <% cont = cont + 1;%>
         <%} %>
          <a href="index.html">Regresar para ingresar información</a>
    </body>
</html>
