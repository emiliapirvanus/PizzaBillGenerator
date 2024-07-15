import java.util.HashMap;
import java.util.Map;
public class Pizza {
    private PizzaOption name;
    private String size;
    private Dough dough;
    private double basePrice = 30.0;
    private Map<Topping, Integer> toppings = new HashMap<>();

    public Pizza() {
    }

    public Pizza(PizzaOption name, String size, Dough dough, double basePrice, Map<Topping, Integer> toppings) {
        this.name = name;
        this.size = size;
        this.dough = dough;
        this.basePrice = basePrice;
        this.toppings = toppings;
    }

    public PizzaOption getName() {
        return name;
    }

    public void setName(PizzaOption name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Dough getDough() {
        return dough;
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public Map<Topping, Integer> getToppings() {
        return toppings;
    }

    public void setToppings(Map<Topping, Integer> toppings) {
        this.toppings = toppings;
    }

    private Topping getToppingByName(String toppingName) {
        for (Topping topping : Topping.values()) {
            if (topping.getName().equalsIgnoreCase(toppingName)) {
                return topping;
            }
        }
        return null; // Topping not found
    }

    public void addTopping(String inputTopping, int quantity) {
        Topping selectedTopping = getToppingByName(inputTopping);
        if (selectedTopping != null) {
            toppings.put(selectedTopping, toppings.getOrDefault(selectedTopping, 0) + quantity);
            System.out.println(quantity + " " + selectedTopping.getName() + " added");
        } else {
            System.out.println("Invalid topping: " + inputTopping);
        }
    }

    public double calculatePrice(){

        for(Map.Entry<Topping, Integer> toppingEntry : toppings.entrySet()){
            basePrice+= toppingEntry.getValue() * toppingEntry.getKey().getPrice();
        }
        return basePrice; //corectez sa se inteleaga ca este pretul final
    }

    public String choosePizza(int option){
        switch (option){
            case 1 -> {
                System.out.println("Ai selectat pizza Margherita");
                return PizzaOption.MARGHERITA.getName();
            }
            case 2 -> {
                System.out.println("Ai selectat pizza Pollo");
                return PizzaOption.POLLO.getName();
            }
            case 3 -> {
                System.out.println("Ai selectat pizza Capriciosa");
                return PizzaOption.CAPRICIOSA.getName();
            }
            default -> System.out.println("Nu exista aceasta optiune");
        }

        return null;
    }


    public String chooseDough(int option){
        if (option == 1){
            System.out.println("Ai selectat blat pufos");
            return Dough.FLUFFY.getName();
        }

        if (option == 2){
            System.out.println("Ai selectat blat subtire");
        }

        return null;
    }

}
