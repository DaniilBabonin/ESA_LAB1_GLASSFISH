<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Cats</title>
</head>
<body>
<table>
    <thead>
    <tr>
        <td>name</td>
        <td>color</td>
        <td>age</td>
        <td>breedName</td>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${catsList}" var="cat">
        <tr>
            <td>${cat.name}</td>
            <td>${cat.color}</td>
            <td>${cat.age}</td>
            <td>${cat.breed.breedName}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>