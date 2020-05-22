package ch02;

import java.util.Date;

public class Obat {
    String barcode;
    String nama;
    Date tanggalkadaluarsa;
    double harga;

    public String getNama() {
        return nama;
    }

    public String getBarcode() {
        return barcode;
    }

    public Date getTanggalkadaluarsa() {
        return tanggalkadaluarsa;
    }

    public double getHarga() {
        return harga;
    }

}