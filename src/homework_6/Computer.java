package homework_6;

public class Computer {
    public static void main(String[] args) {
        Computer intel = new Computer(2500, "Intel");
        Computer amd = new Computer(5000, "AMD", 32, 1000);
    }

    public int price;
    public String model;
    public int RAM;
    public int HDD;

    public Computer(int price, String model) {
        this.price = price;
        this.model = model;
    }

    public Computer(int price, String model, int RAM, int HDD) {
        this.price = price;
        this.model = model;
        this.RAM = RAM;
        this.HDD = HDD;
    }

    public void display() {
        System.out.println("Price: " + this.price + "Model: " + this.model + "RAM: " + this.RAM + "HDD: " + this.HDD);
    }
}

