package Jobsheet12;

import java.util.ArrayList;

public class InputData1841720206Kaisar {

    ArrayList<Mahasiswa1841720206Kaisar> ListMahasiswa;

    public InputData1841720206Kaisar() {
        ListMahasiswa = new ArrayList();
    }

    public void isiDataKaisar(String Nim, String Nama, String Alamat) {
        Mahasiswa1841720206Kaisar mhs = new Mahasiswa1841720206Kaisar(Nim, Nama, Alamat);
        ListMahasiswa.add(mhs);
    }

    public ArrayList<Mahasiswa1841720206Kaisar> getDataKaisar() {
        return ListMahasiswa;
    }
}
