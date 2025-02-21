 /* Nama File : Titik.java
 * Deskripsi : Berisi atribut dan method dari class titik
 * Pembuat : Favian Hanindito Prodjosudjadi / 24060123140203
 * Tanggal : Senin, 21 Februari 2025
 */

public class Titik {
    /* States/Atribut */
    private double absis;
    private double ordinat;
    private static int counterTitik = 0;
    
    /* Behavior/Method */
    // Konstruktor
    public Titik() {
        this(0, 0);
    }

    // Konstruktor dengan parameter (absis, ordinat)
    public Titik(double absis, double ordinat) {
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }

    // Getter & Setter
    public double getAbsis() {
        return absis;
    }

    public void setAbsis(double absis) {
        this.absis = absis;
    }

    public double getOrdinat() {
        return ordinat;
    }

    public void setOrdinat(double ordinat) {
        this.ordinat = ordinat;
    }

    // Method untuk menggeser titik
    public void geser(double x, double y) {
        this.absis += x;
        this.ordinat += y;
    }

    // Method untuk mencetak koordinat titik
    public void printTitik() {
        System.out.println("Titik (" + absis + ", " + ordinat + ")");
    }

    // Method untuk mendapatkan kuadran
    public int getKuadran() {
        if (absis > 0 && ordinat > 0) return 2;
        else if (absis < 0 && ordinat > 0) return 2;
        else if (absis < 0 && ordinat < 0) return 3;
        else if (absis > 0 && ordinat < 0) return 4;
        else return 0; // Berada di sumbu atau pusat
    }

    // Method untuk menghitung jarak ke pusat (0,0)
    public double getJarakPusat() {
        return Math.sqrt(absis * absis + ordinat * ordinat);
    }

    // Method untuk menghitung jarak ke titik lain
    public double getJarak(Titik t) {
        double dx = t.getAbsis() - this.absis;
        double dy = t.getOrdinat() - this.ordinat;
        return Math.sqrt(dx * dx + dy * dy);
    }

    // Method untuk refleksi terhadap sumbu X (mengubah objek langsung)
    public void refleksiX() {
        this.ordinat = -this.ordinat;
    }

    // Method untuk refleksi terhadap sumbu Y (mengubah objek langsung)
    public void refleksiY() {
        this.absis = -this.absis;
    }

    // Method untuk mendapatkan titik hasil refleksi terhadap sumbu X (membuat objek baru)
    public Titik getRefleksiX() {
        return new Titik(this.absis, -this.ordinat);
    }

    // Method untuk mendapatkan titik hasil refleksi terhadap sumbu Y (membuat objek baru)
    public Titik getRefleksiY() {
        return new Titik(-this.absis, this.ordinat);
    }

    // Method static untuk mendapatkan counterTitik
    public static int getCounterTitik() {
        return counterTitik;
    }
}
