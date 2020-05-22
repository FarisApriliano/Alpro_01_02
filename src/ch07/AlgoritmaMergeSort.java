package ch07;

public class AlgoritmaMergeSort {
    public static void mergesort(int Narray[], int x, int y) {

        int rendah= x;
        int tinggi= y;
            if(x >= y) {
            return;
        }
        int tengah = (rendah+tinggi) /2;
            mergesort(Narray, rendah, tengah);
            mergesort(Narray, tengah+1, tinggi);
        int belakang = tengah;
        int depan = tengah+1;
                while((x <= belakang)&&(depan<=tinggi)) {
                    if(Narray[rendah]<Narray[depan]) {
                    rendah++;
            }
            else {
                int tmp = Narray[depan];
                for(int i = depan-1; i >= rendah; i--) {
                    Narray[i+1]=Narray[i];
                }
                Narray[rendah]=tmp;
                rendah++;
                belakang++;
                depan++;
            }
        }
    }

    public static void main(String[] args) {
        int [] Narray = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        mergesort(Narray, 0, Narray.length-1);

        System.out.print("Hasil Mengurutkan Array dengan Merge Sort= ");
        for(int j = 0; j < Narray.length; j++){
            System.out.print(Narray[j]+" ");
        }
        System.out.println("");
    }
}