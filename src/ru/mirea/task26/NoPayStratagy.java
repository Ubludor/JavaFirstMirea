package ru.mirea.task26;

public class NoPayStratagy implements UnderZeroble{
    @Override
    public void GoToUnderZero() {
        System.out.println("Нет оплаты");
    }
}
