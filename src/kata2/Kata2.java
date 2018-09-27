
package kata2;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Usuario
 */
public class Kata2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] data = {"Rosa", "Pepe", "María", "Pepe", "Pepe", "Rosa"};
        histogram histo = new histogram(data);
        Map <String, Integer> histogr = histo.gethistogram();
            
        for(Map.Entry<String, Integer> entry : histogr.entrySet()) {
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());  
        }
    
    }
}

