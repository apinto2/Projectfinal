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





<form method="post" action="/saveproduct">
    <input type="hidden" name="productid" value="${selectedItem.getProductID()}">
    <br>Product: <br>
    <input type="text" name="product" value="${selectedItem.getProduct()}">
    <br>Quantity:<br>
    <input type="text" name="quantity" value="${selectedItem.getQuantity()}">
    <br>Cost:<br>
    <input type="text" name="cost" value="${selectedItem.getCost()}">
    <br><br><br>
    <input type="submit" value="Submit">
</form>


</body>
</html>
