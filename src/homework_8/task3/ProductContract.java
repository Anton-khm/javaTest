package homework_8.task3;

import java.util.Date;

public class ProductContract extends Registry{
    public int documentNumber;
    public String productType;
    public int quantity;
    public Date date;

    public ProductContract(int documentNumber, String productType, int quantity, Date date){
        this.documentNumber = documentNumber;
        this.productType = productType;
        this.quantity = quantity;
        this.date = date;
    }

    public ProductContract(){}
}
