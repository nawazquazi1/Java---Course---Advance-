import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

//file class methods
public class FileDemo {
    public static void main(String[] args) throws IOException {
        File f = new File("src/new.txt");
//        System.out.println(f.length());
//        System.out.println(f.getName());
//        System.out.println(f.isFile());
//        System.out.println(f.getFreeSpace());
//        System.out.println(f.canWrite());
//        System.out.println(f.canExecute());
//        System.out.println(f.canRead());
//        System.out.println(f.lastModified());
//        f.createNewFile();
//        System.out.println(f.delete());
//           f.createNewFile();
    }
}
             // create  new a dir
class Dir {
    public static void main(String[] args) {
        File file = new File("C:\\program\\one");
        //file.mkdir();
        if (file.mkdirs()) {
            System.out.println("Created onr within program");
        } else {
            System.out.println("sorry ...check the path");
        }
//        System.out.println(file.delete());
    }
}


class FileDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String DirName = sc.next();
        //  dir
        File dirFile = new File(DirName);
        if (!dirFile.isDirectory()) {
            System.out.println(DirName + " is file not a directory");
            return;
        }
        for (String f : dirFile.list()) {
            System.out.println(f);
        }

        //files
        File[] files = dirFile.listFiles();
        Date fileDate = new Date();
        for (File a_File : files) {
            fileDate.setTime(a_File.lastModified());
            String content;
            content = a_File.isDirectory() ? "<DIR>" : " " + a_File.length();
            System.out.println(fileDate + "\t" + content + "\t" + a_File);
        }
    }
}

//filtering
class FilterExt implements FilenameFilter {
    String ext;

    FilterExt(String ext) {
        this.ext = ext;
    }

    @Override
    public boolean accept(File dir, String name) {
        return name.endsWith(ext);
    }
}

class FileListDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FilenameFilter only = new FilterExt("java");
        String dirname = sc.next();
        File MyDir = new File(dirname);
        if (MyDir.isDirectory()) {
            File[] files = MyDir.listFiles(only);
            for (File a_file : files) {
                System.out.println(a_file.getName());
            }
            System.out.println("total : " + files.length);
        } else {
            System.out.println("not a dir ");

        }

    }
}

