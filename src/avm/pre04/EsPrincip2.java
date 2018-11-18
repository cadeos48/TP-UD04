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
public class EsPrincip2 {
      public static void main(String[] args){
        //Se crea un array llamado AleatorioArray, que tiene una dimensión
        //aleatoria que se calcula con el método Math.random. Se suma 1 al valor
        //aleatorio para que el array nunca tenga una dimensión 0 y se multiplica
        //por 15 para que tenga una dimensión de 16 como máximo. El array AleatorioArray
        //será igual que el generado por el método arrayEnteros de la clase ES
        
        int[] AleatorioArray = ES.arrayEnteros((int) (Math.random() *15+1));
        
      }
}
