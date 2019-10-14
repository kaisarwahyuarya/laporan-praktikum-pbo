package Jobsheet7;

public class Karyawan1841720206Kaisar {

    private String mNama;
    private String mNip;
    private String mGolongan;
    private double mGaji;

    public void setNamaKaisar(String nama) {
        this.mNama = nama;
    }

    public void setNipKaisar(String nip) {
        this.mNip = nip;
    }

    public void setGolonganKaisar(String golongan) {
        this.mGolongan = golongan;

        switch (golongan.charAt(0)) {
            case '1':
                this.mGaji = 5000000;
                break;
            case '2':
                this.mGaji = 3000000;
                break;
            case '3':
                this.mGaji = 2000000;
                break;
            case '4':
                this.mGaji = 1000000;
                break;
            case '5':
                this.mGaji = 750000;
                break;
        }
    }

    public void setGajiKaisar(double gaji) {
        this.mGaji = gaji;
    }

    public String getNamaKaisar() {
        return mNama;
    }

    public String getNipKaisar() {
        return mNip;
    }

    public String getGolonganKaisar() {
        return mGolongan;
    }

    public double getGajiKaisar() {
        return mGaji;
    }
}
