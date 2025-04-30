import java.util.ArrayList;

public class TestPolimorfisme {
    public static void main(String[] args) {
        Pegawai pegawai1 = new Programmer("Mira");
        Pegawai pegawai2 = new Manager("Joko");
        Pegawai pegawai3 = new Manager("Argo");

        ArrayList<Pegawai> emps = new ArrayList<>();
        emps.add(pegawai1);
        emps.add(pegawai2);
        emps.add(pegawai3);

        for (Pegawai emp : emps) {
            emp.tampilData();
        }
    }
}

// 1. Jelaskan manfaat polimorfisme pada kasus ini 
// Jawab: Polimorfisme bikin objek Programmer dan Manajer bisa dianggap sama-sama sebagai Pegawai, jadi:
// - Semua jenis pegawai bisa disimpan bareng di satu list (misalnya: ArrayList<Pegawai> emps), nggak perlu dipisah-pisah
// - Kodenya jadi lebih simpel, gampang diatur, dan bisa dikembangin lebih fleksibel karena nggak harus ngecek tipe objek satu-satu pakai instanceof

// 2. Apabila pada main program perlu menambahkan pegawai 4 dan pegawai 5! 
// Apa permasalahan yang muncul jika diterapkan tanpa polimorfisme (inclusion)?
// Jawab: 
// Kita nggak bisa nyimpen semua jenis pegawai dalam satu list atau array
// karena tiap jenis pegawai bakal dianggap tipe yang beda-beda.

