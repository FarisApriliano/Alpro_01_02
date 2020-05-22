package ch09;

public class AlgoritmaSOA {

    public static int variabel (int x) {

        if(x>2)
            System.out.print (2+" ");
        else if(x>3)
            System.out.println (3+" ");
        boolean aku [] = new boolean [x];
        for(int i = 0; i < x; i++)
            aku[i]= false;
        for(int j = 1; j < x; j++) {
            for(int k = 1; k * k < x; k++) {
            int d = ( 4 * j * j ) + ( k * k );
            if(d <= x && (d % 12 == 1||d  % 12 == 5))
                aku[d] ^= true;
            }
        }
        for(int l = 5; l*l<x; l++){
            if(aku[l]){
                for(int i = l*l; i < x; i += l*l)
                    aku[l]=false;
            }
        }
        for (int prima = 5; prima < x; prima++)
            if(aku[prima])
                System.out.print(prima+" ");
        return 0;
    }
    public static void main(String[] args) {
        int x = 1000;
        variabel(x);

        System.out.println("");
    }    
}