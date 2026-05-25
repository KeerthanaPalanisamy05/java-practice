package basics;

public class ObjectCounter {
    static int counter = 0;
//    int counter;

    ObjectCounter() {
        counter++;
    }
    public static void main (String[] args) {
        ObjectCounter o1 = new ObjectCounter();
        ObjectCounter o2 = new ObjectCounter();
        ObjectCounter o3 = new ObjectCounter();
        ObjectCounter o4 = new ObjectCounter();

        System.out.println(counter);
//        System.out.println(o4.counter);//1
    }
}
