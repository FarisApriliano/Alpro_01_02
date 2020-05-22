package ch09;

public class AlgoritmaSOE {

    public static void variabel (int x) {

        boolean aku[] = new boolean[x+1];
        for(int i = 0; i < x; i++)
            aku[i] =  true;
        for(int j = 2; j*j <= x; j++){
            if(aku[j]==true){
                for(int i = j*j; i <= x; i+=j)
                    aku[i]=false; }
        }
        for(int i =2; i <= x; i++){
            if(aku[i]==true)
                System.out.print(i+" "); }
    }
    public static void main(String[] args) {
        int x = 1000;
        AlgoritmaSOE.variabel(x);

         System.out.println("");
    }    
}