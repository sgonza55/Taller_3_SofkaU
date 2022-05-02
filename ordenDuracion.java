/*
 * Taller 3 - Sofka U
 */
package com.mycompany.taller_3;


/**
 * Representa una clase para organizar las canciones de la bibloteca
 * por orden de duración ya sea de mayor a menor o viceversa. 
 * @author Santiago Gonzalez - sgi1604@hotmail.com
 * @author Juan Fernando Ardila Marín - jfardilam@outlook.com
 */
public class ordenDuracion {
    
    /**
     * Método que organiza las canciones de duración mayor a la menor.
     * @param tamaño Cantidad de canciones de la biblioteca
     * @param biblioteca biblioteca de canciones. 
     * @param MayOMen valor que define si la operación a realizar es mayor a menor o viceversa
     * @return biblioteca organizada por duración.
     */
    public static biblioteca[] ordenMayMen (int tamaño, biblioteca biblioteca[], int MayOMen){
        /**
         * Bibliotecas creada para guardar temporalmente 
         * datos para organizar la biblioteca
         */
        biblioteca[] auxiliar = new biblioteca [tamaño]; 
        /**
         * Bibloteca con las canciones organizadas. 
         */
        biblioteca[] bibliotecaDuracion = new biblioteca [tamaño];
        /**
         * Ciclo for para organizar canciones. 
         */
        for(int i = 1; i < tamaño; i++){
            for(int j = 0;j < tamaño-i;j++){
                if (MayOMen==1){
                    if(biblioteca[j].getDuracion() < biblioteca[j+1].getDuracion()) {
                        auxiliar[i] = biblioteca[j];
                        biblioteca[j] = biblioteca[j+1];
                        biblioteca[j+1] = auxiliar[i];
                    }
                } else if (MayOMen==2) {
                    if(biblioteca[j].getDuracion() > biblioteca[j+1].getDuracion()) {
                        auxiliar[i] = biblioteca[j];
                        biblioteca[j] = biblioteca[j+1];
                        biblioteca[j+1] = auxiliar[i];
                    }
                } else {
                    System.out.println("No se ingresó un número correcto");
                }
            }
        }
        bibliotecaDuracion = biblioteca;
        /**
         * Ciclo for que imprime las canciones organizadas. 
         */
        for(int i =0; i<biblioteca.length;i++){
            bibliotecaDuracion[i].display();
            System.out.println(" ");
        } 
        return (bibliotecaDuracion);
    }
}
