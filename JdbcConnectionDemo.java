import java.sql.*;

public class JdbcConnectionDemo {
    public static void main(String[] args) throws SQLException{
        String url="jdbc:postgresql://localhost/Demo";
        Connection conn=null;
        int roll=43;
        String name="akib nawaz";
        int age =29;
        String sql="insert into Student(RollNo, Name) "+"values ( "+roll+",'"+name +"'"+")";
//        Connection c = null;
        try {
//            Class.forName("org.postgresql.Driver");
//            c = DriverManager.register(new org.postgresql.Driver());
//            c = DriverManager
//                    .getConnection("jdbc:postgresql://192.168.29.4:5432/test",
//                            "postgres", "postgres");
            conn= DriverManager.getConnection(url,"postgres","7410");
            Statement st=conn.createStatement();
            int m=st.executeUpdate(sql);
            if (m==1){
                System.out.println("inserted successfully : "+sql);
            }
            else {
                System.out.println("Insertion failed");
            }
        } catch (Exception e) {
//            e.printStackTrace();//
            System.out.println(e);
        }finally {
//            conn.close();
        }
    }
}
