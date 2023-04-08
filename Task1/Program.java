package Task1;

public class Program {
    public static void main(String[] args) {

        Family Viktor = new Family("Максимов Виктор Петрович","1938-09-14");
        Family Elena = new Family("Максимова Елена Ивановна","1937-10-28");
        Family Vladimir = new Family("Максимов Владимир Викторович","1964-05-10");
        Family Serzh = new Family("Максимов Сергей Владимирович", "1989-03-06");

        Family Svetlana = new Family("Максимова Светлана Петровна","1964-10-25");
        Family Lidia = new Family("Михайлова Лидия Ивановна","1939-11-22");
        Family Petr = new Family("Михайлов Петр Иванович","1936-12-18");
        Family Ivan = new Family("Михайлов Иван Петрович", "1968-09-03");

        Viktor.addChild(Vladimir, Viktor, Elena);
        Elena.addChild(Vladimir, Viktor, Elena);

        Petr.addChild(Svetlana, Petr, Lidia);
        Lidia.addChild(Svetlana, Petr, Lidia);
        Petr.addChild(Ivan, Petr, Lidia);
        Lidia.addChild(Ivan, Petr, Lidia);

        Vladimir.addChild(Serzh, Vladimir, Svetlana);
        Svetlana.addChild(Serzh, Vladimir, Svetlana);


//        System.out.println(Svetlana);

        Cabinet cabinet = new Cabinet(20,30, 40, 4);
        cabinet.open();
        cabinet.placeOnShelf(2, Svetlana);
        cabinet.close();
    }
}
