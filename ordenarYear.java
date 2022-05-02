/*
 * Taller 3 - Sofka U
 */
package com.mycompany.taller_3;

/**
 * Representa una clase para organizar las canciones de la bibloteca
 * por orden de año de lanzamiento ya sea de mayor a menor o viceversa. 
 * @author Santiago Gonzalez - sgi1604@hotmail.com
 * @author Juan Fernando Ardila Marín - jfardilam@outlook.com
 */

public class ordenarYear {
    
    /**
     * Método que organiza las canciones del año mayor (reciente) 
     * al menor (antiguo) o viceversa, 
     * @param tamaño Cantidad de canciones de la biblioteca
     * @param biblioteca biblioteca de canciones. 
     * @param MayOMen valor que define si la operación a realizar es mayor a menor o viceversa
     * @return biblioteca organizada por año.
     */
    public static biblioteca[] ordenMayMen (int tamaño, biblioteca biblioteca[],int MayOMen){
        /**
         * Bibliotecas creada para guardar temporalmente 
         * datos para organizar la biblioteca
         */
        biblioteca[] auxiliar = new biblioteca [tamaño]; 
        /**
         * Bibloteca con las canciones organizadas. 
         */
        biblioteca[] bibliotecaYear = new biblioteca [tamaño];
        /**
         * Ciclo for para organizar canciones. 
         */
        for(int i = 1; i < tamaño; i++){
            for(int j = 0;j < tamaño-i;j++){
                if (MayOMen==1){
                    if(biblioteca[j].getFecha() < biblioteca[j+1].getFecha()) {
                        auxiliar[i] = biblioteca[j];
                        biblioteca[j] = biblioteca[j+1];
                        biblioteca[j+1] = auxiliar[i];
                    }
                } else if (MayOMen==2){
                    if(biblioteca[j].getFecha() > biblioteca[j+1].getFecha()) {
                        auxiliar[i] = biblioteca[j];
                        biblioteca[j] = biblioteca[j+1];
                        biblioteca[j+1] = auxiliar[i];
                    } 
                } else {
                    System.out.println("No se ingresó un número correcto");
                }
            }
        }
        bibliotecaYear = biblioteca;
        /**
         * Ciclo for que imprime las canciones organizadas. 
         */
        for(int i =0; i<biblioteca.length;i++){
            bibliotecaYear[i].display();
            System.out.println(" ");
        } 
        return (bibliotecaYear);
    }
}
