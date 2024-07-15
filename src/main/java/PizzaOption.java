public enum PizzaOption {

        MARGHERITA("Margerita"),
        POLLO("Pollo"),
        CAPRICIOSA("Capriciosa");

        private final String name;

        PizzaOption(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

}
