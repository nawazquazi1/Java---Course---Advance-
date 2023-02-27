import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class serialization2 {
    public static void main(String[] args) {
        Vehicle bike = new Vehicle("bike", 101);
        Vehicle car = new Vehicle("car", 201);
        WriteObject.writeObject(bike,car);
        ReadObject.readObject(new File("C:\\program1\\Vehicle.txt"));
    }
}

class Vehicle implements Serializable {

    private String type;
    private int number;

    public Vehicle(String type,int number){
        this.number=number;
        this.type=type;
    }



    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "type='" + type + '\'' +
                ", number=" + number +
                '}';
    }
}

class WriteObject{
    public static void writeObject(Object o1,Object o2){

        try(FileOutputStream fo=new FileOutputStream("C:\\program1\\Vehicle.txt")) {
            try(ObjectOutputStream oo=new ObjectOutputStream(fo)) {
                oo.writeObject(o1);
                oo.writeObject(o2);
                System.out.println("Object Written onto the file");
            }

        } catch (IOException e) {
            System.out.println("File not found"+e);
        }
    }
}

class ReadObject{
    static void readObject(File file){
        try(FileInputStream fn=new FileInputStream(file)) {
            try(ObjectInputStream ob=new ObjectInputStream(fn)) {
                Vehicle v= (Vehicle) ob.readObject();
                Vehicle v1= (Vehicle) ob.readObject();
                System.out.println("object 1: "+v);
                System.out.println("object 2: "+v1);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
class table{
     public static void main(String[] args) {
         for (int i=1;i<=10;i++){
             System.out.println(i*14);
         }

    }
}