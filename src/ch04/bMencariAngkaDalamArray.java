package ch04;

import java.util.Scanner;

public class bMencariAngkaDalamArray {
    public static void main (String[] args){

        int Narray[] = {82,12,41,38,19,26,9,48,20,55,8,32,3};

        System.out.println("Masukan nilai yang ingin dicari dalam array : ");
        Scanner cariX = new Scanner (System.in);	
	    int cari = cariX.nextInt();
	    boolean ketemu = false;
       
        for (int i=0;i<Narray.length;i++){
		if(Narray[i]==cari){
		   System.out.println("Angka "+cari+" ada di index ke "+i);  
		   ketemu=true;
		    }	
        }

	    if (ketemu == false){
	   System.out.println("Angka "+cari+" tidak ditemukan");
	    }

    System.out.println(" ");

    }
    
}