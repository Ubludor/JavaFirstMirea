package ru.mirea.task7;

class Square extends Rectangle{
    protected double side = 1;

    public Square(){

        this.side=1;
        this.lenght=1;
        this.filled=false;
        this.widh=1;
        this.color="white";
    }

    public Square(double widh,double lenght){
        super(widh,lenght);
    }

    public Square(double side,double widh, double lenght) {
        super(widh, lenght);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void setWidh(double side) {
        super.setWidh(widh);
    }

    @Override
    public void setLenght(double side) {
        super.setLenght(lenght);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
