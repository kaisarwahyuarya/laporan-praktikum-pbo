package Jobsheet8;

public class ProgramMain1841720206Kaisar {
    public static void main(String[] args) {
        Rektor1841720206Kaisar pakRektor = new Rektor1841720206Kaisar();
        
        //Mahasiswa1841720206Kaisar mahasiswaBiasa = new Mahasiswa1841720206Kaisar("Charlie");
        Sarjana1841720206Kaisar sarjanaCumlaude = new Sarjana1841720206Kaisar("Dini");
        PascaSarjana1841720206Kaisar masterCumlaude = new PascaSarjana1841720206Kaisar("Elok");
        
        //pakRektor.beriSertifikatCumlaudeKaisar(mahasiswaBiasa);
        //pakRektor.beriSertifikatCumlaudeKaisar(sarjanaCumlaude);
        //pakRektor.beriSertifikatCumlaudeKaisar(masterCumlaude);
        
        pakRektor.beriSertifikatMawapresKaisar(sarjanaCumlaude);
        pakRektor.beriSertifikatMawapresKaisar(masterCumlaude);
    }
}