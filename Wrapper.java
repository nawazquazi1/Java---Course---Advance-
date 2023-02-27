public class Wrapper {
    public static void main(String[] args) {


        // 1)  Conversions from Primitive Type To Object Type

        // a) By Using Parameterized Constructors From Wrapper Classes

        int i = 10;
        Integer in = new Integer(i);
        System.out.println(i + " " + in);

        // b) By Using ValueOf(-) Method Provided By Wrapper Classes

        int i1 = 10;
        Integer in1 = Integer.valueOf(i1);
        System.out.println(i1 + " " + in1);


        // c)  By Using Auto-Boxing Approach:

        int i2 = 10;
        Integer in2 = i2;
        System.out.println(12 + " " + in2);

        // 2) Conversions From Object Type To Primitive Types:

        // a) By Using xxxValue() Method From Wrapper Classes:

        Integer in3 = new Integer(10);
        int i3 = in.intValue();
        System.out.println(in3 + " " + i3);

        // b) By using Auto-Unboxing
        Integer in4 = 10;
        int i4 = in4;
        System.out.println(in4 + " " + i4);


        // 3) Conversions from String Type to Object Type:

        // a) By Using String Parameterized Constructors From Wrapper Classes
        String str = "10";
        Integer in5 = new Integer(str);
        System.out.println(str + " " + in5);

        // b) By Using Static valueOf(-) Method From Wrapper Classes:
        String str1 = "20";
        Integer in6 = Integer.valueOf(str1);
        System.out.println(str1 + " " + in6);


        // 4) Conversions From Object Type To String Type:

        // a) By using toString() Method from Wrapper Classes:
        Integer in7 = new Integer(100);
        String str2 = in7.toString(in7);
        System.out.println(str2 + " " + in7);


        // b) By Using '+' Concatenation Operator:
        Integer in8 = new Integer(100);
        String str3 = "" + in8;
        System.out.println(str3 + " " + in8);


        // 5. Conversions From Primitive Data Types To String Data Types
        // a) By using Static toString() Method from Wrapper Classes:
        int i9 = 10;
        String str4 = Integer.toString(i);
        System.out.println(i9 + " " + str4);

        // b) By using '+' Concatenation Operator:

        int i10 = 10;
        String str5 = "" + i10;
        System.out.println(i10 + " " + str5);

        //6) Conversions From String Type To Primitive Type:
        //a) By using parseXXX() Method from Wrapper Classes:
        String str6 = "10";
        int i11 = Integer.parseInt(str6);
        System.out.println(str6+" "+i11);

    }
}

class m{

    public static void main(String[] args) {

        Thread tf=new Thread(){
        };
    }
}