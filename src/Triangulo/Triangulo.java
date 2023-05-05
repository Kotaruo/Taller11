package Triangulo;
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class TriangulosApplet extends Applet {

	public void paint(Graphics g) {
        // Triángulo rojo
        g.setColor(Color.RED);
        int[] x1 = {50, 100, 150};
        int[] y1 = {150, 50, 150};
        g.fillPolygon(x1, y1, 3);

        // Triángulo verde
        g.setColor(Color.GREEN);
        int[] x2 = {200, 250, 300};
        int[] y2 = {150, 50, 150};
        g.fillPolygon(x2, y2, 3);
    }
}
