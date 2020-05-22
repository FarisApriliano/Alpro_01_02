package ch02;

import java.util.Date;

public class ObjectProduk {
    public static void main(String[] args) {
        Produk x1 = new Produk();
        x1.barcode = "123456789";
        x1.nama = "Oreo";
        x1.tanggalkadaluarsa = new Date (2021-2-7);
        x1.harga = 5000;

        Produk x2 = new Produk();
        x2.barcode = "987654321";
        x2.nama = "Chocolatos";
        x2.tanggalkadaluarsa = new Date (2021-2-20);
        x2.harga = 3500;

        System.out.println(x1.nama + " (" + x1.barcode + ")");
        System.out.println("Harga: Rp" + x1.harga);
        System.out.println("Exp: " + x1.tanggalkadaluarsa.toString());

        System.out.println("==============================");

        System.out.println(x2.nama + " (" + x2.barcode + ")");
        System.out.println("Harga: Rp" + x2.harga);
        System.out.println("Exp: " + x2.tanggalkadaluarsa.toString());


    }


}