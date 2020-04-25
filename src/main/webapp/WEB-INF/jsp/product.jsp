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

<h2 align="center">Products</h2>



<table>
    <tr>

        <th>Product</th>
        <th>Quantity</th>
        <th>Cost</th>
        <th>Action</th>


    </tr>
    <c:forEach var = "listitem" items = "${productlist}">
        <tr>
            <td>${listitem.getProduct()}</td>
            <td>${listitem.getQuantity()}</td>
            <td>${listitem.getCost()}</td>
            <td>
                <a href="/editProduct/${listitem.getProductID()}">EDIT</a>
                <a href="/deleteProduct/${listitem.getProductID()}"><img src="../../img/delete.jpg" alt="delete_image" ></a>
            </td>




        </tr>
    </c:forEach>
</table>
<form method="post" action="/saveproduct">
    <br>
    <input type="hidden" name="productid">
    Product:<br>
    <input type="text" name="product">
    <br>
    Quantity:<br>
    <input type="text" name="quantity">
    <br>
    Cost:<br>
    <input type="text" name="cost">
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
