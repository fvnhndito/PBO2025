package praktikum2;

public class Mahasiswa {
    private String nim;
    private String nama;
    private String prodi;
    private MataKuliah[] listMatKul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;
    private int jumlahMatKul;

    // Konstruktor tanpa parameter
    public Mahasiswa() {
        this.nim = "";
        this.nama = "";
        this.prodi = "";
        this.listMatKul = new MataKuliah[50];
        this.jumlahMatKul = 0;
        this.dosenWali = new Dosen();
        this.kendaraan = new Kendaraan();
    }

    // Konstruktor dengan parameter
    public Mahasiswa(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.listMatKul = new MataKuliah[50];
        this.jumlahMatKul = 0;
        this.dosenWali = new Dosen();
        this.kendaraan = new Kendaraan();
    }

    // Selektor dan Mutator
    public String getNim() { return nim; }
    public String getNama() { return nama; }
    public String getProdi() { return prodi; }
    public void setNim(String nim) { this.nim = nim; }
    public void setNama(String nama) { this.nama = nama; }
    public void setProdi(String prodi) { this.prodi = prodi; }

    public void setDosenWali(Dosen dosenWali) {
        this.dosenWali = dosenWali;
    }

    public void setKendaraan(Kendaraan kendaraan) {
        this.kendaraan = kendaraan;
    }

    // Menambahkan mata kuliah
    public void addMatKul(MataKuliah mk) {
        if (jumlahMatKul < 50) {
            listMatKul[jumlahMatKul++] = mk;
        }
    }

    // Mendapatkan jumlah SKS
    public int getJumlahSKS() {
        int totalSKS = 0;
        for (int i = 0; i < jumlahMatKul; i++) {
            totalSKS += listMatKul[i].getSks();
        }
        return totalSKS;
    }

    // Mendapatkan jumlah mata kuliah yang diambil
    public int getJumlahMatKul() {
        return jumlahMatKul;
    }

    // Menampilkan data mahasiswa
    public void printMhs() {
        System.out.println("NIM: " + nim + ", Nama: " + nama + ", Prodi: " + prodi);
    }

    // Menampilkan detail mahasiswa
    public void printDetailMhs() {
        printMhs();
        System.out.println("Dosen Wali: " + dosenWali.getNama());
        System.out.println("Kendaraan: " + kendaraan.getNoPlat() + " - " + kendaraan.getJenis());
        System.out.println("Mata Kuliah:");
        for (int i = 0; i < jumlahMatKul; i++) {
            System.out.println(" - " + listMatKul[i].getNama() + " (" + listMatKul[i].getSks() + " SKS)");
        }
    }
}
