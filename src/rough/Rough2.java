package rough;

import java.util.LinkedHashMap;
import java.util.Map;

public class Rough2 {
    public static void main(String[] args) {
        //LinkedHashMap allows data to be stored in the order of entry
        Map<String, String> map1 = new LinkedHashMap<>();
        map1.put("Tan","Seyi");
        map1.put("Ben","Feyi");
        map1.put("ken","Femi");
        map1.put("Grek","Kevin");
        map1.put("Lin","Seth");
        map1.put("Pet","Dan");

        //Set<String> keys = map1.keySet();

        for(String key:map1.keySet()){
            System.out.println(key+ " : "+map1.get(key));
        }


    }
}
