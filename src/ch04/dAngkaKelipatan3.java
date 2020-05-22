package ch04;

public class dAngkaKelipatan3 {

    public static void main(String[] args) {

        int Narray [] = { 82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3 };

        System.out.println(" ");
        System.out.print("Angka Kelipatan 3 dalam Array : ");
        for (int i = 0; i < Narray.length; i++) {
            if (Narray [i] % 3 ==0) {
                System.out.print( Narray [i] + "  ");
            }
        }

        System.out.println(" ");

    }
    
}