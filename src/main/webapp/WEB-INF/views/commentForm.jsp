<%--
  Created by IntelliJ IDEA.
  User: huynq
  Date: 1/10/2024
  Time: 10:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>Form</title>
</head>
<body>
    <form:form action="/commentSubmission" method="post">
        <table>
            <tr>
                <td>Name</td>
                <td><input type="text" name="name"/></td>
            </tr>
            <tr>
                <td>Comment</td>
                <td><input type="text" name="comment"/></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="Submit"/></td>
            </tr>
        </table>
    </form:form>
</body>
</html>
