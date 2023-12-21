package jobsheet10;

public class ElectricityBill implements Payable{
    private int kwh;
    private String category;

    public ElectricityBill(int kwh, String category){
        this.kwh = kwh;
        this.category = category;
    }

    public String getCategory() {
        return category;
    }
    public int getKwh() {
        return kwh;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public void setKwh(int kwh) {
        this.kwh = kwh;
    }

    @Override
    public int getPaymentAmount() {
        return kwh*getBasePrice();
    }

    public int getBasePrice(){
        int bPrice = 0;
        switch (category) {
            case "R-1" : bPrice = 100;break;
            case "R-2" : bPrice = 200;break;
        }
        return bPrice;
    }

    public String getBillInfo(){
        return "kWH = " + kwh + "\n" +
                "Category = " +category+"("+getBasePrice()+" per kWH)\n";
    }
}
