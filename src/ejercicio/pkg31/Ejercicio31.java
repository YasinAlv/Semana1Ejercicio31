/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg31;

import java.util.Scanner;

/**
 *
 * @author Ingenieria
 */
public class Ejercicio31 {

    /**
     * Mostrar la longitud de una cadena. 
     * @param args
     */
    public static void main(String[] args) {
        
        Scanner Teclado = new Scanner(System.in);
        String frase;
        System.out.println("Digite una frase: ");
        frase = Teclado.nextLine();
        int tamano;
        
        tamano=frase.length();
        System.out.println("La longitud de la cadena es de: "+tamano);
    }
    
}
