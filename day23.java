package Coding;

import java.util.Scanner;

public class day23 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int batas_atas;
        int jumlahBilangan = 0;

        System.out.print("Masukkan batas atas : ");
        batas_atas = input.nextInt();

        for (int i = 1; i <= batas_atas; i++) {
            if (i % 3 == 0) {
                jumlahBilangan++;
            }
        }
        System.out.println("Jumlah angka yang habis dibagi 3 : " + jumlahBilangan);
    }
    
}
