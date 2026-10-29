<%--
  Created by IntelliJ IDEA.
  User: pasargad
  Date: 10/29/2026
  Time: 3:14 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Add Book</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/books/save" method="post">
    <label for="name">Name : </label>
    <input type="text" id="name" placeholder="name" required> <br>

    <label for="title">author : </label>
    <input type="text" name="author" id="title" placeholder="title" required> <br>

    <label for="price">Price : </label>
    <input type="number" name="price" id="price" placeholder="e.g. 1000.0 $" required> <br>

    <button type="submit">ADD</button>
</form>
</body>
</html>
