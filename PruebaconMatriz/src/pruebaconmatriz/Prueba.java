package pruebaconmatriz;

import java.awt.Image;
import javax.swing.ImageIcon;

public class Prueba {

    public int ass = 0;
    public int oss = 0;

    public Prueba(int as, int os) {

        this.ass = as;
        this.oss = os;
        
    }

    public Prueba() {

    }

    public ImageIcon obtenerimagen(int tamx,int tamy) {

        ImageIcon per = new ImageIcon(getClass().getResource("/imagen/corazon.png"));
        Image image = per.getImage();
        Image tamiimagen = image.getScaledInstance(tamx, tamy, Image.SCALE_SMOOTH);
        per = new ImageIcon(tamiimagen);
        return per;

    }
     public ImageIcon obtenerimagen(int tamy) {

        ImageIcon per = new ImageIcon(getClass().getResource("/imagen/corazon.png"));
        Image image = per.getImage();
        Image tamiimagen = image.getScaledInstance(198, tamy, Image.SCALE_SMOOTH);
        per = new ImageIcon(tamiimagen);
        return per;

    }
}
