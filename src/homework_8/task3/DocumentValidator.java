package homework_8.task3;

import homework_8.task3.exceptions.ContainsABCException;

public class DocumentValidator {

    public static void validate(String documentNumber)
            throws ContainsABCException{

        if (!documentNumber.contains("abc")) {
            throw new ContainsABCException("Error: Document number doesn't contain abc.");
        }
    }
}
