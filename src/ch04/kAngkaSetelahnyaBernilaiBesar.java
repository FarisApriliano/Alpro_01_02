package ch04;

public class kAngkaSetelahnyaBernilaiBesar {

    public static void main(String[] args) {

        int Narray [] = {83, 12, 41, 38, 19, 26, 9,48, 20, 55, 8, 32, 3};

        System.out.print("Menampilkan Semua Data Yang Ada Di Dalam Array");

        for (int i = 0; i < Narray.length; i++) {
            System.out.print(Narray[i] + " ");
        }

        System.out.println();

        System.out.println("Angka Terbesar Setelah : ");

        for (int i = 0 ; i < Narray.length; i++) {
            for (int q=1;q<Narray.length-1;q++) {
                if (Narray[q] > Narray [i]) {

                    System.out.print(Narray[i] + " < " + " ; ");

                }
            }

            System.out.println();
        }

    }
    
}