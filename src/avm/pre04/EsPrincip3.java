package avm.pre04;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author yo
 */
public class EsPrincip3 {

    public static void main(String[] args) {
        String cadena = "aaadabcdabbbadabacababcdacbdab";
        int contador = 0;

        for (int cont = 0; cont < cadena.length() - 3; cont++) {
            String subcadena = cadena.substring(cont, cont + 4);
            char a = subcadena.charAt(0);
            char b = subcadena.charAt(1);
            char c = subcadena.charAt(2);
            char d = subcadena.charAt(3);
                        
            if (a != b && a != c && a != d && b != c && b != d && c != d)
            {
                contador = contador + 1;
            }
        }
        System.out.println("El número de subcadenas es:" +contador);
    }
}
