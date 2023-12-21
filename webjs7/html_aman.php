<?php
// $input = $_POST['input'];
// $input = htmlspecialchars($input, ENT_QUOTES, 'UTF-8');

// $email = $_POST['$email'];
// if (filter_var($email, FILTER_VALIDATE_EMAIL)) {

// } else {
    
// }
?>

<!doctype html>
<html lang="en">
<head>
  <title>Form Input PHP</title>
</head>
<body>
  <h2>Form Input PHP</h2>
  <?php
  $inputErr = "";
  $emailErr = "";
  $input = "";
  $email = "";

  if ($_SERVER["REQUEST_METHOD"] == "POST") {
   
    if (empty($_POST["input"])) {
        $inputErr = "Username Harus diisi!";
      } else {
        $input= $_POST['input'];
        if (is_numeric($input)) {
          $inputErr = "Input harus mengandung huruf!";
        } else {
          $input = htmlspecialchars($input, ENT_QUOTES, 'UTF-8');
          echo "Username yang tersimpan: ".$input;
        }
      }
    //   if (empty($_POST["email"])) {
    //     $emailErr = "Email harus diisi!";
    //   } else {
    //     $email = $_POST['email'];
    //     if (filter_var($email, FILTER_VALIDATE_EMAIL)) {
    //       echo "<br>Email yang tersimpan: ".$email."<br><br>";
    //     } else {
    //       $emailErr = "Email tidak valid!";
    //     }
    //   }
    
  }
  ?>
  <form method="post" action="<?php echo htmlspecialchars($_SERVER["PHP_SELF"]); ?>">
  
  <label for="input">username:</label>
    <input type="text" name="input" id="input" value="<?php echo $input; ?>">
    <span class="error"><?php echo $inputErr;?></span><br><br>

    <!-- <label for="email">Email:</label>
    <input type="text" name="email" id="email" value="<?php echo $email; ?>">
    <span class="error"><?php echo $emailErr;?></span><br><br> -->

    <input type="submit" name="submit" value="submit">
  </form>
</body>
</html>