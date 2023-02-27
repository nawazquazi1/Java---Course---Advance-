import java.io.*;
import java.util.Scanner;

public class bufferedWriter_bufferedReader {
    public static void main(String[] args) throws IOException {
        // file writer
        File f = new File("C:\\program1\\fi.txt");
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(f, true))) {
            bw.write("nawaz");
            bw.newLine();
            bw.write("akib");
            bw.newLine();
            bw.write("mohammd");
            bw.newLine();
            bw.write("quazi");
            bw.newLine();
            bw.close();
            System.out.println("Writing onto the file completed ");
        } catch (IOException e) {
            System.out.println("error occured while creating writing onto file" + e);
        }

        // file reader
        try (BufferedReader br = new BufferedReader(new FileReader(f))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("error : " + e);
        }

    }
}

class Ex {
    public static void main(String[] args) throws IOException {
        // file writer
        File f = new File("C:\\program1\\f.txt");
        Scanner sc = new Scanner(System.in);
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(f, true))) {
            System.out.println("save your files");
            String string = sc.nextLine();
            bw.write(string);
            System.out.println("Writing onto the file completed ");
        } catch (IOException e) {
            System.out.println("error occured while creating writing onto file" + e);
        }

        try (BufferedReader br = new BufferedReader(new FileReader(f))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("error : " + e);
        }
    }
}


// reading file while scanner class
class scanner {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("C:\\program1\\file2"));
        String line;
        while (sc.hasNext()) {
            line = sc.nextLine();
            System.out.println(line);
        }
        sc.close();
    }
}