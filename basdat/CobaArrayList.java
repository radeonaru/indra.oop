import java.util.ArrayList;
import java.util.List;

public class CobaArrayList {
    public static void main(String[] args) {
        List mListCountry = new ArrayList<>();
        mListCountry.add("Indonesia");
        mListCountry.add("Malaysia");
        mListCountry.add("Germany");
        System.out.println(mListCountry);
        System.out.printf("List index 0 = %s\n", mListCountry.get(0));
        System.out.printf("List index 2 = %s\n", mListCountry.get(2));
        
    }
}
