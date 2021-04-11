package com.company;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        
        verificarPalindromo(entradaString());
    }

   //Metodo que crea una entrada de String

    public static String entradaString(){

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese entrada");

        String entrada = teclado.nextLine();

            return entrada;
    }
      //Metodo que elimina las tildes, comas, espacios, etc

    public static String eliminarSpeChar(String palabra){

        String spechar = "áéíóú";
        String chara = "aeiou";
        String signos = "¡!¿?.,;:'";

        for(int i = 0; i < spechar.length(); i++){

            palabra = palabra.replace(spechar.charAt(i), chara.charAt(i));
        }

        for(int i = 0; i < signos.length(); i++){

            palabra = palabra.replace(signos.charAt(i), ' ');
        }

        palabra = palabra.replace(" ","");

        return palabra;
    }

    //Metodo que verifica que palabra es un palíndromo

    public static void verificarPalindromo(String palabra){

        palabra = eliminarSpeChar(palabra);

        StringBuilder palindromo = new StringBuilder(palabra.toLowerCase());

        if (palindromo.toString().equals(palindromo.reverse().toString())){
            System.out.println("Es un palíndromo");
            return;
        }
        System.out.println("No es palíndromo");
    }
}
