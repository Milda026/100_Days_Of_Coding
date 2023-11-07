package Coding;

import java.util.Scanner;

public class day29 {
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);
        int batas ;
        System.out.println("Masukkan batas " );
        batas = m.nextInt();

        for (int i = 2; i <= batas; i += 2) {
            System.out.println(i);
        }
    } 
}
