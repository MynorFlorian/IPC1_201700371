package pruebaconmatriz;

import javax.swing.JOptionPane;

public class Turno {

    boolean[] turno;
    boolean[] personaje;

    public void division() {
        turno[0] = true;
        turno[1] = false;
        personaje[0] = true;
        personaje[1] = false;
        personaje[2] = true;
        personaje[3] = false;
        personaje[4] = true;
        personaje[5] = false;

    }
    public void confirmacion(){
        
    }

    public boolean turno(int n) {
        if (n == 1) {
            System.out.println("Turno jugador 1");
            System.out.println("Mover primera pieza");
          
            return turno[0];
        } else if (n == 2) {
            System.out.println("Turno jugador 1");
            System.out.println("Mover primera pieza");
            return turno[1];
        }
        
        return true;
    }
}
