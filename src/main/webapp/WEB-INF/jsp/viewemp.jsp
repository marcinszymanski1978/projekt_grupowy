<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<h1>View Employees List</h1>
<table border="2" width="70%" cellpadding="2">
    <tr>
        <th>Id</th>
        <th>First Name</th>
        <th>Last Name</th>
        <th>Salary</th>
        <th>Email</th>
        <th>Phones</th>
        <th>Cars</th>
        <th>Printers</th>
        <th>Action</th>

    </tr>
    <c:forEach var="emp" items="${list}">
        <tr>
            <td>${emp.id}</td>
            <td>${emp.firstName}</td>
            <td>${emp.lastName}</td>
            <td>${emp.salary}</td>
            <td>${emp.email}</td>
            <td></td>
            <td></td>
            <td></td>

<%--                            <td>${emp.phones}</td>--%>
<%--            <td>${emp.printers}</td>--%>
<%--            <td>${emp.cars}</td>--%>
            <td>
                <form:form method="post" action="delete">
                    <input type="hidden" id="id" name="id" value="${emp.id}"/>
                    <input type="submit" class="button" name="Delete" value="delete"/>
                </form:form>
                <form:form method="post" action="edit">
                    <input type="hidden" id="id" name="id" value="${emp.id}"/>
                    <input type="submit" class="button" name="Edit" value="edit"/>
                </form:form>
            </td>
        </tr>
    </c:forEach>


</table>
<br/>
    <td>
        <form:form method="post" action="test">
            <input type="submit" class="button" name="test" value="Refresh"/>
        </form:form>
        <br/>
        <form:form method="post" action="start">
            <input type="submit" class="button" name="start" value="Home Page"/>
        </form:form>
        <br/>
    </td>
