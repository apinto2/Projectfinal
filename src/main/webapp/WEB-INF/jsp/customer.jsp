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

<h2 align="center">Customers</h2>



<table>
    <tr>

        <th>First Name</th>
        <th>Last Name</th>
        <th>Action</th>


    </tr>
    <c:forEach var = "listitem" items = "${customerlist}">
        <tr>
            <td>${listitem.getFirstName()}</td>
            <td>${listitem.getLastName()}</td>
            <td>
                <a href="/editCustomer/${listitem.getCustomerID()}">EDIT</a>
                <a href="/deleteCustomer/${listitem.getCustomerID()}"><img src="../../img/delete.jpg" alt="delete_image" ></a>
            </td>


        </tr>
    </c:forEach>
</table>
<form method="post" action="/savecustomer">
    <br>
    <input type="hidden" name="customerid">
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
