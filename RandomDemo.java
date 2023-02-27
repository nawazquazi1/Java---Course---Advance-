import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class RandomDemo implements Serializable {
    int rollNo;
    String name;

    public RandomDemo(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    public String toString() {
        return rollNo + " ----->" + name;
    }

}

class nawaz {
    public static void main(String[] args) throws ClassNotFoundException, IOException {
        try {
            Scanner sc = new Scanner(System.in);
            String filepath = sc.next();
            FileOutputStream file = new FileOutputStream(filepath);
            ObjectOutputStream obj = new ObjectOutputStream(file);

            RandomDemo s[] = new RandomDemo[5];
            s[0] = new RandomDemo(101, "mohammed");
            s[1] = new RandomDemo(102, "akib");
            s[2] = new RandomDemo(103, "nawaz");
            s[3] = new RandomDemo(104, "quazi");
            s[4] = new RandomDemo(105, "attari");
            for (int i = 0; i < 5; i++) {
                obj.writeObject(s[i]);
                obj.flush();
                obj.close();
                file.close();
            }
        } catch (IOException e) {
//            e.printStackTrace();
            System.out.println("    NAWAZ QIUAZI    ");

//        try {
//            RandomDemo fis;
//            FileInputStream fin = new FileInputStream(filepath);
//            ObjectInputStream obj = new ObjectInputStream(fin);
//            while (fin.available() > 0) {
//                fis = (RandomDemo) obj.readObject();
//                System.out.println(fis);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        }
    }
}
