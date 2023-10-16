package Coding;

import java.util.Scanner;
public class day5 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan panjang: ");
        int panjang = scanner.nextInt();

        System.out.print("Masukkan lebar: ");
        int lebar = scanner.nextInt();

        int luas = panjang * lebar;

        System.out.println("Luas persegi panjang adalah " + luas);
    }
    
}
