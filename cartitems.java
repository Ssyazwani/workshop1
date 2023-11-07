import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class cartitems {
    public static void main(String[] args) {
        List<String> cart = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to your shopping cart");

        while (true) {
            System.out.print("> ");
            String input = scanner.nextLine(); // did not use this

            if (input.equals("list")) {
                if (cart.size()== 0) {
                    System.out.println("Your cart is empty");
                } else {
                    for (int i = 0; i < cart.size(); i++) {
                        System.out.println((i + 1) + ". " + cart.get(i));
                    }
                }
            } else if (input.startsWith("add")) {
                String items = input.substring(4).trim();
                String[] itemArray = items.split(",");
                for (String item : itemArray) {
                    item = item.trim();
                    if (!cart.contains(item)) {
                        cart.add(item);
                        System.out.println( item + " has been added to the cart.");
                    } else {
                        System.out.println("You already added " + item +  " in the cart" );
                    }

                }
            } else if (input.startsWith("delete")) {
                int index = Integer.parseInt(input.substring(7).trim()) - 1;
                if (index >= 0 && index < cart.size()) {
                    String removedItem = cart.remove(index);
                    System.out.println(removedItem + " removed from cart");
                } else {
                    System.out.println("Incorrect item index");
                }

                
            }
        }
    }
}