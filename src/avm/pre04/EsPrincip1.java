/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avm.pre04;


/**
 *
 * @author Usuario
 */
public class EsPrincip1 {
    public static void main(String[] args){
        int[] unArray = new int[5];
        int suma = 0;
              
        for(int cont= 0; cont < unArray.length; cont++){
            unArray[cont] = ES.leerEntero();           
            suma = suma + unArray[cont];
        }
        System.out.print("La suma total es: " +suma);
        
    }
}