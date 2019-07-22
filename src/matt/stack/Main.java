package matt.stack;

import java.util.Random;

public class Main {

    public static void main(String[] args){

        String randomString = null;

        IStringStack stack = new StackArray();

        testStack(stack);
    }

    public static void testStack(IStringStack stack){

        String[] testArray = new String[100000];
        Random r = new Random();
        boolean equal = true;

        //String.valueOf(randomNumber);

        //Generate testArray
        for(int i = 0; i < 100000; i++) {
            testArray[i] = String.valueOf(Math.abs(r.nextInt()));
        }
        //Add testArray to the Stack
        for(int i = 0; i < 100000; i++) {
            stack.add(testArray[i]);
        }
        //See if the testArray and the Stack are equal
        for(int i = testArray.length - 1; i >= 0; i--) {
            if (!stack.get().equals(testArray[i])) equal = false;

            System.out.println(stack.get() + " " + testArray[i]);
            stack.removeLast();
        }

        System.out.println(equal);


    }
}
