<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<style><%@include file="/WEB-INF/css/style.css"%></style>

		<h1>Add New Employee</h1>
       <form:form method="post" action="save">
      	<table >
            <form:hidden path="id" />
         <tr>  
          <td>First Name : </td>
          <td><form:input path="firstName" /></td>
         </tr>  
         <tr>
          <td>Last Name :</td>
          <td><form:input path="lastName" /></td>
         </tr>
         <tr>
          <td>Salary :</td>
          <td><form:input path="salary" /></td>
         </tr>

         <tr>
          <td>Email :</td>
          <td><form:input path="email" /></td>
         </tr>
         
         <tr>  
          <td> </td>  
          <td><input type="submit" value="Save" /></td>  
         </tr>  
        </table>  
       </form:form>
<br/>
<td>
    <form:form method="post" action="empform">
        <input type="submit" class="button" name="test" value="Refresh"/>
    </form:form>
    <br/>
    <form:form method="post" action="start">
        <input type="submit" class="button" name="start" value="Home Page"/>
    </form:form>
    <br/>
</td>
