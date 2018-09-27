/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
        int[] data = {1, -1, 7, 100, 7, -1, 7, 100, -1, 1, 7, 100, -1, 7, 100};
        Map <Integer, Integer> histogram = new HashMap<>();
        for (int i = 0; i < data.length; i++) {
            if(histogram.containsKey(data[i])){
                histogram.put(data[i], histogram.get(data[i])+1);
            }else{
            histogram.put(data[i],1);
            }
        }
        for(Map.Entry<Integer, Integer> entry : histogram.entrySet()) {
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());  
        }
    
    }
}
