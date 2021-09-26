package ru.mirea.task5.MEBEL;

public abstract class MEBEL {

    private String material = "dub";

    public String getMaterial() {
        return material;
    }

    public abstract void MEBELinfo();

}

class taburetka extends MEBEL
{
    private int hight = 1;

    public int getHight() {
        return hight;
    }

    public void setHight(int hight) {
        this.hight = hight;
    }

    @Override
    public void MEBELinfo(){}
}

class STOL extends MEBEL
{
    private double hight = 1.2;

    public void setHight(double hight) {
        this.hight = hight;
    }

    public double getHight() {
        return hight;
    }

    @Override
    public void MEBELinfo(){System.out.print("Материал - "+getMaterial());}
    public void STOLinfo()
    {
        MEBELinfo();
        System.out.println("Высота стола равна - " + getHight());
    }
}