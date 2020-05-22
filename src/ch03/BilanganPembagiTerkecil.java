package ch03;

import java.util.Scanner;

public class BilanganPembagiTerkecil {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        int a = 0;
        int b = 30;
        
        System.out.println("Menentukan Bilangan Pembagian Terkecil");
        System.out.println("Inputkan Angka : ");
        a=input.nextInt();
        input.close();

        while ( b>=a ) {
            if ( (a%b)!=0 ) {

            } else {
                System.out.println("Bilangan Pembagi Terkecil = " + b);
                b=b+1;
            }
        }


    }
    
}