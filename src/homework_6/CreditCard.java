package homework_6;

public class CreditCard {
    public static void main(String[] args) {
        CreditCard alfa = new CreditCard(111333555, 2500);
        CreditCard mtb = new CreditCard(111335444, 500);
        CreditCard prior = new CreditCard(11133555, 15000);

        alfa.increaseSum(200);
        mtb.increaseSum(300);
        prior.reduceSum(1000);
        alfa.getAccountInfo();
        mtb.getAccountInfo();
        prior.getAccountInfo();
    }


    public int accountNumber = 0;
    public int accountSum=0;

    public CreditCard(int accountNumber, int accountSum){
        this.accountNumber = accountNumber;
        this.accountSum = accountSum;
    }

    public void increaseSum(int number){
        this.accountSum += number;
    }

    public void reduceSum(int number){
        this.accountSum -= number;
    }

    public void getAccountInfo(){
        System.out.println("Sum on the account: " + this.accountSum + "\n" + "Account Number: " + this.accountSum);
    }
}


