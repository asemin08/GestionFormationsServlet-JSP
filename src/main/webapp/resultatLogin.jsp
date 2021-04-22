<%@ page import="eu.ensup.gestionformation.metier.User" %><%--
  Created by IntelliJ IDEA.
  User: Allan
  Date: 22/04/2021
  Time: 14:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Résultat identifications</title>
</head>
<body>
    <%
        User u = (User) session.getAttribute("utilisateur");
    %>

    <h1>Informations utilisateur</h1>
    <ul>
        <li>login : <%=u.getLogin()%></li>
        <li>mdp : <%=u.getPassword()%></li>
    </ul>

</body>
</html>
