<%--
  Created by IntelliJ IDEA.
  User: mmish
  Date: 22.10.2023
  Time: 15:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Attraction</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
          rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
          crossorigin="anonymous">
</head>
<body>
    <div class="container">
        <h1 class="m-3">Attractions</h1>
        <div class="row">
            <div class="col">
                <div class="card" style="width: 18rem;">
                    <img src="${img1}" class="card-img-top" alt="img1">
                    <div class="card-body">
                        <p class="card-text">${massGrave}</p>
                    </div>
                </div>
            </div>
            <div class="col">
                <div class="card" style="width: 18rem;">
                    <img src="${img2}" class="card-img-top" alt="img2">
                    <div class="card-body">
                        <p class="card-text">${warrior}</p>
                    </div>
                </div>
            </div>
            <div class="col">
                <div class="card" style="width: 18rem;">
                    <img src="${img3}" class="card-img-top" alt="img2">
                    <div class="card-body">
                        <p class="card-text">${volodymyr}</p>
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>
</html>
