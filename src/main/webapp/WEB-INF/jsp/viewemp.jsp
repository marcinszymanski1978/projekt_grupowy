<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<style><%@include file="/WEB-INF/css/viewemp.css"%></style>


<h1>Lista pracowników</h1>
<div class="tbl-header">
    <table cellpadding="0" cellspacing="0" border="0">
        <thead>
        <tr>
            <th>Id</th>
            <th>Nazwisko</th>
            <th>Imię</th>
            <th>Wynagrodzenie</th>
            <th>Action</th>
        </tr>
        </thead>
    </table>
</div>
<div class="tbl-content">
    <table cellpadding="0" cellspacing="0" border="0">
        <tbody>
        <c:forEach var="emp" items="${list}">
            <tr>
                <td>${emp.id}</td>
                <td>${emp.lastName}</td>
                <td>${emp.firstName}</td>
                <td>${emp.salary}</td>
                <td>
                    <form:form method="post" action="delete">
                        <input type="hidden" id="id" name="id" value="${emp.id}"/>
                        <input type="submit" class="button1" name="Delete" value="delete"/>
                    </form:form>
                    <form:form method="post" action="edit">
                        <input type="hidden" id="id" name="id" value="${emp.id}"/>
                        <input type="submit" class="button1" name="Edit" value="edit"/>
                    </form:form>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>


</table>