package com.ferragnez.party;
import java.util.Scanner;

public class CheckGuest {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        String[] listaOspiti = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic" };
        System.out.println("Come ti chiami");
        String userName = Input.nextLine();
        Input.close();
        boolean isNameInside = false;
        int i=0;
        while(isNameInside==false && i<listaOspiti.length){
            
            if (listaOspiti[i].equalsIgnoreCase(userName)) {
                isNameInside = true;
                System.out.println("benvenuto");
            } 
            i++;
        }

    }

}
