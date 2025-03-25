public class Main {
    public static void main(String[] args) {
        System.out.println("=== Persegi ===");
        Persegi persegi = new Persegi(4, "Merah", "Hitam");
        persegi.printInfo();

        System.out.println("\n=== Lingkaran ===");
        Lingkaran lingkaran = new Lingkaran(10, "Biru", "Putih");
        lingkaran.printInfo();
    }
}
