<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Register an Employee</title>
</head>
<body>
<h3>Enter details</h3>
<h4>${message}</h4>
<form:form method="post" action="${pageContext.request.contextPath}/addEmployee" modelAttribute="employee">
    <table>
        <tr>
            <td><form:label path="name">Name</form:label></td>
            <td><form:input path="name"/></td>
        </tr>
        <tr>
            <td><form:label path="id">Id</form:label></td>
            <td><form:input path="id"/></td>
        </tr>
        <tr>
            <td><form:label path="contactNumber">Contact Number</form:label></td>
            <td><form:input path="contactNumber"/></td>
        </tr>
        <tr>
            <td><input type="submit" name="submit" value="Submit"/></td>
            <td><input type="submit" name="cancel" value="Cancel"/></td>
        </tr>
    </table>
</form:form>

</body>
</html>
