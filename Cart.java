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
        
         //     String items = input.substring(4).trim();
        //      String[] itemarray = items.split(",");

        switch(input){ // change to itemarray
            case ("list"): {
                if (cartitems.isEmpty()){
                    System.out.println("Your cart is empty");
                    break;
                } else {
                    for (int i = 0; i <cartitems.size(); i++){
                    System.out.println((i + 1) + ". " + cartitems.get(i));
                     break;
                    }
           
                
                }
            }
            case ("add"):{
                
                String items = input.substring(4).trim();
                String[] itemarray = items.split(",");
                for (String item : itemarray) {
                    item = item.trim();
                if(!cartitems.contains(item)){
                    cartitems.add(item);
                    System.out.println(item + " had been added to cart");
                } else {
                    System.out.println("You already have " + item + " in cart");
                }
                break;
            }
        }
            
            case ("delete"): {
                int index = Integer.parseInt(input.substring(7).trim()) - 1; //remember this
                if (index >= 0 && index < cartitems.size()) {
                    String removedItem = cartitems.remove(index);
                    System.out.println(removedItem + " removed from cart");
                } else {
                    System.out.println("Incorrect item index");
                } break;


            }
        }
    
       
 
        }  

    }


     }

     //REDO thanks
     


 

