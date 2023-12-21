<?php
$umur;
if (isset($umur) && $umur >= 18){
    echo"Anda sudah dewasa<br>";
} else {
    echo "Anda belum dewasa atau variabel 'umur' tidak ditemukan.<br>";
}

$data = array("nama" => "Indra", "usia" => 20);
if (isset($data["nama"])){
    echo "Nama: " . $data["nama"];
} else{
    echo"Variabel 'nama' tidak ditemukan dalam array.";
}

?>