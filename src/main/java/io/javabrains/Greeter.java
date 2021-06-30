package io.javabrains;



interface MyAdd {
    int add(int x,int y);
}

public class Greeter {

    public static void main(String args[]) {
        Greeter greeter = new Greeter();
        HelloWorldGreeting helloWorldGreeting = new HelloWorldGreeting();
        greeter.greet(helloWorldGreeting);

        Greeting myLambdaExpression = () -> System.out.println("hello world");
        MyAdd addFunction = (int a, int b) -> a + b;

        Greeting innerclassGreeting = new Greeting() {
            @Override
            public void perform() {
                System.out.println("helloooooooooo");
            }
        };

        myLambdaExpression.perform();
        greeter.greet(myLambdaExpression);
        greeter.greet(innerclassGreeting);

    }

    public void greet(Greeting greeting) {
        greeting.perform();
    }
}
