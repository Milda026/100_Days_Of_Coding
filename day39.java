package Coding;

import java.util.Scanner;

public class day39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        int batas_awal;
        int batas_akhir;
  
        System.out.print("Masukkan batas atas: ");
        batas_awal= scanner.nextInt();
        System.out.print("Masukkan batas akhir: ");
        batas_akhir= scanner.nextInt();
       
        for (int i = batas_awal; i <= batas_akhir; i++) {
            if (i % 2 == 0) {
                System.out.print(i+ " + ");
                total += i;
            }
        }
        for (int i = batas_akhir; i <= batas_awal; i++) {
            if (i % 2 == 0) {
                System.out.print(i+ " + ");
                total += i;
            }
        }
        System.out.println(" = " + total);
    
    }
    
}
