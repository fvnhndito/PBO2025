package posttest9b;

public class Main {
    public static void main(String[] args) {
        Anabul[] anabuls = {
            new Kucing("Kiki"),
            new Anjing("Bobo"),
            new Burung("Cici")
        };

        for (Anabul a : anabuls) {
            a.gerak();
            a.bersuara();
            System.out.println(); // pemisah antar anabul
        }
    }
}
