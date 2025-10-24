package PBOpraktikum;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Pembelanjaan {
    public static void main(String[] args) throws IOException {
        DataInputStream in = new DataInputStream(System.in);
        DataOutputStream out = new DataOutputStream(System.out);

        out.writeBytes("Masukkan Nama             : ");
        out.flush();
        String nama = in.readLine();

        out.writeBytes("Masukkan Total Belanja    : ");
        out.flush();
        double total = Double.parseDouble(in.readLine());

        out.writeBytes("Masukkan Diskon (%)       : ");
        out.flush();
        double diskon = Double.parseDouble(in.readLine());

        double potongan = total * (diskon / 100);
        double bayar = total - potongan;

        out.writeBytes("Total Bayar               : " + bayar + "\n");
        out.flush();

        out.writeBytes("Masukkan Uang Dibayarkan  : ");
        out.flush();
        double uang = Double.parseDouble(in.readLine());

        double kembalian = uang - bayar;

        System.out.println("\n::: STRUK PEMBELANJAAN :::");
        System.out.println("Nama            : " + nama);
        System.out.println("Total Belanja   : " + total);
        System.out.println("Diskon          : " + diskon + "%");
        System.out.println("Total Bayar     : " + bayar);
        System.out.println("Kembalian       : " + kembalian);
    }
}

