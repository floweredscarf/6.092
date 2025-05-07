import java.awt.Color;
import java.awt.Graphics;

public class DrawGraphics {
    BouncingBox box;
    
    /** Initializes this class for drawing. */
    public DrawGraphics() {
        box = new BouncingBox(200, 50, Color.RED);
    }

    /** Draw the contents of the window on surface. Called 20 times per second. */
    public void draw(Graphics surface) {
        surface.drawLine(50, 50, 250, 250);
        box.draw(surface);
        surface.drawRect(100, 100, 50, 50);
        surface.drawArc(150, 150, 50, 50, 0, 360);
        surface.drawString("text", 50, 50);
        surface.drawOval(200, 200, 40, 20);
    }
} 