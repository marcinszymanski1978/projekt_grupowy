<style><%@include file="/WEB-INF/css/style.css"%></style>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dodaj telefon</title>
</head>
<body>
<div class="container">
    <form:form method="post" action="saveCar" class="signUp">
        <h3>Samochód</h3>
        <p>i wprowadź ID pracownika</p>
        <form:hidden path="id"/>
        <form:input path="name" class="w100" placeholder="Marka samochodu"  autocomplete='off' />
        <form:input path="model"  placeholder="Model"  />
        <form:input path="registrationDate" type="Date" placeholder="Data rejestracji" />
        <form:input path="employees.id" placeholder="Numer pracownika"  />

        <form:button class="form-btn dx" type="submit" value="saveCar">Dodaj</form:button>
    </form:form>

</div>
</body>
</html>
