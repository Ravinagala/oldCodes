package Exceptions;

public class InSufficientAmountException extends Exception{
    public InSufficientAmountException(){
        super("Insufficient Balance!");
    }
    public InSufficientAmountException(String msg){
        super(msg);
    }
}
