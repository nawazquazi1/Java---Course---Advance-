import java.beans.*;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Bean implements Serializable {
    private String Name;
    private String Id;
    private String Add;
    private int Roll;
    private int NO;

    public int getRoll() {
        return Roll;
    }

    public void setRoll(int roll) {
        Roll = roll;
    }

    public int getNO() {
        return NO;
    }

    public void setNO(int NO) {
        this.NO = NO;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getAdd() {
        return Add;
    }

    public void setAdd(String add) {
        Add = add;
    }
}

class Test {
    public static void main(String[] args) throws IntrospectionException {


        //    BeanInfo
        BeanInfo beanInfo = Introspector.getBeanInfo(Bean.class);
        BeanDescriptor beanDescriptor = beanInfo.getBeanDescriptor();
        System.out.println("Bean Name : " + beanDescriptor.getName());
        System.out.println();


        //  beanDescriptor 
        Class cls = beanDescriptor.getBeanClass();
        System.out.println("Bean class : " + cls.getName());
        System.out.println("super class : " + cls.getSuperclass().getName());

        System.out.println("-------------------------------------------------------------------");

        // PropertyDescriptor
        PropertyDescriptor[] propertyDescriptor = beanInfo.getPropertyDescriptors();
        System.out.println("Properties :");
        for (PropertyDescriptor descriptor : propertyDescriptor) {
            if (!descriptor.getName().equals("class")) {
                System.out.println("Name     :" + descriptor.getName() + "\t");
                System.out.println("Data Type  :" + descriptor.getPropertyType().getName());
                System.out.println("Read Method :" + descriptor.getReadMethod().getName());
                System.out.println("Write Method :" + descriptor.getWriteMethod().getName());
                System.out.println("------------------------------------------------------");
            }
        }
        //  MethodDescriptor
        MethodDescriptor[] methodDescriptors = beanInfo.getMethodDescriptors();
        System.out.println("Methods : ");
        for (MethodDescriptor descriptor : methodDescriptors) {
            System.out.println("Method name" + descriptor.getName() + "\t");
            Method method = descriptor.getMethod();
            System.out.println("Modifier    :" + Modifier.toString(method.getModifiers()));
            System.out.println("Return Type :" + method.getReturnType());
            System.out.println("---------------");
        }
        System.out.println();
    }
}