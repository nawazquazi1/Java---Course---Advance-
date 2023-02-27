import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CodeWithHarry {
    public static void main(String[] args) throws IOException {
//        File myFile = new File("ateeq.txt");
//        myFile.createNewFile();
//        FileWriter myFileWriter=new FileWriter("Nawaz.txt");
//        myFileWriter.write(" this is first file this is java cours\n ok now bike");
//        myFileWriter.close();


//        File myFile = new File("Main.java");
//        Scanner sc=new Scanner(myFile);
//        while (sc.hasNextLine()){
//            String  line=sc.nextLine();
//            System.out.println(line);
//        }
//        sc.close();
        File myFile = new File("Nawaz.txt");
        if (myFile.delete()) {
            System.out.println("i have deleted : " + myFile.getName());
        } else {
            System.out.println(" some problam");
        }
    }
}
