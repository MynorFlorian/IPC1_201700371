package pruebaconmatriz;

import javax.swing.JOptionPane;

public class MovimientoArriba extends Thread {

    Mostrar show;

    public MovimientoArriba() {

    }
    int control = Mostrar.contadormuniequitos + 1;
    public int cantidad = 0;
    public Tablero tab = null;

    public MovimientoArriba(int cantidad, Tablero tablero) {
        this.tab = tablero;
        this.cantidad = cantidad;
    }

    public Boolean comprobarFinaba() {
        if (Tablero.x[Mostrar.contadormuniequitos] >= tab.tamaño + 1) {
            return true;
        }
        return false;
    }

    public void confirmacion() {
        for (int i = 0; i < tab.tamaño; i++) {
            for (int j = 0; j < tab.tamaño; j++) {
                if (tab.vecl[i][j] == 8) {
                    if (tab.posiciones[0][0] == tab.vecl[i][j]) {
                        JOptionPane.showMessageDialog(null, "El jugador ha perdido una vida, ten mas cuidado");
                    }
                }
            }
        }
    }

    public void moverAbajo(int cantidad) {
        show = new Mostrar();
        System.out.println("Contador arriba " + Mostrar.contadormuniequitos);
        if (cantidad <= 0) {
            return;
        }

        control = Mostrar.contadormuniequitos + 1;
        if (comprobarFinaba()) {
            cantidad = 0;
            tab.vecl[tab.tamaño][tab.tamaño + 1] = 0;
            tab.vecG[tab.tamaño][tab.tamaño + 1].setIcon(null);

            Tablero.x[Mostrar.contadormuniequitos] = 0;
            Tablero.y[Mostrar.contadormuniequitos] = 0;

            tab.repintar();
            return;
        } else {
            try {

                tab.vecl[Tablero.x[Mostrar.contadormuniequitos]][Tablero.y[Mostrar.contadormuniequitos]] = 0;
                tab.vecG[Tablero.x[Mostrar.contadormuniequitos]][Tablero.y[Mostrar.contadormuniequitos]].setIcon(null);
                tab.repintar();
                tab.fondo.repaint();
                Tablero.y[Mostrar.contadormuniequitos] -= 1;

                if (tab.vecl[Tablero.x[Mostrar.contadormuniequitos]][Tablero.y[Mostrar.contadormuniequitos]] != 8 && tab.vecl[Tablero.x[Mostrar.contadormuniequitos]][Tablero.y[Mostrar.contadormuniequitos]] != 0 && tab.vecl[Tablero.x[Mostrar.contadormuniequitos]][Tablero.y[Mostrar.contadormuniequitos]] != 7) {

                    if (control % 2 == 0) {
                        Tablero.x[Mostrar.contadormuniequitos] += 1;
                    } else {
                        Tablero.x[Mostrar.contadormuniequitos] -= 1;

                    }

                    tab.vecl[Tablero.x[Mostrar.contadormuniequitos]][Tablero.y[Mostrar.contadormuniequitos]] = control;
                    tab.repintar();

                    cantidad--;
                    Thread.sleep(100);
                    moverAbajo(cantidad);
                } else if (tab.vecl[Tablero.x[Mostrar.contadormuniequitos]][Tablero.y[Mostrar.contadormuniequitos]] == 8) {

                    if (cantidad != 1) {

                        Tablero.y[Mostrar.contadormuniequitos] -= 1;
                        tab.vecl[Tablero.x[Mostrar.contadormuniequitos]][Tablero.y[Mostrar.contadormuniequitos]] = control;
                        tab.repintar();
                        cantidad--;
                        Thread.sleep(100);
                        moverAbajo(cantidad);
                    } else {
                        Tablero.y[Mostrar.contadormuniequitos] += 1;
                        System.out.println("asdf");
                        tab.vecl[Tablero.x[Mostrar.contadormuniequitos]][Tablero.y[Mostrar.contadormuniequitos]] = control;
                        tab.repintar();
                        cantidad--;
                        Thread.sleep(100);
                        moverAbajo(cantidad);
                        if (control == 1 || control == 3 || control == 5) {
                            Mostrar.vidasj1--;
                        } else if (control == 2 || control == 4 || control == 6) {
                            Mostrar.vidasj2--;
                            System.out.println("baja vida" + Mostrar.vidasj1);
                        }
                    }

                } else if (tab.vecl[Tablero.x[Mostrar.contadormuniequitos]][Tablero.y[Mostrar.contadormuniequitos]] == 7) {

                    if (cantidad != 1) {

                        Tablero.y[Mostrar.contadormuniequitos] -= 1;
                        tab.vecl[Tablero.x[Mostrar.contadormuniequitos]][Tablero.y[Mostrar.contadormuniequitos]] = control;
                        tab.repintar();
                        cantidad--;
                        Thread.sleep(100);
                        moverAbajo(cantidad);
                    } else {
                        System.out.println("asdf");
                        tab.vecl[Tablero.x[Mostrar.contadormuniequitos]][Tablero.y[Mostrar.contadormuniequitos]] = control;
                        tab.repintar();
                        cantidad--;
                        Thread.sleep(100);
                        moverAbajo(cantidad);
                        if (control == 1 || control == 3 || control == 5) {
                            Mostrar.vidasj1++;
                        } else if (control == 2 || control == 4 || control == 6) {
                            Mostrar.vidasj2++;
                            System.out.println("baja vida" + Mostrar.vidasj1);
                        }
                    }
                } else {

                    tab.vecl[Tablero.x[Mostrar.contadormuniequitos]][Tablero.y[Mostrar.contadormuniequitos]] = control;
                    tab.repintar();
                    cantidad--;
                    Thread.sleep(100);
                    moverAbajo(cantidad);
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }

    }

    public void run() {

        moverAbajo(cantidad);

    }

}
