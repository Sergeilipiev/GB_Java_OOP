package Task7;

import Task1.Family;

public class Program {
    public static void main(String[] args) {

        Task1.Family Viktor = new Task1.Family("Максимов Виктор Петрович","1938-09-14");
        Task1.Family Elena = new Task1.Family("Максимова Елена Ивановна","1937-10-28");
        Task1.Family Vladimir = new Task1.Family("Максимов Владимир Викторович","1964-05-10");
        Task1.Family Serzh = new Task1.Family("Максимов Сергей Владимирович", "1989-03-06");

        Task1.Family Svetlana = new Task1.Family("Максимова Светлана Петровна","1964-10-25");
        Task1.Family Lidia = new Task1.Family("Михайлова Лидия Ивановна","1939-11-22");
        Task1.Family Petr = new Task1.Family("Михайлов Петр Иванович","1936-12-18");
        Task1.Family Ivan = new Family("Михайлов Иван Петрович", "1968-09-03");

        Viktor.addChild(Vladimir, Viktor, Elena);
        Elena.addChild(Vladimir, Viktor, Elena);

        Petr.addChild(Svetlana, Petr, Lidia);
        Lidia.addChild(Svetlana, Petr, Lidia);
        Petr.addChild(Ivan, Petr, Lidia);
        Lidia.addChild(Ivan, Petr, Lidia);

        Vladimir.addChild(Serzh, Vladimir, Svetlana);
        Svetlana.addChild(Serzh, Vladimir, Svetlana);

        Cabinet cabinet = new Cabinet(20, 30, 40, 4);
        cabinet.open();
        Svetlana.placeOnShelf(2, cabinet);
        cabinet.close();
    }
}