package homework_8.task3.documents;

import homework_8.task3.registry.Registry;

import java.util.Date;

public class ProductContract extends BaseDocument {
    private String productType;
    private int quantity;

    public ProductContract(int documentNumber, Date documentDate, String productType, int quantity) {
        super(documentNumber, documentDate);
        this.productType = productType;
        this.quantity = quantity;
    }

    public ProductContract(){}

    @Override
    public void printInfo() {
        System.out.println("Product Contract: ");
        System.out.println("Product Type: " + productType);
        System.out.println("Document Number: " + documentNumber);
        System.out.println("Document Date: " + documentDate);
        System.out.println("Quantity: " + quantity);
    }
}
