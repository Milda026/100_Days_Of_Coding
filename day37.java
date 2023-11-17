package Coding;

import java.util.Scanner;

public class day37 {
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);
        int a, b, c;
        System.out.print("Masukkan angka pertama: ");
        a = m.nextInt();
        System.out.print("Masukkan angka kedua: ");
        b = m.nextInt();
        System.out.print("Masukkan angka ketiga: ");
        c = m.nextInt();

        int hasil = a + b + c;

        if (hasil % 2 == 1) {
            hasil +=1;
        } else {
            hasil += 2;
        }

        System.out.println("Hasil: " + hasil);
    }
}
