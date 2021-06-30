package io.javabrains.unit2;

public class ThisReferenceExample {
    public static void main(String[] args) {
        ThisReferenceExample thisReferenceExample = new ThisReferenceExample();
        thisReferenceExample.doProcess(10, i -> {
            System.out.println(i);
//            System.out.println(this);
        });
        thisReferenceExample.execute();
    }

    public void execute() {
        //this reference points to instance of thisReferenceExample where execute method created
        doProcess(10, i -> {
            System.out.println(i);
            System.out.println(this);
        });
    }

    public void doProcess(int i, ProcessRef p) {
        p.processNew(i);
    }

    //override the this reference of the class
    public String toString(){
        return "this is this ref";
    }
}

interface ProcessRef {
    void processNew(int i);
}

