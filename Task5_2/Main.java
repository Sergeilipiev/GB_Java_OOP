package Task5_2;

public class Main {
    public static void main(String[] args) {
        LineByLineFormat lineByLineFormat = new LineByLineFormat();
        PhoneBook phoneBook = new PhoneBook(lineByLineFormat, lineByLineFormat);

        // Импорт контактов из файла
        phoneBook.importContacts("src/contacts.txt");

        // Добавление нового контакта
        phoneBook.addContact(new Contact("Василий Петров", "+1234567890"));
        phoneBook.addContact(new Contact("Иван Петров", "+9234567890"));

        System.out.println(phoneBook.getContacts());

        // Экспорт контактов в файл
        phoneBook.exportContacts("src/exported_contacts.txt");
    }

}
