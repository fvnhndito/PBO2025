public class Tendik extends Karyawan {
    private static int totalTendik = 0;
    private static final double GAJI_POKOK = 4000000;

    public Tendik(String nama, String kontakEmail, String nip, int masaKerja) {
        super(nama, kontakEmail, nip, masaKerja);
        totalTendik++;
    }

    @Override
    public double hitungGaji() {
        return GAJI_POKOK + (masaKerja * 0.01 * GAJI_POKOK);
    }

    @Override
    public void tampilkanDetail() {
        System.out.println("Nama: " + nama);
        System.out.println("Email: " + kontakEmail);
        System.out.println("NIP: " + nip);
        System.out.println("Gaji: Rp" + hitungGaji());
    }
}