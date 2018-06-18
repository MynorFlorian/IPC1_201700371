/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaconmatriz;

/**
 *
 * @author mynor
 */
public class Persona {

    private int tiempo;
    private String nombre;
    String nombre2;
    int vidas;

   

    public Persona(int tiempo, String nombre, String nombre2, int vidas) {
        this.tiempo = tiempo;
        this.nombre = nombre;
        this.nombre2 = nombre2;
        this.vidas = vidas;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre2() {
        return nombre2;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }


   
}
