package matt.stack;

import java.util.Stack;

public class StackArray implements IStringStack {

    private StackNode last;

    public StackArray(){

    }

    @Override
    public void add(String s) {

        StackNode newStackNode = new StackNode();
        newStackNode.setData(s);

        if (last == null) {
            last = newStackNode;
        } else {
            newStackNode.setLast(last);
            last = newStackNode;
        }
    }

    @Override
    public String get() {
        return last.getData();
    }

    @Override
    public void removeLast() {
        if (last != null) {
            last = last.getLast();
        } else {
            System.out.println("Nothing in the queue...");
        }
    }

    public boolean isEmpty() {
        boolean isEmpty = false;

        if (last == null) {
            isEmpty = true;
        }

        return isEmpty;
    }
}
