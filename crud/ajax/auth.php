<?php
//Membuat Token keamanan ajax request (Csrf Token)
session_start();
if (empty($_SESSION['csrf_token'])) {
  try {
    $_SESSION['csrf_token'] = bin2hex(random_bytes(32));
  } catch (Exception $e) {
  }
}
?>
