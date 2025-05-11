package assn06;

import java.awt.Color;
import java.awt.Graphics;

public class RoundRectangle implements Sprite {
    private int width;
    private int height;
    private int arcWidth;
    private int arcHeight;
    private Color color;

    public RoundRectangle(int width, int height, int arcWidth, int arcHeight, Color color)
    {
        this.width = width;
        this.height = height;
        this.arcWidth = arcWidth;
        this.arcHeight = arcHeight;
        this.color = color;
    }
    public void draw(Graphics surface, int x, int y)
    {
        surface.setColor(color);
        surface.fillRoundRect(x, y, width, height, arcWidth, arcHeight);
        surface.setColor(Color.BLACK);
    }

    public int getWidth()
    {
        return width;
    }

    public int getHeight()
    {
        return height;
    }
}
