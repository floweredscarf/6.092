package Graphics;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class DrawGraphics {
    ArrayList<BouncingBox> boxes = new ArrayList<BouncingBox>();
    
    /** Initializes this class for drawing. */
    public DrawGraphics() {
        boxes.add(new BouncingBox(200, 50, Color.RED));
        boxes.get(0).setMovementVector(1, 0);
        boxes.add(new BouncingBox(200, 50, Color.BLUE));
        boxes.get(1).setMovementVector(0, -2);
        boxes.add(new BouncingBox(200, 50, Color.GREEN));
        boxes.get(2).setMovementVector(1, -2);
    }

    /** Draw the contents of the window on surface. Called 20 times per second. */
    public void draw(Graphics surface) {
        surface.drawLine(50, 50, 250, 250);
        for (BouncingBox box : boxes)
        {
            box.draw(surface);
        }
        surface.drawRect(100, 100, 50, 50);
        surface.drawArc(150, 150, 50, 50, 0, 360);
        surface.drawString("text", 50, 50);
        surface.drawOval(200, 200, 40, 20);
    }
} 