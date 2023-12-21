<?php
header('Content-Type: application/json');

//mengirimkan token keamanan
if (empty($_SESSION['csrf_token'])) {
  try {
    $_SESSION['csrf_token'] = bin2hex(random_bytes(32));
  } catch (Exception $e) {
  }
}

$headers = apache_request_headers();
if (isset($headers['Csrf-Token'])) {
  if ($headers['Csrf-Token'] !== $_SESSION['csrf_token']) {
    exit(json_encode(['error' => 'Wrong CSRF token.']));
  }

} else {
  exit(json_encode(['error' => 'No Csrf token.']));
}


?>
