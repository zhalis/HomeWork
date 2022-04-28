package student;

public class Student {

    public Student(int indexNumber, String name, int age, double mark, boolean olympiad) {
        this.indexNumber = indexNumber;
        this.name = name;
        this.age = age;
        this.mark = mark;
        this.olympiad = olympiad;
    }

    private int indexNumber;
    private String name;
    private int age;
    private double mark;
    private boolean olympiad;

    public int getIndexNumber() {
        return this.indexNumber;
    }

    public void setIndexNumber(int indexNumber) {
        this.indexNumber = indexNumber;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMark() {
        return this.mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public boolean isOlympiad() {
        return this.olympiad;
    }

    public void setOlympiad(boolean olympiad) {
        this.olympiad = olympiad;
    }

    @Override
    public String toString() {
        return "IndexNumber: " + this.indexNumber
                + "\nName: " + this.name
                + "\nAge: " + this.age
                + "\nMark: " + this.mark
                + "\nOlympiad: " + this.olympiad;
    }
}
