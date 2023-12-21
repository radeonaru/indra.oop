<!-- <!DOCTYPE html>
<html>
    <head>
        <title>Tambah Data Anggota</title>
        <link rel="stylesheet" href="style.css">
    </head>
    <body>
        <div class="container"></div>
        <h2>Tambah Data Anggota</h2>
        <form action="proses.php?aksi=tambah" method="post">
    <label for="nama">Nama:</label>
    <input type="text" name="nama" id="nama" required>
    <label for="jenis_kelamin">Jenis Kelamin:</label>
    <div class="radio-group">
        <input type="radio" name="jenis_kelamin"  value="L" id="laki" required><label for="laki">Laki-laki</label>
        <input type="radio" name="jenis_kelamin"  value="P" id="perempuan" required><label for="perempuan">Perempuan</label>
    </div>
    <label for="alamat">Alamat:</label>
 <input type="text" name="alamat" id="alamat" required>
    <label for="no_telp">No. Telp:</label>
 <input type="text" name="no_telp" id="no_telp" required>
 <button type="submit">Simpan Data</button>
 <a href="index.php" class="btn-kembali">Kembali</a>
</form>
    </body>
</html> -->
<!doctype html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Tambah Data Anggota</title>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
<div class="container mt-4">
  <h2>Tambah Data Anggota</h2>

  <form action="proses.php?aksi=tambah" method="post">
    <div class="form-group">
      <label for="nama">Nama:</label>
      <input type="text" class="form-control" name="nama" id="nama" required>
    </div>
    <div class="form-group">
      <label for="jenis_kelamin">Jenis Kelamin:</label>
      <div class="form-check">
        <input type="radio" class="form-check-input" name="jenis_kelamin" value="L" id="laki" required>
        <label class="form-check-label" for="laki">Laki-laki</label>
      </div>
      <div class="form-check">
        <input type="radio" class="form-check-input" name="jenis_kelamin" value="P" id="perempuan" required>
        <label class="form-check-label" for="perempuan">Perempuan</label>
      </div>
    </div>
    <div class="form-group">
      <label for="alamat">Alamat:</label>
      <input type="text" class="form-control" name="alamat" id="alamat" required>
    </div>
    <div class="form-group">
      <label for="no_telp">No. Telp:</label>
      <input type="text" class="form-control" name="no_telp" id="no_telp" required>
    </div>
    <button type="submit" class="btn btn-primary">Simpan Data</button>
  </form>
  <a class="btn btn-secondary mt-2" href="index.php">Kembali</a>
</div>

<script src="https://code.jquery.com/jquery-3.7.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.3/dist/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

</body>
</html>
