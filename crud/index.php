<!-- <!DOCTYPE html>
<html>
    <head>
        <title>Data Anggota</title>
        <link rel="stylesheet" href="style.css">
    </head>
    <body>
        <div class="container">
            <h2>Data Anggota</h2>
            <a href="create.php" class="btn-tambah">Tambah Anggota</a>
        //    <?php
            // include ('koneksi.php');
            // $query = "SELECT * FROM anggota order by id desc";
            // $result = mysqli_query($koneksi, $query);

            // if(mysqli_num_rows($result) > 0){
            // $no=1;
            // echo "<table>";
            // echo "<table>";
            // echo "<tr><th>No</th><th>Nama</th?<th>Jenis Kelamin</th>
            //      <th>Alamat</th><th>No. Telp</th><th>Aksi</th></tr>";    
            //      while($row = mysqli_fetch_array($result)){
            //         $kelamin = ($row["jenis_kelamin"] === 'L') ? 'Laki-Laki' : 'Perempuan';
            //         echo "<tr>
            //         <td>" . $no++ . "</td><td>" . $row["nama"] . "</td>
            //         <td>" . $kelamin . "</td><td>" . $row["alamat"] . "</td>
            //         <td>" . $row["no_telp"] . "</td>
            //         <td><a href='edit.php?id=" . $row["id"] . "'>Edit</a> |
            //         <a href ='#' onclick='KonfirmasiHapus(" . $row["id"] . ",\"" . $row["nama"] . "\")'>Hapus</a></td>
            //         <tr> ";
            //      }
            //      echo "</table>";
            // }else{
            //     echo "tidak ada data";
            // }
            // mysqli_close($koneksi);
            // ?>
        </div>
        <script>
            function KonfirmasiHapus(id, nama){
                var konfirmasi = confirm("Apakah anda yakin ingin menghapus  data dengan nama " + nama + "?");
                if(konfirmasi){
                    window.location.href = "proses.php?aksi=hapus&id=" + id;;
                }
            }
        </script>
    </body>
</html> -->

<!doctype html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <title>Data Anggota</title>
</head>
<body>
<div class="container mt-4">
  <h2>Data Anggota</h2>
  <a class="btn btn-success mt-2" href="create.php">Tambah Data</a>
  <br><br>
  <?php
  include('koneksi.php');
  $query = "SELECT * FROM anggota ORDER BY id DESC";
  $result = mysqli_query($koneksi, $query);
  ?>
  <table class="table">
    <thead class="thead-light">
    <tr>
      <th>No</th>
      <th>Nama</th>
      <th>Jenis Kelamin</th>
      <th>Alamat</th>
      <th>No. Telp</th>
      <th>Aksi</th>
    </tr>
    </thead>
    <tbody>
    <?php
    $no = 1;
    while ($row = mysqli_fetch_assoc($result)) {
      $kelamin = ($row["jenis_kelamin"] == 'L') ? 'laki-laki' : 'Perempuan';
      ?>
      <tr>
        <td><?= $no++ ?></td>
        <td><?= $row["nama"] ?></td>
        <td><?= $kelamin ?></td>
        <td><?= $row["alamat"] ?></td>
        <td><?= $row["no_telp"] ?></td>
        <td>
          <a class="btn btn-primary" href="edit.php?id=<?= $row["id"] ?>">Edit</a>
          <a class='btn btn-danger' href='#' data-toggle='modal' data-target='#hapusModal<?= $row["id"] ?>'>Hapus</a>
        </td>
      </tr>
      <div class='modal fade' id='hapusModal<?= $row["id"] ?>' tabindex='-1' role='dialog'
           aria-labelledby='exampleModalLabel' aria-hidden='true'>
        <div class='modal-dialog' role='document'>
          <div class='modal-content'>
            <div class='modal-header'>
              <h5 class='modal-title' id='exampleModalLabel'>Konfirmasi Hapus</h5>
              <button type='button' class='close' data-dismiss='modal' aria-label='Close'>
                <span aria-hidden='true'>&times;</span>
              </button>
            </div>
            <div class='modal-body'>
              <?= "Apakah Anda yakin ingin menghapus data dengan nama " . $row["nama"] . "?" ?>
            </div>
            <div class='modal-footer'>
              <a class='btn btn-danger' href='proses.php?aksi=hapus&id=<?= $row["id"] ?>'>Hapus</a>
              <button type='button' class='btn btn-secondary' data-dismiss='modal'>Batal</button>
            </div>
          </div>
        </div>
      </div>
      <?php
    }
    ?>
    </tbody>
  </table>
</div>
<script src="https://code.jquery.com/jquery-3.7.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.3/dist/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
