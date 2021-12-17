package ru.mirea.task19;

public class test19 {
    public static void main(String[] args) {
        try {
            RightTriangle tr = new RightTriangle(90, 89, 3);
        } catch(InvalidAngleException exc) {
            exc.printStackTrace();
            System.out.println("сумма углов не равна 90 градусам!");
        }
    }
}
