package Kuis1;

public class Bayar1841720206Kaisar {

    public int jumlah;
    public int harga;
    public int total;
    public double diskon;
    protected double totaldiskon;

    public Bayar1841720206Kaisar() {
    }

    public Bayar1841720206Kaisar(int jumlah, int harga) {
        this.jumlah = jumlah;
        this.harga = harga;
    }

    public int getHargaKaisar() {
        return harga;
    }

    public void setHargaKaisar(int harga) {
        this.harga = harga;
    }

    public int getJumlahKaisar() {
        return jumlah;
    }

    public void setJumlahKaisar(int jumlah) {
        this.jumlah = jumlah;
    }

    public int totalhargaKaisar() {
        total = jumlah * harga;
        return total;
    }

    public double diskonKaisar() {
        if (total >= 1000000) {
            diskon = total * 0.2;
        }else{
            diskon = total;
        }
        return diskon;
    }

    public double totaldiskonKaisar() {
        totaldiskon = total - diskon;
        return totaldiskon;
    }

    public void infoKaisar() {
        if(total >= 1000000){
            System.out.println("\nKarena total harga pembelian melewati 1.000.000");
            System.out.println("Selamat anda mendapat diskon : " + diskon);
            System.out.println("Total Harga : " + totaldiskon);
        }else{
           System.out.println("Total Harga : "+total);
        }
    }
}
