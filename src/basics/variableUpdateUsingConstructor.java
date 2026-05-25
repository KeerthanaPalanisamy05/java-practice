package basics;

public class variableUpdateUsingConstructor {
    int x = 10;
    static int y = 20;

    variableUpdateUsingConstructor(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static void main(String[] args) {
        variableUpdateUsingConstructor m = new variableUpdateUsingConstructor(2, 21);
        variableUpdateUsingConstructor n = new variableUpdateUsingConstructor(3, 22);

        System.out.println(m.x);//2
        System.out.println(n.x);//3

        System.out.println(m.y);//2
        System.out.println(n.y);//3
    }
}
