package task1;

import task1.interfaces.Printable;

public class Student implements Printable {
    private String name;
    private int recordBookNumber;
    private float mark;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRecordBookNumber() {
        return this.recordBookNumber;
    }

    public void setRecordBookNumber(int number) {
        this.recordBookNumber = number;
    }

    public float getMark() {
        return mark;
    }

    public void setMark(float mark) {
        this.mark = mark;
    }

    @Override
    public void print() {
        System.out.printf("Student %s with average mark %s", this.name, this.mark);
    }
}
