import java.util.*;

public class InventoryManagement {
    private Map<String, Integer> stock = new HashMap<>();

    // Add new product (initial quantity)
    public void addProduct(String product, int qty) {
        stock.put(product, stock.getOrDefault(product, 0) + qty);
        System.out.println("Added: " + product + " (" + qty + ")");
    }

    // Customer buys some quantity
    public void buy(String product, int qty) {
        Integer cur = stock.get(product);
        if (cur == null) {
            System.out.println(product + " is not stocked.");
            return;
        }
        int remaining = cur - qty;
        if (remaining <= 0) {
            stock.remove(product);
            System.out.println(product + " is now out of stock.");
        } else {
            stock.put(product, remaining);
            System.out.println("Sold " + qty + " of " + product + ". Remaining: " + remaining);
        }
    }

    // Shipment arrival
    public void restock(String product, int qty) {
        stock.put(product, stock.getOrDefault(product, 0) + qty);
        System.out.println("Restocked: " + product + " (" + qty + ")");
    }

    // Query product
    public void query(String product) {
        if (!stock.containsKey(product)) System.out.println(product + " : not stocked");
        else System.out.println(product + " : " + stock.get(product) + " units");
    }

    // Print out-of-stock products
    public void printOutOfStock() {
        System.out.println("Out of stock items:");
        // If we removed products when they hit zero, out-of-stock means not present.
        // If policy was to keep with 0 quantity, adjust accordingly.
        // We'll consider products that were removed as out of stock; hence nothing to print from map.
        // To follow the brief: show products with quantity == 0 (if any)
        boolean any = false;
        for (var e : stock.entrySet()) {
            if (e.getValue() == 0) {
                System.out.println(e.getKey());
                any = true;
            }
        }
        if (!any) System.out.println("- none (all stocked entries have qty > 0)");
    }

    public static void main(String[] args) {
        InventoryManagement store = new InventoryManagement();

        // 1. Add new products with initial quantities
        store.addProduct("Soap", 10);
        store.addProduct("Shampoo", 5);
        store.addProduct("Toothpaste", 3);

        // 2. Customer buys
        store.buy("Soap", 4);         // Soap -> 6
        store.buy("Toothpaste", 3);   // Toothpaste -> removed / out of stock
        store.buy("Chips", 1);        // not stocked

        // 3. New shipment arrives
        store.restock("Shampoo", 10); // Shampoo -> 15
        store.restock("Toothpaste", 5);// Toothpaste added back -> 5

        // 4. Query
        store.query("Soap");
        store.query("Toothpaste");
        store.query("Chips");

        // Print full inventory
        System.out.println("\nFull inventory:");
        store.stock.forEach((k,v)-> System.out.println(k+" : "+v));

        // Print out-of-stock items (per above logic)
        System.out.println();
        store.printOutOfStock();
    }
}


