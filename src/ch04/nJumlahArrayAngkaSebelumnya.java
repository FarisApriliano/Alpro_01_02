package ch04;

public class nJumlahArrayAngkaSebelumnya {

    public static void main(final String[] args) {

    final int Narray [] = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

    System.out.print("Menampilkan Semua Data Yang Ada di Array : ");

    for ( int i=0; i < Narray.length; i++ ) {
        System.out.print(Narray[i] + " ");
    }

    System.out.println();
    System.out.println();

    int jumlahnya = 0;
    for ( int i = 0; i < Narray.length; i++) {
        for ( final int array:Narray ) {
            if ( Narray[i] < Narray.length ) {
                jumlahnya=Narray.length-Narray[i];
            }
        }

        System.err.println("Jumlah Angka Sebelum : " + Narray[i] + " = " + jumlahnya);
    
    }
    }
  }