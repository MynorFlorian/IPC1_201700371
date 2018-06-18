package pruebaconmatriz;

import javax.swing.JOptionPane;

public class MovimientoIzquierda extends Thread {

    public MovimientoIzquierda() {

    }
    public int cantidad = 0;
    public Tablero tab = null;
    public int control = Mostrar.contadormuniequitos + 1;

    public MovimientoIzquierda(int cantidad, Tablero tablero) {
        this.tab = tablero;
        this.cantidad = cantidad;
    }

    public Boolean comprobarFinaba() {
        if (Tablero.x[Mostrar.contadormuniequitos] >= tab.tamaño + 1) {
            return true;
        }
        return false;

    }

    public void moverAbajo(int cantidad) {

        if (cantidad <= 0) {

            return;

        }

        System.out.println("mierda");
        if (comprobarFinaba()) {

            cantidad = 0;
            tab.vecl[tab.tamaño + 1][tab.tamaño] = 0;
            tab.vecG[tab.tamaño + 1][tab.tamaño].setIcon(null);
            Tablero.x[Mostrar.contadormuniequitos] = 0;
            Tablero.y[Mostrar.contadormuniequitos] = 0;

            tab.repintar();
            return;
        } else {
            //mover una posicion hacia abajo

            try {
                tab.vecl[Tablero.x[Mostrar.contadormuniequitos]][Tablero.y[Mostrar.contadormuniequitos]] = 0;
                tab.vecG[Tablero.x[Mostrar.contadormuniequitos]][Tablero.y[Mostrar.contadormuniequitos]].setIcon(null);
                tab.repintar();
                tab.fondo.repaint();
                Tablero.x[Mostrar.contadormuniequitos] -= 1;

//                tab.fondo.removeAll();
                if (tab.vecl[Tablero.x[Mostrar.contadormuniequitos]][Tablero.y[Mostrar.contadormuniequitos]] != 8 && tab.vecl[Tablero.x[Mostrar.contadormuniequitos]][Tablero.y[Mostrar.contadormuniequitos]] != 0 && tab.vecl[Tablero.x[Mostrar.contadormuniequitos]][Tablero.y[Mostrar.contadormuniequitos]] != 7) {

                    if (control % 2 == 0) {
                        Tablero.y[Mostrar.contadormuniequitos] += 1;
                    } else {
                        Tablero.y[Mostrar.contadormuniequitos] -= 1;

                    }

                    tab.vecl[Tablero.x[Mostrar.contadormuniequitos]][Tablero.y[Mostrar.contadormuniequitos]] = control;
                    tab.repintar();

                    cantidad--;
                    Thread.sleep(100);
                    moverAbajo(cantidad);
                } else if (tab.vecl[Tablero.x[Mostrar.contadormuniequitos]][Tablero.y[Mostrar.contadormuniequitos]] == 8) {

                    if (cantidad != 1) {

                        Tablero.x[Mostrar.contadormuniequitos] -= 1;
                        tab.vecl[Tablero.x[Mostrar.contadormuniequitos]][Tablero.y[Mostrar.contadormuniequitos]] = control;
                        tab.repintar();
                        cantidad--;
                        Thread.sleep(300);
                        moverAbajo(cantidad);
                    } else {
                      
                        System.out.println("asdf");
                        tab.vecl[Tablero.x[Mostrar.contadormuniequitos]][Tablero.y[Mostrar.contadormuniequitos]] = control;
                        tab.repintar();
                        cantidad--;
                        Thread.sleep(300);
                        moverAbajo(cantidad);
                        if (control == 1 || control == 3 || control == 5) {
                            Mostrar.vidasj1--;
                        } else if (control == 2 || control == 4 || control == 6) {
                            Mostrar.vidasj2--;
                            System.out.println("baja vida" + Mostrar.vidasj1);
                        }
                    }

                } else if (tab.vecl[Tablero.x[Mostrar.contadormuniequitos]][Tablero.y[Mostrar.contadormuniequitos]] == 7) {
//
                    if (cantidad != 1) {

                        Tablero.x[Mostrar.contadormuniequitos] -= 1;
                        tab.vecl[Tablero.x[Mostrar.contadormuniequitos]][Tablero.y[Mostrar.contadormuniequitos]] = control;
                        tab.repintar();
                        cantidad--;
                        Thread.sleep(300);
                        moverAbajo(cantidad);
                    } else {
                        Tablero.x[Mostrar.contadormuniequitos] += 1;
                        System.out.println("asdf");
                        tab.vecl[Tablero.x[Mostrar.contadormuniequitos]][Tablero.y[Mostrar.contadormuniequitos]] = control;
                        tab.repintar();
                        cantidad--;
                        Thread.sleep(300);
                        moverAbajo(cantidad);

                        if (control == 1 || control == 3 || control == 5) {
                            Mostrar.vidasj1++;
                        } else if (control == 2 || control == 4 || control == 6) {
                            Mostrar.vidasj2++;
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
                JOptionPane.showMessageDialog(null, "Hola");
            }
        }
    }

    public void run() {
        moverAbajo(cantidad);
    }
}
