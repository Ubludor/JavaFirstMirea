package ru.mirea.task22;

public class ChairFabric {
    public Chair createChair(ChairType type)
    {
        Chair chair = null;
        switch (type)
        {
            case MAGIC:
                chair = new Magic();
                break;
            case MULTY:
                chair = new Multy();
                break;
            case VIKTORIAN:
                chair = new Victorian();
                break;
        }
        return chair;
    }

}
