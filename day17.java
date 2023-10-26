package Coding;

public class day17 {
    public static void main(String[] args) {
        int a = 26;
        int b = 12;

        // Perbandingan
        boolean samaDengan = (a == b);
        boolean tidakSamaDengan = (a != b);
        boolean lebihBesarDari = (a > b);
        boolean lebihKecilDari = (a < b);
        boolean lebihBesarSamaDengan = (a >= b);
        boolean lebihKecilSamaDengan = (a <= b);
        System.out.println("a == b: " + samaDengan);
        System.out.println("a != b: " + tidakSamaDengan);
        System.out.println("a > b: " + lebihBesarDari);
        System.out.println("a < b: " + lebihKecilDari);
        System.out.println("a >= b: " + lebihBesarSamaDengan);
        System.out.println("a <= b: " + lebihKecilSamaDengan);
    }
    
}
