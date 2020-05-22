package ch07;

public class AlgoritmaCocktailShakerSort {
    public static void cocktailsort(int[]Narray) {

        boolean a;
        do {
            a = false;
            for(int i = 0; i <= Narray.length-2; i++){
                if(Narray[i]>Narray[i+1]){
                    int x = Narray[i];
                    Narray[i] = Narray[i+1];
                    Narray[i+1] = x;
                    a = true;
                }
            }
        if(!a) {
        break;
        }

        } while(a);
    }

    public static void main(String[] args) {

        int [] Narray = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        cocktailsort(Narray);
        
        System.out.print("Hasil Mengurutkan Array dengan Cocktail Shaker Sort= ");
        for(int i = 0; i < Narray.length; i++) {
            System.out.print(Narray[i]+" ");
        }
        System.out.println("");
    }
}