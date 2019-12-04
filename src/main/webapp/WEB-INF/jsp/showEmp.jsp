<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<style><%@include file="/WEB-INF/css/showEmp.css"%></style>
<div id="personal">
    ${employees.lastName} ${employees.firstName}<br/>
    pracuje od: ${employees.startJobDate}<br/>
    adres: ${employees.address}, ${employees.city}
    email: ${employees.email}
</div>
<h1>Lista samochodów pracownika</h1>
<div class="tbl-header">
    <table cellpadding="0" cellspacing="0" border="0">
        <thead>
        <tr>
            <th>Id</th>
            <th>Marka</th>
            <th>Model</th>
            <th>Data rejestracji</th>
        </tr>
        </thead>
    </table>
</div>
<div class="tbl-content">
    <table cellpadding="0" cellspacing="0" border="0">
        <tbody>
        <c:forEach var="car" items="${carsSet}">
            <tr>
                <td>${car.id}</td>
                <td>${car.name}</td>
                <td>${car.model}</td>
                <td>${car.registrationDate}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
