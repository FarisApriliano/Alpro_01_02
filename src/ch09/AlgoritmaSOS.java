package ch09;

import java.util.Arrays;

public class AlgoritmaSOS {

    public static int variabel(int x) {
        int xaku = (x-2)/2;
        boolean kamu[] = new boolean[xaku+1];
        Arrays.fill(kamu,false);
        for(int i =1; i <= xaku; i++)
            for(int j = i; (i+j+2*i*j) <= xaku; j++)
                kamu[i+j+2*i*j] = true;
        if(x > 2)
            System.out.print(2+" ");
                for(int i = 1; i <= xaku; i++)
                    if(kamu[i]==false)
                        System.out.print(2*i+1+" ");
        return-1;
    }
    public static void main(String[] args) {        
        int x = 1000;
        variabel(x);

        System.out.println("");
    }   
}