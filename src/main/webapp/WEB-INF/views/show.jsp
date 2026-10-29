<%@ page import="java.util.List" %>
<%@ page import="ir.maktabsharif.model.Book" %><%--
  Created by IntelliJ IDEA.
  User: pasargad
  Date: 10/29/2026
  Time: 3:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>

<html>
<head>
    <title>Find All</title>
</head>
<body>

<% List<Book> books = (List<Book>) request.getAttribute("books") ;
    for (Book book: books){
%>
<p><%= book.getName() %></p>
<p><%= book.getAuthor() %></p>
<%
    }
%>
</body>
</html>
