public class Lingkaran extends BangunDatar {
    private double jariJari;

    public Lingkaran() {
        this.jariJari = 7;
        setJmlSisi(0);
    }

    public Lingkaran(double jariJari, String warna, String border) {
        super(0, warna, border);
        this.jariJari = jariJari;
    }

    public double getJariJari() {
        return jariJari;
    }

    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }

    public double getLuas() {
        return Math.PI * jariJari * jariJari;
    }

    public double getKeliling() {
        return 2 * Math.PI * jariJari;
    }

    public double getDiameter() {
        return 2 * jariJari;
    }
    
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jari-Jari: " + jariJari);
        System.out.println("Luas: " + getLuas());
        System.out.println("Keliling: " + getKeliling());
        System.out.println("Diameter: " + getDiameter());
    }
}