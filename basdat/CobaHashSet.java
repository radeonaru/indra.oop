import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class CobaHashSet{
public static void main(String[] args) {
    Set mSetCity = new HashSet<>();
    Kota kota1 = new Kota("Kediri", 1);
    Kota kota2 = new Kota("Blitar", 2);
    mSetCity.add("Malang");
    mSetCity.add("Banyuwangi");
    mSetCity.add("Yogyakarta");
    mSetCity.add("Batu");
    mSetCity.add(kota1.kota);
    mSetCity.add(kota2.kota);

    System.out.println(mSetCity);
    Iterator<String> mIterator = mSetCity.iterator();

    while (mIterator.hasNext()) {
        System.out.println(mIterator.next().toLowerCase());
    }

    Kota batu = new Kota("Batu", 5);
    Kota batu2 = batu;
    List<Kota> listCity = new ArrayList<>();
    listCity.add(batu);
    listCity.add(batu2);
    System.out.println(listCity);
}
}