import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regular_Expression {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("^[a-z]*[\\d+]*@[a-z]{5}.[a-z]{3}");//[a-z]@[a-z]+[\\.][a-z]{2,3}$
//        Pattern p = Pattern.compile("^[a-z][a-z0-9._]*[a-z0-9]+@[a-z]+[\\.][a-z]{2,3}$");
        Matcher matcher = p.matcher("nawazquazi356@gmail.com");
        boolean isMatched = matcher.matches();
        if (isMatched) {
            System.out.println("String Matches the pattern ");
        } else {
            System.out.println("String Does not Matches the pattern");
        }

        String s1 = "nawazquazi356@gmail.com";
        System.out.println(s1.replaceAll("\\s", ""));
        System.out.println(s1.replaceAll("", ""));


//        Matcher m = p.matcher(s1);
//        String s = m.replaceAll("");
//        System.out.println(s);
//
//
////nawazquazi356@gmail.com
//    }
//    }


// . any character
// * more occurrence
// // d digit
// + one and more
//   [a-z] a to z small word
//  [A-Z] A to Z capital word
// [0-9]   0 to 9  digit
    }

}
