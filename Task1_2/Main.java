package Task1_2;

public class Main {
    public static void main(String[] args) {
        Human owner = new Human("Артем");
        Cat cat = new Cat();

        owner.callCat(cat);
    }
}