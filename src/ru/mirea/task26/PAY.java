package ru.mirea.task26;

public class PAY {
    UnderZeroble underZeroble;
    public void pay()
    {
        underZeroble.GoToUnderZero();
    }
}


class CreditCart extends PAY
{
    public CreditCart()
    {
        this.underZeroble = new UnderZeroPayStratagy();
    }
}
class ElectronicWallet extends PAY
{
    public ElectronicWallet()
    {
        this.underZeroble = new NoPayStratagy();
    }
}