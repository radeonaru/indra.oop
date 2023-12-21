<!DOCTYPE html>
<html lang="en">
<head>
    <title>Login</title>
</head>
<body>
    <form action="login.php" method="post">
        <input type="text" name="username" placeholder="username" required>
        <br>
        <input type="password" name="password" placeholder="password" required>
        <br>
        <input type="submit" name="submit">
    </form>
</body>
</html>
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
if (isset($_POST["submit"])) {
    $username = $_POST["username"];
    $password = md5($_POST["password"]);


    $sql = "SELECT * FROM users WHERE username = '".$username."'";
    $result = $conn->query($sql);
    var_dump ($result);

    if ($result->num_rows > 0) {
        echo "Anda berhasil login";
        while ($row = $result->fetch_assoc()) {
            var_dump($row);
            if ($row["password"] == $password) {
                echo "Anda berhasil login";
                $sql = "update users set last_login = now() where username = '".$username."'";
                $conn->query($sql);
            } else {
                echo "Login gagal";
            }
        }
    } else {
        echo "Login gagal";
    }

    $conn->close();
    }
?>