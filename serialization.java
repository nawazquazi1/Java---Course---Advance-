import java.io.*;
import java.util.Scanner;

public class serialization implements Serializable {
    private static final long serialLVVersionUID = 1L;
    private String name;
    private int age;
    private String address;
    private String phone;

    public serialization(String name, int age, String address,String phone) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.phone=phone;
    }
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }



    @Override
    public String toString() {
        return "serialization{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}

class main {
    public static void main(String[] args) {
        serialization se = new serialization("nawaz", 19, "23 east california","9460985441");
        String filename = "C:\\program1\\gta.txt";
//        FileOutputStream fileOut = null;
//        ObjectOutputStream objOut = null;
//        // serialization
//        try {
//            fileOut = new FileOutputStream(filename);
//            objOut = new ObjectOutputStream(fileOut);
//            objOut.writeObject(se);
//
//            objOut.close();
//            fileOut.close();
//
//            System.out.println("Object has been serialized : \n " + se);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        //deserialization
        FileInputStream fileIn = null;
        ObjectInputStream objIn = null;
        try {
            fileIn = new FileInputStream(filename);
            objIn = new ObjectInputStream(fileIn);

            serialization object = (serialization) objIn.readObject();

            System.out.println("object has been deserialization : \n" + object);
            objIn.close();
//            objOut.close();
            fileIn.close();
        } catch (IOException | ClassNotFoundException ie) {
            ie.printStackTrace();
        }
    }
}

class WriteDemo2 {
    public static void main(String[] args) throws IOException {
        serialization[] se = new serialization[3];//("nawaz", 19, "23 east california");
        se[0] = new serialization("nawaz", 32, "21 nawaz house","6350593403");
        se[1] = new serialization("quazi", 23, "34 bhilwara","9460985441");
        se[2] = new serialization("akib", 45, "ajmer","9251236950");
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();
//        writeing from file

        FileOutputStream fileOut = null;
        ObjectOutputStream objOut=null;
        try {
             fileOut = new FileOutputStream(path);
             objOut = new ObjectOutputStream(fileOut);
            for (int i = 0; i < 3; i++) {
                objOut.writeObject(se[i]);
                objOut.flush();
                System.out.println("Object has been serialization : "+se[i]);
            }
        } catch (IOException io) {
            System.out.println(io);
        }finally {
            fileOut.close();
            objOut.close();
        }
    }
}

class ReadDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();
        try {
            serialization se;
            FileInputStream inn = new FileInputStream(path);
            ObjectInputStream oss = new ObjectInputStream(inn);
            while (inn.available() > 0) {
                se = (serialization) oss.readObject();
                System.out.println(se);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}