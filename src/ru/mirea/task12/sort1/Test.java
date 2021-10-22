package ru.mirea.task12.sort1;

public class Test {
    public static void main(String[] args) {
        int[] array = {10, 2, 10, 3, 1, 2, 5};

        Students[] Sarray = new Students[10];
        Sarray[0] = new Students("t_34",123);

        Sarray[1] = new Students("ak_47",23);

        Sarray[2]=new Students("su_34",6788);

        Sarray[3]=new Students("tommahowk",56);

        Sarray[4]=new Students("Abrams",444);

        Sarray[5]=new Students("armata",7);

        Sarray[6]=new Students("t_80",434);

        Sarray[7] = new Students("cobra",98);

        Sarray[8] = new Students("yak_30",13);

        Sarray[9] = new Students("mig_29",654);





        for (int left = 0; left < Sarray.length; left++) {
            // Вытаскиваем значение элемента
            int value = Sarray[left].getiDNumber();
            // Перемещаемся по элементам, которые перед вытащенным элементом
            int i = left - 1;
            for (; i >= 0; i--) {
                // Если вытащили значение меньшее — передвигаем больший элемент дальше
                if (value < Sarray[i].getiDNumber()) {
                    Sarray[i + 1].setiDNumber( Sarray[i].getiDNumber());
                } else {
                    // Если вытащенный элемент больше — останавливаемся
                    break;
                }
            }
            // В освободившееся место вставляем вытащенное значение
            Sarray[i + 1].setiDNumber(value);
        }
        for(int i = 0;i<Sarray.length;i++)
        {
            System.out.println(Sarray[i].getiDNumber());
        }
    }
}
