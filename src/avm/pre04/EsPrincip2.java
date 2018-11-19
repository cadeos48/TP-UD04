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
        //Se crea un array que tiene una dimensión aleatoria que se calcula con el método Math.random.
        //Se suma 1 al valor aleatorio para que el array nunca tenga una dimensión 0 
        //y se multiplica por 9 para que tenga una dimensión de 10 como máximo. 
        int dimension = (int) (Math.random()*9+1);
        int[] arrayEnt = new int[dimension];
         
        for (int cont = 0; cont<dimension; cont++){
            arrayEnt[cont] = (int) (Math.random()*50);//genera un número aleatorio
            // del 0 al 50 y se lo asigna a la posición "cont" del array.
            // Se multiplica por 50 el número randmom, ya que esa función
            // da un número entre 0 y 1, por lo que al multiplicarlo por
            //50 dará un número entre 0 y 50.
            System.out.print("La posición " +cont +" del array, contiene en número "
            +arrayEnt[cont]);
            System.out.println(ES.parOImpar(arrayEnt[cont]));//Llama al método parOImpar
            //y le pasa por parámetro el número que contiene la posición "cont"
            //del array para que evalúe si ese número es par o impar y lo comunique
            //por pantalla
        }
      }
}