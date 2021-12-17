package ru.mirea.task22;

public class test22 {
    public static void main(String[] args) {
        Chair chair;
        ChairFabric chF = new ChairFabric();
        chair = chF.createChair(ChairType.MULTY);
        chair.name();
    }
}
