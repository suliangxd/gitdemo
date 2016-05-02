/**
 * Created by Liang on 16/5/2.
 * No.7-2
 */
public class Main {

    public static void main(String[] args) {
        java.util.Scanner in = new java.util.Scanner(System.in);
        Clock clock = new Clock(in.nextInt(), in.nextInt(), in.nextInt());
        clock.tick();
        System.out.println(clock);
        in.close();
    }
}

class Clock {
    public Clock(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void tick() {
        this.second += 1;
        if (this.second == 60) {
            this.minute += 1;
            this.second = 0;
        }
        if (this.minute == 60) {
            this.hour += 1;
            this.minute = 0;
        }
        if (this.hour == 24) {
            this.hour = 0;
        }
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", this.hour, this.minute, this.second);
    }

    private int hour;
    private int minute;
    private int second;
}
