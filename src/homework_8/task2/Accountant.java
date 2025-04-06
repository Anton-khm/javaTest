package homework_8.task2;

public class Accountant implements Work {
    public static void main(String[] args) {
        Director d = new Director();
        d.work();
    }

    public void work() {
        System.out.println("I am accountant");
    }
}
