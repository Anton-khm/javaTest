package homework_8.task3.registry;

import homework_8.task3.documents.BaseDocument;

public class Registry {

    public BaseDocument[] registry = new BaseDocument[10];
    private int counter = 0;

    public void saveDocuments(BaseDocument doc) {
        if(counter < registry.length) {
            registry[counter++] = doc;
        } else {
            System.out.println("Registry is full. Cannot save more documents.");
        }
    }

    public void loadDocumentInfo(BaseDocument doc){
        doc.printInfo();
    }
}
