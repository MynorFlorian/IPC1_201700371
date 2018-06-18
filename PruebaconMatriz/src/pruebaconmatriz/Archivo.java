/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaconmatriz;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author mynor
 */
public class Archivo {

    public void crear() {
        String ruta = "Archivo.txt";
        File archivo = new File(ruta);
        PrintWriter pw;
        try {
            if (archivo.exists()) {
                pw = new PrintWriter(new FileWriter(ruta, true));
                int a = (int) (Math.random() * 10);
                pw.println("Jug" + a + "," + (a + 1));
            } else {

                pw = new PrintWriter(new FileWriter(ruta, true));

                pw.println("Estuardo,56");

            }
            pw.close();
        } catch (Exception w) {

        }

    }

    public Persona[] obtenerPersonas(String archivo) throws FileNotFoundException, IOException {

        String cadena = "";
        Persona[] per = new Persona[]{new Persona(43, "D", "A", 0, 0, "AD"), new Persona(43, "D", "A", 0, 0, "AD"), new Persona(43, "D", "A", 0, 0, "AD"), new Persona(43, "D", "A", 0, 0, "AD"), new Persona(43, "D", "A", 0, 0, "AD"), new Persona(43, "D", "A", 0, 0, "AD"), new Persona(43, "D", "A", 0, 0, "AD"), new Persona(43, "D", "A", 0, 0, "AD"), new Persona(43, "D", "A", 0, 0, "AD"), new Persona(43, "D", "A", 0, 0, "AD"), new Persona(43, "D", "A", 0, 0, "AD")};

        FileReader fr = new FileReader(archivo);
        BufferedReader br = new BufferedReader(fr);
        int linea = 0;

        while ((cadena = br.readLine()) != null && linea < 5) {
            String[] cadenassplit = cadena.split(",");
//            per[linea] = new Persona(Integer.parseInt(cadenassplit[1].trim()), cadenassplit[0]);
            linea++;
        }
        br.close();
        return per;
    }

}
