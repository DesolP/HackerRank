package JavaPriorityQueue;

import java.util.ArrayList;
import java.util.List;

public class Priorities {
    List<Student> studentList = new ArrayList<Student>();

    int id = 0;
 public List<Student> getStudents(List<String> events){

//this is done just to check github
     //againagagain  333
 }
 public void addStudent(String name, double cgpa){
     Student student = new Student(id, name, cgpa);
     studentList.add(student);
     id++;
 }
 public void removeStudent(){
    Student selectedStudent = studentList.stream().max((a,b)-> (int)a.getCGPA() > (int)b.getCGPA()? (int)a.getCGPA():(int)b.getCGPA()).get();
     System.out.println(studentList.get(selectedStudent.getId()));
    studentList.remove(selectedStudent.getId());
 }
}
