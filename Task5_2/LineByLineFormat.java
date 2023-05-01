package Task5_2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class LineByLineFormat implements DataImporter, DataExporter {
    @Override
    public List<Contact> importData(String filePath) {
        List<Contact> contacts = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] contactData = line.split(",");
                if (contactData.length == 2) {
                    String name = contactData[0].trim();
                    String phoneNumber = contactData[1].trim();
                    contacts.add(new Contact(name, phoneNumber));
                }
            }
        } catch (IOException e) {
            System.err.println("Ошибка чтения файла: " + e.getMessage());
        }
        return contacts;
    }

    @Override
    public void exportData(List<Contact> contacts, String filePath) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (Contact contact : contacts) {
                String contactLine = contact.getName() + ", " + contact.getPhoneNumber();
                writer.write(contactLine);
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println("Ошибка записи в файл: " + e.getMessage());
        }
    }
}
