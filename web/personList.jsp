<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table style='border: 2px solid black;'>
            <tr>
                <th>Imię</th> 
                <th>Nazwisko</th>
                <th>Email</th>               
            </tr>
            <c:forEach items="${personList}" var="osoby">
                <tr>
                    <td><c:out value="${osoby.firstName}"/></td>
                    <td><c:out value="${osoby.lastName}"/></td>  
                    <td><c:out value="${osoby.email}"/></td>  
                </tr>
            </c:forEach>
        </table>
                    </body>
                </html>
