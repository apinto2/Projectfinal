<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<head>
    <title>Retail Store</title>
    <style>
        table {
            width: 100%;
            border: 3px solid black;
            font-family: Times New Roman, serif;

        }

        h2{
            color: black;
            font-size: 50px;
            font-family: cursive;

        }
        th{
            background-color: black;
        }
        td{
            background-color: white;
            font-size: large;
        }

        td, th {
            color:lightseagreen;
            border: 2px solid black;
            padding: 7px;
            text-align: left;

        }




    </style>

</head>
<body style="background:sandybrown">

<h2 align="center">Employees</h2>





<form method="post" action="/saveemployee">
    <input type="hidden" name="employeeid" value="${selectedItem.getEmployeeID()}">
    <br>First Name: <br>
    <input type="text" name="firstname" value="${selectedItem.getfirstname()}">
    <br>Last name:<br>
    <input type="text" name="lastname" value="${selectedItem.getlastname()}">
    <br><br><br>
    <input type="submit" value="Submit">
</form>


</body>
</html>
