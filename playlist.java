/*
 * Taller 3 - Sofka U
 */
package com.mycompany.taller_3;

import java.util.Scanner;

/**
 * Representa una clase para crear una playlist.  
 * @author Santiago Gonzalez - sgi1604@hotmail.com
 * @author Juan Fernando Ardila Marín - jfardilam@outlook.com
 */

public class playlist {
    
    /**
     * Función con ciclos y switch anidados para la creación de una Playlist
     * con canciones de una biblioteca determinada. 
     * @param tamaño Cantidad de canciones de la biblioteca. 
     * @param biblioteca biblioteca de canciones. 
     * @return playlist de canciones seleccionadas. 
     */
    public static biblioteca [] crearPlaylist (int tamaño, biblioteca biblioteca[] ){

        Scanner entradaEscaner = new Scanner (System.in); 
        /**
         * Biblioteca playlist para guardar canciones deseadas. 
         */
        biblioteca[] playlist = new biblioteca [tamaño]; 
        /**
         * Interruptor para el ciclo do while y decirle para decirle al programa cuando parar de agregar canciones. 
         */
        int interr = 0; 
        /**
         * Contador de canciones agregadas a la Playlist. 
         */
        int cancionesAgregadas = 0;
        
        do {  
            /**
             *  Biblioteca auxiliar para guardar canciones encontradas según los parametros de busqueda. 
             */  
            biblioteca[] cancionesEncontradas = new biblioteca [tamaño]; 
            /**
             * Contador que funciona como interuptor en caso de que no haya canciones en la busqueda
             */
            int subCancionesAgregadas = 0; 
            System.out.println("Ingrese 1 si desea buscar la canción por nombre");
            System.out.println("Ingrese 2 si desea buscar la canción por genero");
            System.out.println("Ingrese 3 si desea buscar la canción por artista");
            System.out.println("Ingrese 4 si desea buscar la canción por año");
            try {
                /**
                 * Variable que determina el tipo de busqueda (nombre, genero, artista o año)
                 */
                int tipoABuscar = Integer.parseInt(entradaEscaner.nextLine());  
                /**
                 * Switch para buscar con base a cada uno de los casos posibles de tipo de busqueda. 
                 */
                switch (tipoABuscar){
                    case 1:
                        System.out.println("Ingrese el nombre de la canción que esta buscando: ");
                        String buscadorS = (entradaEscaner.nextLine()); 
                        for (int i=0; i<tamaño; i++){
                            if (buscadorS.equals(biblioteca[i].getNombre())){ /*Busca el nombre ingresado en la biblioteca*/
                                cancionesEncontradas [subCancionesAgregadas] = biblioteca[i];
                                subCancionesAgregadas = subCancionesAgregadas + 1;
                            }
                        }
                    break;

                    case 2: 
                        System.out.println("Ingrese el genero de la canción que esta buscando: ");
                        buscadorS = (entradaEscaner.nextLine()); 
                        for (int i=0; i<tamaño; i++){
                            if (buscadorS.equals(biblioteca[i].getGenero())){ /*Busca el genero ingresado en la biblioteca*/
                                cancionesEncontradas [subCancionesAgregadas] = biblioteca[i];
                                subCancionesAgregadas = subCancionesAgregadas + 1;
                            }
                        }
                    break; 

                    case 3: 
                        System.out.println("Ingrese el artista de la canción que esta buscando: ");
                        buscadorS = (entradaEscaner.nextLine());  
                        for (int i=0; i<tamaño; i++){
                            if (buscadorS.equals(biblioteca[i].getAutor())){ /*Busca el artista ingresado en la biblioteca*/
                                cancionesEncontradas [subCancionesAgregadas] = biblioteca[i];
                                subCancionesAgregadas = subCancionesAgregadas + 1;
                            }
                        }
                    break; 

                    case 4: 
                        System.out.println("Ingrese el año de la canción que esta buscando: ");
                        try{
                            int buscadorI = Integer.parseInt(entradaEscaner.nextLine()); 
                            for (int i=0; i<tamaño; i++){
                                if (buscadorI == biblioteca[i].getFecha()){ /*Busca el año ingresado en la biblioteca*/
                                    cancionesEncontradas [subCancionesAgregadas] = biblioteca[i];
                                    subCancionesAgregadas = subCancionesAgregadas + 1;
                                }
                            }
                        } catch (NumberFormatException ex) {
                            System.out.println("No se ingresaron valores númericos");
                        }
                    break;

                    default:
                        System.out.println("No se ingresó ningún valor valido para iniciar la busueda");
                }
            }catch (NumberFormatException ex) {
                System.out.println("No se ingresó un número");
            }
            /**
             * Condicional para agregar canciones anteriormente encontradas. 
             */    
            if (subCancionesAgregadas>=1){ 
                System.out.println("Se encontraron " + subCancionesAgregadas + " cancion(es)");
                for(int i =0; i < subCancionesAgregadas;i++){
                    cancionesEncontradas[i].display();
                    System.out.println("Ingresa 1 para agregar la canción a la Playlist o cualquier otra tecla para NO agregarla");
                    try {
                        int decision = Integer.parseInt(entradaEscaner.nextLine());  
                        if (decision==1){
                            playlist[cancionesAgregadas] = cancionesEncontradas[i];
                            cancionesAgregadas = cancionesAgregadas + 1;
                        } else {
                            System.out.println("No se agregó la canción"); 
                        }
                    }catch (NumberFormatException ex) {
                        System.out.println("No se ingresó un número");
                    }
                } 
            } else if (subCancionesAgregadas==0){ /*En caso de ingresar un genero que no esta en la biblioteca*/
                System.out.println("No se encontraron canciones en la busqueda"); 
            }
            /**
             * Condicional para definir si se desean agregar más canciones. 
             */
            System.out.println("Ingrese 1 para buscar y agregar más canciones o presione cualquier tecla para terminar la playlist."); 
            try{
                int continuarPlaylist = Integer.parseInt(entradaEscaner.nextLine()); 
                if (continuarPlaylist!=1){
                    interr = interr + 1;
                }
                }catch (NumberFormatException ex) {
                    interr = interr + 1;
                    System.out.println("No se ingresó un número");
            }
        } while (interr==0);

        /**
         * Ciclo para imprimir en consola las canciones agregadas a la Playlist. 
         */
        System.out.println("Las canciones agregadas a la Playlist son las siguientes: "); 
            for(int i =0; i<cancionesAgregadas;i++){
                playlist[i].display();
                System.out.println(" ");
            } 
        return (playlist);
    } 
}
