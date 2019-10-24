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
public class Ejercicio001 {
     public static void main(String[] args) {
     int tablan []; 
        int tablam [];
        tablan = new int[100];
        tablam = new int[100];
        
        for (int i = 0; i < 100; i++) {
            Random numeroA = new Random();
            int n = 1 + numeroA.nextInt(20);
            tablan[i]=n;  
        }
        for (int i = 0; i < 100; i++) {
            tablam[i]=tablan[i];
        }
        for (int i = 0; i < 100; i++) {
            System.out.print(" " + tablam[i] + " ");
        }
        int x;
        int y;
        Scanner re1 = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("indique los numeros a cambiar: ");
        x = re1.nextInt();
        y = re1.nextInt();
        
        for (int i = 0; i < 100; i++) {
            if (tablam[i] == x) {
                tablam[i] = y;   
            }
        }
        for (int i = 0; i < 100; i++) {
            System.out.print(" " + tablam[i] + " ");
        }
    
    } 
}

