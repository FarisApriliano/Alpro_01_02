package ch04;
public class aMenampilkanNilaiArray {

    public static void main(String[] args) {

        int Narray [] = {82,12,41,38,19,26,9,48,20,55,8,32,3};

        Array(Narray);

    }

    public static void Array(int[] w) {
        for (int i = 0; i < w.length; i++) {
            System.out.print(w[i] + "  ");
            
        }System.out.println(" ");
    }
     
}