package Task6;

public class CabinetUsage {
    private Cabinet cabinet;
    private boolean isOpen;

    public CabinetUsage(Cabinet cabinet) {
        this.cabinet = cabinet;
        this.isOpen = false;
    }

    public void open() {
        this.isOpen = true;
    }

    public void close() {
        this.isOpen = false;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void placeOnShelf(int shelfNumber, Family family) {
        if (!isOpen) {
            System.out.println("Шкаф закрыт, нельзя положить на полку.");
        } else if (shelfNumber > cabinet.getNumberOfShelves()) {
            System.out.println("Нет такой полки в шкафу.");
        } else {
            System.out.println(family.getFullName() + " положил(а) что-то на полку " + shelfNumber);
        }
    }
}
