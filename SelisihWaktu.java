package PBOpraktikum;

import java.util.Scanner;

public class SelisihWaktu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jam pertama (jam menit detik): ");
        int jam1 = sc.nextInt();
        int menit1 = sc.nextInt();
        int detik1 = sc.nextInt();

        System.out.print("Masukkan jam kedua (jam menit detik): ");
        int jam2 = sc.nextInt();
        int menit2 = sc.nextInt();
        int detik2 = sc.nextInt();

        int totalDetik1 = jam1 * 3600 + menit1 * 60 + detik1;
        int totalDetik2 = jam2 * 3600 + menit2 * 60 + detik2;

        int selisih = Math.abs(totalDetik2 - totalDetik1);

        int jam = selisih / 3600;
        int sisa = selisih % 3600;
        int menit = sisa / 60;
        int detik = sisa % 60;

        System.out.println("\nSelisih waktu: " + jam + " jam " + menit + " menit " + detik + " detik");
    }
}
