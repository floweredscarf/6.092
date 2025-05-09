import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class DrawGraphics {
    ArrayList<Bouncer> movingSprites = new ArrayList<Bouncer>();

    /** Initializes this class for drawing. */
    public DrawGraphics() {
        Rectangle box = new Rectangle(15, 20, Color.RED);
        movingSprites.add(new Bouncer(100, 170, box));
        movingSprites.get(0).setMovementVector(3, 1);
        Rectangle box1 = new Rectangle(15, 20, Color.BLUE);
        movingSprites.add(new Bouncer(100, 170, box1));
        movingSprites.get(1).setMovementVector(-3, 1);
    }

    /** Draw the contents of the window on surface. */
    public void draw(Graphics surface) {
        for (Bouncer movingSprite : movingSprites)
        {
            movingSprite.draw(surface);
        }
    }
}
