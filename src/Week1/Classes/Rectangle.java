package Week1.Classes;

public class Rectangle {
    // Fields
    private int Width;
    private int Height;
    private String Color;

    Rectangle(int Width, int Height, String Color) {
        this.Width = Width;
        this.Height = Height;
        this.Color = Color;
    }

    public int getWidth() {
        return Width;
    }

    public int getHeight() {
        return Height;
    }

    public String getColor() {
        return Color;
    }

    public void setWidth(int width) {
        Width = width;
    }

    public void setHeight(int height) {
        Height = height;
    }

    public void setColor(String color) {
        Color = color;
    }


}
