<%@page language="java"%>
<html>
<head>
 <link rel="stylesheet" type="text/css" href="../style.css">
    <style>
            body {
                font-family: Arial, sans-serif;
                background-color: #f4f4f4;
                margin: 0;
                padding: 0;
            }
            .button-container {
                margin: 50px auto;
                width: 80%;
                text-align: center;
            }
            h1 {
                color: #333;
            }
            form {
                display: inline-block;
            }
            input[type="submit"] {
                padding: 10px 20px;
                margin: 10px;
                font-size: 16px;
                background-color: #8b4513; /* Brown color */
                color: #fff;
                border: none;
                cursor: pointer;
            }
            input[type="submit"]:hover {
                background-color: #654321; /* Darker brown on hover */
            }
        </style>

</head>
<body>
<div class="button-container">
    <h1>Student Course Application</h1>
    <form action="addStudent">
        <input type="submit" value="Add Student">
    </form>
    <form action="viewStudent">
        <input type="submit" value="View Student">
    </form>


</div>
</body>
</html>
