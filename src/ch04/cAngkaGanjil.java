package ch04;

public class cAngkaGanjil {
    
    public static void main(String[] args) {

        int Narray[] = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55,8, 32, 3};

        System.out.println("");
        System.out.print("Angka Ganjil dalam Array= ");
        for (int i = 0; i < Narray.length; i++){
            if (Narray [i] % 2!= 0) {
                System.out.print( Narray [i] + " " );
            }
        }

        System.out.println("");


    }

}