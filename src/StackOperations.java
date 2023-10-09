import java.util.ArrayList;
import java.util.List;



public class StackOperations {

    private int top;
    private List<Integer> stack = new ArrayList<>();

    public void push(int value){
        stack.add(value);
        top++;
    }

    public int pop(){
        if(isEmpty()){
            throw new RuntimeException("Stack is empty");
        }

        int lastIndex = stack.size() - 1;
        int poppedValue = stack.get(lastIndex);
        stack.remove(lastIndex);
        return poppedValue;
    }

    public boolean isEmpty(){
        return stack.isEmpty();

    }

    public int length(){
       return stack.size();
    }



    public static void main(String[] args) {
        StackOperations stackOperations = new StackOperations();
        stackOperations.push(1);
        stackOperations.push(2);
        stackOperations.push(3);
        stackOperations.push(5);

        System.out.println(stackOperations.length());
        System.out.println("Pop:"+ stackOperations.pop());
        System.out.println("Pop:"+ stackOperations.pop());
        System.out.println("remaining:"+stackOperations.stack);


    }
}


