package praktikum2;

public class MataKuliah {
    private String idMatKul;
    private String nama;
    private int sks;

    // Konstruktor tanpa parameter
    public MataKuliah() {
        this.idMatKul = "";
        this.nama = "";
        this.sks = 0;
    }

    // Konstruktor dengan parameter
    public MataKuliah(String idMatKul, String nama, int sks) {
        this.idMatKul = idMatKul;
        this.nama = nama;
        this.sks = sks;
    }

    // Selektor (Getter)
    public String getIdMatKul() { return idMatKul; }
    public String getNama() { return nama; }
    public int getSks() { return sks; }

    // Mutator (Setter)
    public void setIdMatKul(String idMatKul) { this.idMatKul = idMatKul; }
    public void setNama(String nama) { this.nama = nama; }
    public void setSks(int sks) { this.sks = sks; }
}
