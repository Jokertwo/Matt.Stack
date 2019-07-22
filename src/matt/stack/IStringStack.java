package matt.stack;

public interface IStringStack {
    void add(String s);
    String get();
    void removeLast();
    void expandArray(int capacity);
    void print();
}
