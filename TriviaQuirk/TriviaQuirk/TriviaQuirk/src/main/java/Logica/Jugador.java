/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

/**
 *
* @author esteb
 */
public class Jugador {
    
    /**
     *Puntos del jugador
     */
    private int puntos;
    /**
     * Nombre del jugador
     */
    private String nombre; 

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    public Jugador(int puntos) {
        this.puntos = puntos;
    }
}
