package ch09;

import java.util.Scanner;

public class AlgoritmaAKSPT {

    public static long p[] = new long[1000];
    public static void koefesien(final int x) {
        p[0] = 1;
        for(int i = 0; i < x; p[0] = -p[0], i++){
            p[1+i] = 1;
            for(int j = i; j > 0; j--)
                p[j] = p[j-1]-p[j];
        }
    }
    public static boolean prima(final int x){
        koefesien(x);
        p[0]++;
        p[x]--;
        int i = x;
        while((i--)>0&&p[i]%x==0);
        return i < 0;
    }
    public static void main(final String[]args) {
        final Scanner nw = new Scanner(System.in);
        System.out.println("Inputkan bilangan");
        final int x = nw.nextInt();
        if(prima(x))
            System.out.println("Bilangan Prima");
        else
            System.out.println("Bukan Bilangan Prima");

            System.out.println("");
    }
}