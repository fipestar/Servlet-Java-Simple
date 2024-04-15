

<%@page import="java.util.List"%>
<%@page import="logica.Donaciones"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mostrar Donaciones</title>
    </head>
    <body>
        <h1>Lista de Donaciones registradas</h1>
        <%
          List<Donaciones> listaDonaciones = (List) request.getSession().getAttribute("listaDonaciones");
            int cont = 1;
          for(Donaciones usu : listaDonaciones){                  
         %>
            <p><b>Donacion Numero <%=cont%></b></p>
            <p>Nombre: <%=usu.getNombre()%></p>
            <p>Identificacion: <%=usu.getIdentificacion()%></p>
            <p>Monto: <%=usu.getMonto()%></p>
            <p>''''''''''''''''''''''''''''''''''''''</p>
            <% cont = cont + 1;%>
         <%} %>
          <a href="index.html">Regresar para ingresar información</a>
    </body>
</html>
