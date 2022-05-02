/*
 * Taller 3 - Sofka U
 */
package com.mycompany.taller_3;

import java.util.Scanner;

/**
 * Representa una clase para filtrar las canciones de la biblioteca 
 * ya sea por año o por genero. 
 * @author Santiago Gonzalez - sgi1604@hotmail.com
 * @author Juan Fernando Ardila Marín - jfardilam@outlook.com
 */

public class filtro {
    
    /**
     * Método para filtrar canciones según su genero. 
     * @param tamaño cantidad de canciones de la biblioteca
     * @param biblioteca biblioteca de canciones. 
     * @return null. El código en su interior va imprimiendo mediante 
     * un ciclo for las canciones de genero buscado. 
     */
    public static String filtroGenero(int tamaño, biblioteca biblioteca[] ){
        int cont = 0; /*Contador que funciona como interuptor en caso de que no haya canciones del genero buscado*/
        Scanner entradaEscaner = new Scanner (System.in); 
        System.out.println("Ingrese el nombre del genero a buscar");
        String generoBuscado = (entradaEscaner.nextLine()); 
        for (int i=0; i<tamaño; i++){
            if (generoBuscado.equals(biblioteca[i].getGenero())){ /*Busca el genero ingresado en la biblioteca*/
                biblioteca[i].display(); /*Imprime la canción en caso de coincidir con el genero*/
                cont = cont + 1;
            }
        }
        /*En caso de ingresar un genero que no esta en la biblioteca*/
        if (cont==0){ 
            System.out.println("No hay canciones de ese genero"); 
        }
        return null;
    }
    
    /**
     * Método para filtrar canciones según su año. 
     * @param tamaño cantidad de canciones de la biblioteca
     * @param biblioteca biblioteca de canciones. 
     * @return null. El código en su interior va imprimiendo mediante 
     * un ciclo for las canciones del año buscado. 
     */
    public static String filtroYear(int tamaño, biblioteca biblioteca[] ){
        int cont = 0; /*Contador que funciona como interuptor en caso de que no haya canciones del año buscado*/
        Scanner entradaEscaner = new Scanner (System.in); 
        System.out.println("Ingrese el año a buscar");
        try {
            Integer yearBuscado = Integer.parseInt(entradaEscaner.nextLine());  
            for (int i=0; i<tamaño; i++){
                if (yearBuscado == biblioteca[i].getFecha()){/*Busca el año ingresado en la biblioteca*/
                    biblioteca[i].display();/*Imprime la canción en caso de coincidir con el año*/
                    cont = cont + 1;
                }
            }
            /*En caso de ingresar un año que no esta en la biblioteca*/
            if (cont==0){
                System.out.println("No hay canciones en ese año");
            }
        } catch (NumberFormatException ex) {
            System.out.println("No se ingresó un número");
        } 
        return null;
    }
}
