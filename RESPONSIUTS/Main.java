public class Main {
    public static void main(String[] args) {
        Fakultas ilmukomputer = new Fakultas("Ilmukomputer", 6000000, 7500000);
        Fakultas teknik = new Fakultas("Teknik", 5000000, 6500000);

        Mahasiswa mhs1 = new Mahasiswa("sunjingwo", "sungjingwo@gmail.com", "210001", 3, ilmukomputer);
        Mahasiswa mhs2 = new Mahasiswa("chaemin", "chaeminyu@gmail.com", "210002", 5, teknik);

        Dosen dosen1 = new Dosen("Dr. APW", "APW@gmail.com", "D001", 10, ilmukomputer);
        Tendik tendik1 = new Tendik("BETA", "BETA@gmail.com", "T001", 7);

        System.out.println("===== nfo Mahasiswa =====");
        mhs1.tampilkanDetail();
        System.out.println();
        mhs2.tampilkanDetail();

        System.out.println("\n===== Info Dosen =====");
        dosen1.tampilkanDetail();

        System.out.println("\n===== Info Tendik =====");
        tendik1.tampilkanDetail();
    }
}
