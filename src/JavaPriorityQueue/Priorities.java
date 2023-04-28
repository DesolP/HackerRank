package JavaPriorityQueue;

import java.util.*;
import java.util.stream.Collectors;

public class Priorities {
    public List<Student> studentList = new ArrayList<Student>();

    int id = 0;

    public String getStudents(List<String> events) {

        List<String> separatedInput;
        for (String event : events) {
            separatedInput = Arrays.asList(event.split(" "));
            if (separatedInput.get(0).equals("ENTER")) {
                addStudent(separatedInput.get(1), Double.parseDouble(separatedInput.get(2)), Integer.parseInt(separatedInput.get(3)));

            } else if (separatedInput.get(0).equals("SERVED")) {
                removeStudent();

            }
        }
        if(studentList.isEmpty()){
           return "EMPTY";
        }else{
            return studentList.stream().sorted((Comparator.comparing(Student::getCGPA)
                    .reversed()).thenComparing(Comparator.comparing(Student::getName)))
                    .map(Student::getName).collect(Collectors.joining("\n"));

        }
    }

    public void addStudent(String name, double cgpa, int id) {
        Student student = new Student(name, cgpa, id);
        studentList.add(student);
    }

    public void removeStudent() {
        if (studentList.isEmpty()) {

        } else {

            double maxCGPA = studentList.stream()
                    .mapToDouble(o -> o.getCGPA()).max().getAsDouble();

            String name = studentList.stream()
                    .max(Comparator.comparing(Student::getCGPA)).map(o -> o.getName()).toString();

            for (Student student : studentList) {
                if (student.getCGPA() == maxCGPA) {
                    studentList.remove(student);
                    break;
                }
            }


        }
    }
}
