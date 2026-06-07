package basics.dataTypes;

public class Casting {
    int x = 100;
    double y = x;
    public static void main (String[] args) {
        Casting cast = new Casting();
        System.out.println(cast.y);//100.0
    }
}
