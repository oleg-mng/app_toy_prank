import java.util.Random;

public class Toy {

    public static Random r;
    protected int id;
        public String name;
        protected int quantity;
        protected int drop_frequency;
        static {
            Random r = new Random();
        }

        public Toy(int id, String name, int quantity, int drop_frequency) {
            this.id = id;
            this.name = name;
            this.quantity = quantity;
            this.drop_frequency = drop_frequency;
        }
        public String getInfo() {
        return String.format("id: %d   name: %s   quantity: %d   drop_frequency: %d", id, name, quantity,
                drop_frequency, getClass().getSimpleName());
    }
}
