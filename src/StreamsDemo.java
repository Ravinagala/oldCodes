import java.util.ArrayList;
import java.util.Collections;
import java.util.Optional;

public class StreamsDemo {
    public static void main(String[] args) {
        ArrayList<MyTime> times=new ArrayList<MyTime>();

        times.add(new MyTime(20,45,55));

        times.add(new MyTime(10,34,30));

        times.add(new MyTime(14,15,20));

        times.add(new MyTime(10,34,30));

        times.stream().filter(t -> t.getHours() ==10).forEach(System.out::println);
// Convert object to int
        double average = times.stream().mapToInt(MyTime::totalSeconds).average().getAsDouble();
        System.out.println(average);

        System.out.println("Any Hours > 12 ? " +times.stream().anyMatch(t->t.getHours()>12));

        System.out.println("All Hours > 12 ? " + times.stream().allMatch(t->t.getHours()>12));

        System.out.println("Count = " + times.stream().count());

        Optional<MyTime> minimumtime = times.stream().min((t1,t2)->t1.totalSeconds()-t2.totalSeconds());
        System.out.println("Minimum = " + minimumtime.get());

        times.stream().filter(t-> t.getHours()==20).forEach(System.out::println);

        System.out.println("Count = "+ times.stream().count());

        Optional<MyTime> maxtime = times.stream().max((t1,t2)->t2.totalSeconds()- t1.getSeconds());
        System.out.println("Maximum ="+ maxtime.get());

        System.out.println("None match > 100000 ? " +times.stream().noneMatch(t->t.totalSeconds()>100000));


        Collections.sort(times,new CompareHours());
        for(var p : times){
            System.out.println(p);
        }

        Collections.sort(times);
        for (var p : times){
            System.out.println(p);
        }



    }
}
