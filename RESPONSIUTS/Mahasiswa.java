public class Mahasiswa extends CivitasAkademika {
    private static int totalMahasiswa = 0;
    private String nim;
    private int semesterSaatIni;
    private Fakultas fakultasTerdaftar;

    public Mahasiswa(String nama, String kontakEmail, String nim, int semester, Fakultas fakultas) {
        super(nama, kontakEmail);
        this.nim = nim;
        this.semesterSaatIni = semester;
        this.fakultasTerdaftar = fakultas;
        totalMahasiswa++;
    }

    public double hitungUKT() {
        return fakultasTerdaftar.getBiayaUKT() * Math.pow(0.95, semesterSaatIni - 1);
    }

    @Override
    public void tampilkanDetail() {
        System.out.println("Nama: " + nama);
        System.out.println("Email: " + kontakEmail);
        System.out.println("NIM: " + nim);
        System.out.println("Semester: " + semesterSaatIni);
        System.out.println("Fakultas: " + fakultasTerdaftar.getNamaFakultas());
        System.out.println("Total UKT: Rp" + hitungUKT());
    }
}