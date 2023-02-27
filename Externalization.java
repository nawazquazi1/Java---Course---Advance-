import java.io.*;

public class Externalization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileOutputStream fileOutputStream = new FileOutputStream("Externalization.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        Student student1 = new Student("DSS-111", "Nawaz", "Nawaz356@dss.com", "91-9460985441");
        System.out.println(student1);
        objectOutputStream.writeObject(student1);
        FileInputStream fileInputStream = new FileInputStream("Externalization.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Student student2 = (Student) objectInputStream.readObject();
        System.out.println(student2);


    }
}

class Student implements Externalizable {
    String id;
    String Name;
    String email;
    String PhoneNo;

    public Student(String id, String name, String email, String phoneNo) {
        this.id = id;
        this.Name = name;
        this.email = email;
        this.PhoneNo = phoneNo;
    }

    public Student() {

    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        try {
            String[] str1 = id.split("-");
            int rollNo = Integer.parseInt(str1[1]);
            String[] str2 = email.split("@");
            String email = str2[0];
            String[] str3 = PhoneNo.split("-");
            long PhoneNo = Long.parseLong(str3[1]);
            out.writeInt(rollNo);
            out.writeUTF(Name);
            out.writeUTF(email);
            out.writeLong(PhoneNo);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        id = "DSS-" + in.readInt();
        Name = in.readUTF();
        email = in.readUTF() + "@dss.com";
        PhoneNo = "91-" + in.readLong();
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\n' +
                ", Name='" + Name + '\n' +
                ", email='" + email + '\n' +
                ", PhoneNo='" + PhoneNo + '\n' +
                '}';
    }
}
