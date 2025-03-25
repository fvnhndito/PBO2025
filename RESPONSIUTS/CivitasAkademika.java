public abstract class CivitasAkademika {
    protected String nama;
    protected String kontakEmail;

    public CivitasAkademika(String nama, String kontakEmail) {
        this.nama = nama;
        this.kontakEmail = kontakEmail;
    }

    public abstract void tampilkanDetail();
}
