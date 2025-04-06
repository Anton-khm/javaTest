package homework_7;

import java.util.Arrays;

public class Phone {
    public static void main(String[] args) {
        Phone phone = new Phone(375293335, "Samsung");
        System.out.println(phone.model);
        System.out.println(phone.weight);
        System.out.println(phone.number);
        phone.receiveCall("Ivan");
        phone.receiveCall("Anton", 3745533);
        phone.getTelephoneNumber();
        phone.sendMessage(345354543, 45353535, 54354353, 5443);
    }

    public long number;
    public String model;
    public int weight;

    public Phone(){}

    public Phone(long number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(long number, String model, int weight) {
        this(number, model);
        this.weight = weight;
    }

    public void receiveCall(String name){
        System.out.println("Calling " + name);
    }

    public void getTelephoneNumber(){
        System.out.println("Telephone Number " + this.number);
    }

    public void receiveCall(String name, int number2){
        System.out.println("Calling " + name + " With Telephone Number " + number2);
    }

    public void sendMessage(int ... numbers){
        System.out.println("Sending messages to: " + Arrays.toString(numbers));
    }
}
