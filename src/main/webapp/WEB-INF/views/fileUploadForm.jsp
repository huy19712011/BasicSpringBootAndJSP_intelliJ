<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>File Upload Example</title>
</head>

<body>

<h3>Enter The File to Upload (Single file)</h3>

<form:form method="POST" action="${pageContext.request.contextPath}/uploadFile" enctype="multipart/form-data">

    <table>
        <tr>
            <td>Select a file to upload</td>
            <td><input type="file" name="file"/></td>
        </tr>
        <tr>
            <td><input type="submit" value="Submit"/></td>
        </tr>
    </table>

</form:form>

<br/>

<h3>Enter The Files to Upload (Multiple files)</h3>

<form:form method="POST" action="${pageContext.request.contextPath}/uploadMultiFile" enctype="multipart/form-data">

    <table>
        <tr>
            <td>Select a file to upload</td>
            <td><input type="file" name="files"/></td>
        </tr>
        <tr>
            <td>Select a file to upload</td>
            <td><input type="file" name="files"/></td>
        </tr>
        <tr>
            <td>Select a file to upload</td>
            <td><input type="file" name="files"/></td>
        </tr>
        <tr>
            <td><input type="submit" value="Submit"/></td>
        </tr>
    </table>

</form:form>

<br/>

<h3>Fill the Form and Select a File (<code>@RequestParam</code>)</h3>

<form:form method="POST" action="${pageContext.request.contextPath}/uploadFileWithAddtionalData" enctype="multipart/form-data">

    <table>
        <tr>
            <td>Name</td>
            <td><input type="text" name="name"/></td>
        </tr>
        <tr>
            <td>Email</td>
            <td><input type="text" name="email"/></td>
        </tr>
        <tr>
            <td>Select a file to upload</td>
            <td><input type="file" name="file"/></td>
        </tr>
        <tr>
            <td><input type="submit" value="Submit"/></td>
        </tr>
    </table>

</form:form>

<br/>

<h3>Fill the Form and Select a File (<code>@ModelAttribute</code>)</h3>

<form:form method="POST" action="${pageContext.request.contextPath}/uploadFileModelAttribute" enctype="multipart/form-data">

    <table>
        <tr>
            <td>Name</td>
            <td><input type="text" name="name"/></td>
        </tr>
        <tr>
            <td>Email</td>
            <td><input type="text" name="email"/></td>
        </tr>
        <tr>
            <td>Select a file to upload</td>
            <td><input type="file" name="file"/></td>
        </tr>
        <tr>
            <td><input type="submit" value="Submit"/></td>
        </tr>
    </table>

</form:form>

</body>

</html>