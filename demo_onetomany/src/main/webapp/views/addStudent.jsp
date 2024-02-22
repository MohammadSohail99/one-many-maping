<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
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
</head>
<h2>Student Page</h2>

<form:form action="saveStudent" modelAttribute="studentModel">
    <table>
        <tr>
            <td>Student ID </td> <td> <form:input path="Id"/> </td>
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
            <td col span="2"> <input type="submit" value="Add Student"> </td>
        </tr>
    </table>
</form:form>
</html>