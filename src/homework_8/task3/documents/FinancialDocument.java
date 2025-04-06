package homework_8.task3.documents;

import homework_8.task3.registry.Registry;

import java.util.Date;

public class FinancialDocument extends BaseDocument {
    private int finalSum;
    private int departmentNumber;

    public FinancialDocument(int documentNumber, int departmentNumber, int finalSum, Date documentDate) {
        super(documentNumber, documentDate);
        this.departmentNumber = departmentNumber;
        this.finalSum = finalSum;
    }

    public FinancialDocument(){}

    @Override
    public void printInfo() {
        System.out.println("FinancialDocument: ");
        System.out.println("Department Number: " + departmentNumber);
        System.out.println("Document Number: " + documentNumber);
        System.out.println("Document Date: " + documentDate);
        System.out.println("Final Sum: " + finalSum);
    }
}
