package basics.StaticAndClassInitialization;

public class StaticBlockAndClassInitializationBlock {

    int testint = 0;
    static int staticVar1 =0;

    static {

        System.out.println("this is the test inside static block");
    }

    {
        System.out.println("this is the test inside initialization block");
    }

    StaticBlockAndClassInitializationBlock(int testint,int staticVar){
        System.out.println(" this is the sout in constructor");
        this.testint = testint;
        this.staticVar1 = staticVar;
    }

    StaticBlockAndClassInitializationBlock(){
        System.out.println(" this is the sout in parent default constructor");
    }

    public static void main(String[] args) {
        StaticBlockAndClassInitializationBlock s = new StaticBlockAndClassInitializationBlock(10,20);
    }
}
