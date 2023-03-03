
public class Toy {

        protected static int id;

        protected String name;
        protected int quantity;
        protected int drop_frequency;

        public Toy(int id, String name, int quantity, int drop_frequency) {
            this.id = id;
            this.name = name;
            this.quantity = quantity;
            this.drop_frequency = drop_frequency;
        }
        public String getInfo() {
        return String.format("id: %d   name: %s   quantity: %d   drop_frequency: %d", id, name, quantity,
                drop_frequency);
    }
}
