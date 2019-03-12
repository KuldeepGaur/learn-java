package basics.StaticConcept;

public class StaticKeywords {
    int nonStatic = 0;
    static  int staticInt = 0;

    StaticKeywords(int nonStatic , int staticInt){
        this.nonStatic = nonStatic;
        this.staticInt = staticInt;
    }

    public static void main(String[] args) {
        StaticKeywords instance1 = new StaticKeywords(10,10);
        StaticKeywords instance2 = new StaticKeywords(20,20);

        System.out.println(instance1.nonStatic +" "+ staticInt);
        System.out.println(instance2.nonStatic +" "+ staticInt);

    }

}
