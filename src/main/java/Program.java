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
    public static void main(String[] args) {
        Toy Doll = new Toy(33,"Doll", 1,30);
        Toy Robot = new Toy(7,"Robot", 2,20);
        Toy Constructor = new Toy(23,"Constructor", 1,15);
        Toy Soft_toy = new Toy(17,"Soft_toy", 1,35);
        System.out.println(Doll.getInfo());
        System.out.println(Robot.getInfo());
        System.out.println(Constructor.getInfo());
        System.out.println(Soft_toy.getInfo());

        addNewToy(111,"Road", 1,50);
        changeDropFrequency();
    }
    public static void addNewToy(int number, String name, int qua, int drop) {
        System.out.println("Get add toy...");
        Toy toy = new Toy(number, name,qua, drop);
        System.out.println(toy.getInfo());
    }
    public static void changeDropFrequency() {
        System.out.println("Get change Drop Frequency of the toys");
        int drop = Toy.r.nextInt(0, 5);
        System.out.print("newDrop: " + drop);
    }

}
