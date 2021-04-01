package com.company;

import java.nio.file.Watchable;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//Домашнее задание №3
public class Main {

    public static void main(String[] args) {

/*
	//Задание №1
        System.out.println("Задание 1");
        int num;
        for(num = 1; num < 100; num+=2)
            System.out.print(" "+ num);


    //Задание №2
        System.out.println("\n");
        System.out.println("Задание 2");
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите значение n:");
        int n = sc.nextInt();
        int i;
        int factorial = 1;
        for(i = 1; i < n + 1; i++ )
            factorial = factorial * i;
        System.out.println("n="+ n);
        System.out.println("n!="+ factorial);


        //Задание 3
        System.out.println("Задание 3");
        //Пункт 1
        System.out.println("Пункт 1");
        int num1 = 1;
        while(num1 < 100){
            System.out.print(" "+ num1);
            num1+=2;}

        //Пункт 2
        System.out.println("\n");
        System.out.println("Пункт 2");
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Введите значение n:");
        int n1 = sc1.nextInt();
        int i1 = 1;
        int factorial1 = 1;
        while(i1 < n1 + 1){
            factorial1 = factorial1 * i1;
            i1++;}
        System.out.println("n="+ n1);
        System.out.println("n!="+ factorial1);


        //Задание 4
        System.out.println("Задание 4");
        //Пункт 1
        System.out.println("Пункт 1");
        int num2 = 1;
        do{
            System.out.print(" "+ num2);
            num2+=2;}
        while(num2<100);

        //Пункт 2
        System.out.println("\n");
        System.out.println("Пункт 2");
        Scanner sc2 = new Scanner(System.in);
        System.out.print("Введите значение n:");
        int n2 = sc2.nextInt();
        int i2 = 1;
        int factorial2 = 1;
        do{
            factorial2 = factorial2 * i2;
            i2++;}
        while(i2 < n2 + 1);
        System.out.println("n="+ n2);
        System.out.println("n!="+ factorial2);

        //Задание 5
        System.out.println("Задание 5");
        int counter;
        int result = 1;
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Введите значение x:");
        int varX = Scanner.nextInt();
        System.out.print9("Введите значение n:");
        int varN = Scanner.nextInt();
        for(counter = 1; counter < varN + 1; counter++)
            result = result * varX;
        System.out.println("x^n="+ result);


        //Задание 6
        System.out.println("Задание 6");
        int number = 0;
        int numberCounter;
            System.out.print("Последовательность:");
        for(numberCounter = 1; numberCounter < 11; numberCounter++){
            System.out.print(" " + number);
            number-=5;}

        //Задание 7
        System.out.println("Задание 7");
        Scanner Input = new Scanner(System.in);
        System.out.print("Введите число, таблицу умножения на которое вы хотите вывести:");
        int multiplicationNumber = Input.nextInt();
        int numbers;
        int multiplicationResult;
        for(numbers = 1; numbers < 11; numbers++) {
            multiplicationResult = numbers * multiplicationNumber;
            System.out.println( multiplicationNumber + "+" + numbers + "=" + multiplicationResult );
        }

        //Задание 8
        System.out.println("Задание 8");
        int[]oddArray = new int[10];
        int i;
        int oddNumber = 1;
        for(i=0;i<oddArray.length;i++){
            oddArray[i] = oddNumber;
            oddNumber+=2;
        }
        System.out.println(Arrays.toString(oddArray));  */

   /*  //Задание 9
        System.out.println("Задание 10");
        Scanner ScannerN = new Scanner(System.in);
        System.out.print("Введите размерность массива:");
        int N = ScannerN.nextInt();
        int[]Array = new int[N];
        int min = 100;
        int i;
        Random rnd = new Random();
        for(i = 0; i < Array.length; i++)
            Array[i] = rnd.nextInt(5);

        System.out.print("Массив: " + Arrays.toString(Array));
        for(i = 0; i < Array.length; i++) {
            if(Array[i] < min) {
                min = Array[i];
            }
        }
        System.out.print("Минимальные элементы массива: ");
        for(i=0 ; i < Array.length; i++ ){
            if( Array[i] == min)
                System.out.print(" " + Array[i]);
        }

     /*   //Задание 10
        System.out.println("Задание 10");
        Scanner ScannerN = new Scanner(System.in);
        System.out.print("Введите размерность массива:");
        int N = ScannerN.nextInt();
        int[]Array = new int[N];
        int max = 0;
        int i;
        Random rnd = new Random();
        for(i = 0; i < Array.length; i++)
            Array[i] = rnd.nextInt(5);

        System.out.print("Массив: " + Arrays.toString(Array));
        for(i = 0; i < Array.length; i++) {
            if(Array[i] > max) {
                max = Array[i];
            }
        }
        System.out.print("Максимальные элементы массива: ");
        for(i=0 ; i < Array.length; i++ ){
            if( Array[i] == max)
                System.out.print(" " + Array[i]);
        }  */

   /*     //Задание 11
        System.out.println("Задание 11");
        Scanner ScannerN = new Scanner(System.in);
        System.out.print("Введите размерность массива:");
        int N = ScannerN.nextInt();
        int[]Array11 = new int[N];
        Random rnd = new Random();
        for(int i = 0; i < Array11.length; i++)
            Array11[i] = rnd.nextInt(100);
        System.out.print("Изначальный массив: " + Arrays.toString(Array11));

        int minIndex = 0;
        for (int i = 0; i < Array11.length; i++)
        {
            if (Array11[i] < Array11[minIndex])
                minIndex = i;
        }

        int maxIndex = 0;
        for (int i = 0; i < Array11.length; i++)
        {
            if (Array11[i] > Array11[maxIndex])
                maxIndex = i;
        }


        int temp;
            temp = Array11[minIndex];
            Array11[minIndex] = Array11[maxIndex];
            Array11[maxIndex] = temp;

        System.out.println("Новый массив" + Arrays.toString(Array11));       */
/*
        //Задание 12
        System.out.println("Задание 12");
        Scanner ScannerN = new Scanner(System.in);
        System.out.print("Введите размерность массива:");
        int N = ScannerN.nextInt();
        int[]Array12 = new int[N];
        int sum = 0;
        Random rnd = new Random();
        for(int i = 0; i < Array12.length; i++) {
            Array12[i] = rnd.nextInt(100);
            sum = sum + Array12[i];
        }
        System.out.print("Массив: " + Arrays.toString(Array12));
        double average = 0;
        average = sum / N;
        System.out.print("Среднее арифметическое:" + average);

 */

        //Задание 13
        System.out.println("Задание 13");
        String[][] Chess = new String[8][8];
        int i, j;
        for (i = 0; i < Chess.length; i++) {
            for (j = 0; j < Chess.length; j++) {
                if (i % 2 == 0 && j % 2 != 0) {
                    Chess[i][j] = "B";
                    //  System.out.print(Chess[i][j]);
                } else if (i % 2 != 0 && j % 2 == 0) {
                    Chess[i][j] = "W";
                    //System.out.println(Chess[i][j]);
                }
                else if (i % 2 == 0 || j % 2 != 0) {
                    Chess[i][j] = "B";
                    //System.out.println(Chess[i][j]);
                }
            }
        }
        for (i = 0; i < Chess.length; i++) {
            for (j = 0; j < Chess[i].length; j++)
                System.out.print(Chess[i][j] + " ");
            System.out.println();
        }
    }
}




