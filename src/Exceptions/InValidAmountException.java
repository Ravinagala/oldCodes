package Exceptions;

public class InValidAmountException extends Exception{
    public InValidAmountException(){
        super("Invalid Transaction amount!");
    }
    public InValidAmountException(String msg){
        super(msg);
    }
}
