<%@ page import="ir.maktabsharif.model.Book" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: amirm
  Date: 10/29/2026
  Time: 4:13 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>views</title>
</head>
<body>

<% List<Book> books = (List<Book>) request.getAttribute("books") ;
    for (Book book: books){
%>
<p><%= book.getName() %></p>
<p><%= book.getAuthor() %></p>
<p><%= book.getPrice() %></p>
<%
    }
%>

<%--<c:forEach var="Book" items="${books}">--%>
<%--    <h3>${book.name}</h3>--%>
<%--</c:forEach>--%>

</body>
</html>
