package ch04;

public class iSelisihAngkaArray {

    public static void main(String[] args) {

    int Narray [] = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
    System.out.print("Menampilkan Semua Data Di Array : ");

        int i;
        for ( i=0; i < Narray.length; i++ ) {
            System.out.print(Narray[i] + " ");
        }

        System.out.println();

        int selisihnya = Narray[0]-Narray[1];
        for ( i=0; i < Narray.length; i++ ) {
            if ( i==Narray.length-1 ) {

            } else {
                selisihnya = Narray[i]-Narray[i+1];


                System.out.println("Selisihnya " + Narray[i] + " Dengan " + Narray[i+1] + " : " + selisihnya);

            }
        }




    }
}