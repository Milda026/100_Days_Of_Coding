package Coding;

import java.util.Scanner;


public class day35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, genap = 0, ganjil = 0;
        System.out.print("Masukkan n: ");
        n = scanner.nextInt();
        
        for (int i = 2; i <= n; i+=2) {
            genap += i;
        }
        for (int i = 1; i <= n; i+=2) {
            ganjil += i;
        }
        System.out.println("genap :" +genap);
        System.out.println("ganil :" +ganjil);
        
    }
}
