package matt.stack;

public class StackArray implements IStringStack {

    private String[] data;
    private int freeIndex;

    public StackArray(){
        data = new int[5];
        freeIndex = 0;
    }

    @Override
    public void add(String s) {
        data[freeIndex] = s;
        freeIndex++;
    }

    @Override
    public String get() {
    }

    @Override
    public void removeLast() {

    }
}
