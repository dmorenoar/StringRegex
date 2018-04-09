/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author dmorenoar
 */
public class StringRegex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String numeros = ".*[0-9].*";
        String letras = ".*[A-Za-z].*";
        String caracEspeciales = ".*[!@#$%&*()_+=|<>?{}\\[\\]~-].*";
        
        
        System.out.println("Introduce un texto:");
        String texto = br.readLine();

        if (texto.matches(numeros) || texto.matches(letras)) {
            System.out.println("Contiene letras o numeros y es válido");
        }

        if (texto.matches(caracEspeciales)) {
            System.out.println("Contiene caracteres especiales");
        }
    }

}
