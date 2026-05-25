package basics;

public class objectCounter {
    static int counter = 0;
//    int counter;

    objectCounter() {
        counter++;
    }
    public static void main (String[] args) {
        objectCounter o1 = new objectCounter();
        objectCounter o2 = new objectCounter();
        objectCounter o3 = new objectCounter();
        objectCounter o4 = new objectCounter();

        System.out.println(counter);
//        System.out.println(o4.counter);//1
    }
}
