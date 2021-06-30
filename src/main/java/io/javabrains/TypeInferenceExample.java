package io.javabrains;

public class TypeInferenceExample {
    public static void main(String[] args) {
        StringLengthLambda myLambda = (String s) -> s.length();
        System.out.println(myLambda.stringLength("hello world"));
    }
}


interface StringLengthLambda{
    int stringLength(String s);
}