package homework_8.task3.documents;

import java.util.Date;

public class EmployeeContract extends BaseDocument {
    private Date documentEndDate;
    private String employeeName;

    public EmployeeContract(int documentNumber, Date documentDate, Date documentEndDate, String employeeName){
        super(documentNumber, documentDate);
        this.documentEndDate = documentEndDate;
        this.employeeName = employeeName;
    }

    public EmployeeContract(){}

    @Override
    public void printInfo() {
        System.out.println("EmployeeContract: ");
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Document Number: " + documentNumber);
        System.out.println("Document Date: " + documentDate);
        System.out.println("Document End Date: " + documentEndDate);
    }
}
