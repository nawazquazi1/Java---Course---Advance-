import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NioDemo {
    public static void main(String[] args) throws IOException {

        // file read
        FileInputStream fin = new FileInputStream("C:\\program1\\qq.txt");
        FileChannel read = fin.getChannel();
        ByteBuffer readB = ByteBuffer.allocate(1024);
        int result = read.read(readB);
        System.out.println("file read successfully " + result);


        // file write
        FileOutputStream fout = new FileOutputStream("C:\\program1\\qq1.txt");
        FileChannel WritChannel = fout.getChannel();
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        String message = "this is  TEST String";
        buffer.put(message.getBytes());
        buffer.flip();
        WritChannel.write(buffer);
        System.out.println("file written successfully");
    }
}
