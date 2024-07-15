import java.util.Map;
import java.util.Scanner;

public class OrderingSystem {


    public static void main(String[] args) {

        Pizza pizza = new Pizza();
        Scanner scanner = new Scanner(System.in);
        displayPizzaOptions();
        System.out.print("Enter option: ");
        int pizzaOption = scanner.nextInt();   // trebuie sa validez: chiar daca pun un nr ce nu e valid programul continua
        String typeOfPizza = pizza.choosePizza(pizzaOption);

        displayDoughOptions();
        System.out.print("Enter option: ");
        int doughOption = scanner.nextInt();
        scanner.nextLine();
        String typeOfDough = pizza.chooseDough(doughOption);

        while(true) {
            System.out.println("Do you want extra toppings? Enter Y - Yes or N - No");
            String answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("N")){
                break;
            }
            if (answer.equalsIgnoreCase("y")){
                displayToppingsOptions();
                System.out.print("Choose topping: ");
                String topping = scanner.nextLine();
                System.out.print("Quantity: ");
                int quantity = scanner.nextInt();
                scanner.nextLine();
                pizza.addTopping(topping, quantity);
            }

        }

        System.out.println("You have to pay: " + pizza.calculatePrice());



    }

    private static void displayPizzaOptions(){

        System.out.println("Choose pizza: ");
        System.out.println("""
                1 - Pizza Margherita
                2 - Pizza Capriciosa
                3 - Pizza Pollo
                """);
    }

    private static void displayToppingsOptions(){

        System.out.println("Choose toppings: ");
        System.out.println("""
                1 - Cheese
                2 - Olives
                3 - Salami
                4 - Mushrooms
                """);
    }

    private static void displayDoughOptions(){
        System.out.println("Choose the type of dough: ");
        System.out.println("""
                1 - Fluffy
                2 - Thin
                """);
    }

    private static void displayBill(String typeOfPizza, String dough, Map<Topping, Integer> toppings){
        //TO DO
    }


}
