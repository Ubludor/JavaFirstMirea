package ru.mirea.task10.n6;

public class Main {

    public static int Is_it_simple_number(int N,int n)
    {
        //  n--;
        if(n>1) {
            if (N % n == 0) {
                return 1;
            } else {
                return 0 + Is_it_simple_number(N, n - 1);
            }
        }
        else {
            return 0;
        }
    }


    public static void main(String[] args) {
        int N = 5;

        if (Is_it_simple_number(N, N - 1) == 0)
        {System.out.println("Yes");}
        else
        {System.out.println("NO");}

    }
}
