import java.net.InetAddress;

public class IPAddressDisplay
{
   public static void main(String args[]) throws Exception
   {
      InetAddress inetAddress = InetAddress.getLocalHost();
      System.out.println("IP Address: "+inetAddress.getHostAddress());
  }
}