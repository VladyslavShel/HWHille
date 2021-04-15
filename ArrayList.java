package com.company;

import java.util.Scanner;

public class ArrayList {
    Scanner sc = new Scanner(System.in);
    int tempSize = sc.nextInt();
    Object[] array = new Object[tempSize];
    int pointer = 0;



    /*
    Добавление
    */
    public void add() {
        System.out.println("Введите данные:");
        for(int i = 0; i < tempSize + 1; i++) {
            String item = sc.nextLine();
            if (pointer == array.length - 1)
                resize(array.length * 2);
            array[pointer++] = item;
        }
    }

    /*
    Get
    */
    public String get()
    {
        System.out.println("Введите индекс:");
        int index = sc.nextInt();
        System.out.println(array[index]);
        return (String) array[index];
    }

    /*
    Удаление
    */
    public void remove()
    {
        System.out.println("Введите индекс:");
        int index = sc.nextInt();
        for (int i = index; i < pointer; i++)
            array[i] = array[i + 1];
        array[pointer] = null;
        pointer--;
    }

    /*Количество элементов*/

    public int size()
    {
        System.out.println("Количество элементов в массиве: " + pointer);
        return pointer;
    }

    /*Вспомогательный метод*/
    private void resize(int newLength)
    {
        Object[] newArray = new Object[newLength];
        System.arraycopy(array, 0, newArray, 0, pointer);
        array = newArray;
    }
}
