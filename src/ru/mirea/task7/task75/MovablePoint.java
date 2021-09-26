package ru.mirea.task7.task75;

public class MovablePoint implements Movable {

    protected int x=0;
    protected int y=0;
    protected int xSpeed;
    protected int ySpeed;

    MovablePoint(int x,int y,int xSpeed,int ySpeed)
    {
        this.x=x;
        this.y=y;
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }

    public String toString(){return null;}

    @Override
    public void moveUp() {

    }

    @Override
    public void moveDown() {

    }

    @Override
    public void moveLeft() {

    }

    @Override
    public void moveRight() {

    }
}
