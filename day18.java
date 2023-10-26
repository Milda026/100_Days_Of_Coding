package Coding;

import java.util.Scanner;
public class day18 {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int angka = scanner.nextInt();

        if (angka > 0) {
            System.out.println("Angka ini adalah positif.");
        } else {
            System.out.println("Angka ini adalah negatif atau nol.");
        }
    }
    
}
