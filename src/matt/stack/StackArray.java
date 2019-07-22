package matt.stack;

public class StackArray implements IStringStack {

    private String[] data;
    private int freeIndex;
    private int capacity;

    public StackArray(){
        capacity = 5;
        data = new String[capacity];
        freeIndex = 0;
            }

    @Override
    public void add(String s) {

        if(freeIndex == data.length){
            expandArray(capacity * 2);
        }

        data[freeIndex] = s;
        freeIndex++;
    }

    @Override
    public String get() {
        return data[freeIndex - 1];
    }

    @Override
    public void removeLast() {
        data[freeIndex - 1] = null;
        freeIndex--;
    }

    @Override
    public void expandArray(int capacity) {

        //Set temp to new array with capacity of data(capacity*2)
        String[] temp = new String[capacity];

        //Copy the contents of the stack into the temp stack
        for (int i = 0; i < freeIndex; i++){
            temp[i] = data[i];
        }

        //update capacity and set data equal to temp
        this.capacity = capacity;
        data = temp;

    }

    @Override
    public void print(){
        for(int i = capacity - 1; i >= 0; i--){
            System.out.println(data[i]);
        }
    }
}
