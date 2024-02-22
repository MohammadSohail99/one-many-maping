<%@taglib uri="http://java.sun.com/jsp/jstl/core"   prefix="c"%>
<h2>Courses Page for particular student </h2>
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
        <th>Course Id</th>
        <th>Course Name</th>
        <th>Course Instructor</th>
    </tr>

    <c:if test="${!empty CoursesList}">
        <c:forEach items="${CoursesList}" var="coursesModel">
            <tr>
                <td> <c:out value="${coursesModel.getCid()}"/></td>
                <td><c:out value="${coursesModel.getCname()}"/></td>
                <td><c:out value="${coursesModel.getInstructor()}"/></td>
                <td><a href="DeleteCourse?Cid=${coursesModel.getCid()}">Delete Course</a></td>
                <td><a href="UpdateCourse?Cid=${coursesModel.getCid()}">Update Course</a></td>
            </tr>


        </c:forEach>
    </c:if>
    <c:if test="${empty CoursesList}">
    <h2> no records</h2>
    </c:if>
</table>
<form style="text-align: center;" action="addStudent">
        <input type="submit" value="Add Student">
</form>