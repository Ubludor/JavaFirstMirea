package ru.mirea.task5.DISH;

public abstract class Dish {
   private int weight = 1;
    private String color = "white";

    public String getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }

    public Dish(int weight, String color) {
        this.color = color;
        this.weight = weight;
    }

    public abstract void dishinfo();



    //public void iteminfo()
    //{
      //  System.out.print(getColor()+" "+getWeight());
    //}

}

class Cup extends Dish
{
    private int radius=1;

    public Cup(int weight, String color) {
        super(weight, color);
    }
    public Cup(int radius,int weight,String color) {super(weight,color); this.radius=radius;}
    @Override
    public void dishinfo() {System.out.println("Цвет предмета - "+getColor()+"Вес предмета - "+getWeight());}

    public int getRadius() {
        return radius;
    }

    public void Cupinfo() {
        System.out.print("Радиус чашки равен - "+getRadius());
        dishinfo();
    }
}

class Teapot extends Dish
{
    private int volume = 1000;

    public Teapot(int weight,String color){ super(weight, color);}

    public int getVolume() {
        return volume;
    }

    @Override
    public void dishinfo() {System.out.print("Цвет предмета - "+getColor()+"Вес предмета - "+getWeight());}

    public void Teapotinfo() {
        System.out.print("Объем чайника равен - "+getVolume());



        dishinfo();
    }
}