<%@ page import="com.example.java_lr10.City" %><%--
  Created by IntelliJ IDEA.
  User: mmish
  Date: 22.10.2023
  Time: 13:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% City city = (City) request.getAttribute("city"); %>
<html>
<head>
    <title>City</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
          rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
          crossorigin="anonymous">
</head>
<body>
    <div class="container">
        <h1>Name of city: ${city.getNameOfCity()}</h1>
        <h3>Name of country: ${city.getNameOfCountry()}</h3>
        <img src="${city.getCoatOfArms()}" style="width: 200px"/>
        <h3>Number of people: ${city.getCountOfPeople()}</h3>
        <h3>Description: ${city.getDescription()}</h3>
        <a href="index.jsp">BACK</a>
    </div>
</body>
</html>
