public class Main {
    public static void main(String[] args) {
        Person p;
        p = new Student("Sally");
        p.status(1);
    }
}

//Hasil output “Now online: Sally” muncul karena waktu fungsi status() dijalankan, 
//kata this di situ untuk menunjuk ke objek dari kelas Student, 
//bukan cuma ke kelas Person. 
//Makanya, yang dipanggil itu versi isAsleep() milik Student, bukan yang ada di Person.