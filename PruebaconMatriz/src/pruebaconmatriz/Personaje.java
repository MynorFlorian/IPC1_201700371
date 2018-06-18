package pruebaconmatriz;

import java.awt.Image;
import javax.swing.*;

public class Personaje {

    public int as = 0;
    public int os = 0;
    public MostrarPrincipal mos;

    public Personaje(int as, int os) {
        this.as = as;
        this.os = os;

    }
    public int[] x;
    public int[] y;

    public Personaje() {

    }

    public ImageIcon obtenerimagen(int tamx, int tamy) {
        mos = new MostrarPrincipal();
        ImageIcon per = null;
        if (MostrarPrincipal.op1.equals("Princesa")) {
            per = new ImageIcon(getClass().getResource("/imagen/princesa.png"));
            Image image = per.getImage();
            Image tamiimagen = image.getScaledInstance(tamx, tamy, Image.SCALE_SMOOTH);
            per = new ImageIcon(tamiimagen);
            return per;
        } else if (MostrarPrincipal.op1.equals("Guerrero")) {
            per = new ImageIcon(getClass().getResource("/imagen/Guerrero.png"));
            Image image = per.getImage();
            Image tamiimagen = image.getScaledInstance(tamx, tamy, Image.SCALE_SMOOTH);
            per = new ImageIcon(tamiimagen);
            return per;
        } else if (MostrarPrincipal.op1.equals("Mago")) {
            per = new ImageIcon(getClass().getResource("/imagen/mago.png"));
            Image image = per.getImage();
            Image tamiimagen = image.getScaledInstance(tamx, tamy, Image.SCALE_SMOOTH);
            per = new ImageIcon(tamiimagen);
            return per;
        }
        return per;
    }

    public ImageIcon obtenerimagen2(int tam, int tamx) {
        mos = new MostrarPrincipal();
        ImageIcon per = null;
        if (MostrarPrincipal.op2.equals("Princesa")) {
            per = new ImageIcon(getClass().getResource("/imagen/princesa1.jpg"));
            Image image = per.getImage();
            Image tamiimagen = image.getScaledInstance(tamx, tam, Image.SCALE_SMOOTH);
            per = new ImageIcon(tamiimagen);
            return per;
        } else if (MostrarPrincipal.op2.equals("Guerrero")) {
            per = new ImageIcon(getClass().getResource("/imagen/Guerrero1.png"));
            Image image = per.getImage();
            Image tamiimagen = image.getScaledInstance(tamx, tam, Image.SCALE_SMOOTH);
            per = new ImageIcon(tamiimagen);
            return per;
        } else if (MostrarPrincipal.op2.equals("Mago")) {
            per = new ImageIcon(getClass().getResource("/imagen/mago1.jpg"));
            Image image = per.getImage();
            Image tamiimagen = image.getScaledInstance(tamx, tam, Image.SCALE_SMOOTH);
            per = new ImageIcon(tamiimagen);
            return per;
        }
        return per;
    }

    public ImageIcon obtenerimagen3(int tam, int tamx) {
        ImageIcon per = new ImageIcon(getClass().getResource("/imagen/mina_1.png"));
        Image imagen = per.getImage();
        Image tamanioimagen = imagen.getScaledInstance(tamx, tam, Image.SCALE_SMOOTH);
        per = new ImageIcon(tamanioimagen);
        return per;
    }

    public ImageIcon obtenerimagen4(int tam, int tamx) {
        ImageIcon per = null;
        if (MostrarPrincipal.op3.equals("Princesa")) {
            per = new ImageIcon(getClass().getResource("/imagen/princesa.png"));
            Image image = per.getImage();
            Image tamiimagen = image.getScaledInstance(tamx, tam, Image.SCALE_SMOOTH);
            per = new ImageIcon(tamiimagen);
            return per;
        } else if (MostrarPrincipal.op3.equals("Guerrero")) {
            per = new ImageIcon(getClass().getResource("/imagen/Guerrero.png"));
            Image image = per.getImage();
            Image tamiimagen = image.getScaledInstance(tamx, tam, Image.SCALE_SMOOTH);
            per = new ImageIcon(tamiimagen);
            return per;
        } else if (MostrarPrincipal.op3.equals("Mago")) {
            per = new ImageIcon(getClass().getResource("/imagen/mago.png"));
            Image image = per.getImage();
            Image tamiimagen = image.getScaledInstance(tamx, tam, Image.SCALE_SMOOTH);
            per = new ImageIcon(tamiimagen);
            return per;
        }
        return per;
    }

