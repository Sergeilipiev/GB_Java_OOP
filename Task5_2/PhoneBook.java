package Task5_2;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    private final List<Contact> contacts;
    private final DataImporter importer;
    private final DataExporter exporter;

    public PhoneBook(DataImporter importer, DataExporter exporter) {
        this.contacts = new ArrayList<>();
        this.importer = importer;
        this.exporter = exporter;
    }

    public void importContacts(String filePath) {
        contacts.addAll(importer.importData(filePath));
    }

    public void exportContacts(String filePath) {
        exporter.exportData(contacts, filePath);
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public List<Contact> getContacts() {
        return contacts;
    }


}
