package ch04;

public class jSelisihAngkaGenap {

    public static void main(final String[] args) {

        final int Narray [] = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};


        System.out.print("Menampilkan Semua Data Yang Ada Di Aray");

        for (int i = 0; i < Narray.length; i++) {
            System.out.print(Narray[i] + " ");
        }

        System.out.println();

        int selisihnya = Narray [0] - Narray [1];
        for ( int i = 0; i < Narray.length; i++ ) {
            for (int q = i + 1 ; q <Narray.length; q++) {
                if ((Narray[i] % 2 == 0) && (Narray[q] % 2 == 0)) {
                    selisihnya = Narray[i] - Narray[q];
                    System.out.println(" Selisihnya " + Narray[i] + " Dengan " + Narray[q] + " : " + selisihnya);
                }
            }
            }

        }


    }
    
