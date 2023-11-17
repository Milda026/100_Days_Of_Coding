
package Coding;

import java.util.Scanner;

public class day38 {
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int gajiPokok, jamLembur, gajiLembur;
    System.out.print("Masukkan gaji pokok: ");
    gajiPokok = input.nextInt();
    System.out.print("Masukkan lama lembur (jam): ");
    jamLembur = input.nextInt();

    if (jamLembur > 10) {
        System.out.println("Lama lembur melebihi batas. Jam lembur maksimal adalah 10 jam.");
        System.out.println("Gaji bersih karyawan  : Rp. " + gajiPokok);
    } else {
        gajiLembur = jamLembur * 55000;

        int gajiBersih = gajiPokok + gajiLembur;

        double pajak = 0.1 * gajiBersih;

        gajiBersih -= pajak;

        System.out.println("Gaji bersih karyawan : Rp. " + gajiBersih);
    }
}

}
