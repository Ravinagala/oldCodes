class Ball {
    private String[] data = new String[3];
    private int top;

    public void push(String value) {
        try{
            data[top] = value;
            top++;
            if(top > data.length)
                throw new RuntimeException();
        }
        catch (Exception ex){
            System.out.println("stack is full");
        }
    }

    public void print(){
        for(int i = 0; i < top; i ++){
            System.out.println(data[i]);
        }
    }
}

public class MyBall{
    public static void main(String[] args) {
        Ball b = new Ball();
        b.push("Ball1");
        b.push("Ball2");
        b.push("Ball3");
        b.push("Ball4");
        //b.print();

    }

}
