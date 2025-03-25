public class Dosen extends Karyawan {
    private static int totalDosen = 0;
    private Fakultas fakultas;

    public Dosen(String nama, String kontakEmail, String nip, int masaKerja, Fakultas fakultas) {
        super(nama, kontakEmail, nip, masaKerja);
        this.fakultas = fakultas;
        totalDosen++;
    }

    @Override
    public double hitungGaji() {
        return fakultas.getGajiDasar() + (masaKerja * 0.01 * fakultas.getGajiDasar());
    }

    @Override
    public void tampilkanDetail() {
        System.out.println("Nama: " + nama);
        System.out.println("Email: " + kontakEmail);
        System.out.println("NIP: " + nip);
        System.out.println("Fakultas: " + fakultas.getNamaFakultas());
        System.out.println("Gaji: Rp" + hitungGaji());
    }
}