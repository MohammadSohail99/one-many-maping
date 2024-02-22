<%@ taglib  uri="http://www.springframework.org/tags/form"  prefix="form"%>
<html>
<h2>Add Courses Page</h2>
<br><hr>
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


<form:form action="saveCourse" modelAttribute="coursesModel">
    <table>
        <tr>
            <td>Course ID </td> <td> <form:input path="cid"/> </td>
            <td><form:errors path="cid"/></td>
        </tr>
        <tr>
            <td>Course Name </td> <td> <form:input path="cname"/></td>
            <td><form:errors path="cname"/></td>
        </tr>
        <tr>
            <td>Course Instructor </td> <td> <form:input path="instructor"/></td>
            <td><form:errors path="instructor"/></td>
        </tr>
        <tr>
            <td col span="2"> <input type="submit" value="Add Course"> </td>
        </tr>
    </table>
</form:form>
</html>