package basics;

public class variableDemo {

    int x = 10;
    static String name = "java";

    public static void main(String[] args) {
        variableDemo m = new variableDemo();
        variableDemo n = new variableDemo();

        m.x = 20;
        m.name = "angular";

        System.out.println(n.x);//10
        System.out.println(n.name);//angular

    }
}