<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<style>
    <%@include file="/WEB-INF/css/showEmp.css" %>
</style>
<div id="personal">
    ${employees.lastName} ${employees.firstName}<br/>
    pracuje od: ${employees.startJobDate}<br/>
    adres: ${employees.address}, ${employees.city}<br/>
    wiek: ${employees.age} lat<br/>
    wynagrodzenie: ${employees.salary} zł<br/>
    email: ${employees.email}<br/>

</div>
<div class="singleList">
    <h1>Lista samochodów pracownika</h1>
    <div class="tbl-header">
        <table cellpadding="0" cellspacing="0" border="0">
            <thead>
            <tr>
                <th>Id</th>
                <th>Marka</th>
                <th>Model</th>
                <th>Data rej.</th>
                <th>Delete</th>
                <th>Edit</th>
                <th>Show</th>
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
                    <td>
                        <form:form method="post" action="deleteCar">
                            <input type="hidden" id="id" name="id" value="${car.id}"/>
                            <input type="submit" class="button1" name="Delete" value="delete"/>
                        </form:form>
                    </td>
                    <td>
                        <form:form method="post" action="editCar">
                            <input type="hidden" id="id" name="id" value="${car.id}"/>
                            <input type="submit" class="button1" name="Edit" value="edit"/>
                        </form:form>
                    </td>
                    <td>
                        <form:form method="post" action="showCar">
                            <input type="hidden" id="id" name="id" value="${car.id}"/>
                            <input type="submit" class="button1" name="Show" value="show"/>
                        </form:form>
                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>

    </div>
</div>
<div class="singleList">
    <h1>Lista telefonów pracownika</h1>
    <div class="tbl-header">
        <table cellpadding="0" cellspacing="0" border="0">
            <thead>
            <tr>
                <th>Id</th>
                <th>Marka</th>
                <th>Model</th>
            </tr>
            </thead>
        </table>
    </div>
    <div class="tbl-content">
        <table cellpadding="0" cellspacing="0" border="0">
            <tbody>
            <c:forEach var="phone" items="${phoneSet}">
                <tr>
                    <td>${phone.id}</td>
                    <td>${phone.name}</td>
                    <td>${phone.model}</td>
                    <td>
                        <form:form method="post" action="deletePhone">
                            <input type="hidden" id="id" name="id" value="${phone.id}"/>
                            <input type="submit" class="button1" name="Delete" value="delete"/>
                        </form:form>
                    </td>
                    <td>
                        <form:form method="post" action="editPhone">
                            <input type="hidden" id="id" name="id" value="${phone.id}"/>
                            <input type="submit" class="button1" name="Edit" value="edit"/>
                        </form:form>
                    </td>
                    <td>
                        <form:form method="post" action="showPhone">
                            <input type="hidden" id="id" name="id" value="${phone.id}"/>
                            <input type="submit" class="button1" name="Show" value="show"/>
                        </form:form>
                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</div>
<div class="singleList">
    <h1>Lista samochodów pracownika</h1>
    <div class="tbl-header">
        <table cellpadding="0" cellspacing="0" border="0">
            <thead>
            <tr>
                <th>Id</th>
                <th>Model</th>
                <th>cmyk</th>
                <th>Miasto</th>
            </tr>
            </thead>
        </table>
    </div>
    <div class="tbl-content">
        <table cellpadding="0" cellspacing="0" border="0">
            <tbody>
            <c:forEach var="printer" items="${printerSet}">
                <tr>
                    <td>${printer.id}</td>
                    <td>${printer.model}</td>
                    <td>${printer.cmyk}</td>
                    <td>${printer.localization}</td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
        <br/>
    </div>
</div>
<br/>
     <table>

        <td>
            <form:form method="post" action="test">
                <input type="submit" class="button" name="test" value="Employee List"/>
            </form:form>
            <br/>
            <form:form method="post" action="start">
                <input type="submit" class="button" name="start" value="Home Page"/>
            </form:form>
            <br/>
        </td>
     </table>
