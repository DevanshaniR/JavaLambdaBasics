package io.javabrains;

public class RunnableExample {
    public static void main(String [] args){
        Thread newThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("abc");
            }
        });

        newThread.run();
        Thread myLambdaThread = new Thread(() -> System.out.println("abc inline"));
        myLambdaThread.run();
    }
}
