<?php
if ($_SERVER ["REQUEST_METHOD"] == "POST") {
    $selectedBuah = $_POST ['buah'];

    if (isset($_POST['warna'])) {
        $selectedWarna = $_POST ['warna'];
    } else {
        $selectedWarna = [];
    }

    $selectedJenisKelamin = $_POST ['jenis-kelamin'];

    echo"Anda memilih buah: " . $selectedBuah . "<br>";

    if (!empty($selectedWarna)){
        echo "Warna favorit anda: ". implode(", ", $selectedWarna) ."<br>";
    } else {
        echo"Anda tidak memilih warna favorit.<br>";
    }

    echo"Jenis kelamin Anda: " . $selectedJenisKelamin;
}
?>