package ch02;

import java.util.Date;

public class Produk {
    String barcode;
    String nama;
    Date tanggalkadaluarsa;
    double harga;

    public String getBarcode() {
        return barcode;
    }

    public String getNama() {
        return nama;
    }

    public Date getTanggalkadaluarsa() {
        return tanggalkadaluarsa;
    }

    public double getHarga() {
        return harga;
    }


}