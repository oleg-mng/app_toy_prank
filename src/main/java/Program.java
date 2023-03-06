import java.util.ArrayList;
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
    int n = 10; // количество игрушек
    public static void main(String[] args) {

        Toy Doll = new Toy(33, "Doll", 1, 30);
        Toy Robot = new Toy(7, "Robot", 2, 20);
        Toy Constructor = new Toy(23, "Constructor", 1, 15);
        Toy Soft_toy = new Toy(17, "Soft_toy", 1, 35);
        System.out.println(Doll.getInfo());
        System.out.println(Robot.getInfo());
        System.out.println(Constructor.getInfo());
        System.out.println(Soft_toy.getInfo());

        addNewToy(111, "Road", 1, 50);
        addNewToy(222, "Board_games", 3, 5);
//        changeDropFrequency(222,20);

        ArrayList<Toy> basketWithToys = new ArrayList<>();
        System.out.println("Build ArrayList 'basketWithToys' of Toys:");
        basketWithToys.add(new Toy(301, "Toy1", 1, 5));
        basketWithToys.add(new Toy(302, "Toy2", 1, 10));
        basketWithToys.add(new Toy(303, "Toy3", 1, 13));
        for (Toy basketWithToy : basketWithToys) {
            System.out.println(basketWithToy.getInfo());
        }

        ArrayList<Toy> basketWithToys2 = new ArrayList<>();
        System.out.println("Build ArrayList_2 'basketWithToys2' of Toys in Method addNewToyInBasket:");
        addNewToyInBasket(basketWithToys2, 777, "Board_games777", 1, 5);
        addNewToyInBasket(basketWithToys2, 888, "Board_games777", 1, 5);
        addNewToyInBasket(basketWithToys2, 999, "Board_games777", 1, 5);
        basketWithToys2.add(new Toy(1919, "Board_games1919", 1, 5));
//        for (Toy toy : basketWithToys2) {
//            System.out.println(toy.getInfo());
//        }
        System.out.println("---------------------");
        System.out.println("Printing basketWithToys2");
        printArray(basketWithToys2);
        System.out.println("Printing basketWithToys");
        printArray(basketWithToys);

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
//        System.out.println("Get add new toy...");
        basketWithToys2.add(new Toy(id, name, qua, drop));
        return (ArrayList<Toy>) basketWithToys2;
    }
//    public static void changeDropFrequency(int id,int newDrop) {
//        System.out.println("Get change Drop Frequency of the toys");
//        for (int i = 0; i < n; i++) {
//            if (List[i] == id) drop = newDrop;
//        }
//        System.out.print("newDrop: " + newDrop);
//        System.out.println(toy.getInfo());
//    }
    public static void choiceOfPrizeToys(){

    }
}
