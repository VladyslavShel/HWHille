package com.company;

import java.util.Scanner;

public class Car {
    float capacity;
    float remaining;
    float consumption;
    float amountOfFuel = 0;
    float distance = 0;
    float distanceForAmount = 0;
    float amountFuel = 0;
    float OdesaKievDist = 479;
    float cost = 0;
    int odesaOzero = 178;
    int ozeroShashov = 153;
    int shashkovKiev = 148;
    float temp;
    float costTemp;
    float totalCost;
    public Car(){
        this.creation();
        this.refueling();
        //this.detected();
        //this.amountOfFuel();
        this.OdesaKiev();
    }
    public void creation() {
        System.out.println("Введите параменты авто:");
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Введите объём бака:");
        capacity = Scanner.nextFloat();
        while(capacity <= 0){
            System.out.println("Объем не может быть меньше либо равен 0. Введите новое значение: ");
            capacity = Scanner.nextFloat();}
        System.out.println("Введите остаток топлива в баке:");
        remaining = Scanner.nextFloat();
        while(remaining < 0 || remaining > capacity){
            System.out.println("Остаток не может быть больше объёма бака, или же меньше 0. Введите новое значение: ");
            remaining = Scanner.nextFloat();}
        System.out.println("Введите расход топлива на 100 км:");
        consumption = Scanner.nextFloat();
        while(consumption <= 0){
            System.out.println("Расход должен быть больше 0. Введите новое значение: ");
            consumption = Scanner.nextFloat();}
    }

    public void refueling() {
        amountOfFuel = capacity - remaining;
                remaining = capacity;
        System.out.println("Бак заправлен на "+amountOfFuel+" л. Залито "+remaining+" л./"+capacity+" л.");
    }
    public void detected() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество пройденных километров: ");
        distance = sc.nextFloat();
        while(distance <= 0)
        {
            System.out.println("Расстояние должно быть больше 0. Введите новое значение: ");
            distance = sc.nextFloat();
        }
        remaining =  remaining - ((consumption / 100) * distance);
        System.out.println("Остаток топлива в баке: " + remaining + " л. Пройденная дистанция: "+distance+" км.");
    }
    public void amountOfFuel()
    {
        Scanner scAmount = new Scanner(System.in);
        System.out.println("Введите пройденную дистанцию в километрах:");
        distanceForAmount = scAmount.nextFloat();
        while(distanceForAmount <= 0)
        {
            System.out.println("Расстояние должно быть больше 0. Введите новое значение: ");
            distanceForAmount = scAmount.nextFloat();
            }
            amountFuel = capacity - (remaining - ((consumption / 100) * distanceForAmount));
            System.out.print("Дозаправить до полного бака: " + amountFuel + " л. Пройденная дистанция: "+distanceForAmount+" км.");


    }
    public void OdesaKiev()
    {
        System.out.print("Расстояние от Киева до Одессы : " + OdesaKievDist + " км.");
        Scanner Cost = new Scanner(System.in);
        System.out.println("Введите цену за литр топлива:");
        cost = Cost.nextFloat();
        while(cost <= 0) {
            System.out.print("Цена должна быть больше 0. Введите новую цену:");
            cost = Cost.nextFloat();
        }
        System.out.println("Изначальное количество топлива: " + remaining + " л. Залит полный бак.");
        remaining = remaining - (consumption/100 * odesaOzero);
        temp = capacity - remaining;
        System.out.println("Количество топлива по приезду в Кривое Озеро: " + remaining +" л. Для полного бака нужно долить: " + temp + " л.");
        costTemp = cost*temp;
        totalCost = costTemp;
        System.out.println("Заправляем полный бак. Бак заправлен на "+ costTemp +" грн.");
        remaining = remaining + temp;
        remaining = remaining - (consumption/100 * ozeroShashov);
        temp = capacity - remaining;
        System.out.println("Количество топлива по приезду в Жашков: " + remaining + " л. Для полного бака нужно долить: " + temp + " л.");
        costTemp = cost*temp;
        totalCost = totalCost + costTemp;
        System.out.println("Заправляем полный бак. Бак заправлен на "+ costTemp + " грн.");
        remaining = remaining + temp;
        remaining = remaining - (consumption/100 * shashkovKiev);
        System.out.println("Количество топлива по приезду в Киев: " + remaining + " л.");
        System.out.println("Общая стоимость топлива за всю поездку: " + totalCost + " грн.");

    }
}
