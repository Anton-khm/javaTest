package homework_8.task3;

import homework_8.task3.documents.EmployeeContract;
import homework_8.task3.documents.FinancialDocument;
import homework_8.task3.documents.ProductContract;
import homework_8.task3.exceptions.ContainsABCException;
import homework_8.task3.registry.Registry;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Registry registry = new Registry();

        String docNumber = "test--a-bc";

        try {
            DocumentValidator.validate(docNumber);
            ProductContract contract = new ProductContract(10511, new Date(), "Drawer", 5);
            registry.saveDocuments(contract);
            registry.loadDocumentInfo(contract);
        } catch (ContainsABCException e) {
            System.out.println("Document check failed " + e.getMessage());
        }
        System.out.println();

        EmployeeContract contract2 = new EmployeeContract(10512, new Date(), new Date(), "Alex");
        registry.saveDocuments(contract2);
        registry.loadDocumentInfo(contract2);
        System.out.println();

        FinancialDocument contract3 = new FinancialDocument(10513, 24, 10500, new Date());
        registry.saveDocuments(contract3);
        registry.loadDocumentInfo(contract3);
    }
}
