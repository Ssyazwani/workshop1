import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Cart {
    public static void main(String[] args) {
        List<String> cartitems = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to your shopping cart");

        while (true) {
            System.out.print("> ");
            String input = scanner.nextLine();
            String[] items = input.split(" "); //splitting an array into strings
        
        switch(items[0]){ 
            case ("list"): 
                if (cartitems.isEmpty()){
                    System.out.println("Your cart is empty");
                } else {
                    for (int i = 0; i <cartitems.size(); i++){
                    System.out.println((i + 1) + ". " + cartitems.get(i));
                     
                    }
                 break;
            }
            case ("add"):
            if (input.length() > 4) {
              String item = input.substring(4).trim();
              String[] itemarray = item.split(",");
                for (String thing : itemarray) {
                    item = item.trim();
                if(!cartitems.contains(item)){
                    cartitems.add(item);
                    System.out.println(item + " had been added to cart");
                } else {
                    System.out.println("You already have " + item + " in cart");
                }
            
            }
            break;
        }
            case ("delete"): {
                if (input.length() > 7) {
             int index = Integer.parseInt(input.substring(7).trim()) - 1;  
                if (index >= 0 && index < cartitems.size()) {
                    String removedItem = cartitems.remove(index);
                    System.out.println(removedItem + " removed from cart");
                } else {
                    System.out.println("Incorrect item index");
                }

            }

            break;
        }
    
       // do not remove by index --> because u are modifying the list or maybe u create a second list with the item that already has been removed
       // use stream 
 
        }  

    }

    
    }

}
     

     //SOLVED*  


 

