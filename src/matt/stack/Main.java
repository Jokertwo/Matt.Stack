package matt.stack;

import java.util.Random;
import java.util.Stack;

public class Main {

    public static void main(String[] args){

        IStringStack stack = new StackArray();
        testStack(stack);
    }

    public static void testStack(IStringStack stack){

        String[] testArray = new String[100000];
        Random r = new Random();

        //String.valueOf(randomNumber);

        //Generate a bunch of nodes and add them to the stack one after another.
        for(int i = 0; i < 100000; i++) {
            testArray[i] = String.valueOf(Math.abs(r.nextInt()));
            stack.add(testArray[i]);
        }

        //See if the testArray and the Stack are equal
        for(int i = testArray.length - 1; i >= 0; i--) {

            if (!stack.isEmpty()) {
                System.out.println(stack.get() + " " + testArray[i]);
                stack.removeLast();
            }
        }

        System.currentTimeMillis();
    }

}
