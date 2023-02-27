import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc {
    public static void main(String[] args) {
//        demo d=new demo("nawaz","10001","100001","9460985441");
//        String name=d.getName();
//        String  id=d.getId();
//        String roll=d.getRoll();
//        String  phoneNo=d.getPhoneNo();
        demo d1 = new demo("sahil", "10004", "100004", "7014543726","bhilwara");
        String name = d1.getName();
        String id = d1.getId();
        String roll = d1.getRoll();
        String phoneNo = d1.getPhoneNo();


////        String  address=d.getAddress();
//        int marks = demo.marks;
//        String url = "jdbc:postgresql://localhost/test";
        String sql = "insert into demo(name, id, roll, phoneno, address, marks) " + "values ( '" + d1.getName() + "'," + d1.getId() + "," + d1.getRoll() + "," + d1.getPhoneNo() + "," + d1.getAddress() + "," + demo.marks + ")";
        connection(sql);


//        try {
//            Connection conn = DriverManager.getConnection(url, "postgres", "postgres");
//            Statement st = conn.createStatement();
//            int m = st.executeUpdate(sql);
//            if (m == 1) {
//                System.out.println("inserted successfully : " + sql);
//            } else {
//                System.out.println("Insertion failed");
//            }
//        } catch (SQLException e) {
//            System.out.println(e);
//            e.printStackTrace();
//        }
    }

    public static void connection(String sql) {
        String url = "jdbc:postgresql://loc";
        try {
            Connection conn = DriverManager.getConnection(url, "postgres", "postgres");
            Statement st = conn.createStatement();
            int a = st.executeUpdate(sql);
            if (a == 1) {
                System.out.println("inserted successfully : " + sql);
            } else {
                System.out.println("Insertion failed");
            }
        } catch (SQLException e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }

}


class demo {
    private String name;
    private String id;
    private String roll;
    private String phoneNo;
    private String address;

    public demo() {
        super();
    }

    final static int marks = 50;

    public demo(String name, String id, String roll, String phoneNo,String address) {
        ;
        this.name = name;
        this.id = id;
        this.roll = roll;
        this.phoneNo = phoneNo;
        this.address = address;
    }

    public String getRoll() {
        return roll;
    }

    public void setRoll(String roll) {
        this.roll = roll;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAddress() {
        return address;

    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "demo{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", roll='" + roll + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

}