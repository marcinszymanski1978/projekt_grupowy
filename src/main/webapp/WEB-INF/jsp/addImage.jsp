<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dodaj zdjęcie do pracownika</title>
</head>
<body>

    <h3>File Upload:</h3>
    Select a file to upload: <br />
    <form:form action = "saveImage" method = "post" class="signUp">
        <form:input path="id" name = "id" size="50"/>
        <br/>
        <form:input path="file" type ="file" name = "file" size = "50" />
        <br />
        <form:button class="form-btn dx" type="submit" value="saveCar">Dodaj</form:button>
    </form:form>



</body>
</html>
