<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<head>
    <title>Retail Store</title>
    <style>


        h2{
            color: black;
            font-size: 50px;
            font-family: cursive;


        }




        .retail-menu a {
            background-color: #eee;
            color: black;
            display: block;
            padding: 13px;
            text-decoration: none;

        }

        .retail-menu a:hover {
            background-color: #ccc;
        }

        .retail-menu a.active {
            background-color:lightseagreen;
            color: white;
        }




    </style>

</head>
<body style="background:sandybrown">

<h2 align="center">Entering Retail Store</h2>

<div class="retail-menu" align="center">
    <a href="#" class="active">Home</a>
    <a href="product">Products</a>
    <a href="customer">Customers</a>
    <a href="employee">Employee</a>
    <a href="transaction">Transaction</a>
</div>


</body>
</html>
