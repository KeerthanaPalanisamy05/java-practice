package basics.dataTypes;

public class Casting {
    //implicit casting
    int x = 100;
    double y = x;

    //explicit casting
    double d = 99.99;
    int i = (int) d;

    int data = 65;
    char a = (char) data;

    int data1 = -65;//unknown char will be printed no error will be thrown


    public static void main (String[] args) {
        Casting cast = new Casting();
        System.out.println(cast.y);//100.0
        System.out.println(cast.i);//99
        System.out.println(cast.a);//99

    }
}
