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
public class ESBorrar {

    /**
     * @param args the command line arguments
     */
    
    
    public static int[] intValores(int dimension){
        Scanner teclado = new Scanner(System.in);
        int[] arrayEnt = new int[dimension];
        boolean validacion = false;
        
        do{
           try {
               for (int cont = 0; cont<dimension; cont++){
                   System.out.println("Introduce un número");
                   arrayEnt[cont] = teclado.nextInt();                   
                   }
               validacion = true;
           }
           catch(Exception e){
               System.out.println("Valor no válido, introduzca un número");
               teclado.nextLine();
           }
        }
        while(validacion = false);
        return arrayEnt;
    }

public static String parOImpar(int numero){
    if(numero%2 == 0){
        return ". El número es par";
    } else {
        return ". El número es impar";
    }
}
    
 public static int[] arrayEnteros(int dimension){
        int[] arrayEnt = new int[dimension];
        boolean validacion = false;
        int n = 50;
        
        for (int cont = 0; cont<dimension; cont++){
            arrayEnt[cont] = (int) (Math.random()*n);//genera un número aleatorio
            // del 1 al 50 y se lo asigna a la posición "cont" del array.
            // Se multiplica por 50 el número randmom, ya que esa función
            // da un número entre 0 y 1, por lo que al multiplicarlo por
            //50 dará un número entre 0 y 50.
            System.out.print("La posición:" +cont +" contiene en número:"
            +arrayEnt[cont] +" del array");
            System.out.println(parOImpar(arrayEnt[cont]));//Llama al método parOImpar
            //y le pasa por parámetro el número que contiene la posición "cont"
            //del array para que evalúe si ese número es par o impar y lo comunique
            //por pantalla
        }
        return arrayEnt;
    }
}