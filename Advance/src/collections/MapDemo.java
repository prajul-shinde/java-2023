package collections;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    

    public static void main(String[] args) {
        Map<String, Customer> map = new HashMap<>();
        Customer c1 = new Customer("goku", "goku1@gmail.com");
        Customer c2 = new Customer("vegeta", "vegeta1@gmail.com");

        map.put(c1.getEmail(), c1);
        map.put(c2.getEmail(), c2);

        Customer unknown = new Customer("unknown", "unknown");
        Customer defaultcCustomer = map.getOrDefault("e1", unknown);
        System.out.println(defaultcCustomer);
        for(var entry: map.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}
