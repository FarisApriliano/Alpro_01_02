package ch07;

public class AlgoritmaBlockSort {
    public static void main(String[] args) {

        int [] Narray = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        int x = 0;

        for(int i = 0; i < Narray.length; i++){
            for(int j = 0; j < Narray.length; j++){
                if (Narray[i]<Narray[j]){
                    x = Narray[i];
                    Narray[i] = Narray[j];
                    Narray[j] = x;                    
                }
            }
        }
        System.out.print("Hasil Mengurutkan Array dengan Block Sort= ");
        for(int i = 0; i < 13; i++){
            System.out.print(Narray[i]+" ");

        }
        System.out.println("");
    }
    
}