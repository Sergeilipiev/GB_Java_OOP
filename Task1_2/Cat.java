package Task1_2;

public class Cat extends Pet {
    @Override
    public void answer(String sound) {
        if (sound.equals("кис-кис")) {
            System.out.println("Мяу!");
        }
    }
}
