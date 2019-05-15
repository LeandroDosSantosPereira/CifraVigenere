/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cifra;

/**
 *
 * @author LEANDRO
 */
public class Vigenere {
    
        public static String criptografar(String texto, final String chave)

    {

        String res = "";

        texto = texto.toUpperCase();

        for (int i = 0, j = 0; i < texto.length(); i++)

        {

            char c = texto.charAt(i);

            if (c < 'A' || c > 'Z')

                continue;

            res += (char) ((c + chave.charAt(j) - 2 * 'A') % 26 + 'A');

            j = ++j % chave.length();

        }

        return res;

    }

 

    public static String descriptar(String texto, final String chave)

    {

        String res = "";

        texto = texto.toUpperCase();

        for (int i = 0, j = 0; i < texto.length(); i++)

        {

            char c = texto.charAt(i);

            if (c < 'A' || c > 'Z')

                continue;

            res += (char) ((c - chave.charAt(j) + 26) % 26 + 'A');

            j = ++j % chave.length();

        }

        return res;

    }
 

    
}
