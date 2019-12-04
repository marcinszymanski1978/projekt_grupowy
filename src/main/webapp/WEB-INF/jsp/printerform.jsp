<style><%@include file="/WEB-INF/css/style.css"%></style>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Dodaj drukarkę</title>
</head>
<body>
<div class="container">
    <form:form method="post" action="savePrinter" class="signUp">
        <h3>Dodaj drukarkę</h3>
        <p>i wprowadź ID pracownika</p>
        <form:hidden path="id"/>
        <form:input path="model" placeholder="Model drukarki"  autocomplete='off' />
        <form:input path="cmyk"  type="text" name="cmyk" placeholder="czy CMYK?" list ="c" />
        <datalist id="c">
            <option value="true"></option>
            <option value="false"></option>
        </datalist>
        <form:input path="localization" placeholder="Miasto lokalizacji" />
        <form:input path="employees.id" type="text" name="employ" placeholder="Wybór pracownika" list="emp" />
        <datalist id="emp">
            <c:forEach var="emp" items="${list}">
                <option value="${emp.id}" label="${emp.firstName} ${emp.lastName}"></option>
            </c:forEach>
        </datalist>
        <form:button class="form-btn dx" type="submit" value="savePrinter">Dodaj</form:button>
    </form:form>

</div>
</body>
</html>
