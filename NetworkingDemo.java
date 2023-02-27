import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class NetworkingDemo {
    public static void main(String[] args) throws UnknownHostException {
        String url="www.simplilearn.com";
        InetAddress inetAddress= Inet4Address.getByName(url);

        System.out.println("Address  : "+ Arrays.toString(inetAddress.getAddress()));
        //getHostAddress    Method
        System.out.println("Host Address  : "+ (inetAddress.getHostAddress()));
        // isAnyLocalAddress  method
        System.out.println("isAnyLocalAddress  : "+ (inetAddress.isAnyLocalAddress()));
        // isLinkLocalAddress  method
        System.out.println("isLinkLocalAddress : "+ (inetAddress.isLinkLocalAddress()));
        // isLoopbackAddress
        System.out.println("isLoopbackAddress : "+ (inetAddress.isLoopbackAddress()));
        //isSiteLocalAddress
        System.out.println("isSiteLocalAddress : "+ (inetAddress.isSiteLocalAddress()));
        //hashcode
        System.out.println("hashcode  : "+inetAddress.hashCode());
     }
}
