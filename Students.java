package sample;

import java.util.UUID;

public class Students {

    public String firstName;
    public int age;
    public UUID id;
    public String major;
    public String gpa;

    @Override
    public String toString() {
        return this.firstName + " " + this.id + " " + this.major + " " + this.age + " " + this.gpa;
    }
}