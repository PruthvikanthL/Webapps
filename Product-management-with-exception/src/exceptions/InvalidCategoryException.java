package exceptions;

public class InvalidCategoryException extends RuntimeException{
    public InvalidCategoryException(String message){
        super(message);
    }
}
