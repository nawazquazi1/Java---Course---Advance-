import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

// outputStreamWriter
// inputStreamReader
//byte
public class FileStreamDemo {
    public static void main(String[] args) throws IOException {
        File f = new File("C:\\program1\\java.txt");
        FileInputStream fileInputStream = new FileInputStream(f);
        byte[] b = new byte[(int) f.length()];
        int read = fileInputStream.read(b);
        System.out.println((char) read);
        System.out.println("Data from file reade successfully...");
        FileOutputStream fileOutputStream = new FileOutputStream("C:\\program1\\file8");
        fileOutputStream.write(b);
        System.out.println("Data written successfully");
    }
}

//char
// file copy
class FileReaderWriter {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int c;
        String str1 = sc.next();
        FileReader fin = new FileReader(str1);
        String str2 = sc.next();
        FileWriter fout = new FileWriter(str2);
        do {
            c = fin.read();
            if (c != -1) {
                fout.write(c);
            }
        } while (c != -1);
        System.out.println("File copy successfully");
        fin.close();
        fout.close();
    }

}

class SimpleLearnDmo {
    public static void main(String[] args) throws IOException {
        //byte stream
//        try {
//            FileInputStream fi = new FileInputStream("C:\\program\\javq.txt");
//            FileOutputStream fo = new FileOutputStream("C:\\program\\javaq1.txt");
//            int content;
//            while ((content = fi.read()) != -1) {
//                fo.write((byte) content);
//            }
//            fi.close();
//            fo.close();
//        } catch (IOException i) {
//            i.printStackTrace();
//        }
        //  char
        FileReader fr = new FileReader("C:\\program\\javq.txt");
        FileWriter fw = new FileWriter("C:\\program\\javaq1.txt");
        int con;
        while ((con = fr.read()) != -1) {
            fw.write((char) con);
        }
        fr.close();
        fw.close();
    }
}


class d {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\program1\\nawaz.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        int val = fileInputStream.available();
        byte[] b = new byte[val];
        fileInputStream.read(b);
        String data = new String(b);
        System.out.println(data);
        FileOutputStream fileOutputStream = new FileOutputStream("C:\\program1\\nawaz.txt", true);
        fileOutputStream.write(("nawaz is very bed person").getBytes());
//           val=fileInputStream.available();
//           b=new byte[val];
//           fileInputStream.read(b);
        System.out.println(data);
    }
}


class as {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("na.txt");
        fileOutputStream.write("nawaz quazi is bad boy ".getBytes());
        System.out.println("succesfull");
        fileOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream("na.txt");
        int data;
        while ((data = fileInputStream.read()) != -1) {
            System.out.print((char) data);
        }
    }
}

class count {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("www.txt");
        int size = fileInputStream.available();
        byte[] b = new byte[size];
        fileInputStream.read(b);
        String data = new String(b);
        String[] tokens = data.split(" ");
        System.out.println("no Of Words : " + tokens.length);
        int count = 0;
        for (String  str:tokens){
            if (str.equals("nawaz")){
                count++;
            }
        }
        System.out.println(count);
    }
}

class Image{
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream=new FileInputStream("C:\\program1\\IMG_20220218_201032.jpg");
        FileOutputStream fileOutputStream=new FileOutputStream("C:\\program1\\IMG.jpg");
        int c;
        while ((c=fileInputStream.read())!=-1){
            fileOutputStream.write(c);
        }
        fileInputStream.close();
        fileOutputStream.close();
    }
}