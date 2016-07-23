
package networking;
/**
 *
 * @author Amany
 */
import java.net.MalformedURLException;
import java.net.URL;

public class SimpleUrl {
    public static void main(String a[]){
        try {
            String myUrl = "http://www.goggle.com";
            URL url = new URL(myUrl);
            System.out.println(url.toString());
        } catch (MalformedURLException ex) {
            ex.printStackTrace();
        }
    }
}
