package homework_3;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args){
        // Method calls
        // Вызываете методы и проверяете результаты
        // После этого подгружаете все, как я вам и показывал
        // В ТГ в группе ДЗ ставите + с указанием номера домашки
        // Например, ДЗ3 +, ДЗ4 +
//        System.out.println("Введите номер месяца: ");
//        String name = input().nextLine();
        getInitialMsg();
//        checkOddOrEven(new Scanner(System.in).nextInt());
//        displayTimeOfYear(new Scanner(System.in).nextInt());
//        showOddNumbers();
//        summarize(new Scanner(System.in).nextInt());
//        summarizeSeven();
//        firstTen();
//        powerOfTwo();
//        showMultiplicationTable();
    }


    // Одно задание - один метод
    public static void getInitialMsg() {
        System.out.println("Введите номер месяца: ");
    }

    public static Scanner input(){
        return new Scanner(System.in);
    }

    public static void displayTimeOfYear(int month) {
        switch (month) {
            case 1, 2, 12:
                System.out.println("Winter");
                break;
            case 3, 4, 5:
                System.out.println("Spring");
                break;
            case 6, 7, 8:
                System.out.println("Summer");
                break;
            case 9, 10, 11:
                System.out.println("Autumn");
                break;
        }
    }

    public static void displayTimeOfYear2(int month) {
        if(month == 1 || month == 2 || month == 12){
            System.out.println("Winter");
        } else if(month == 3 || month == 4 || month == 5){
            System.out.println("Spring");
        } else if(month == 6 || month == 7 || month == 8){
            System.out.println("Summer");
        } else if(month == 9 || month == 10 || month == 11){
            System.out.println("Autumn");
        }
    }

    public static void checkOddOrEven(int number) {
        if(number%2==0){
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }

    public static void checkTemperature(int number) {
        if(number > -5){
            System.out.println("Тепло");}
        else if(number > -20 && number <= -5){
            System.out.println("Нормально");
        } else if(number <= -20){
            System.out.println("Холодно");
        }
    }

    public static void showRainbowColor(int number) {
        if(number == 1){
            System.out.println("Красный");
        } else if(number == 2){
            System.out.println("Оранжевый");
        } else if(number == 3){
            System.out.println("Желтый");
        } else if(number == 4){
            System.out.println("Зеленый");
        } else if(number == 5){
            System.out.println("Салатовый");
        } else if(number == 6){
            System.out.println("Голубой");
        } else if(number == 7){
            System.out.println("Синий");
        } else if(number == 8){
            System.out.println("Фиолетовый");
        } else if(number == 9){
            System.out.println("Розовый");
        }
    }

    public static void showOddNumbers() {
        for (int i = 0; i <= 99; i++) {
           if (i % 2 != 0){System.out.println(i);}
        }
    }

    public static void showNumbers() {
        for (int i = 5; i >= 1; i--) {
            System.out.println(i);
        }
    }

    public static void summarize(int number) {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    public static void summarizeSeven() {
        int number = 7;
        while (number <= 100) {
                System.out.println(number);
                number+=7;
        }
    }

    public static void firstTen() {
        int number = 0;
        for(int i = 0; i < 10; i++){
            System.out.println(number);
            number-=5;
        }
    }

    public static void powerOfTwo() {
        for(int i = 10; i <= 20; i++){
            System.out.println(i*i);
        }
    }

    public static void showMultiplicationTable() {
        for(int i = 1; i <= 10; i++){
            for (int y = 1; y <= 10; y++){
                System.out.println(i + "*" + y + "=" + i*y);
            }
        }
    }

}