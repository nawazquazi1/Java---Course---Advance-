import javax.swing.*;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class UserDefined_Sorting2 {
    String no;
    String name;
    String id;
    int marks;

    UserDefined_Sorting2(String no, String name, String id, int marks) {
        this.no = no;
        this.name = name;
        this.id = id;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "aa{" +
                "no='" + no + '\'' +
                ", name='" + name + '\'' +
                ", id='" + id + '\'' + ",marks='" + marks +
                '}';
    }

}

class MyComparator implements Comparator<UserDefined_Sorting2> {

    @Override
    public int compare(UserDefined_Sorting2 o1, UserDefined_Sorting2 o2) {
        int val = 0;
        if (main3.SortingKey.equalsIgnoreCase("No")) {
            val = o1.no.compareTo(o2.no);
        } else if (main3.SortingKey.equalsIgnoreCase("Name")) {
            val = o1.name.compareTo(o2.name);
        } else if (main3.SortingKey.equalsIgnoreCase("Id")) {
            val = o1.id.compareTo(o2.id);
        } else if (main3.SortingKey.equalsIgnoreCase("Marks")) {
            val = o1.marks - o2.marks;
        }
        return val;
    }
}

class main3 {
    static String SortingKey = "";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option = 0;
        UserDefined_Sorting2 a = new UserDefined_Sorting2("111", "nawaz", "na12", 43);
        UserDefined_Sorting2 a1 = new UserDefined_Sorting2("122", "nawaz", "na12", 45);
        UserDefined_Sorting2 a2 = new UserDefined_Sorting2("133", "ateeq", "at14", 56);
        UserDefined_Sorting2 a3 = new UserDefined_Sorting2("144", "quazi", "qu15", 67);
        UserDefined_Sorting2 a4 = new UserDefined_Sorting2("155", "alfez", "al16", 87);
        MyComparator my = new MyComparator();
        System.out.println("Employee sorting Application");
        System.out.println("======================================");
        while (true) {
            System.out.println("1. sorting by No");
            System.out.println("2. sorting by Name");
            System.out.println("3. sorting by Id");
            System.out.println("4. sorting by Marks");
            option=sc.nextInt();
            switch (option) {
                case 1 -> SortingKey = "No";
                case 2 -> SortingKey = "Name";
                case 3 -> SortingKey = "Id";
                case 4 -> SortingKey = "Marks";
                case 5 -> {
                    System.out.println("******Thank you for using app******");
                    System.exit(0);
                }
                default -> System.out.println("Invalid option");
            }
            TreeSet<UserDefined_Sorting2> set = new TreeSet<>(my);
            set.add(a3);
            set.add(a1);
            set.add(a4);
            set.add(a);
            set.add(a2);
            System.out.println(set);
        }


    }
}