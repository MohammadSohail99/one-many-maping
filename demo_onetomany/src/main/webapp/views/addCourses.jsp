<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<h2>Student List Page</h2>
<style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 0;
        }

        h2 {
            text-align: center;
            margin-top: 20px;
        }

        table {
            margin: 0 auto;
            border-collapse: collapse;
            background-color: #fff;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }

        table td {
            padding: 10px;
            border: 1px solid #ddd;
        }

        table tr:nth-child(even) {
            background-color: #f9f9f9;
        }

        input[type="submit"] {
            padding: 5px 10px;
            background-color: #4CAF50;
            color: #fff;
            border: none;
            cursor: pointer;
        }

        input[type="submit"]:hover {
            background-color: #45a049;
        }

        form {
            margin-top: 20px;
        }

        .error {
            color: red;
        }
    </style>
<table border="1">
    <tr>
        <th>Student ID</th>
        <th>Student Name</th>
        <th>View Courses</th>
        <th>Add Courses</th>
        <th>Delete Courses</th>
        <th>Update Courses</th>
    </tr>

    <c:if test="${!empty studentList}">
        <c:forEach items="${studentList}" var="studentModel">
            <tr>
                <td><c:out value="${studentModel.getId()}"/></td>
                <td><c:out value="${studentModel.getName()}"/></td>
                <td>
                    <a href="ViewCourses?Id=${studentModel.getId()}">View Courses</a>
                </td>
                <td>
                    <a href="AddCourses?Id=${studentModel.getId()}">Add Courses</a>
                </td>
                <td>
                    <a href="DeleteStudent?Id=${studentModel.getId()}">Delete Student</a>
                </td>
                <td>
                     <a href="UpdateStudent?Id=${studentModel.getId()}">Update Student</a>
                </td>
            </tr>
        </c:forEach>
    </c:if>
</table>
<form style="text-align: center;" action="addStudent">
        <input type="submit" value="Add Student">
</form>
</html>
