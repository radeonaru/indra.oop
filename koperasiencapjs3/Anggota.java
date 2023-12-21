package koperasiencapjs3;

public class Anggota {
    public String noKTP;
    public String nama;
    public int limitPinjaman;
    public int jumlahPinjaman = 0;

    Anggota(String noKTP, String nama, int limitPinjaman){
        this.noKTP = noKTP;
        this.nama = nama;
        this.limitPinjaman = limitPinjaman;
    }

    public String getNama(){
        return nama;
    }
    public int getLimitPinjaman(){
        return limitPinjaman;
    }

    public int pinjam(int jumlah){
        if (jumlah > (limitPinjaman -= jumlahPinjaman)) {
            System.out.println("Maaf, jumlah pinjaman melebihi limit");
        }
        else {
            jumlahPinjaman += jumlah;
        }
        return jumlahPinjaman;
    }

    public int getJumlahPinjaman(){
        return jumlahPinjaman;
    }

    public int angsur(int bayar){
        if (bayar > jumlahPinjaman*0.1) {    
        if (jumlahPinjaman == 0) {
            System.out.println("Anda tidak memiliki pinjaman");
        } else {
            jumlahPinjaman -= bayar;
        }
    }
    else {
        System.out.println("Maaf, jumlah angsuran yang anda bayarkan kurang dari 10% dari jumlah pinjaman anda!");
    }
        return jumlahPinjaman;
    }

    public void tampilMenu() {
        System.out.println("Masukkan Menu :\n1.Pinjam Uang\n2.Angsur Pinjaman\n3.Keluar");
    }

}
