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

    void draw(){
        if (Color == ""){
            Color = "Blue";
        }
        if (Width <= 0){
            Width = 1;
        }
        if (Height <= 0){
            Height = 1;
        }

        System.out.println( "Color : " + getColor());


        for (int i = 0; i <getHeight() ; i++) {
            for (int j = 0; j < getWidth() ; j++) {
                System.out.print("#");
            }
            System.out.println(" ");
        }
    }
}
