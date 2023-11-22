package Coding;

import java.util.Scanner;

public class day43 {
    public static void main(String[] args) {
    Scanner m = new Scanner(System.in);
    while (true) {
    System.out.print("Masukkan nilai awal : ");
    int awal = m.nextInt();
    System.out.print("Masukkan nilai akhir : ");
    int akhir = m.nextInt();

    for (int i = awal; i <= akhir; i++) {
        if (i % 3 != 0 ) {
           System.out.println(i+" adalah bilangan yang tidak habis dibagi 3"); 
        }
    }
    for (int i = awal; i <= akhir; i++) {
        if (i % 4 != 0 ) {
            System.out.println(i+" adalah bilangan yang tidak habis dibagi 4"); 
        }
    }
    for (int i = awal; i <= akhir; i++) {
        if (i % 5 != 0 ) {
            System.out.println(i+" adalah bilangan yang tidak habis dibagi 5"); 
        }
    }
            
    }
    }
    
}
