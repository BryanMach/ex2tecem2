<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="com.emergentes.modelo.Evento"%>
<%
    Evento evento = (Evento)request.getAttribute("evento");
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Nuevo Seminario</h1>
        <form action="MainController" method="post">
            <table>
                <input type="hidden" name="id" value="${evento.id}">
                <tr>
                    <td>Título</td>
                    <td><input type="text" name="titulo" value="${evento.titulo}"></td>
                </tr>
                <tr>
                    <td>Expositor</td>
                    <td><input type="text" name="expositor" value="${evento.expositor}"></td>
                </tr>
                <tr>
                    <td>Fecha</td>
                    <td><input type="text" name="fecha" value="${evento.fecha}"></td>
                </tr>
                <tr>
                    <td>Hora</td>
                    <td><input type="text" name="horas" value="${evento.horas}"></td>
                </tr>
                <tr>
                    <td>Cupos</td>
                    <td><input type="number" name="cupos" value="${evento.cupos}"></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="Enviar" ></td>
                </tr>
                
            </table>
        </form>            
    </body>
</html>
