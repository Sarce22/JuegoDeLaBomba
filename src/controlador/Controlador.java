/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.Bomba;
import modelo.Casilla;

/**
 *
 * @author Sebastian
 */
public class Controlador {

    Casilla[][] casillas;

    public Controlador(int fila, int columna) {
        casillas = new Casilla[fila][columna];
        initCasillas();

    }

    public Casilla[][] getCasillas() {
        return casillas;
    }

    public void initCasillas() {

        for (int i = 0; i < casillas.length; i++) {
            for (int j = 0; j < casillas[i].length; j++) {
                casillas[i][j] = new Casilla(i, j);

            }
        }
    }

    public void agregarBomba(Bomba bomba, int fila, int columna) {
        casillas[fila][columna].setBomba(bomba);
        casillas[fila][columna].setEstado(Casilla.BOMBA);

    }

    public Casilla obtenerCasillar(int fila, int columna) {
        return casillas[fila][columna];
    }

}
