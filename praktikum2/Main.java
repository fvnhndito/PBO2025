package praktikum2;

public class Main {
    public static void main(String[] args) {
        // Membuat objek MataKuliah
        MataKuliah mk1 = new MataKuliah("PBO", "Pemrograman Berorientasi Objek", 3);
        MataKuliah mk2 = new MataKuliah("MBD", "Manjemen Basis Data", 4);
        MataKuliah mk3 = new MataKuliah("ASA", "Analisis Strategi Algoritma", 4);
        
        // Membuat objek Dosen
        Dosen dosen1 = new Dosen("001", "Dr. Ambatukay", "Informatika");
        Dosen dosen2 = new Dosen("012", "Dr. Asidik", "ELektro");
        
        // Membuat objek Kendaraan
        Kendaraan kendaraan1 = new Kendaraan("B1234CD", "motor");
        Kendaraan kendaraan2 = new Kendaraan("B1324CD", "helikopter");
        
        // Membuat objek Mahasiswa
        Mahasiswa mhs1 = new Mahasiswa( "111", "Panjul Gedang","Informatika");
        Mahasiswa mhs2 = new Mahasiswa( "133", "Parjo Markon","Elektro");
        
       // Mahasiswa 
        mhs1.setDosenWali(dosen1);
        mhs1.setKendaraan(kendaraan2);
        mhs1.addMatKul(mk1);
        mhs1.addMatKul(mk2);
        mhs1.addMatKul(mk3);

       // Mahasiswa 
       mhs2.setDosenWali(dosen2);
       mhs2.setKendaraan(kendaraan1);
       mhs2.addMatKul(mk2);
       mhs2.addMatKul(mk3);
        
        // Print
        System.out.println("========== MAHASISWA 1 ==========");
        mhs1.printDetailMhs();
        System.out.println("Jumlah SKS: " + mhs1.getJumlahSKS());
        System.out.println("Jumlah Mata Kuliah: " + mhs1.getJumlahMatKul());

        System.out.println("========== MAHASISWA 2 ==========");
        mhs2.printDetailMhs();
        System.out.println("Jumlah SKS: " + mhs2.getJumlahSKS());
        System.out.println("Jumlah Mata Kuliah: " + mhs2.getJumlahMatKul());
        
    }
}