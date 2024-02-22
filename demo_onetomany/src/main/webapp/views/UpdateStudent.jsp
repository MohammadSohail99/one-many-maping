<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<h2>Update Student</h2>

<form:form action="saveUpdatedStudent" modelAttribute="studentModel">
    <table>
        <tr>
            <td>Student ID </td> <td> <form:input path="Id" readonly="true"/> </td>
            <td><form:errors path="Id"/></td>
        </tr>
        <tr>
            <td>Student Name </td> <td> <form:input path="name"/> </td>
            <td><form:errors path="name"/></td>
        </tr>
        <tr>
             <td>Student ClassName </td> <td> <form:input path="classname"/> </td>
             <td><form:errors path="classname"/></td>
        </tr>
        <tr>
             <td>Student Age </td> <td> <form:input path="age"/> </td>
             <td><form:errors path="age"/></td>
        </tr>
        <tr>
            <td col span="2"> <input type="submit" value="Update Student"> </td>
        </tr>
    </table>
</form:form>
</html>
