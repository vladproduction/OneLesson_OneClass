package Clone.app01.solution;

public class MyPhoneSolutionInfo {
    private int size;
    private String color;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "TvInfo{" +
                "size=" + size +
                ", color='" + color + '\'' +
                '}';
    }
}
