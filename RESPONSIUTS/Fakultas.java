public class Fakultas {
    private String namaFakultas;
    private double biayaUKT;
    private double gajiDasar;

    public Fakultas(String namaFakultas, double biayaUKT, double gajiDasar) {
        this.namaFakultas = namaFakultas;
        this.biayaUKT = biayaUKT;
        this.gajiDasar = gajiDasar;
    }

    public String getNamaFakultas() {
        return namaFakultas;
    }

    public double getBiayaUKT() {   
        return biayaUKT;
    }

    public double getGajiDasar() {
        return gajiDasar;
    }
}