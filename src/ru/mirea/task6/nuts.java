package ru.mirea.task6;

public class nuts implements Priceable {
    private int price = 1;

    public nuts(int price)
    {
        this.price=price;
    }
    public nuts(){}

    public void getPrice()
    {
        System.out.println(price);
    }
}
