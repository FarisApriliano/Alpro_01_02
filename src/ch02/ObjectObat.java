package ch02;

import java.util.Date;

public class ObjectObat {
    public static void main(String[] args) {
        Obat x1 = new Obat();
        x1.barcode = "123321123";
        x1.nama = "Sangobion";
        x1.tanggalkadaluarsa = new Date (2020-10-15);
        x1.harga = 15000;

        Obat x2 = new Obat();
        x2.barcode = "456654456";
        x2.nama = "Promaag";
        x2.tanggalkadaluarsa = new Date (2020-11-15);
        x2.harga = 6000;

        System.out.println(x1.nama + " (" + x1.barcode +")");

        System.out.println("Harga: Rp" + x1.harga);
        System.out.println("Exp: " + x1.tanggalkadaluarsa.toString());

        System.out.println("===================================");

        System.out.println(x2.nama + " (" + x2.barcode +")");

        System.out.println("Harga: Rp" + x2.harga);
        System.out.println("Exp: " + x2.tanggalkadaluarsa.toString());


    }


}