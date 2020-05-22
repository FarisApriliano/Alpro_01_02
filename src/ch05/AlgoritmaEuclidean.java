package ch05;

public class AlgoritmaEuclidean {
    public static int fpb(int i, int j) { 
        if (i == 0) 
            return j; 
        return fpb(j % i, i); 
    } 
    public static void main(String[] args) { 
        int i = 21;
        int j = 14, k; 
        k = fpb(i, j); 

        System.out.println("FPB dari ("+i+", "+j+")="+k); 
    
    }
}
