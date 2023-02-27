import java.io.Console;

public class console{
    public static void main(String[] args) throws Exception {
        Console console = System.console();
        String userName = console.readLine("User name   :");
        char[] pass = console.readPassword("Password     :");
        String password = new String(pass);
        if (userName.equals("nawaz") && password.equals("nawaz@441")) {
            System.out.println("Login Success");
        } else {
            System.out.println("Login failure");
        }
    }
    }