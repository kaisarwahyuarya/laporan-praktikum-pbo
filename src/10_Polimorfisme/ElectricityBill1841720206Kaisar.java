package Jobsheet10;

public class ElectricityBill1841720206Kaisar implements Payable1841720206Kaisar{
    private int mKwh;
    private String mCategory;

    public ElectricityBill1841720206Kaisar(int kwh, String category) {
        this.mKwh = kwh;
        this.mCategory = category;
    }

    public int getKwhKaisar() {
        return mKwh;
    }

    public void setKwhKaisar(int kwh) {
        this.mKwh = kwh;
    }

    public String getCategoryKaisar() {
        return mCategory;
    }

    public void setCategoryKaisar(String category) {
        this.mCategory = category;
    }

    @Override
    public int getPaymentAmountKaisar() {
        return mKwh*getBasePriceKaisar();
    }
    
    public int getBasePriceKaisar() {
        int bPrice = 0;
        switch(mCategory) {
            case "R-1" : bPrice = 100;break;
            case "R-2" : bPrice = 200;break;
        }
        return bPrice;
    }
    
    public String getBillInfoKaisar(){
        return "kWH = "+mKwh+"\n"+
                "Category = "+mCategory+"("+getBasePriceKaisar()+" per kWH) \n";
    }
    
}
