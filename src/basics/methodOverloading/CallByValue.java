package basics.methodOverloading;

public class CallByValue {
    //When you pass a primitive variable (int, double, char, etc.), Java copies the value.
    static void callByValue(int x) {
        x = 100;
    }
    // String Example
    static void callByValueString(String d) {
        d = "avaJ";
    }
    public static void main (String[] args) {
        int a = 10;
        callByValue(a);
        System.out.println(a);//10

        // String Example
        String name = "Java";
        callByValueString(name);
        System.out.println(name);//Java

    }
}
