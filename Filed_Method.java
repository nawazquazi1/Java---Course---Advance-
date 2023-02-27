import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Filed_Method {
    public static void main(String[] args) throws IllegalAccessException {
        Class c=Reflection_Api.class;
        Field []fields=c.getDeclaredFields();
        for (Field fid1:fields){
            fid1.setAccessible(true);
            System.out.println("Field name :"+fid1.getName());
            System.out.println("Field Type :"+fid1.getType().getName());
            System.out.println("Field Value :"+fid1.get(fid1));
            System.out.println("Field Modifiers :"+ Modifier.toString(fid1.getModifiers()));
            System.out.println("-------------------------------------");
        }

    }
}

class Reflection_Api{
    public static int number=2345;
    private static transient String Id ="akiakai123";
    public static volatile long along=3245466;
      static transient float marks=4558657687987867564687.78f;
}
