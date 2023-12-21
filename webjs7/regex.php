<?php
$pattern = '/[a-z]/';
$text = 'This is a sample text.';
if (preg_match( $pattern, $text ) ) {
    echo "Huruf kecil ditemukan!<br>";
} else {
    echo "Tidak ada huruf kecil!";
}


$pattern = '/[0-9]+/';
$text = 'There are 123 apples.';
if (preg_match( $pattern, $text, $matches)) {
    echo "Cocokan: " . $matches[0] . "<br>";
} else {
    echo "Tidak ada yang cocok!";
}

$pattern = '/apple/';
$replacement = 'banana';
$text = 'I Like apple pie.';
$new_text = preg_replace( $pattern, $replacement, $text );
echo $new_text . "<br>";

$pattern = '/go*d/';
$text = 'god is good.';
if (preg_match( $pattern, $text, $matches ) ) {
    echo "Cocokkan: ". $matches[0] . "<br>";
} else {
    echo "Tidak ada yang cocok!";
}

$pattern = '/go?d/';
$text = 'god is good.';
if (preg_match( $pattern, $text, $matches ) ) {
    echo "Cocokkan: ". $matches[0] . "<br>";
} else {
    echo "Tidak ada yang cocok!";
}

// $pattern = '/go{1,5}d/';
// $text = 'god is good.';
// if (preg_match( $pattern, $text, $matches ) ) {
//     echo "Cocokkan: ". $matches[0] . "<br>";
// } else {
//     echo "Tidak ada yang cocok!";
// }

?>