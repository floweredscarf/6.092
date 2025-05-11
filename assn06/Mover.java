package assn06;

import java.awt.Graphics;

public interface Mover {
    public void setMovementVector(int xIncrement, int yIncrement);
    public void draw(Graphics surface);
}