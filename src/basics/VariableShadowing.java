package basics;

public class VariableShadowing {
    int x = 20;
    void show() {
        int x = 10;
        System.out.println(x);//10
        System.out.println(this.x);//20
    }
    public static void main(String[] args) {
        VariableShadowing vs = new VariableShadowing();
        vs.show();
    }
}
