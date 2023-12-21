package uts;

public class Pengumuman {
    public void lihatPengumuman(CalonMahasiswa mahasiswa, boolean diterima) {
        if (diterima) {
            System.out.println(mahasiswa.getNama() + " diterima di " + mahasiswa.getPerguruanTinggi().getNama());
            System.out.println("--------------------------------------------------------\n");
        } else {
            System.out.println(mahasiswa.getNama() + " tidak diterima di " + mahasiswa.getPerguruanTinggi().getNama());
            System.out.println("--------------------------------------------------------\n");
        }
    }
}
