import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class JavaSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String buffer = sc.nextLine();
        List<String> students = new ArrayList<>();
        for(int i = 0; i< n; i++){
            students.add(sc.nextLine());
        }
        printNamesAsc(students);

    }
public static void printNamesAsc(List<String> students){
        List<StudentClass> studentClassList = new ArrayList<>();
        for(String student : students){
            String [] separatedStudentData = student.split("\\s+");
            studentClassList.add(new StudentClass(Integer.parseInt(separatedStudentData[0]),
                    separatedStudentData[1],
                    Double.parseDouble(separatedStudentData[2])));
        }
        List<String> CGPAList = studentClassList.stream().sorted(Comparator.comparing(StudentClass::getStudentCGPA).reversed().
                thenComparing(StudentClass::getStudentName).
                thenComparing(StudentClass::getStudentID)).map(o -> o.getStudentName()).collect(Collectors.toList());
        CGPAList.stream().forEach(o -> System.out.println(o));


}


}

 class StudentClass{
     public int getStudentID() {
         return studentID;
     }

     public String getStudentName() {
         return studentName;
     }

     public double getStudentCGPA() {
         return studentCGPA;
     }

     int studentID;
     String studentName;
     double studentCGPA;
     public StudentClass(int studentID, String studentName, double studentCGPA){
         this.studentID = studentID;
         this.studentName = studentName;
         this.studentCGPA  = studentCGPA;
     }

}
