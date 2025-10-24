//Perbedaan Class Scanner Dan Class Buffereader

//Scanner : Digunakan untuk membaca input bertipe data langsung seperti int, double, String, dll.
    //Digunakan untuk : Program sederhana, input dari pengguna di console.

//Buffereader : Digunakan untuk membaca teks mentah (string) dari input (biasanya satu baris penuh).
    //Digunakan untuk : Program besar, terutama yang butuh kecepatan tinggi (misal baca file besar).



package PBOpraktikum;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class PerbandinganInput {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("=== Input dengan Scanner ===");
        System.out.print("Masukkan nama : ");
        String nama1 = sc.nextLine();
        System.out.print("Masukkan umur : ");
        int umur1 = sc.nextInt();

        System.out.println("\n=== Input dengan BufferedReader ===");
        System.out.print("Masukkan nama : ");
        String nama2 = br.readLine();
        System.out.print("Masukkan umur : ");
        int umur2 = Integer.parseInt(br.readLine());

        System.out.println("\n=== HASIL PERBANDINGAN ===");
        System.out.println("Scanner -> Nama: " + nama1 + ", Umur: " + umur1);
        System.out.println("BufferedReader -> Nama: " + nama2 + ", Umur: " + umur2);
    }
}

