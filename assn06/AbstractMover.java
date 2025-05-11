package assn06;

import java.awt.Graphics;

public abstract class AbstractMover implements Mover {
    protected int x;
    protected int y;
    protected int xDirection;
    protected int yDirection;
    protected Sprite sprite;

    public AbstractMover(int startX, int startY, Sprite spirte)
    {
        x = startX;
        y = startY;
        this.sprite = spirte;
    }

    public void setMovementVector(int xIncrement, int yIncrement)
    {
        xDirection = xIncrement;
        yDirection = yIncrement;
    }

    public void draw(Graphics surface)
    {
        sprite.draw(surface, x, y);
        x += xDirection;
        y += yDirection;
    }
}
