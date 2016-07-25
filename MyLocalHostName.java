

package networking;

/**
 *
 * @author Amany
 */

import java.net.InetAddress;
import java.net.UnknownHostException;
 
public class MyLocalHostName {
    public static void main(String a[]){
        try {
            InetAddress myHost = InetAddress.getLocalHost();
            System.out.println(myHost.getHostName());
        } catch (UnknownHostException ex) {
            ex.printStackTrace();
        }
    }
}
