package ru.mirea.task13.Task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class CollectionArrList {
    public void sort(ArrayList<String> arli )
    {
        String[] Stringarli = new String[arli.size()];
        for(int i=0;i<arli.size();i++)
        {
            Stringarli[i]= arli.get(i);
        }
        Arrays.sort(Stringarli);
        for(int i=0;i<arli.size();i++)
        {
            arli.set(i,Stringarli[i]);
        }

    }
    public String max(ArrayList<String> arli)
    {
        return arli.get(arli.size()-1);
    }
    public String min(ArrayList<String> arli)
    {
        return arli.get(0);
    }
    public void reverse(ArrayList<String> arli)
    {
        String[] Stringarli = new String[arli.size()];
        for(int i=0;i<arli.size();i++)
        {
            Stringarli[i]= arli.get(i);
        }
       // Arrays.sort(Stringarli);
        String bufer;
        for (int i=0;i<arli.size()/2;i++)
        {
            bufer=Stringarli[i];
            Stringarli[i]=Stringarli[arli.size()-1-i];
            Stringarli[arli.size()-1-i]=bufer;
        }
        for(int i=0;i<arli.size();i++)
    {
        arli.set(i,Stringarli[i]);
    }

    }
    public void shuffle(ArrayList<String> arli)
    {    String[] Stringarli = new String[arli.size()];
        for(int i=0;i<arli.size();i++)
        {
            Stringarli[i]= arli.get(i);
        }

        int index;String temp;
        Random random = new Random();
        for (int i = Stringarli.length - 1; i > 0; i--)
        {
            index = random.nextInt(i + 1);
            temp = Stringarli[index];
            Stringarli[index] = Stringarli[i];
            Stringarli[i] = temp;
        }
        for(int i=0;i<arli.size();i++)
        {
            arli.set(i,Stringarli[i]);
        }
    }
}
