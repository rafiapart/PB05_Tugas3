package PBOpraktikum;

import java.util.Scanner;

public class PercetakanNovel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah novel yang akan dicetak: ");
        int jumlahNovel = sc.nextInt();

        System.out.print("Masukkan jumlah lembar per novel: ");
        int lembarPerNovel = sc.nextInt();

        int totalLembar = jumlahNovel * lembarPerNovel;
        int totalDetik = totalLembar;

        int hari = totalDetik / 86400;
        int sisaHari = totalDetik % 86400;

        int jam = sisaHari / 3600;
        int sisaJam = sisaHari % 3600;

        int menit = sisaJam / 60;
        int detik = sisaJam % 60;

        System.out.println("\nWaktu yang dibutuhkan untuk mencetak:");
        System.out.println(hari + " hari " + jam + " jam " + menit + " menit " + detik + " detik");
    }
}

