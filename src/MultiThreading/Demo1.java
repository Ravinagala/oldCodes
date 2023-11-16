package MultiThreading;

class Demo2{

    public void hello(){
        System.out.println("Nadigatla Neelima Praveen");
    }
}
interface Demo3{
    void mesg();
}
public class Demo1 extends Demo2  implements Demo3 {
    @Override
    public void mesg() {
        System.out.println("hiii");
    }

    @Override
    public void hello(){
        System.out.println("Nadigatla Neelima");
    }

    public static void main(String[] args) {
        Demo1 demo1=new Demo1();
        demo1.mesg();
        demo1.hello();
    }
}
