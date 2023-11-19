package Coding;

import java.util.Scanner;
public class day42 {
     public static void main(String[] args) {
        Scanner m = new Scanner(System.in);
        int angka;
        String a ;
        while (true) {
        System.out.print("Masukkan angka: ");
        angka = m.nextInt();
        
        if (angka % 2 == 0) {
            System.out.println(angka+" adalah bilangan genap" );
        }else {
            System.out.println(angka+ " adalah bilangan ganjil");   
        } 
        
        System.out.print("ingin lanjut :");
        a = m.next();
        if (a.equals("tidak")) {
            break; 
        }
        }
    }
    
}
