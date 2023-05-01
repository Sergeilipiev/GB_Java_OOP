package Task7;

public class Cabinet implements CabinetOperations {
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

    @Override
    public void open() {
        this.isOpen = true;
    }

    @Override
    public void close() {
        this.isOpen = false;
    }

    @Override
    public boolean isOpen() {
        return isOpen;
    }
}