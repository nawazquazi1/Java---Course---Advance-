import java.lang.annotation.Target;
import java.util.ArrayList;

class MyGeneric<T1, T2> {
    int val;
    private T1 t1;
    private T2 t2;

    public MyGeneric(int val, T1 t1, T2 t2) {
        this.val = val;
        this.t1 = t1;
        this.t2 = t2;
    }

    public T2 getT2() {
        return t2;
    }

    public void setT2(T2 t2) {
        this.t2 = t2;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public T1 getT1() {
        return t1;
    }

    public void setT1(T1 t1) {
        this.t1 = t1;
    }
}


public class Generics {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
//        ArrayList<int> arrayList = new ArrayList(); -- this will produce an error
//        arrayList.add("str1");
        arrayList.add(54);
        arrayList.add(643);
//        arrayList.add(new Scanner(System.in));

        int a = (int) arrayList.get(0);
//        System.out.println(a);
        MyGeneric<String, Integer> g1 = new MyGeneric<>(23, "MyString is my string ", 45);
        String str = g1.getT1();
        Integer int1 = g1.getT2();
        System.out.println(str + int1);
    }
}

class call {
    public static void main(String[] args) {
        // Without Java Generics :
        ArrayList myArrayList = new ArrayList();
        myArrayList.add(10);  //Integer value
        myArrayList.add("Harry Bhai!"); //String value
        myArrayList.add(20.4); //Double value
        System.out.println(myArrayList);

        // int x = myArrayList.get(0);//without error  accrued
        // System.out.println(x);
        // error :java: incompatible types: java.lang.Object cannot be converted to int

        int x = (int) myArrayList.get(0); //b=object typecasted into integer
        System.out.println(x);

        // With Java Generics :
        ArrayList<Integer> myArrayList1 = new ArrayList();
        myArrayList1.add(10);  //Integer value
        //myArrayList1.add("Harry Bhai!"); //String value error
        //myArrayList1.add(20.4); //Double value error only for integer value stored
        System.out.println(myArrayList);
        // java: incompatible types: java.lang.String cannot be converted to java.lang.Integer
        // java: incompatible types: double cannot be converted to java.lang.Integer

        int x1 = myArrayList1.get(0);
        System.out.println(x1);//simple no taypcasted

    }
}