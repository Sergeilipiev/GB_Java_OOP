package Task1_2;

public class Human implements Call{

    String name;

    public Human(String name) {
        this.name = name;
    }

    @Override
    public void callCat(Cat cat) {
        cat.answer("кис-кис");
    }

}