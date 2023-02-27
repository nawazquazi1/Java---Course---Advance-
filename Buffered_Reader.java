import java.io.*;
import java.util.Arrays;

//  Buffered_Reader  Dynamic input
public class Buffered_Reader {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Data ");
        String data = bufferedReader.readLine();
        System.out.println("Enter data ");
        int val = bufferedReader.read();
        System.out.println("ReadLine  :" + data);
        System.out.println("Read   :" + val + "[" + (char) val + "]");

    }
}

