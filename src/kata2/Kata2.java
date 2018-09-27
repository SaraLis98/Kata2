
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
        Integer[] data = {1, -1, 7, 100, 7, -1, 7, 100, -1, 1, 7, 100, -1, 7, 100};
        histogram histo = new histogram(data);
        Map <Integer, Integer> histogr = histo.gethistogram();
            
        for(Map.Entry<Integer, Integer> entry : histogr.entrySet()) {
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());  
        }
    
    }
}

