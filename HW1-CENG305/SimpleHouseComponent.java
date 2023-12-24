import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.Polygon;
import java.awt.BasicStroke;
import java.awt.geom.Line2D;
import javax.swing.JComponent;

public class SimpleHouseComponent extends JComponent {
    public void paintComponent(Graphics g) {

        Graphics2D g2 = (Graphics2D) g;

        // Draw the house structure
        g2.setColor(Color.BLUE);
        Rectangle houseBody = new Rectangle(100, 150, 200, 150);
        g2.fill(houseBody);

        // Draw the roof
        int[] xPoints = {100, 200, 300};
        int[] yPoints = {150, 50, 150};
        Polygon roof = new Polygon(xPoints, yPoints, 3);
        g2.setColor(Color.RED);
        g2.fill(roof);

        // Draw the door
        g2.setColor(Color.GREEN);
        Rectangle door = new Rectangle(170, 220, 60, 80);
        g2.fill(door);

        // Draw the window
        g2.setColor(Color.YELLOW);
        Rectangle window = new Rectangle(120, 220, 40, 40);
        g2.fill(window);


        g2.setColor(Color.BLACK);
        g2.setStroke(new BasicStroke(2));
        g2.draw(new Line2D.Double(140, 220, 140, 260));
        g2.draw(new Line2D.Double(120, 240, 160, 240));
    }
}
