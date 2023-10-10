package FileHandling;

import java.io.RandomAccessFile;

public class RandomAccessDemo {


    public static void main(String[] args) throws Exception {
        int phoneNumbers[] = {11111,22222,33333,44444};
        RandomAccessFile raf = new RandomAccessFile("C:\\Users\\Ravi\\Documents\\numbers.dat","rw");

        for(int n : phoneNumbers)
            raf.writeInt(n);

        raf.seek(0);
        int count = (int) (raf.length()/4);

        for(int i = 0; i < count; i++)
            System.out.println(raf.readInt());

        raf.seek(2* 4);
        raf.writeInt(66666);


        raf.seek(0);
        for(int i = 0; i < count; i++)
            System.out.println(raf.readInt());

    }
}
