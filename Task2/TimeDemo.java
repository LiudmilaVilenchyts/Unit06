package Task2;

public class TimeDemo {
    public static void main(String[] args) {
        Time t1 = new Time(1,1,1);
        Time t2 = new Time();
        t1.displayTime();

        t1.increaseHours(12);
        t1.increaseMinutes(3);
        t1.increaseSeconds(25);
        t1.displayTime();


        t1.decreaseHours(3);
        t1.decreaseMinutes(2);
        t1.decreaseSeconds(10);
        t1.displayTime();


        t2.setHours(13);
        t2.setMinutes(30);
        t2.setSeconds(20);
        t2.displayTime();
    }
}
