import java.util.ArrayList;
import java.util.Random;

public class ChangeDrop extends Toy{
        static Random r = new Random();

    public ChangeDrop(int id, String name, int quantity, int drop_frequency) {
        super(id, name, quantity, drop_frequency);
        //redefining the weight randomly
        this.drop_frequency =ChangeDrop.r.nextInt(1, 45);
        //redefining the weight with an exact figure ->
//        this.drop_frequency = 45;
    }

    public String getInfo() {
        return String.format("id: %d   name: %s   quantity: %d   drop_frequency: %d", id, name, quantity,
                drop_frequency, getClass().getSimpleName());
    }
}
