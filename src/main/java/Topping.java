public enum Topping {
    CHEESE("Cheese", 3.0),
    OLIVES("Tomato", 2.0),
    SALAMI("Olives", 1.5),
    MUSHROOMS("Bacon", 4.0);

    private final String name;
    private final double price;

    Topping(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
