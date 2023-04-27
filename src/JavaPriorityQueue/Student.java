package JavaPriorityQueue;

public class Student {


    int id;
    String name;
    double CGPA;

    //constructor
    public Student(String name, double CGPA, int id) {
        this.id = id;
        this.name = name;
        this.CGPA = CGPA;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCGPA() {
        return CGPA;
    }


}
