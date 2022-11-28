package ru.access.parser;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        System.out.println("Введите число 1:" );
        int number1 = new Scanner(System.in).nextInt();
        System.out.println("Введите число 2:" );
        int number2 = new Scanner(System.in).nextInt();

        //расчет суммы
        int sum= number1+number2;
        System.out.println("Сумма = " +sum );

        //расчет разности
        int raz= number1-number2;
        System.out.println("Разность = " +raz);
        //расчет произведения
        int ymn= number1*number2;
        System.out.println("Произведение = "+ymn );

        //расчет деления
        double chas= (double)number1/number2 ;
        System.out.println("Частное = " +chas );


    }
}