/*
 * Taller 3 - Sofka U
 */
package com.mycompany.taller_3;


/**
 * Representa una clase de una biblioteca con sus 
 * respectivos atributos y métodos. 
 * @author Santiago Gonzalez - sgi1604@hotmail.com
 * @author Juan Fernando Ardila Marín - jfardilam@outlook.com
 */
public class biblioteca {

    /**
     * Nombre de la canción.
     */
    public String nombre; 
    /**
     * ID de la canción
     */
    public int id;
    /**
     * Año de lanzamiento de la canción.
     */
    public int fecha;
    /**
     * Minutos (sin contar los segundos) que dura la canción
     */
    public String duracionMin;
    /**
     * Segundos (quitando los minutos ya ingresados) restantes que dura la canción
     */
    public String duracionSeg;
    /**
     * Genero de la canción
     */
    public String genero;
    /**
     * Autor de la canción (cantante)
     */
    public String autor;
    /**
     * Descripción de la canción.
     */
    public String descripcion;
    
    /**
     * Biblioteca con cada uno de los parametros. 
     * @param nombre nombre de la canción
     * @param id identificador de la canción
     * @param fecha año de lanzamiento de la canción
     * @param duracionMin duración minutos de la canción
     * @param duracionSeg duración segundos de la canción
     * @param genero genero musical de la canción
     * @param autor autor de la canción
     * @param descripcion descricpción de la canción
     */
    public biblioteca (String nombre, int id, int fecha, String duracionMin, 
                        String duracionSeg, String genero, String autor, String descripcion){
        this.nombre = nombre;
        this.id = id;
        this.fecha = fecha;
        this.duracionMin = duracionMin;
        this.duracionSeg = duracionSeg;
        this.genero = genero;
        this.autor = autor;
        this.descripcion = descripcion;
    }

    /**
     * Obtiene el genero de la canción 
     * @return genero de la canción 
     */
    public String getGenero() {
        return genero;
    }

    /**
     * Obtiene el año de lanzamiento de la canción 
     * @return año de lanzamiento de la canción 
     */
    public int getFecha() {
        return fecha;
    }

    /**
     * Obtiene la duración de la canción como un flotante para poder organizarla en un filtro. 
     * @return duración de la canción como número real 
     */
    public float getDuracion() {
        String duracionString = duracionMin + "." + duracionSeg;
        Float duracion = Float.valueOf(duracionString);
        return (duracion);
    }

    /**
     * Obtiene el nombre de la canción
     * @return Nombre de la canción
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene el autor de la canción
     * @return autor de la canción
     */
    public String getAutor() {
        return autor;
    }

    /**
     * Método que imprime en pantalla los atributos de la canción. 
     */
    public void display(){
        System.out.println("|" + nombre + " ID:" + id + " " + fecha
                            + " " + duracionMin + ":" + duracionSeg + " " 
                            + genero + " " + autor + " " + descripcion + "|");
    }
}
