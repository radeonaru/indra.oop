package MuhammadBagusIndra.relasiclass.percobaan1;

public class Processor {
    private String merk;
    private double cache;

    Processor (String merk, double cache){
        this.cache = cache;
        this.merk = merk;
    }

    public Processor() {
    }

    public void setCache(double cache) {
        this.cache = cache;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public double getCache() {
        return cache;
    }
    
    public String getMerk() {
        return merk;
    }

    public void info(){
        System.out.printf("Merk Processor = %s\n", merk);
        System.out.printf("Cache Memory = %.2f\n", cache);
    }
}
