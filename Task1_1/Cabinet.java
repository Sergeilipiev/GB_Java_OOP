package Task1_1;

public class Cabinet implements Usage {
    private int width;
    private int height;
    private int depth;
    private int numberOfShelves;
    private boolean isOpen;

    public Cabinet(int width, int height, int depth, int numberOfShelves) {
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.numberOfShelves = numberOfShelves;
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

    @Override
    public void placeOnShelf(int shelfNumber, Family family) {
        if (!isOpen) {
            System.out.println("Шкаф закрыт, нельзя положить на полку.");
        } else if (shelfNumber > numberOfShelves) {
            System.out.println("Нет такой полки в шкафу.");
        } else {
            System.out.println(family.fio + " положил(а) что-то на полку " + shelfNumber);
        }
    }
}
