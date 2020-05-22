package ch04;

public class hJumlahAngkaArray {
    
    public static void main(String[] args) {


        int Narray [] = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        System.out.print("Menampilkan Semua Nilai Di Array : ");

        for (int i = 0; i < Narray.length; i ++) {
            System.out.print(Narray[i] + " ");
        }

        System.out.println("\n");
        System.out.print("Jumlah Angka Yang Ada Di Dalam Array : " + Narray.length);

        System.out.println("\n");

        int Jumlah = 0;
        for (int Angka : Narray) {
            Jumlah = Jumlah + Angka;
        }

        System.out.print("Penjumlahan Semua Angka Hasilnya : " + Jumlah);

        System.out.println();
    }

}