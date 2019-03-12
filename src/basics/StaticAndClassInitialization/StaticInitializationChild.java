package basics.StaticAndClassInitialization;

public class StaticInitializationChild extends StaticBlockAndClassInitializationBlock {

    int testint = 0;
    static int staticVar1 = 0;

    static {

        System.out.println("this is the child test inside static block");
    }

    {
        System.out.println("this is the child test inside initialization block");
    }

    StaticInitializationChild(int testint, int staticVar) {
        System.out.println(" this is the sout in child constructor");
        this.testint = testint;
        this.staticVar1 = staticVar;
    }


    public static void main(String[] args) {
        StaticInitializationChild s = new StaticInitializationChild(10, 20);
    }
}