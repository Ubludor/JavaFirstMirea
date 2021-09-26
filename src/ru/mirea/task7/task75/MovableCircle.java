package ru.mirea.task7.task75;

public class MovableCircle extends MovablePoint implements Movable{
    private int radius=1;
    private MovablePoint center;


    MovableCircle(int x, int y, int xSpeed, int ySpeed) {
        super(x, y, xSpeed, ySpeed);
    }
    public String toString(){return null;}

    @Override
    public void moveUp() {
        super.moveUp();
    }

    @Override
    public void moveDown() {
        super.moveDown();
    }

    @Override
    public void moveLeft() {
        super.moveLeft();
    }

    @Override
    public void moveRight() {
        super.moveRight();
    }
}
