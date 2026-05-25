package basics;

public class VariableDemo {

    int x = 10;
    static String name = "java";

    public static void main(String[] args) {
        VariableDemo m = new VariableDemo();
        VariableDemo n = new VariableDemo();

        m.x = 20;
        m.name = "angular";

        System.out.println(n.x);//10
        System.out.println(n.name);//angular

    }
}