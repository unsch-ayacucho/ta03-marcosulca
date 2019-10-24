/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Ejercicio003 {
     public static void main(String[] args) {
     int tablan []; 
        tablan = new int[100];
        for (int i = 0; i < 100; i++) {
            Random numeroA = new Random();
            int n = 1 + numeroA.nextInt(500);
            tablan[i]=n;  
        }
        int menor, mayor;
        mayor = tablan[0];
        menor = tablan[0];
        for (int i = 1; i < 100; i++) {
            if (tablan[i]>mayor) {
                mayor = tablan[i];
            }
            if (tablan[i]<menor) {
                menor = tablan[i];
            }
        }
        for (int i = 0; i < 100; i++) {
            System.out.print(" " + tablan[i] + " ");
        }
        System.out.println(" ");
        Scanner re1 = new Scanner(System.in);
        System.out.println("¿que quieres destacar?");
        System.out.println("1 -- maximo");
        System.out.println("2 -- minimo");
        int x = re1.nextInt();
        System.out.println(" ");
        if (x==1) {
            for (int i = 0; i < 100; i++) {
                if(tablan[i] == mayor){
                    System.out.print(" **" + tablan[i] + "** ");
                }
                else{
                    System.out.print(" " + tablan[i] + " ");
                }
            }
        }
        if (x == 2){
            for (int i = 0; i < 100; i++) {
                if(tablan[i] == menor){
                    System.out.print(" **" + tablan[i] + "** ");
                }
                else{
                    System.out.print(" " + tablan[i] + " ");
                }
            }
        }
    }
}
