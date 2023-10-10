import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Optional;

public class MyTime implements Comparable<MyTime>{

    private int hours;
    private int minutes;

    private int seconds;

    public MyTime(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public int totalSeconds(){
        return hours*3600 + minutes * 60 + seconds;
    }

    @Override
    public String toString() {
        return "MyTime{" +
                "hours=" + hours +
                ", minutes=" + minutes +
                ", seconds=" + seconds +
                '}';
    }


    @Override
    public int compareTo(MyTime myTime) {
        return this.getHours()-myTime.getHours();
    }
}
class CompareHours implements Comparator<MyTime> {
    @Override
    public int compare(MyTime t1, MyTime t2) {
        return t2.getHours() - t1.getHours();
    }
}
 class TimeSorting {
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

        Optional<MyTime> minimumtime = times.stream().min((t1, t2)->t1.totalSeconds()-t2.totalSeconds());
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


