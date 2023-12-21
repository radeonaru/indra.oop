import java.util.ArrayList;

public class InputData {
    ArrayList<Mahasiswa> ListMahasiswa;

    public InputData (){
        ListMahasiswa = new ArrayList<>();
    }

    public void isiData (String nim, String nama, String alamat){
        Mahasiswa mhs = new Mahasiswa(nim, nama, alamat);
        ListMahasiswa.add(mhs);
    }

    public ArrayList<Mahasiswa> getData(){
        return ListMahasiswa;
    }
}
