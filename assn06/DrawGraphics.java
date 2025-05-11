package assn06;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class DrawGraphics {
    ArrayList<Mover> movers = new ArrayList<Mover>();

    /** Initializes this class for drawing. */
    public DrawGraphics() {
        Rectangle box = new Rectangle(15, 20, Color.RED);
        movers.add(new Bouncer(100, 170, box));
        movers.get(0).setMovementVector(3, 1);
        movers.add(new StraightMover(100, 170, box));
        movers.get(1).setMovementVector(3, -1);
        RoundRectangle box1 = new RoundRectangle(15, 20, 5, 5, Color.BLUE);
        movers.add(new Bouncer(200, 170, box1));
        movers.get(2).setMovementVector(-3, 1);
        movers.add(new StraightMover(200, 170, box1));
        movers.get(3).setMovementVector(-3, -1);
    }

    /** Draw the contents of the window on surface. */
    public void draw(Graphics surface) {
        for (Mover mover : movers)
        {
            mover.draw(surface);
        }
    }
}
