public enum Dough {
    FLUFFY("Fluffy"),
    THIN("Thin");

   private final String name;

    Dough(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }
}
