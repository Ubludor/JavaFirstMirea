package ru.mirea.task12.sort3;

public interface Comparator {
    Student[] quickSort(Student[] students, int leftBorder, int rightBorder);
    void output(Student[] students);
}
