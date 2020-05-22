package ch03;

import java.util.Scanner;

public class BilanganPrima {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        int bilangan, cek=0;

        System.out.println("Menentukan Bilangan Prima");
        System.out.println("Inputkan Angka: ");
        bilangan=input.nextInt();
        input.close();

        for (int i=2; i<=bilangan; i++) {
            if (bilangan%i==0){
                cek++;
            }
        }

        if (cek==1) {
            System.out.println(bilangan+ " Ini Bilangan Prima ");

        } else {
            System.out.println(bilangan+ " Ini Bukan Bilangan Prima ");
        }


    }
    
}