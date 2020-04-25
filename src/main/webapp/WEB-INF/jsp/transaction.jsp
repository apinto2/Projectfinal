<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<head>
    <title>Retail Store</title>
    <style>
        table {
            width: 28.5%;
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

<h2 align="center">Transaction</h2>


<form>

    <div id="test" style="display:none">
<table>
    <tr>
        <th>Receipt </th>
        <th>Date</th>


    </tr>
    <c:forEach var = "listitem" items = "${transactionlist}">

        <tr>
            <td>${listitem.getreceipt()}</td>
            <td>${listitem.getdate()}</td>

        </tr>
    </c:forEach>





</table>
    </div>
</form>
<script>
    function loadFunction() {document.getElementById('table').style.display="grid";};
</script>

<table id="table" style="display:none">
    <tr>
        <th>Receipt </th>
        <th>Date</th>


    </tr>
    <c:forEach var = "listitem" items = "${transactionlist}">
        <tr>
            <td>${listitem.getreceipt()}</td>
            <td>${listitem.getdate()}</td>



        </tr>
    </c:forEach>


</table>


<br>
<form id="query">
<input type="text" placeholder="Look Up" name="lookup">

    <input type="button" value="Load Information" onclick="loadFunction()">

</form>

<form action="/">
    <input type="submit" value="Return">
</form>



</body>
</html>
