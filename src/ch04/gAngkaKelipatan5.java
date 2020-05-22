package ch04;

public class gAngkaKelipatan5 {

    public static void main(String[] args) {

        int Narray [] = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        System.out.println("Menampilkan Semua Nilai Di Array : ");

        for (int i = 0; i < Narray.length; i ++) {
            System.out.print(Narray [i] + " ");
        }

        System.out.println("\n");

        System.out.print("Angka Kelipatan 5 dalam Array : ");
        for (int i=0; i < Narray.length; i ++){
            if (Narray[i]%5==0) {
                System.out.print(Narray[i]+ " ");
            }
        }

        System.out.println("");
        
    }
    
}