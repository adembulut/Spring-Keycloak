<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Spring Keycloak Integration</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
    <div class="row">
        <div class="col-md-12">
            <nav class="navbar navbar-default">
                <div class="container-fluid">
                    <div class="navbar-header">
                        <a class="navbar-brand" href="#">Spring Keycloak Integration</a>
                    </div>
                    <ul class="nav navbar-nav">
                        <li><a href="${pageContext.request.contextPath}/">Home</a></li>
                        <li><a href="${pageContext.request.contextPath}/admin/">Admin Page</a></li>
                        <li class="active"><a href="${pageContext.request.contextPath}/user/">User Page</a></li>
                    </ul>
                </div>
            </nav>

            ${pageInfo}
        </div>
    </div>
    <div class="row">
        <div class="col-md-12">
            <b><a href="${pageContext.request.contextPath}/">Back</a></b>
        </div>
    </div>
</div>
</body>
</html>
