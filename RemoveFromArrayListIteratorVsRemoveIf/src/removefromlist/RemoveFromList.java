package removefromlist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class RemoveFromList {

    public static void main(String[] args) {

        int total = 500000;
        int specimens = 0;
        Random rnd = new Random();
        
        List<Product> productsA = new ArrayList<>();
        List<Product> productsB = new ArrayList<>();        

        for (int i = 0; i < total; i++) {
            int price = rnd.nextInt(1000);
            productsA.add(new Product("product_" + i, price));
            productsB.add(new Product("product_" + i, price));
            
            if(price > 500) {
                specimens ++;
            }
        }
        
        System.out.println("Removing " + specimens + " specimens from a total of " + total + " ...");

        long startA = System.nanoTime();        
        for (Iterator<Product> iterator = productsA.listIterator(); iterator.hasNext();) {            
            if (iterator.next().getPrice() > 500) {
                iterator.remove();
            }
        }         
        System.out.println("Took (iterator): " 
                + (double)(System.nanoTime() - startA)/ 1_000_000_000.0 + " s");
        // System.out.println("Took (iterator): " 
        //      + (double)(System.nanoTime() - startA)/ 1_000_000.0 + " ms");
        
        long startB = System.nanoTime();        
        productsB.removeIf((p) -> p.getPrice() > 500);
        
        System.out.println("Took (removeIf): " 
                + (double)(System.nanoTime() - startB)/ 1_000_000_000.0 + " s");
        // System.out.println("Took (removeIf): " 
        //      + (double)(System.nanoTime() - startB)/ 1_000_000.0 + " ms");

    }

}
