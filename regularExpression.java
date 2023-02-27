import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regularExpression {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("l[a-zA-Z]*n");
        Matcher matcher = pattern.matcher("LearnVern");
        boolean isMatched = matcher.matches();
        if (isMatched) {
            System.out.println("String Matches the pattern ");
        } else {
            System.out.println("String Does not Matches the pattern");
        }
    }


}

class Regular_Expression2 {
//    public static void main(String[] args) {
//        Pattern pattern=Pattern.compile("Lv");
//        Matcher matcher=pattern.matcher("I said that Lv Stands For LearnVern");
////        boolean isMatched=matcher.matches();
//        if (matcher.lookingAt()){
//            System.out.println("Lv Found at Beginning ");
//        }else {
//            System.out.println("Lv is not at the Beginning");
//        }
//        if (matcher.find()){
//            System.out.println("Lv is there in the String");
//        }else {
//            System.out.println("Lv is not present in the String");
//        }
//        if (matcher.find(5)){
//            System.out.println("Lv is there in the String after 15th Character");
//        }else {
//            System.out.println("Lv is not present in the String after 15 index position");
//        } if (matcher.matches()){
//            System.out.println("String follows the pattern of lv");
//        }else {
//            System.out.println("String Does not Matches the pattern");
//        }
//    }
}

class Start_End_Method {
//    public static void main(String[] args) {
//        int count=0;
//        Pattern pattern=Pattern.compile("L[a-z]*n");
//        Matcher m=pattern.matcher("Learn from the Best Expers at LearnVern amd enjoy of the ride Of Learning ");
//        while (m.find()){
//            count++;
//            System.out.println("count : "+count);
//            System.out.println("start() : "+m.start());
//            System.out.println("End() : "+m.end());
//        }
//    }
}

class Replacement {
    public static void main(String[] args) {
        String s1 = "Welcome         to LearnVern         and7687988 Enjoy your             LearnVern coding ";
//        System.out.println(s1.replaceAll(" \\s",""));
//        System.out.println(s1.replaceAll("[^a-zA-z]",""));
        Pattern p = Pattern.compile("//s{2,}");
        Matcher m = p.matcher(s1);
        System.out.println(m.replaceAll(s1));


    }
}


class PatternDemo {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Please Enter the a Character");
//        String s1 = sc.next();
//        Pattern p1 = Pattern.compile("[^a-e]");
//        Matcher m1 = p1.matcher(s1);
//        System.out.println("Is the string in the range a to e " + m1.matches());
//    }
}

class Pattern_Quantifiers_Demo {
//    public static void main(String[] args) {
//        boolean  s1=Pattern.matches("[0-9]?","345");
//        System.out.println(s1);

//        boolean s1=Pattern.matches("[0-9]+","6");
//        System.out.println(s1);
//        boolean s2=Pattern.matches("[0-9]+","68");
//        System.out.println(s2);
//        boolean s3=Pattern.matches("[0-9]+","68y");
//        System.out.println(s3);
//        boolean s4=Pattern.matches("[0-9]+","6");
//        System.out.println(s4);

//        boolean s1=Pattern.matches("[0-9]*","6");
//        System.out.println(s1);
//        boolean s2=Pattern.matches("[0-9]*","68");
//        System.out.println(s2);
//        boolean s3=Pattern.matches("[0-9]*","68y");
//        System.out.println(s3);
//        boolean s4=Pattern.matches("[0-9]*","6");
//        System.out.println(s4);
//
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Please Enter your mobile Number");
//        String Mobil_Number=sc.next();
//        System.out.println(isValidMobile(Mobil_Number));
//    }
//    public  static boolean isValidMobile(String mb){
//        return Pattern.matches("[6-9][0-9]{9}",mb);
//    }
}

class MetaCharactersDemo {
//    public static void main(String[] args) {
//        System.out.println(Pattern.matches("\\d","a"));//false
//        System.out.println(Pattern.matches("\\d","9"));//true
//        System.out.println(Pattern.matches("\\d","90"));//false
//        System.out.println(Pattern.matches("\\d+","90")); //true

//        System.out.println(Pattern.matches("\\D","a"));//true
//        System.out.println(Pattern.matches("\\D","9"));//false
//        System.out.println(Pattern.matches("\\D","90"));//false
//        System.out.println(Pattern.matches("\\D+","abcd")); //true

//        Pattern p=Pattern.compile("\\bLearn\\b");
//        Matcher m1= p.matcher("I Want to Learn java from LearnVern");
//        System.out.println(m1.find());

//        System.out.println(Pattern.matches("\\w","a"));//false
//        System.out.println(Pattern.matches("\\w","A"));//true
//        System.out.println(Pattern.matches("\\w","0"));//false
//        System.out.println(Pattern.matches("\\w+","")); //true

//        System.out.println(Pattern.matches("\\W","a"));//false
//        System.out.println(Pattern.matches("\\W","A"));//true
//        System.out.println(Pattern.matches("\\W","0"));//false
//        System.out.println(Pattern.matches("\\W+","(")); //true
//    }
}

class Pattern_Email_ID {
    public static void main(String[] args) {
        System.out.println(Pattern.matches("^[a-z][a-z0-9._]*[a-z0-9]+@[a-z]+[\\.][a-z]{2,3}$", "nawazquazi356@2gmail.com"));
    }
}