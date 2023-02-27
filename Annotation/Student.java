package Annotation;

import java.lang.reflect.Method;
import java.text.Annotation;

// Method Level Annotation
class Test1 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
        Student student = new Student("N-111", "aafiya", "Ajmer");
        student.getStudentDetails();
        System.out.println();

        Class<? extends Student> studentClass = student.getClass();
        Method m = studentClass.getMethod("getStudentDetails");
        Institute annotation = m.getAnnotation(Institute.class);
        System.out.println("Institute Details ");
        System.out.println("----------------------------------------");
        System.out.println("Institute Name :" + annotation.Name());
        System.out.println("Institute Name :" + ( annotation).Website());
        System.out.println("Institute Name :" + ( annotation).Phone());
        System.out.println("Institute Name :" + (annotation).Branch());
    }
}

public class Student {
    String id;
    String name;
    String add;

    Student(String id, String name, String add) {
        this.id = id;
        this.name = name;
        this.add = add;
    }

    @Institute(Name = "SDKR T ECH", Website = "WWW>Nawaz356.com", Phone = "9460985441", Branch = "Ajmer")
    public void getStudentDetails() {
        System.out.println("Student Details");
        System.out.println("------------------------------------");
        System.out.println("Student ID :" + id);
        System.out.println("Student Name :" + name);
        System.out.println("Student Add :" + add);
    }

}
