package homework_8.task3;

import java.util.Date;

public class EmployeeContract extends Registry{
    public int documentNumber;
    public Date date;
    public Date documentEndDate;
    public String employeeName;

    public EmployeeContract(int documentNumber, Date date, Date documentEndDate, String employeeName){
        this.documentNumber = documentNumber;
        this.date = date;
        this.documentEndDate = documentEndDate;
        this.employeeName = employeeName;
    }

    public EmployeeContract(){}

    @Override
    public void loadDocumentInfo() {
        super.loadDocumentInfo();
    }
}
