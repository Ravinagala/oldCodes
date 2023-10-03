import java.util.Comparator;

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


