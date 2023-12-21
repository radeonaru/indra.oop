<?php
$host = "localhost";
$user = "root";
$password = "";
$database = "prakwebdb";

$koneksi = mysqli_connect($host, $user, $password,$database);

if (mysqli_connect_errno()) {
  echo "Failed to connect to MySQL: " . mysqli_connect_error();
  exit();
}

//Cek Koneksi
// if (!$conn) {
//   die("Koneksi gagal: " . mysqli_connect_error());
// }

//SQL untuk membuat tabel user
// $tabelUser = "CREATE TABLE user (
//     id INT AUTO_INCREMENT PRIMARY KEY,
//     username VARCHAR(50) NOT NULL,
//     password VARCHAR(50) NOT NULL
// )";

//Jalankan query untuk membuat table user
// if (mysqli_query($conn, $tabelUser)) {
//   echo "Table user berhasil dibuat";
// } else {
//   echo "Error membuat Table: " . mysqli_error($conn);
// }
?>