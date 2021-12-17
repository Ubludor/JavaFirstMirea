package ru.mirea.task18;

import javax.lang.model.element.Name;
import java.util.Collections;
import java.util.Scanner;

//ошибка если длина инн меньше 4

public class OnlineStore {

    Scanner sc = new Scanner(System.in).useDelimiter("\\n");
    String Name;
    String INN;

    OnlineStore() throws INN_Exception {
        System.out.println("Введите ваше имя");
        Name = sc.nextLine();

        while (true) {
            System.out.println("Введите ваш ИНН");
            INN = sc.nextLine();
            try {
                if (INN.length() > 4) {
                    throw new INN_Exception("INN is > 4 symbols");
                }
                else
                {
                    break;
                }
            } catch (INN_Exception im) {
                System.out.println("ERROR : " + im.getMessage());

            }
        }
        System.out.println(Name+", ваш заказ выполняется!");
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getINN() {
        return INN;
    }

    public void setINN(String INN) {
        this.INN = INN;
    }
}
