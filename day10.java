package Coding;

import java.util.Scanner;
public class day10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bil1, bil2;
        
        System.out.print("Masukkan bilangan pertama: ");
        bil1 = input.nextInt();
        System.out.print("Masukkan bilangan kedua: ");
        bil2 = input.nextInt();
        
        int hasil = bil1 - bil2;
        System.out.println("Hasil penjumlahan: " + hasil);
    }
}
