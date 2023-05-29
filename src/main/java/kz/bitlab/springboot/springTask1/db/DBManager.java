package kz.bitlab.springboot.springTask1.db;

import java.util.ArrayList;

public class DBManager {

    private static final ArrayList<Student> students = new ArrayList<>();
    private static Long id = 6L;

    static{
        students.add(new Student(1L, "Ilyas", "Zhuanyshev", 88, "B"));
        students.add(new Student(2L, "Serik", "Erikov", 91, "A"));
        students.add(new Student(3L, "Erik", "Serikov", 65, "C"));
        students.add(new Student(4L, "Nurzhan", "Bolatov", 48, "F"));
        students.add(new Student(5L, "Sabina", "Assetova", 20, "F"));
    }

    public static ArrayList<Student> getStudents(){
        return students;
    }

    public static void addStudent(Student student){
        student.setId(id);
        id++;
        if(student.getExam() > 90){
            student.setMark("A");
        }else if(student.getExam() < 90 && student.getExam() >= 75){
            student.setMark("B");
        }else if(student.getExam() < 75 && student.getExam() >= 60){
            student.setMark("C");
        }else if(student.getExam() < 60 && student.getExam() >= 50){
            student.setMark("D");
        }else if(student.getExam() < 50){
            student.setMark("F");
        }
        students.add(student);
    }

}
