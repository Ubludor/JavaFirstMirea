package ru.mirea.task12.sort2;



public class Test {

    private static void qsort(SortingStudentsByGPA[] s) {
        int [] arraynumber= new int[s.length];
        for(int i=0;i<s.length;i++)
        {
            arraynumber[i]=s[i].getiDNumber();
        }

        s[0].quicksort(arraynumber,0,s.length-1);

        SortingStudentsByGPA bufer;

        for(int i=0;i< s.length;i++)
        {

            for(int j=0;j<s.length;j++)
            {
                if(arraynumber[i]==s[j].getiDNumber())
                {
                    bufer= s[i];
                    s[i]=s[j];
                    s[j]=bufer;

                    break;
                }
            }
        }

        for(int i=0;i<s.length;i++)
        {
            System.out.println(s[i].getGender()+" - "+s[i].getiDNumber());

        }


    }

    public static void main(String[] args) {
        SortingStudentsByGPA[] s= new SortingStudentsByGPA[10];
        s[0] = new SortingStudentsByGPA("t_34",123);
        s[1] = new SortingStudentsByGPA("ak_47",23);
        s[2]=new SortingStudentsByGPA("su_34",6788);
        s[3]=new SortingStudentsByGPA("tommahowk",56);
        s[4]=new SortingStudentsByGPA("Abrams",444);
        s[5]=new SortingStudentsByGPA("armata",777777);
        s[6]=new SortingStudentsByGPA("t_80",434);
        s[7] = new SortingStudentsByGPA("cobra",98);
        s[8] = new SortingStudentsByGPA("yak_30",13);
        s[9] = new SortingStudentsByGPA("mig_29",654);

        qsort(s);

    }
}
