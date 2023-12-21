public class TestMahasiswa {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.nim = 101;
        mhs1.nama = "Lestari";
        mhs1.alamat = "Jl. Vinolia No 1A";
        mhs1.kelas = "1A";
        mhs1.tampilBiodata();
        System.out.println();
        Mahasiswa mhs2 = new Mahasiswa();
        mhs2.nim = 102;
        mhs2.nama = "Jesslyn";
        mhs2.alamat = "Jl.Cempaka No 4B";
        mhs2.kelas = "1F";
        mhs2.tampilBiodata();
        System.out.println();
        Mahasiswa mhs3 = new Mahasiswa();
        mhs3.nim = 103;
        mhs3.nama = "Viola";
        mhs3.alamat = "Jl.Anggrelk NO 10A";
        mhs3.kelas = "1H";
        mhs3.tampilBiodata();
    }
}
