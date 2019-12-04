<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<style><%@include file="/WEB-INF/css/empform.css"%></style>

<div class="container">
    <form:form method="post" action="save" class="signUp">
        <h3>Dodaj pracownika</h3>
        <p>do bazy danych</p>
        <form:hidden path="id"/>
        <form:input path="firstName" placeholder= "imię"/>
        <form:input path="lastName"  placeholder="nazwisko"  />
        <form:input path="address"  placeholder="adres"  />
        <form:input path="city"  placeholder="miasto"  />
        <form:input path="email"  placeholder="adres email" />
        <form:input path="salary" placeholder="wynagrodzenie" />
        <form:input path="age" placeholder="wiek" />
        <form:input path="startJobDate" placeholder="data zatrudnienia" type = "date"/>
        <form:input path="benefit" type="text" name="benefit" placeholder="Czy korzysta z benefitów" list="ben" />
        <datalist id="ben">
            <option value="1" label="tak"></option>
            <option value="0" label="nie"></option>
        </datalist>
        <form:button class="form-btn dx" type="submit" value="save">Dodaj</form:button>
    </form:form>

</div>