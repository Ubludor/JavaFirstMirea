package ru.mirea.task10.n8;

public class Main {

    public static String t8(String slovo1,String slovo2,int lenght,int index)
    {
        if(lenght!=index+1){
            if(slovo1.charAt(index)==slovo2.charAt(lenght-1-index)){
                return t8(slovo1,slovo2,lenght,index+1);
            }
            else{return "NO";}
        }
        else{return "Yes";}

    }

    public static void main(String[] args) {

        String slovo = "dAAdAAd";

        System.out.println(t8(slovo,slovo,slovo.length(),0));

    }
}
