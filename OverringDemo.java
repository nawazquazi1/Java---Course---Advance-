import javax.swing.text.Style;
import java.io.*;
import java.lang.*;
import java.util.Arrays;
import java.util.Date;
import java.util.stream.*;
import java.security.*;
import java.util.Scanner;

class UserDefinePackage {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String dir = sc.next();
        String dir2=sc.next();
        File MyDir = new File(dir);
        File MyDir2= new File(dir);
        int c = 0;
        try {
            FileReader inputStream = new FileReader(MyDir);
            FileWriter fileReader = new FileWriter(MyDir2);
            do {
                c = inputStream.read();
                if (c != -1) {
                    fileReader.write(c);
                }
            } while (c != -1);

            System.out.println("  file copy Successfully....");
            inputStream.close();
            fileReader.close();
            FileOutputStream fileOutputStream = new FileOutputStream(dir);
            fileOutputStream.write(Integer.parseInt(dir2));
            System.out.println("Data written to file successfully");
        } catch (IOException io) {
            System.out.println("Exception Occurred ");
        }

//        System.out.println("  DAta return to Successfully....  ");

//        Filter filter=new Filter("txt");
//
//        File MyDir = new File(dir);
//        if (MyDir.isDirectory()){
//            File[] files=MyDir.listFiles();
//            for (File a_file:files){
//                System.out.println(a_file.getName());
//            }
//            System.out.println(" Total "+ files.length);
//        }else {
//            System.out.println("Not a Directory ");
//        }
//        System.out.println("file name :" + f.getName());
//        System.out.println(" file path : " + f.getPath());
//        System.out.println("parent of file : " + f.getParent());
//        System.out.println(" file size : " + f.length());
//        System.out.println("  file  exuteblae : " + f.canExecute());
//        System.out.println(" last modifive " + f.lastModified());
//        System.out.println(Arrays.toString(f.list()));
//        File f1 = new File("");
//        if (!f.isDirectory()) {
//            System.out.println(dir+"is not Directory ");
//            return;
//        }
//        for (String  s: Objects.requireNonNull(f.list())){
//            System.out.println(s);
//        }

//        File [] file =f.listFiles();
//        Date fileDat=new Date();
//        for (File a_file:file){
//            fileDat.setTime(a_file.lastModified());
//            String  Content;
//            Content=a_file.isDirectory()?"<DIR>":" "+a_file.length();
//            System.out.println(fileDat+"\t" + Content+ "\t"+ a_file);
//        }
    }
}
