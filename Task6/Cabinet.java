package Task6;

public class Cabinet {
    private int width;
    private int height;
    private int depth;
    private int numberOfShelves;

    public Cabinet(int width, int height, int depth, int numberOfShelves) {
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.numberOfShelves = numberOfShelves;
    }

    public int getNumberOfShelves() {
        return numberOfShelves;
    }
}
