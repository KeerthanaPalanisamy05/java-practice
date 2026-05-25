package basics;

public class VariableUpdateUsingConstructor {
    int x = 10;
    static int y = 20;

    VariableUpdateUsingConstructor(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static void main(String[] args) {
        VariableUpdateUsingConstructor m = new VariableUpdateUsingConstructor(2, 21);
        VariableUpdateUsingConstructor n = new VariableUpdateUsingConstructor(3, 22);

        System.out.println(m.x);//2
        System.out.println(n.x);//3

        System.out.println(m.y);//2
        System.out.println(n.y);//3
    }
}
