
package Coding;

import java.util.Scanner;

public class day44 {
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);
        int angkaTerbesar = 0;
        System.out.print("Masukkan nilai awal : ");
        int awal = m.nextInt();
        System.out.print("Masukkan nilai akhir : ");
        int akhir = m.nextInt();

        for (int i = awal; i <= akhir; i++) {
            if (i > angkaTerbesar) {
                angkaTerbesar = i;
                System.out.println(i);
                
            }
        }

        System.out.println("Bilangan terbesar adalah: " + angkaTerbesar);
    }
    
}
