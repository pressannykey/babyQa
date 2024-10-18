package task1;

import task1.interfaces.Readable;

public class Clock implements Readable {
    private int hours;
    private int minutes;
    private int seconds;

    public int getHours() {
        return this.hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinutes() {
        return this.minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return this.seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public void tick() {
        this.seconds = this.seconds + 1;
    }

    @Override
    public void readTime() {
        System.out.printf("Current time is %s:%s:%s", this.hours, this.minutes, this.seconds);
    }
}
