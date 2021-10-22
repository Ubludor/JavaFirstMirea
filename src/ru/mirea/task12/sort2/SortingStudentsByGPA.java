package ru.mirea.task12.sort2;

public class SortingStudentsByGPA implements Comparator {
    public String gender;
    public int iDNumber;

    public SortingStudentsByGPA(String gender, int iDNumber) {
        this.gender = gender;
        this.iDNumber = iDNumber;
    }

    public String getGender() {
        return gender;
    }

    public int getiDNumber() {
        return iDNumber;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setiDNumber(int iDNumber) {
        this.iDNumber = iDNumber;
    }



    @Override
    public void quicksort(int[] array, int low, int high) {
        if (array.length == 0)
            return;//завершить выполнение если длина массива равна 0

        if (low >= high)
            return;//завершить выполнение если уже нечего делить

        // выбрать опорный элемент
        int middle = low + (high - low) / 2;
        int opora = array[middle];

        // разделить на подмассивы, который больше и меньше опорного элемента
        int i = low, j = high;
        while (i <= j) {
            while (array[i] < opora) {
                i++;
            }

            while (array[j] > opora) {
                j--;
            }

            if (i <= j) {//меняем местами
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        // вызов рекурсии для сортировки левой и правой части
        if (low < j)
            quicksort(array, low, j);

        if (high > i)
            quicksort(array, i, high);
    }
}