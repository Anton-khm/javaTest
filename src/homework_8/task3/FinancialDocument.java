package homework_8.task3;

import java.util.Date;

public class FinancialDocument extends Registry{
    public int finalSum;
    public Date date;
    public int documentNumber;
    public int departmentNumber;

    public FinancialDocument(int documentNumber, int departmentNumber, int finalSum, Date date){
        this.documentNumber = documentNumber;
        this.departmentNumber = departmentNumber;
        this.finalSum = finalSum;
        this.date = date;
    }

    public FinancialDocument(){}
}
