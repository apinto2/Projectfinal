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



<table>
    <tr>

        <th>First Name</th>
        <th>Last Name</th>
        <th>Action</th>


    </tr>
    <c:forEach var = "listitem" items = "${employeelist}">
        <tr>
            <td>${listitem.getfirstname()}</td>
            <td>${listitem.getlastname()}</td>
            <td>
                <a href="/editEmployee/${listitem.getEmployeeID()}">EDIT</a>
                <a href="/deleteEmployee/${listitem.getEmployeeID()}"><img src="../../img/delete.jpg" alt="delete_image" ></a>
            </td>




        </tr>
    </c:forEach>
</table>
<form method="post" action="/saveemployee">
    <br>
    <input type="hidden" name="employeeid">
    First Name:<br>
    <input type="text" name="firstname">
    <br>
    Last Name:<br>
    <input type="text" name="lastname">
    <br>
    <br>
    <br>
    <input type="submit" value="Submit">
</form>
<br>
<form action="/">
    <input type="submit" value="Return">
</form>

</body>
</html>
