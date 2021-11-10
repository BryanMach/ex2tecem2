# ex2tecem2
//index.jsp
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="java.util.List"%>
<%@page import="com.emergentes.modelo.Evento"%>
<%
    List<Evento> evento = (List<Evento>)request.getAttribute("evento");
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Listado de seminarios</h1>
        <p><a href="MainController?op=nuevo">Nuevo</a></p>
        <table border=1">
            <tr>
                <th>Id</th>
                <th>Titulo</th>
                <th>Expositor</th>
                <th>Fecha</th>
                <th>Hora</th>
                <th>Cupos</th>
                <th>Opciones</th>
            </tr>
            <c:forEach var="item" items="${evento}">
            <tr>
                <td>${item.id}</td>
                <td>${item.titulo}</td>
                <td>${item.expositor}</td>
                <td>${item.fecha}</td>
                <td>${item.horas}</td>
                <td>${item.cupos}</td>
                <td> 
                    <a href="MainController?op=eliminar&id=${item.id}" 
                       onclick="return(confirm
                           ('Está seguro de querer eliminar esto???'))"
                       >Eliminar</a></td>
            </tr>
            </c:forEach>
        </table>
    </body>
</html>
