<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Spring MVC form handling</title>
</head>
<body>
<h2>Submitted Employee Information</h2>
<table>
    <tr>
        <td>Name:</td>
        <td>${employee.name}</td>
<%--        <td>${name}</td>--%>
    </tr>
    <tr>
        <td>Id:</td>
        <td>${employee.id}</td>
<%--        <td>${id}</td>--%>
    </tr>
    <tr>
        <td>Contact Number:</td>
        <td>${employee.contactNumber}</td>
<%--        <td>${contactNumber}</td>--%>
    </tr>
</table>
</body>
</html>
