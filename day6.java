
package Coding;

import java.util.Scanner;
public class day6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan nilai Anda: ");
        int nilai = scanner.nextInt();
        if (nilai >= 90) {
            System.out.println("A");
        } else if (nilai >= 80) {
            System.out.println("B");
        } else if (nilai >= 70) {
            System.out.println("C");
        } else {
            System.out.println("D");
        }       
    }
}
