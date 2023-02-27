import java.io.*;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class File_Reader_Writer {
    public static void main(String[] args) {

        // FILE READE & WRITE THE FOR PROGRAM
        Scanner sc = new Scanner(System.in);
        try {
            String FilePath = sc.next();
            RandomAccessFile RAF = new RandomAccessFile(FilePath, "rw");
            byte[] b = new byte[(int) RAF.length()];
            RAF.read(b);
            System.out.println("TEH ORIGINAL CONTENT OF FILE : " + new String(b));
            RAF.seek(0);
            RAF.write("this is the content writtein from the program \n".getBytes());
            RAF.write("I WANT TO CHANGE THE  CONTENT \n".getBytes());
            RAF.seek(0);
            b = new byte[(int) RAF.length()];
            RAF.read(b);
            System.out.println("MODIFIED CONTENT");
            System.out.println(new String(b));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class ex1{
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("plz enter file path");
        String url=sc.next();
        try {
            RandomAccessFile rm=new RandomAccessFile(url,"rw");
            byte [] b=new byte[(int) rm.length()];
            rm.read(b);
            System.out.println("enter your query ");
            String query=sc.next();
            rm.seek(0);
            rm.write(query.getBytes());
            rm.seek(0);
            b=new byte[(int) rm.length()];
            rm.read(b);
            System.out.println(new String(b));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}