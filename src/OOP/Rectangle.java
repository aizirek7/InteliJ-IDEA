package OOP;

import java.io.PrintStream;

public class Rectangle {
    int top;
    int left;
    int width;
    int height;
    Rectangle(){
    }

    public Rectangle(int top, int left, int width) {
        this.top = top;
        this.left = left;
        this.width = width;
        height = width;

    }
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
        left = 0;
        top = 0;
    }
    public Rectangle(int top, int left, int width, int height) {
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }
    void InfoRectangle(){
        ((PrintStream) null).println("top: " + top + " left " + left + " width " + width + " height " + height);
    }
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle( 12, 13,12);
        rectangle.InfoRectangle();

    }
}
