<?php
$myArray = array();
if (empty($myArray)) {
    echo"Array tidak terdefinisi atau kosong.<br>";
} else {
    echo"Array terdefinisi atau tidak kosong.<br>";
}

if (empty($nonExistentVar)) {
    echo "Variabel tidak terdefinisi atau kosong.<br>";
} else {
    echo "Variabel terdefinisi dan tidak kosong.<br>";
}
?>