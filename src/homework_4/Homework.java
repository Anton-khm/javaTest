package homework_4;

import java.util.Arrays;
import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        // Code
//        checkNumberInArray();
//        fullArray(15);
//        compareArrays();
//        showTwoRandomArrays();
//        replaceWithZeros();
        sortArrayOfNames();
    }

    public static void checkNumberInArray(){
        // Создать одномерный массив
        // Заполнить его определенными числами
        // Потом использовать класс Сканнер и попросить у пользователя ввести любое число
        // Проверить есть ли это число в массиве и уже вывести массив без этого числа
        // Создать новый массив (желательно)

        int[] initialValues = new int[6];

        for (int index = 0; index < initialValues.length; index++){
            System.out.print("You must enter " + initialValues.length + " integer numbers. " +
                    "initialValues[" + (index + 1) + "]: ");
            initialValues[index] = input().nextInt();
        }

        // КАК МОЖНО ОТСОРТИРОВАТЬ МАССИВ
        // Вначале отсортировать массив по возрастанию, -9, 0, 5, 10
        // Использовать вложенный в класс Arrays бинарный пойск
        // Бинарный пойск работает лишь в отсортированных массивах

        System.out.print("Please, enter an integer number and we will check whether such value exists in the array: ");
        int value = input().nextInt();
        int counter = 0;

        for (int initialValue : initialValues) {
            if (initialValue == value) {
                // Подсчитывать количество совпадений в массиве
                counter++;
            }
        }

        if (counter == 0){
            System.out.println("We couldn't find any matches in the array. There is no need for changes.");
            showIntArray(initialValues);
        } else {
            if (counter < initialValues.length){
                int[] newArray = new int[initialValues.length - counter];

                for (int index = 0, newIndex = 0; index < initialValues.length; index++){
                    if (initialValues[index] != value){
                        newArray[newIndex] = initialValues[index];
                        newIndex++;
                    }
                }

                showIntArray(newArray);
            } else {
                System.out.println("You have entered a value that matches all elements of the array.");
                System.out.println("So far, there are no elements anymore.");
            }
        }
    }

    public static void showIntArray(int[] initialValues){
        for (int index = 0; index < initialValues.length; index++){
            System.out.println("initialValues[" + index +"]: " + initialValues[index]);
        }
    }

    public static Scanner input(){
        return new Scanner(System.in);
    }

    public static void fullArray(int customLength){
        double[] newArr = new double[customLength];

        for (int index = 0; index < customLength; index++){
            newArr[index] = Math.round(Math.random()*10);
        }
        System.out.println("The array is: " + Arrays.toString(newArr));

//        double min = newArr[0];
//        for (double elem : newArr) {
//            if (min > elem) {
//                min = elem;
//            }
//        }
//        System.out.println("The lowest number in the array is: " + min);

//        double max = newArr[0];
//        for (double elem : newArr) {
//            if (max < elem) {
//                max = elem;
//            }
//        }
//        System.out.println("The biggest number in the array is: " + max);

        double sum = 0;
        for (double elem : newArr) {
            sum += elem;
        }
        System.out.println("The avarage value in the array is: " + sum/newArr.length);
    }

    public static void compareArrays(){
        double[] arr1 = new double[5];
        double[] arr2 = new double[5];
        double sumArr1 = 0;
        double sumArr2 = 0;

        for (int index = 0; index < arr1.length; index++){
            arr1[index] = Math.round(Math.random()*10);
            sumArr1 += arr1[index];
        }
        System.out.println("The array is: " + Arrays.toString(arr1));

        for (int index = 0; index < arr2.length; index++){
            arr2[index] = Math.round(Math.random()*10);
            sumArr2 += arr2[index];
        }
        System.out.println("The array is: " + Arrays.toString(arr2));

        if(sumArr1/arr1.length == sumArr2/arr2.length){
            System.out.println("The average values of the arrays are equal");
        } else if(sumArr1/arr1.length > sumArr2/arr2.length){
            System.out.println("The average value of the array 1 is bigger than the average value of the array 2");
        } else {
            System.out.println("The average value of the array 2 is bigger than the average value of the array 1");
        }
    }

    public static void showTwoRandomArrays(){
        System.out.println("Please enter the array length between 5 and 10");
        int value = input().nextInt();


        if(value <= 5 || value > 10){
            System.out.println("The input number is not correct");
            System.out.println("Please enter the array length between 5 and 10: ");
            value = input().nextInt();}
        else{
            double[] arr1 = new double[value];
            int count = 0;
            double[] arr2 = new double[]{};

            for (int index = 0; index < value; index++){
                arr1[index] = Math.round(Math.random()*10);
                if(arr1[index]%2==0){
                    count++;
                    arr2 = new double[count];
                    arr2[count-1] = arr1[index];
                }
            }
            System.out.println("The array1 is: " + Arrays.toString(arr1));
            System.out.println("The array2 is: " + Arrays.toString(arr2));
        }
    }

    public static void replaceWithZeros(){
        System.out.print("Please enter the array length: ");
        int value = input().nextInt();
        int[]array = new int[value];
        System.out.println("Enter elements of the array: ");
        for (int index = 0; index < array.length; index++){
            array[index] = input().nextInt();
        }
        System.out.println("The array is: " + Arrays.toString(array));
        for (int index = 0; index < array.length; index++){
            if(index % 2 != 0){
                array[index] = 0;
            }
        }
        System.out.println("The array is: " + Arrays.toString(array));
    }

    public static void sortArrayOfNames(){
        System.out.print("Please enter the array length: ");
        int value = input().nextInt();
        String[]array = new String[value];
        System.out.println("Enter elements of the array: ");
        for (int index = 0; index < array.length; index++){
            array[index] = input().nextLine();
        }
        System.out.println("The array is: " + Arrays.toString(array));
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length - 1 -i; j++){
                if (array[j].length() > array[j+1].length()) {
                    String temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        System.out.println("The array is: " + Arrays.toString(array));
    }
}
