package ru.mirea.task10.n7;

public class Main {

    public static int t7(int N,int n){

        if(n>0) {
            if (N % n == 0) {
                System.out.println(n);
                return t7(N,n-1);
            }
            else
            {return t7(N,n-1);}
        }
        else {
            return 0;
        }
    }


    public static void main(String[] args) {

        int N=100;

         t7(N,N);

    }
}
