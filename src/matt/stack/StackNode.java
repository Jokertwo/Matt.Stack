package matt.stack;

public class StackNode {

    private String data;
    private StackNode last;

    public String getData() { return data; }

    public StackNode getLast() { return last; }

    public void setData(String data) { this.data = data; }

    public void setLast(StackNode last) { this.last = last; }

}
