 /* Nama File : MTitik.java
 * Deskripsi : Berisi main dalam class titik
 * Pembuat : Favian Hanindito Prodjosudjadi / 24060123140203
 * Tanggal : Senin, 21 Februari 2025
 */



public class MTitik {
    public static void main(String[] args) {
        // Membuat objek titik T1 (0,0) menggunakan konstruktor default
        Titik T1 = new Titik();
        System.out.println("==========Membuat Objek Titik==========");
        T1.printTitik();
        System.out.println("Kuadran: " + T1.getKuadran());
        System.out.println("Jarak ke Pusat: " + T1.getJarakPusat());

        // Mengubah nilai absis dan ordinat T1
        T1.setAbsis(3);
        T1.setOrdinat(4);
        System.out.println("\n=== Setelah diubah ===");
        T1.printTitik();
        System.out.println("Kuadran: " + T1.getKuadran());
        System.out.println("Jarak ke Pusat: " + T1.getJarakPusat());

        // Membuat objek titik T2 (5,5)
        Titik T2 = new Titik(5, 5);
        System.out.println("\n=== Titik T2 ===");
        T2.printTitik();
        System.out.println("Jarak antara T1 dan T2: " + T1.getJarak(T2));

        // Menggeser T1 sejauh (2,2)
        T1.geser(2, 2);
        System.out.println("\n=== Setelah digeser ===");
        T1.printTitik();

        // Refleksi T1 terhadap sumbu X
        T1.refleksiX();
        System.out.println("\n=== Setelah refleksi X ===");
        T1.printTitik();

        // Refleksi T1 terhadap sumbu Y
        T1.refleksiY();
        System.out.println("\n=== Setelah refleksi Y ===");
        T1.printTitik();

        // Membuat titik hasil refleksi T1 terhadap sumbu X (objek baru)
        Titik T3 = T1.getRefleksiX();
        System.out.println("\n=== Titik T3 (Refleksi X dari T1) ===");
        T3.printTitik();

        // Membuat titik hasil refleksi T1 terhadap sumbu Y (objek baru)
        Titik T4 = T1.getRefleksiY();
        System.out.println("\n=== Titik T4 (Refleksi Y dari T1) ===");
        T4.printTitik();

        // Menampilkan total titik yang pernah dibuat
        System.out.println("\nTotal Titik: " + Titik.getCounterTitik());
    
    
    }
}
