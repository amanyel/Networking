
package networking;

/**
 *
 * @author Amany
 */

import java.net.MalformedURLException;
import java.net.URL;

public class FileUrl {

    public static void main(String a[]){
        try {
            URL url = new URL("file://c:/java");
            System.out.println(url.toString());
        } catch (MalformedURLException ex) {
            ex.printStackTrace();
        }

    }
}
