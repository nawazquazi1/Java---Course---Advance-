public class Autoboxing_Unboxing {
    static void main(String[] args) {

        //Autoboxing
        //primitive data type convert to object class
        int i=100;
        Integer in=i;
        System.out.println(in);

        // unboxing
        // object wrapper class convert to primitive data type
        Integer ia=10;
        int a=ia;
        System.out.println(ia);

        Character ch='a';
        char c=ch;
        System.out.println("value of c: "+c);
        System.out.println("value of ch: "+ch);

    }
}
