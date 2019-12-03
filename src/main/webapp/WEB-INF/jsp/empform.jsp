<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<style><%@include file="/WEB-INF/css/style.css"%></style>

<div class="container">
    <form:form method="post" action="save" class="signUp">
        <h3>Dodaj pracownika</h3>
        <p>do bazy danych</p>
        <form:hidden path="id"/>
        <form:input path="firstName" class="w100" placeholder="Wprowadź imię"  autocomplete='off' />
        <form:input path="lastName"  placeholder="Wprowadź nazwisko"  />
        <form:input path="salary" placeholder="wynagrodzenie"  />

        <form:button class="form-btn dx" type="submit" value="save">Dodaj</form:button>
    </form:form>

</div>