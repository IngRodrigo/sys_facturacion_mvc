package utilidades;


import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;


public class Icono extends javax.swing.JLabel {
    int x, y;
    private String path;

    public Icono(JPanel panel, String path) {
        this.path = path;
        this.x = panel.getWidth();
        this.y = panel.getHeight();
        this.setSize(x, y);
    }

    public void paint(Graphics g) {
        ImageIcon img = new ImageIcon(getClass().getResource(path));
        g.drawImage(img.getImage(), 0, 0, x, y, null);

    }

}
