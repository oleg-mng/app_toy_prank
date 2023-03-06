import java.util.ArrayList;
import java.util.Random;

public class ChangeDrop extends Toy{
    public static int drop;
        static Random r = new Random();

    public ChangeDrop(int id, String name, int quantity, int drop_frequency) {
        super(id, name, quantity, drop_frequency);
//        this.drop =ChangeDrop.r.nextInt(1, 40);
//        this.drop = 40;
        this.drop_frequency = 37;
    }

    public String getInfo() {
        return String.format("id: %d   name: %s   quantity: %d   drop_frequency: %d", id, name, quantity,
                drop_frequency, getClass().getSimpleName());
    }
}
