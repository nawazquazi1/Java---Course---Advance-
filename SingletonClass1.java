public class SingletonClass1 {
    private static SingletonClass1 s = null;

    private SingletonClass1() {

    }

    static SingletonClass1 GetRef() {
        if (s == null) {
            s = new SingletonClass1();
        }
        return s;
    }
}

class SingletonClass2 {
    private static SingletonClass2 s = null;

    static {
        s = new SingletonClass2();
    }

    private SingletonClass2() {
    }

    static SingletonClass2 GetRef() {
        return s;
    }
}

class SingletonClass3 {
  private static SingletonClass3 s = new SingletonClass3();

    private SingletonClass3() {
    }

    static SingletonClass3 getInstance() {
        return s;
    }
}

class A {
    public static void main(String[] args) {

        //class SingletonClass1
//        SingletonClass1 a= GetRef();
//        SingletonClass1 a1= GetRef();
//        SingletonClass1 a2= GetRef();

//        System.out.println(a);
//        System.out.println(a1);
//        System.out.println(a2);
//        System.out.println(SingletonClass1.GetRef());
//        System.out.println(SingletonClass1.GetRef());
//        System.out.println(SingletonClass1.GetRef());

        // class SingletonClass2

//        System.out.println(SingletonClass2.GetRef());
//        System.out.println(SingletonClass2.GetRef());
//        System.out.println(SingletonClass2.GetRef());


        // class SingletonClass3


        System.out.println(SingletonClass3.getInstance());
        System.out.println(SingletonClass3.getInstance());
        System.out.println(SingletonClass3.getInstance());

    }
}