    public ImageIcon obtenerimagen5(int tam, int tamx) {
        ImageIcon per = new ImageIcon(getClass().getResource("/imagen/a.jpg"));
        Image imagen = per.getImage();
        Image tamanioimagen = imagen.getScaledInstance(tamx, tam, Image.SCALE_SMOOTH);
        per = new ImageIcon(tamanioimagen);
        return per;

    }

    public ImageIcon obtenerimagen6(int tam, int tamx) {
         ImageIcon per = null;
        if (MostrarPrincipal.op4.equals("Princesa")) {
            per = new ImageIcon(getClass().getResource("/imagen/princesa1.jpg"));
            Image image = per.getImage();
            Image tamiimagen = image.getScaledInstance(tamx, tam, Image.SCALE_SMOOTH);
            per = new ImageIcon(tamiimagen);
            return per;
        } else if (MostrarPrincipal.op4.equals("Guerrero")) {
            per = new ImageIcon(getClass().getResource("/imagen/Guerrero1.png"));
            Image image = per.getImage();
            Image tamiimagen = image.getScaledInstance(tamx, tam, Image.SCALE_SMOOTH);
            per = new ImageIcon(tamiimagen);
            return per;
        } else if (MostrarPrincipal.op4.equals("Mago")) {
            per = new ImageIcon(getClass().getResource("/imagen/mago1.jpg"));
            Image image = per.getImage();
            Image tamiimagen = image.getScaledInstance(tamx, tam, Image.SCALE_SMOOTH);
            per = new ImageIcon(tamiimagen);
            return per;
        }
        return per;
    }

    public ImageIcon obtenerimagen7(int tam, int tamx) {
        ImageIcon per = null;
        if (MostrarPrincipal.op5.equals("Princesa")) {
            per = new ImageIcon(getClass().getResource("/imagen/princesa.png"));
            Image image = per.getImage();
            Image tamiimagen = image.getScaledInstance(tamx, tam, Image.SCALE_SMOOTH);
            per = new ImageIcon(tamiimagen);
            return per;
        } else if (MostrarPrincipal.op5.equals("Guerrero")) {
            per = new ImageIcon(getClass().getResource("/imagen/Guerrero.png"));
            Image image = per.getImage();
            Image tamiimagen = image.getScaledInstance(tamx, tam, Image.SCALE_SMOOTH);
            per = new ImageIcon(tamiimagen);
            return per;
        } else if (MostrarPrincipal.op5.equals("Mago")) {
            per = new ImageIcon(getClass().getResource("/imagen/mago.png"));
            Image image = per.getImage();
            Image tamiimagen = image.getScaledInstance(tamx, tam, Image.SCALE_SMOOTH);
            per = new ImageIcon(tamiimagen);
            return per;
        }
        return per;
    }

    public ImageIcon obtenerimagen8(int tam, int tamx) {
             ImageIcon per = null;
        if (MostrarPrincipal.op6.equals("Princesa")) {
            per = new ImageIcon(getClass().getResource("/imagen/princesa1.jpg"));
            Image image = per.getImage();
            Image tamiimagen = image.getScaledInstance(tamx, tam, Image.SCALE_SMOOTH);
            per = new ImageIcon(tamiimagen);
            return per;
        } else if (MostrarPrincipal.op6.equals("Guerrero")) {
            per = new ImageIcon(getClass().getResource("/imagen/Guerrero1.png"));
            Image image = per.getImage();
            Image tamiimagen = image.getScaledInstance(tamx, tam, Image.SCALE_SMOOTH);
            per = new ImageIcon(tamiimagen);
            return per;
        } else if (MostrarPrincipal.op6.equals("Mago")) {
            per = new ImageIcon(getClass().getResource("/imagen/mago1.jpg"));
            Image image = per.getImage();
            Image tamiimagen = image.getScaledInstance(tamx, tam, Image.SCALE_SMOOTH);
            per = new ImageIcon(tamiimagen);
            return per;
        }
        return per;
    }

}
