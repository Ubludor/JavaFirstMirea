package ru.mirea.task3.lab2;

public class Human {
    private int head =1;
    private int hend =2;
    private int leg =2;

    public Human(int head, int hend, int leg)
    {
        this.head=head;
        this.hend=hend;
        this.leg=leg;
    }

    public Human(int head, int hend)
    {
        this.head=head;
        this.hend=hend;

    }
    public Human(int head)
    {
        this.head=head;
    }

    public Human()
    {

    }

    public int getHead() {
        return head;
    }

    public int getHend() {
        return hend;
    }

    public int getLeg() {
        return leg;
    }

    public void setHead(int head) {
        this.head = head;
    }

    public void setHend(int hend) {
        this.hend = hend;
    }

    public void setLeg(int leg) {
        this.leg = leg;
    }
}
