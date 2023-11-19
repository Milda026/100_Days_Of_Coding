package Coding;

import java.util.Scanner;

public class day41 {
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);
        int angka;
        while (true) {
        System.out.print("Masukkan angka: ");
        angka = m.nextInt();
        
        if (angka % 2 == 0) {
            System.out.println(angka+" adalah bilangan genap" );
        }else {
            System.out.println(angka+ " adalah bilangan ganjil");   
        } 
        }
    }
}
