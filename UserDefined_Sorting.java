import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;


// Comparable
public class UserDefined_Sorting implements Comparable<UserDefined_Sorting> {
    String no;
    String name;
    String id;

    UserDefined_Sorting(String no, String name, String id) {
        this.no = no;
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "aa{" +
                "no='" + no + '\'' +
                ", name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }

    @Override
    public int compareTo(UserDefined_Sorting o) {
        int val = 0;
        val = this.id.compareTo(String.valueOf(o.id));
        return val;
    }

}

class exu {
    public static void main(String[] args) {
        UserDefined_Sorting a = new UserDefined_Sorting("111", "nawaz", "na12");
        UserDefined_Sorting a1 = new UserDefined_Sorting("122", "nawaz", "na12");
        UserDefined_Sorting a2 = new UserDefined_Sorting("133", "ateeq", "at14");
        UserDefined_Sorting a3 = new UserDefined_Sorting("144", "quazi", "qu15");
        UserDefined_Sorting a4 = new UserDefined_Sorting("155", "alfez", "al16");
        Set<UserDefined_Sorting> set = new TreeSet<>(new Comparator<UserDefined_Sorting>() {
            @Override
            public int compare(UserDefined_Sorting o1, UserDefined_Sorting o2) {
                return o1.id.compareTo(o2.id);
            }
        });
        set.add(a3);
        set.add(a1);
        set.add(a4);
        set.add(a);
        set.add(a2);
        System.out.println(set);

    }
}

