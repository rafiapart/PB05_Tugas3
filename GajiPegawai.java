package PBOpraktikum;

import java.util.Scanner;

public class GajiPegawai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nomor Induk Karyawan : ");
        String nik = input.nextLine();
        System.out.print("Nama Karyawan        : ");
        String nama = input.nextLine();
        System.out.print("Alamat               : ");
        String alamat = input.nextLine();
        System.out.print("Jabatan              : ");
        String jabatan = input.nextLine();

        System.out.print("Gaji Pokok           : ");
        double gajiPokok = input.nextDouble();
        System.out.print("Tunjangan Jabatan    : ");
        double tunJabatan = input.nextDouble();
        System.out.print("Tunjangan Istri      : ");
        double tunIstri = input.nextDouble();
        System.out.print("Tunjangan Anak       : ");
        double tunAnak = input.nextDouble();

        double totalGaji = gajiPokok + tunJabatan + tunIstri + tunAnak;
        double pajak = 0.10 * totalGaji;
        double gajiBersih = totalGaji - pajak;

        System.out.println("\n===== HASIL PERHITUNGAN =====");
        System.out.println("Total Gaji             : " + totalGaji);
        System.out.println("Pajak Penghasilan (10%): " + pajak);
        System.out.println("Gaji Bersih            : " + gajiBersih);
    }
}
