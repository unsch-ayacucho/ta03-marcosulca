/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;
import java.util.Scanner;
/**
 *
 * @author Administrator
 */
public class Ejercicio002 {
    
     public static void main(String[] args) {
     int tablan []; 
        int tablam [];
        tablan = new int[10];
        tablam = new int[10];

        System.out.println("indique los numeros naturales a excepcion del 1 : ");
        Scanner re = new Scanner(System.in);
        for (int k = 0; k < 10; k++) {
            tablan[k]=re.nextInt();
        }
        System.out.print("indice: ");
        for (int i = 0; i < 10; i++) {
            
            System.out.print(" " + i + " ");
        }
        System.out.println(" ");
        System.out.print("valor:  ");
        for (int i = 0; i < 10; i++) {
            
            System.out.print(" " + tablan[i] + " ");
        }
        int cont=0;
        for (int i = 0; i < 10; i++) {
            int num = tablan[i]-1;    
            while(( tablan[i] % num) != 0){
                num--;
            }
            if(num == 1){
                tablam[cont] = tablan[i];
                cont++;
            }  
        }
        for (int i = 0; i < 10; i++) {
            int num = tablan[i]-1;    
            while(( tablan[i] % num) != 0){
                num--;
            }
            if(num != 1){
                tablam[cont] = tablan[i];
                cont++;
            }      
        }
        System.out.println(" ");
        System.out.println("         TABLA REORGANIZADA    ");
        System.out.print("indice: ");
        for (int i = 0; i < 10; i++) {
            
            System.out.print(" " + i + " ");
        }
        System.out.println(" ");
        System.out.print("valor:  ");
        for (int i = 0; i < 10; i++) {
            
            System.out.print(" " + tablam[i] + " ");
        }
        
    }
}
