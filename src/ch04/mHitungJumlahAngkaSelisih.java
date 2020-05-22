package ch04;

public class mHitungJumlahAngkaSelisih {

    public static void main(String[] args) {

        int Narray [] = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        int jumlahnya = 0;
        System.out.print("Menampilkan Semua Data Di Array : ");
        int i;

        for  ( i=0; i < Narray.length; i ++ ) {
            System.out.print(Narray[i] + "  ");
        }

        System.out.println();

        int selisihnya = Narray[0]-Narray[1];
        for ( i=0; i < Narray.length; i ++ ) {
            if ( i == Narray.length-1 ) {

            } else {
                selisihnya = Narray[i]-Narray[i+1];

                System.out.println("selisihnya" +  Narray[i] + " Dengan " + Narray[i+1] + " = " + selisihnya);
                jumlahnya=jumlahnya+selisihnya;


            }

        }
        System.out.println();

        System.out.println("Jumlah Angka Selisih : " + jumlahnya);

    }
    
}