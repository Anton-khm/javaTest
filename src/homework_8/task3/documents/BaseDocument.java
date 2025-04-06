package homework_8.task3.documents;

import java.util.Date;

public abstract class BaseDocument {
    protected int documentNumber;
    protected Date documentDate;

    public BaseDocument() {}

    public BaseDocument(int documentNumber, Date documentDate) {
        this.documentNumber = documentNumber;
        this.documentDate = documentDate;
    }

    public abstract void printInfo();
}