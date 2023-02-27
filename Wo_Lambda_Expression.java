
interface Drawable {
    public void draw();
}

//class  ImplDrawable implements Drawable{
//    int width;
//
//    @Override
//    public void draw() {
////        System.out.println("Darving : "+width);
////    }
//}
public class Wo_Lambda_Expression {
    public static void main(String[] args) {
//        ImplDrawable obj=new ImplDrawable();
//        obj.width=10;
//        obj.draw();
//    }
        int width = 10;
        Drawable dr = new Drawable() {
            @Override
            public void draw() {
                System.out.println("Drawing : " + width);
            }
        };
        dr.draw();
    }
}

@FunctionalInterface
interface Drawable1 {
    public void draw();
}

class LambdaExpression {
    public static void main(String[] args) {
        int width = 20;
        //with Lambda_Expression
        Drawable d = () -> {
            System.out.println("Drawing : " + width);
        };
        d.draw();
    }
}

@FunctionalInterface
interface Sayable {
     String say(String name, int ege);
}

class Lambda_Expression_With_Parameter_2 {
    public static void main(String[] args) {
        int width = 20;
        //with Lambda_Expression
        Sayable d1 = (name,ege) -> {
            return "I have Nothing to say " + name + " " + ege;
        };
        System.out.println(d1.say("nawaz", 12));
    }
}
