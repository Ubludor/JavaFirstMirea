package ru.mirea.task10.n5;

public class Main {

    public static int kolchisel(int N)
    {
        int koln=1;
        if(N>9){return koln + kolchisel(N/10);}
        else {return 1;}

    }
    public static int sumcifr(int N)
    {
        int kolchisel= kolchisel(N);

        if(N>9){return N/((int)Math.pow(10,kolchisel-1)) + sumcifr(N%((int)Math.pow(10,kolchisel-1)));}
        else {return N;}

    }




    public static void main(String[] args) {

        int N = 111122;
        System.out.println(sumcifr(N));

        //String slovo = "AAAAA";

        // System.out.println(t8(slovo,slovo,slovo.length(),0));
        // t7(N,N);

        /* if (Is_it_simple_number(N,N-1)==0){
        System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }*/
        // System.out.println(sumcifr(N));
    }
}
