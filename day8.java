package Coding;
import java.util.Scanner;
public class day8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan nilai Anda: ");
        int nilai = scanner.nextInt();
        if (nilai >= 90) {
            System.out.println("A");
            System.out.println("Pertahankan");
        } else if (nilai >= 80) {
            System.out.println("Belajar lagi");
        } else if (nilai >= 70) {
            System.out.println("C");
            System.out.println("Belajar lebih giat lagi");
        } else {
            System.out.println("D");
            System.out.println("Silahkan mengulang");
        }       
    }
    
}
