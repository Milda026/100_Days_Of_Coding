package Coding;

import java.util.Scanner;

public class day28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int batas ;
        System.out.println("Masukkan batas " );
        batas = sc.nextInt();

        for (int i = 1; i <= batas; i += 2) {
            System.out.println(i);
        }
    }
    
}
