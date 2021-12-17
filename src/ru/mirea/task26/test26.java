package ru.mirea.task26;

public class test26 {
    public static void main(String[] args) {
         PAY creditCart = new CreditCart();
         PAY electrnicWallet = new ElectronicWallet();

         creditCart.pay();
         electrnicWallet.pay();

    }
}
