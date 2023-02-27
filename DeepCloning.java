import java.io.IOException;
import java.rmi.server.ServerNotActiveException;
import java.util.*;

class cloneObject implements Cloneable {
    String id;
    String name;
    String add;
    String email;
    String mobileNo;

    cloneObject(String id, String name, String add, String email, String mobileNo) {
        this.id = id;
        this.name = name;
        this.add = add;
        this.email = email;
        this.mobileNo = mobileNo;
    }

    public void GetStudentDetails() {
        System.out.println("student details");
        System.out.println("------------");
        System.out.println("student Id :" + id);
        System.out.println("student name :" + name);
        System.out.println("student address :" + add);
        System.out.println("student email :" + email);
        System.out.println("student mobileNo :" + mobileNo);
    }


    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

//    @Override
//    public cloneObject clone() {
//        try {
//            return (cloneObject) super.clone();
//        } catch (CloneNotSupportedException e) {
//            throw new AssertionError();
//        }
//    }


}


class main2 {
    public static void main(String[] args) throws CloneNotSupportedException {
        cloneObject c = new cloneObject("s-111", "nawaz", "bhilwara", "nawazquazi@356@gmail.com", "9460985441");
        System.out.println("original object");
        c.GetStudentDetails();
        Object obj = c.clone();
        cloneObject duplicate = (cloneObject) obj;
        System.out.println("duplicate object");
        duplicate.GetStudentDetails();
    }

}

// Shallow Cloning
class account {//Contained class
    String accNo;
    String accHolder;
    String accType;
    String balance;

    account(String accNo, String accHolder, String accType, String balance) {
        this.accNo = accNo;
        this.accHolder = accHolder;
        this.accType = accType;
        this.balance = balance;
    }
}

class Employee implements Cloneable {//container class
    String id;
    String name;
    String sal;
    String add;
    account acc;

    Employee() {
    }

    Employee(String id, String name, String sal, String add, account acc) {
        this.id = id;
        this.name = name;
        this.sal = sal;
        this.add = add;
        this.acc = acc;
    }

    public void getEmpDetails() {
        System.out.println("Employee Details");
        System.out.println(" ----------------------- ");
        System.out.println("Employee id : " + id);
        System.out.println("Employee name : " + name);
        System.out.println("Employee salary : " + sal);
        System.out.println("Employee Address : " + add);
        System.out.println();
        System.out.println("Account Details");
        System.out.println("Account no : " + acc.accNo);
        System.out.println("Account name : " + acc.accHolder);
        System.out.println("Account type : " + acc.accType);
        System.out.println("Account balance : " + acc.balance);
    }

    @Override
    public Employee clone() throws CloneNotSupportedException {
        return (Employee) super.clone();
    }
}

class ShallowCloning {
    public static void main(String[] args) throws CloneNotSupportedException {
        account ac = new account("abc123", "nawaz", "savings", "2343");
        Employee emp = new Employee("e-111", "nawaz", "5000", "bhilwara", ac);
        emp.getEmpDetails();
        System.out.println();
        Employee emp2 = emp.clone();
        emp2.getEmpDetails();
        System.out.println(emp);
        System.out.println(emp2);
        System.out.println(emp.acc);
        System.out.println(emp2.acc);

    }
}

// Deep Cloning

class account1 {//Contained class
    String accNo;
    String accHolder;
    String accType;
    String balance;

    account1(String accNo, String accHolder, String accType, String balance) {
        this.accNo = accNo;
        this.accHolder = accHolder;
        this.accType = accType;
        this.balance = balance;
    }
}

class Employee1 implements Cloneable {//container class
    String id;
    String name;
    String sal;
    String add;
    account1 acc;

    static {
        System.out.println("loding class");
    }

    Employee1() {

    }

    Employee1(String id, String name, String sal, String add, account1 acc) {
        this.id = id;
        this.name = name;
        this.sal = sal;
        this.add = add;
        this.acc = acc;
    }

    public void getEmpDetails() {
        System.out.println("Employee Details");
        System.out.println(" ----------------------- ");
        System.out.println("Employee id : " + id);
        System.out.println("Employee name : " + name);
        System.out.println("Employee salary : " + sal);
        System.out.println("Employee Address : " + add);
        System.out.println();
        System.out.println("Account Details");
        System.out.println("Account no : " + acc.accNo);
        System.out.println("Account name : " + acc.accHolder);
        System.out.println("Account type : " + acc.accType);
        System.out.println("Account balance : " + acc.balance);
    }

    @Override
    public Employee1 clone() throws CloneNotSupportedException {
        account1 acc1 = new account1(acc.accNo, acc.accHolder, acc.accType, acc.balance);
        Employee1 em1 = new Employee1(id, name, sal, add, acc1);
        return em1;

    }
}
    public class DeepCloning {
        public static void main(String[] args) throws CloneNotSupportedException {
            account1 ac = new account1("abc123", "nawaz", "savings", "2343");
            Employee1 emp = new Employee1("e-111", "nawaz", "5000", "bhilwara", ac);
            System.out.println("Original object");
            emp.getEmpDetails();
            System.out.println();
            Employee1 em1 = emp.clone();
            System.out.println("Duplicate object");
            em1.getEmpDetails();
            System.out.println();
            System.out.println("Original object  " + emp);
            System.out.println(emp.acc);
            System.out.println("Duplicate object  " + em1);
            System.out.println(em1.acc);
        }
    }


