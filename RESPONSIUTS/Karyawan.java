public abstract class Karyawan extends CivitasAkademika {
    protected String nip;
    protected int masaKerja;

    public Karyawan(String nama, String kontakEmail, String nip, int masaKerja) {
        super(nama, kontakEmail);
        this.nip = nip;
        this.masaKerja = masaKerja;
    }

    public abstract double hitungGaji();
}