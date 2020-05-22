package ch04;

public class lHasilJumlahGenap {

    public static void main(String[] args) {

        int Narray [] = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        System.out.print("Menampilkan Semua Data Yang Ada di Array : ");

        for (int i = 0; i < Narray.length; i ++) {

            System.out.print(Narray[i] + " ");

        }

        System.out.println();

        int jumlah = Narray [0] + Narray [1];
        for (int i=0; i < Narray.length; i++) {
            if (Narray[i] % 2 == 0 ) {
                jumlah = Narray[i] + Narray [i + 1];
                if (jumlah % 2 == 0) {
                    System.out.println(Narray[i] + " + " + Narray[i+1] + " = " +jumlah);
                    System.out.println(jumlah + " Angka Genap");
                }
            }
        }

    }
    
}