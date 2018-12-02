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
public class ES {

    /**
     * @return devuelve un número entero que se utilizará para dimensionar array
     */
        
    public static int leerEntero(){
        int numEnt = 0;
        Scanner teclado = new Scanner(System.in);
        boolean validacion = false;        
        do{
           try {               
               numEnt = teclado.nextInt();
               validacion = true;
           }
           catch(Exception e){
               System.out.println("Valor no válido, introduzca un número");
               teclado.nextLine();
           }
        }
        while(validacion == false);
        return numEnt;
    }
    /* Correción error método leerEntero(); en el que puse un solo = en el while
    en vez de dos: while(validacion = false);
    Correción de Antonio: En el while estás haciendo dos cosas. Primero poner
    validación a falso ya que estás asignando un valor (un igual en vez de dos)
    y segundo indicas que la condición es falsa al realizar la acción 1 por lo que
    sale del do-while y devuelve el valor 0. Si cambias el = por == debería
    funcionarte sin problema
    */
          
    public static String parOImpar(int numero){
        if(numero%2 == 0){
            return ". El número es par";
            } else {
            return ". El número es impar";
        }
    }
}
