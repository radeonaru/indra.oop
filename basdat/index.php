<?php
$servername = "localhost";
$username = "root";
$password = "";
$dbname = "BikeStore";

// Create connection
$conn = new mysqli($servername, $username, $password, $dbname);
// Check connection
if ($conn->connect_error) {
  die("Connection failed: " . $conn->connect_error);
}

$sql = "select * from v_product";
$result = $conn->query($sql);

if ($result->num_rows > 0) {
    echo"<table border= '1'> <tr> <td> Nomor </td> <td> Kategori </td>
    <td> Brand </td> <td> Nama Produk </td> <td> Harga </td> </tr>";
     $nomor = 0;
  // output data of each row
  while($row = $result->fetch_assoc()) {
    $nomor ++;
    echo"<tr> <td>" . $nomor. "</td> <td>" .$row['product_id']. "</td> <td>"  . $row["store_id"]. "</td>
    <td>" . $row["product_name"]."</td> <td>" . $row["list_price"]. "</td> </tr>";
  }
  echo "</table>";
// var_dump ($result->fetch_assoc());
} else {
  echo "0 results";
}
$conn->close();
?>