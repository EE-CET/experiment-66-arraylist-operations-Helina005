


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> cart = new ArrayList<>();

        // 1. Read the number of items N
        if (sc.hasNextInt()) {
            int n = sc.nextInt();

            // 2. Add N items to the list
            for (int i = 0; i < n; i++) {
                cart.add(sc.next());
            }

            // 3. Read the search term
            String searchItem = sc.next();

            // 4. Sort the items alphabetically
            Collections.sort(cart);

            // 5. Print the sorted list
            System.out.println("Sorted Items: " + cart);

            // 6. Check if the search item exists and print result
            if (cart.contains(searchItem)) {
                System.out.println("Found");
            } else {
                System.out.println("Not Found");
            }
        }
        
        sc.close();
    }
}