package basics.methodOverloading;

//methodOverloading - same method name, different parameter type, different no of parameter

public class MethodOverloading {
    int add (int a , int b) {//int - return type
        return a+b;
    }
    static double add (double a , double b) { //double - return type
        return a+b;
    }

//    int add (int x, int y) { error - not allowed.
//        return x+y;
//    }

    //parameter order is different
    void sum (int a, double b) {
        System.out.println(a+b);
    }
    void sum (double a, int b) {
        System.out.println(a+b);
    }

    public static void main (String[] args) {
        MethodOverloading mo = new MethodOverloading();
        System.out.println(mo.add(1,2));
        System.out.println(mo.add(1.6,1.6));
        System.out.println(add(1.3,2.4));//static so no obj needed to call the method

       //parameter order is different
        mo.sum(2,3.2);
        mo.sum(3.4,6);

    }
}

