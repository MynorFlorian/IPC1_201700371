package pruebaconmatriz;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import javax.swing.*;

public class Tablero {

    public Tablero() {

    }

    int tamaño = 0;
    JPanel fondo = null;

    int[][] vecl;
    JLabel[][] vecG;

    public int[][] posiciones;
    public static int[] x;
    public static int[] y;
    public JLabel casilla = null;
    public int tamañobloquey = 0;
    public int tamañobloquex = 0;

    public Personaje per;
    public Prueba prueba;

    static int a;
    static int b;

    public Tablero(int tam, JPanel panel) {
        this.tamaño = tam;
        this.fondo = panel;
        llenar();

    }

    public void llenar() {

        tamañobloquex = 800 / tamaño;
        tamañobloquey = 800 / tamaño;
        vecl = new int[tamaño][tamaño];
        vecG = new JLabel[tamaño][tamaño];
        int diez = (int) (tamaño * tamaño * .10);
        int cinco = (int) (tamaño * tamaño * .05);

        per = new Personaje();
        posiciones = new int[3][3];
        x = new int[6];
        y = new int[6];

        int tipojugador = 1; //para agregar el jugador

        int contador = 0;
        int contador2 = 0;

        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {

                vecl[i][j] = 0;
            }
        }

        //System.out.println(c + "," + d);
        // System.out.println(a + "," + b);
        // per = new Personaje();
        for (int z = 0; z <= 6; ++z) {
            a = (int) (Math.random() * tamaño);
            b = (int) (Math.random() * tamaño);

            if (vecl[a][b] != 0) {
                --z;
            } else {

                vecl[a][b] = z;

            }

        }

        for (int z = 0; z < diez; ++z) {
            a = (int) (Math.random() * tamaño);
            b = (int) (Math.random() * tamaño);

            if (vecl[a][b] != 0) {
                --z;
            } else {
                vecl[a][b] = 8;
            }

        }

        for (int z = 0; z < cinco; ++z) {
            a = (int) (Math.random() * tamaño);
            b = (int) (Math.random() * tamaño);
            if (vecl[a][b] != 0) {
                --z;
            } else {
                vecl[a][b] = 7;
            }

        }

        for (int qi = 0; qi < tamaño; qi++) {

            for (int qj = 0; qj < tamaño; qj++) {
                if (vecl[qi][qj] == 1) {
                    posiciones[0][0] = vecl[qi][qj];
                    x[0] = qi;
                    y[0] = qj;

                }
                if (vecl[qi][qj] == 2) {
                    posiciones[1][1] = vecl[qi][qj];
                    x[1] = qi;
                    y[1] = qj;

                }
                if (vecl[qi][qj] == 3) {
                    posiciones[2][2] = vecl[qi][qj];
                    x[2] = qi;
                    y[2] = qj;

                }
                if (vecl[qi][qj] == 4) {
                    posiciones[2][2] = vecl[qi][qj];
                    x[3] = qi;
                    y[3] = qj;

                }
                if (vecl[qi][qj] == 5) {
                    posiciones[2][2] = vecl[qi][qj];
                    x[4] = qi;
                    y[4] = qj;

                }
                if (vecl[qi][qj] == 6) {
                    posiciones[2][2] = vecl[qi][qj];
                    x[5] = qi;
                    y[5] = qj;

                }

            }
        }
        repintar();
//        per.as = Tablero.x[0];
//        per.os = Tablero.y[0];
        /*for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if (vecl[i][j] == 0) {
                    --contador;
                } else {
                    vecl[a][b] = 1;
                }

            }
        }*/
//    }
//        for (int i = 0; i < cinco; i++) {
//            int x = (int) (Math.random() * tamaño);
//            int y = (int) (Math.random() * tamaño);
//
//            if (vecl[x][y] != 0) {
//
//            } else {
//                vecl[x][y] = 7;
//            }
//
//        }
//
//        while (contador < diez) {
//            ++contador;
//            int x = (int) (Math.random() * tamaño);
//            int y = (int) (Math.random() * tamaño);
//            System.out.println("10% " + x + "," + y);
//
//            for (int i = 0; i < diez; i++) {
//                for (int j = 0; j < diez; j++) {
//                    if (vecl[i][j] != 0) {
//                        --i;
//                    } else {
//                        vecl[x][y] = 8;
//                    }
//                }
//            }
//        }

    }

    public void repintar() {

        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) { //0 casilla vacia

                if (vecl[i][j] == 0) {
                    casilla = new JLabel();
                } else if (vecl[i][j] == 1) {
                    // 1 personaje

                    per = new Personaje();
                    per.obtenerimagen(tamañobloquex, tamañobloquey);
                    casilla = new JLabel(per.obtenerimagen(tamañobloquex, tamañobloquey));
                } else if (vecl[i][j] == 2) {
                    //personae
                    per = new Personaje();

                    casilla = new JLabel(per.obtenerimagen2(tamañobloquex, tamañobloquey));

                } else if (vecl[i][j] == 3) {
                    //personaje
                    per = new Personaje();

                    casilla = new JLabel(per.obtenerimagen4(tamañobloquex, tamañobloquey));

                } else if (vecl[i][j] == 4) {
                    //personaje
                    per = new Personaje();

                    casilla = new JLabel(per.obtenerimagen6(tamañobloquex, tamañobloquey));
                } else if (vecl[i][j] == 5) {
                    //personaje
                    per = new Personaje();

                    casilla = new JLabel(per.obtenerimagen7(tamañobloquex, tamañobloquey));
                } else if (vecl[i][j] == 6) {
                    //personaje
                    per = new Personaje();

                    casilla = new JLabel(per.obtenerimagen8(tamañobloquex, tamañobloquey));
                } else if (vecl[i][j] == 8) {                   //minas

                    per = new Personaje();

                    casilla = new JLabel(per.obtenerimagen3(tamañobloquex, tamañobloquey));
                } else if (vecl[i][j] == 7) {
                    prueba = new Prueba();

                    casilla = new JLabel(prueba.obtenerimagen(tamañobloquex, tamañobloquey));

                }

                casilla.setOpaque(false);
                casilla.setBorder(BorderFactory.createLineBorder(Color.black));

                casilla.setBounds(i * tamañobloquex, j * tamañobloquey, tamañobloquex, tamañobloquey);

                vecG[i][j] = casilla;
                fondo.add(vecG[i][j], BorderLayout.CENTER);

            }
        }
        fondo.repaint();
    }

}
