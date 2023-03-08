import java.io.FileWriter;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**         Метод добавление новых игрушек и возможность изменения веса (частоты выпадения игрушки)
        Возможность организовать розыгрыш игрушек.
        Например, следующим образом:
        С помощью метода выбора призовой игрушки – мы получаем эту призовую игрушку и записываем в список\массив.
        Это список призовых игрушек, которые ожидают выдачи.
        Еще у нас должен быть метод – получения призовой игрушки.
        После его вызова – мы удаляем из списка\массива первую игрушку и сдвигаем массив. А эту игрушку записываем в текстовый файл.
        Не забываем уменьшить количество игрушек
*/
public class Program {
    private static ArrayList<Toy> basketWithToys3;
    public static void main(String[] args) throws IOException {

        Toy Doll = new Toy(33, "Doll", 1, 30);
        Toy Robot = new Toy(7, "Robot", 2, 20);
        Toy Constructor = new Toy(23, "Constructor", 1, 15);

        System.out.println(Doll.getInfo());
        System.out.println(Robot.getInfo());
        System.out.println(Constructor.getInfo());
        System.out.println();

        addNewToy(111, "Road", 1, 30);
        addNewToy(222, "Board_games", 3, 15);
        addNewToy(223, "Crane", 1, 55);

        // Implemented class ChangeDrop to adjust drop_frequency (weight)
        Toy Constructor1= new ChangeDrop(2002, "CONSTRUCT_for_SMALL", 1, 15);
        System.out.println();
        System.out.println("Realized class ChangeDrop for modify drop_frequency (веса)");
        System.out.println(Constructor1.getInfo());

        ArrayList<Toy> basketWithToys = new ArrayList<>();
        System.out.println("Created ArrayList 'basketWithToys' of Toys:");
        basketWithToys.add(new Toy(301, "Toy1", 1, 5));
        basketWithToys.add(new Toy(302, "Toy2", 1, 10));
        basketWithToys.add(new ChangeDrop(303, "Toy3", 1, 13));

        ArrayList<Toy> basketWithToys2 = new ArrayList<>();
        System.out.println("Created ArrayList_2 'basketWithToys2' of Toys in Method addNewToyInBasket");
        addNewToyInBasket(basketWithToys2, 701, "Doll", 1, 10);
        addNewToyInBasket(basketWithToys2, 702, "Robot", 1, 20);
        addNewToyInBasket(basketWithToys2, 703, "Constructor", 1, 25);
        addNewToyInBasket(basketWithToys2, 704, "Frog", 3, 10);
        addNewToyInBasket(basketWithToys2, 705, "Fox", 1, 10);
        basketWithToys2.add(new Toy(706, "Bracelet", 1, 25));
        basketWithToys2.add(new ChangeDrop(707, "Puzzle", 2, 5));

        System.out.println("---------------------");
        System.out.println("Printing basketWithToys2");
        printArray(basketWithToys2);
        System.out.println("Printing basketWithToys");
        printArray(basketWithToys);

        basketWithToys3 = new ArrayList<>();
        System.out.println("---------------------");
        System.out.println("Define the array of winners toys");
        choiceOfPrizeToys(basketWithToys2);
        choiceOfPrizeToys(basketWithToys2);
        choiceOfPrizeToys(basketWithToys2);
        System.out.println("Printing basketWithToys3");
        printArray(basketWithToys3);

        getBasketPrizeToy(basketWithToys3);
        System.out.println("Basket of leftover toys:");
        printArray(basketWithToys3);
    }

    private static void printArray(ArrayList<Toy> basketWithToys2) {
        for (Toy toy : basketWithToys2) {
            System.out.println(toy.getInfo());
        }
    }

    public static void addNewToy(int id, String name, int qua, int drop) {
//        System.out.println("Get add new toy...");
        Toy toy = new Toy(id, name,qua, drop);
        System.out.println(toy.getInfo());
    }
    public static ArrayList<Toy> addNewToyInBasket(List<Toy> basketWithToys2, int id, String name, int qua, int drop) {

        basketWithToys2.add(new Toy(id, name, qua, drop));
        return (ArrayList<Toy>) basketWithToys2;
    }
//    public static void changeDropFrequency() {
    // realized in Class ChangeDrop

//    }
    public static ArrayList<Toy> choiceOfPrizeToys(ArrayList<Toy> basketWithToys2){
        SecureRandom random = new SecureRandom();
        basketWithToys3.add(basketWithToys2.get(random.nextInt(basketWithToys2.size())));

        return basketWithToys3;
    }
    public static ArrayList<Toy> getBasketPrizeToy(ArrayList<Toy> basketWithToys3) throws IOException {
        System.out.println("this toy won (data saved to file 'wonToy.csv':");
        System.out.println(basketWithToys3.get(0).getInfo());

        FileWriter writer = new FileWriter("wonToy.csv");
            writer.write(basketWithToys3.get(0).getInfo());
        writer.close();

        basketWithToys3.remove(0);

        return basketWithToys3;
    }
}
