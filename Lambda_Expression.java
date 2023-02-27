import java.util.*;
import java.util.function.IntPredicate;

public class Lambda_Expression {
    public static void main(String[] args) {
        Expression1 expression1 = () -> {
            System.out.println("Statement 1");
        };
        expression1.demo();
    }
}

// first lambda program
@FunctionalInterface
interface Expression1 {
    public void demo();
}

//  create thread with lambda
class lambda_Thread {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            System.out.println("i am inside thread 1");
            System.out.println("this is line 2");
        });
        thread1.start();
        Thread thread2 = new Thread(() -> {
            System.out.println("inside thread 2");
        });
        thread2.start();
    }
}

// list<Object> sort logic use lambda
class data {
    private String name;

    public data(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "data{" +
                "name='" + name + '\'' +
                '}';
    }

}

class sort {
    public static void main(String[] args) {
        List<data> list = new ArrayList<data>();
        list.add(new data("nawaz"));
        list.add(new data("mahjbeen"));
        list.add(new data("akib"));
        list.add(new data("teeq"));

        // Collections.sort(data); // this logic is error

//        Collections.sort(list,new Comparator<data>() {
//            @Override
//            public int compare(data o1, data o2) {
//                return o1.getName().compareTo(o2.getName());
//            }
//        }); // this logic is long

//        Collections.sort(list,(data o1,data o2)->{
//            return o1.getName().compareTo(o2.getName());
//        });// this logic is lambda

        Collections.sort(list, (data o1, data o2) -> {
                    if (o1.getName().length() < o2.getName().length()) {
                        return -1;
                    } else if (o1.getName().length() > o2.getName().length()) {
                        return 1;
                    } else {
                        return 0;
                    }
                }
        );
        for (data dat : list) {
            System.out.println(dat);
        }
    }
}

// return lambda
interface Lambda{
    abstract public int Demo();
}

class  Return{
    public static void main(String[] args) {

//        first logic
       // Lambda lambda=(i)->{
         //   return i;
        //};
        //System.out.println(lambda.Demo(10));

//       second  logic

        Lambda lambda=()->10;
        System.out.println(lambda.Demo());

    }
}
 // type casting
class Type{
     public static void main(String[] args) {
         Lambda lambda=()->{
          float f=(float)((10*25)/3);
          return (int) f;
         };
         System.out.println(lambda.Demo());
     }
 }

// for Each loop
class Data {
    private String name;

    public Data(String name) {
        super();
        this.name = name;
    }

    @Override
    public String toString() {
        return "Data [name=" + name + "]";
    }

    public String getName() {
        return name;
    }
}

        class App {

    public static void main(String[] args) {
        List<Data> list = new ArrayList<>();
        list.add(new Data("Chaand"));
        list.add(new Data("John"));
        list.add(new Data("Mia"));
        list.add(new Data("Angelica"));
        list.add(new Data("Roy"));

        Collections.sort(list,(Data o1,Data o2)->{
            return o1.getName().compareTo(o2.getName());
        });

//        for (Data i:list){
//            System.out.println(i);
//        }// this is simple for each loop

        list.forEach(temp->{
            System.out.println(temp.getName());
        }); // this is lambda
    }
}

// predicates
class predicates{
    public static void main(String[] args) {
//        IntPredicate less=new IntPredicate() {
//            @Override
//            public boolean test(int value) {
//                if (value <= 18) {
//                    return true;
//                } else {
//                    return false;
//                }
//            }
//        };
//        System.out.println(less.test(19));

             // simple way
//        IntPredicate less =i->i<=18;
//        System.out.println(less.test(20));


        // and method
        IntPredicate less =i->i<=18;
        IntPredicate less1 =i->i>=10;
        System.out.println(less.and(less1).test(455));
        predicates predicates=new predicates();
        predicates.demo(19,less,less1 );

    }
    public void demo(int x, IntPredicate lessThan18, IntPredicate MoreThan10){
        if(lessThan18.and(MoreThan10).test(x)){
            System.out.println("The input is less Than 18 and more than 10");
        }else{
            System.out.println("invalid input");
        }
    }
}

