<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Java Web - laboratorium 4</title>
    </head>
    <body>
        <h1>Cześć, <c:out value="${dane.firstName}"/> <c:out value="${dane.lastName}"/>!</h1>
        <br>
        <a href="mailto:${dane.email}">email</a>
        <br>
        <span style='color: pink'>Piotr</span>
        <script>alert('Jestem zlym hackerem i zaraz cie zjem!');</script> 
        <br>
        <c:forEach items="${dniTygodnia}" var="dzien">
            <p>
                ${dzien}
            </p>
        </c:forEach>
    </body>
</html>
