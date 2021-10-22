package ru.mirea.task10.n9;

public class Main {


    public static int t9(int one,int zero,int backnumber)
    {
        int i=0;
        if((one>0)&&(zero>0))
        {
            //System.out.println(1);
            t9(one-1,zero,1);
            //System.out.println(0);
            if(backnumber==0){return 0;}
            t9(one,zero-1,0);
        }
        else if((one>0)&&(zero<=0))
        {
            //System.out.println(1);
            t9(one-1,zero,1);
        }
        else if((zero>0)&&(one<=0)){
            //System.out.println(0);
            if(backnumber==0){return 0;}
            t9(one,zero-1,0);
        }
        else{
            System.out.println(1);
        }
        return  0;
    }



    public static void main(String[] args) {

        int zero =2;
        int one =2;
        t9(one,zero,2);

    }
}
