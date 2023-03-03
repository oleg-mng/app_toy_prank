public class Program {
    public static void main(String[] args) {
        Toy Doll = new Toy(0,"Doll", 1,30);
        Toy Robot = new Toy(1,"Robot", 2,20);
        Toy Constructor = new Toy(2,"Constructor", 1,15);
        Toy Soft_toy = new Toy(3,"Soft_toy", 1,35);
        System.out.println(Doll.getInfo());
        System.out.println(Robot.getInfo());
        System.out.println(Constructor.getInfo());
        System.out.println(Soft_toy.getInfo());

    }
}
