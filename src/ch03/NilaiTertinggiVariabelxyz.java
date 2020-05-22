package ch03;

public class NilaiTertinggiVariabelxyz {

    public static void main(String[] args) {

        int x = 6;
        int y = 12;
        int z = 24;

        System.out.println("Nilai X = " + x);
        System.out.println("Nilai y = " + y);
        System.out.println("Nilai z = " + z);

        if (  x > y && x > z  ) {

            System.out.println("Nilai Tertinggi Adalah = " + x);

        } else if ( y > x && y > z ) {
            
            System.out.println("Nilai Tertinggi Adalah = " + y);

        } else {

            System.out.println("Nilai Tertinggi Adalah = " + z);

        }
        
    }
    
}