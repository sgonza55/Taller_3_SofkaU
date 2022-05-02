/*
 * Taller 3 - Sofka U
 */
package com.mycompany.taller_3;

import java.util.Scanner;

/**
 * Representa un programa donde se agregan canciones a una biblioteca, y tiene opciones para
 * filtrar las canciones por año o genero y funcionalidades para organizar las canciones de 
 * la biblioteca de mayor a menor o vicerversa por duración o año. 
 * @author Santiago Gonzalez - sgi1604@hotmail.com
 * @author Juan Fernando Ardila Marín - jfardilam@outlook.com
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /**
         * Creación de biblioteca con canciones predeterminadas. Tiene 16 canciones. 
         */
        biblioteca[] biblioteca = new biblioteca [16];

        biblioteca [0] = new biblioteca ("Yonaguni", 122, 2020, "03", "27", "Reguetón","Bad Bunny","Disco Sencillo. Lanzado por Rimas Entertainment" );
        biblioteca [1] = new biblioteca ("Azul", 348, 2020, "03", "25", "Reguetón","J Balvin","Albúm: Colores" );
        biblioteca [2] = new biblioteca ("Tal para cúal", 158, 1995, "04", "38", "Salsa","Joe Arroyo","Albúm: Mi libertad" );
        biblioteca [3] = new biblioteca ("Conteo Regresivo", 248, 2003, "04","28", "Salsa","Gilberto Santa Rosa","Albúm: Constrste en salsa" );
        biblioteca [4] = new biblioteca ("Flor Palida", 888, 2013, "04","58", "Salsa","Marc Anthony","Albúm: 3.0" );
        biblioteca [5] = new biblioteca ("Dakiti", 668, 2013, "03","25", "Reguetón","Bad Bunny","Albúm: El último tour del mundo");
        biblioteca [6] = new biblioteca ("Sin sentimiento", 489, 1990, "05","00", "Salsa","Grupo Niche","Albúm: Cielo de tambores" );
        biblioteca [7] = new biblioteca ("Bohemian Rhapsody", 409, 1975, "06","00", "Rock","Queen","Albúm: A night at the opera" );
        biblioteca [8] = new biblioteca ("Welcome to the Jungle", 358, 1987, "04","40", "Rock","Guns N' Roses","Albúm: Apetite for destruction" );
        biblioteca [9] = new biblioteca ("Thunderstruck", 963, 1990, "04","53", "Rock","AC/DC","Nominado al MTV Video Music Award for Best Rock Video" );
        biblioteca [10] = new biblioteca ("I was made for loving you", 838, 1979, "03","59", "Rock","Kiss","Albúm: Dynasty" );
        biblioteca [11] = new biblioteca ("Promesa", 735, 2014, "03","59", "Pop","Melendi","Albúm: Un alumno más" );
        biblioteca [12] = new biblioteca ("Virtual Diva", 458, 2009, "04","03", "Reguetón","Don Omar","Albúm: Meet the Orphans");
        biblioteca [13] = new biblioteca ("Besos usados", 735, 2009, "03","57", "Pop","Andrés Cepeda","Albúm: Día tras día" );
        biblioteca [14] = new biblioteca ("Bajo del agua", 555, 2015, "03","51", "Pop","Manuel Medrano","Albúm: Manuel Medrano" );
        biblioteca [15] = new biblioteca ("A la primera persona", 774, 2006, "05","13", "Pop","Alejandro Sanz","Albúm: El tren de los momentos" );

        /**
         * Ciclo que imprime la biblioteca de canciones creada. 
         */
        for(int i =0; i<biblioteca.length;i++){
           biblioteca[i].display();
        }
        System.out.println(" ");

        /**
         * Código para crear un clase Playlist. 
         */
        System.out.println("¿Desea crear una Playlist?");
        System.out.println("Ingrese 1 para crear Playlist o presione cualquier otra tecla para salir: ");
        Scanner entradaEscaner = new Scanner (System.in);
        try {
            int newPlaylist = Integer.parseInt(entradaEscaner.nextLine());  
            if (newPlaylist==1){
                playlist.crearPlaylist(biblioteca.length, biblioteca);
            }
        } catch (NumberFormatException ex) {
            System.out.println("No se ingresó un número");
        }

        /**
         * Switch que permite al usario decidir si quiere filtrar las canciones por genero o año
         * y posteriori busca el canciones respectivas al valor buscado en la 
         * biblioteca anteriormente creada
         */
        System.out.println("Ingrse 1 si desea filtrar las canciones por año o genero "
                            + "o presione otra tecla para saltar:");
        try {
            int interr = Integer.parseInt(entradaEscaner.nextLine());  
            if (interr==1){
                System.out.println("Ingrese 1 para filtrar por genero "
                                    + "o ingrese 2 para filtrar por año: ");
                try {
                    int generoOYear = Integer.parseInt(entradaEscaner.nextLine()); 
                    switch (generoOYear){
                        case 1: 
                            filtro.filtroGenero(biblioteca.length, biblioteca);
                        break;
                        
                        case 2: 
                            filtro.filtroYear(biblioteca.length, biblioteca);
                        break;
                        
                        default:
                            System.out.println("No se ingresó un valor valido"); 
                    }
                }catch (NumberFormatException ex) {
                    System.out.println("No se ingresó un número");
                }
            }
        } catch (NumberFormatException ex) {
            System.out.println("No se ingresó un número");
        } 

        /**
         * Código que permite al usuario decidir si quiere organizar las canciones por año
         * o duración de mayor a menor o vicerversa. 
         */
        System.out.println("Ingrse 1 si desea organizar las canciones por año o duración, " 
                            + "o presione otra tecla para saltar: " );
        try {
            int interr = Integer.parseInt(entradaEscaner.nextLine());  
            if (interr==1){
                System.out.println("Ingrese 1 para orgzanizar por año "
                                    + "o ingrese 2 para organizar por duración: ");
                int YearODuracion = Integer.parseInt(entradaEscaner.nextLine());
                switch (YearODuracion){
                    case 1:
                        System.out.println("Ingrse 1 si desea organizar respecto al año de mayor a menor "
                                            + "o ingrese 2 si desea al réves");
                        int MayorOMenor = Integer.parseInt(entradaEscaner.nextLine());  
                        ordenarYear.ordenMayMen(biblioteca.length, biblioteca,MayorOMenor);

                    break;
                    
                    case 2:
                        System.out.println("Ingrse 1 si desea organizar en duración de mayor a menor "
                                            + "o ingrese 2 si desea al réves");
                        MayorOMenor = Integer.parseInt(entradaEscaner.nextLine());  
                        ordenDuracion.ordenMayMen(biblioteca.length, biblioteca,MayorOMenor);
                    break;

                    default:
                        System.out.println("No se ingresó un valor valido");  
                }
            }
        } catch (NumberFormatException ex) {
            System.out.println("No se ingresó un número");
        }       
    }
}