/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Sebastian
 */
public class Casilla {

    public static final String DESCONOCIDO = "Desconocido";
    public static final String BOMBA = "Bomba";

    private String estado;
    private Bomba bomba;
    private int fila;
    private int columna;

    public Casilla(int fila,int columna) {
        this.estado = DESCONOCIDO;
        this.bomba = null;
        this.fila = fila;
        this.columna = columna;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Bomba getBomba() {
        return bomba;
    }

    public void setBomba(Bomba bomba) {
        this.bomba = bomba;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }
    
    

}
