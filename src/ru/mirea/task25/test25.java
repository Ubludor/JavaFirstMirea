package ru.mirea.task25;

public class test25 {
    public static void main(String[] args) {
        Shape rect = new Rectangle();
        RedShapeDecorator rsDecorator = new RedShapeDecorator(rect);
        rsDecorator.setRedBorder();
        rsDecorator.draw();
    }
}
