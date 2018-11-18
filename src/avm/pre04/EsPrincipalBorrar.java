/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avm.pre04;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EsPrincipalBorrar {
    public static void main(String[] args){
        int[] arrayEnt = new int[5];
        Scanner teclado = new Scanner(System.in);
    
       for (int cont = 0; cont < arrayEnt.length; cont++){
            System.out.println("Introduce un número");
            arrayEnt[cont] = teclado.nextInt();          
        }
        
        for (int cont = 0; cont<arrayEnt.length; cont++){
            System.out.print(arrayEnt[cont]);
        }
    }
}