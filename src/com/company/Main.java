package com.company;

public class Main {

    public static void main(String[] args) {
	// Задание 1 и 2
        int clientOS = 0 ;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }

        int clientAndroid = 1 ;
        if (clientAndroid == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }


        int clientDeviceYearOS = 2014;
        if (clientOS == 0 && clientDeviceYearOS <= 2014) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else {
            if (clientOS == 0 && clientDeviceYearOS > 2014) {
            System.out.println("Установите версию приложения для iOS по ссылке");
            }
        }

        int clientDeviceYearAnd = 2014;
        if (clientAndroid == 1 && clientDeviceYearAnd <= 2014) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            if (clientAndroid == 1 && clientDeviceYearAnd > 2014) {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }

    // Задание 3

        int year = 2022;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

    // Задание 4

        int deliveryDistance = 95;
        int deliveryTime = 1;
        if (deliveryDistance <=20) {
            System.out.println("Потребуется дней: " + deliveryTime);
        } else if (deliveryDistance >20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: " + (deliveryTime + 1));
        } else if (deliveryDistance >60 && deliveryDistance <=100) {
            System.out.println("Потребуется дней: " + (deliveryTime + 2));
        } else {
            System.out.println("Доставка невозможна");
        }

    // Задание 5

        int monthNumber  = 12;

        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца нет");
        }


        }
}
