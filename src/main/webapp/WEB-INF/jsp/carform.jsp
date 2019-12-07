<style><%@include file="/WEB-INF/css/style.css"%></style>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Dodaj samochód</title>
</head>
<body>
<div class="container">
    <form:form method="post" action="saveCar" class="signUp">
        <h3>Dodaj samochód</h3>
        <p>i wprowadź ID pracownika</p>
        <form:hidden path="id"/>
        <form:input path="name" placeholder="Marka samochodu"  autocomplete='off' />
        <form:input path="model"  placeholder="Model"  />
        <form:input path="registrationDate" type="Date" placeholder="Data rejestracji" />
        <form:input path="employees.id" type="text" name="employ" placeholder="Wybór pracownika" list="emp" />
        <datalist id="emp">
            <c:forEach var="emp" items="${list}">
            <option value="${emp.id}" label="${emp.firstName} ${emp.lastName}"></option>
            </c:forEach>
        </datalist>
        <form:button class="form-btn dx" type="submit" value="saveCar">Dodaj</form:button>
    </form:form>

</div>
</body>
</html>
