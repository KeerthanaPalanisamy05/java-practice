package basics;

public class AllVariables {

    // static variable
    // Stored in Method Area (Class Area)
    // Shared across all objects
    static String companyName = "abc";

    // instance variable
    // Stored inside object in Heap memory
    // Each object gets its own copy
    int salary;

    AllVariables(int salary) {

        // local variable 'salary'
        // Exists in Stack memory (constructor stack frame)

        // instance variable 'salary'
        // Stored in Heap memory inside object
        this.salary = salary;
    }

    void show() {

        // local variable
        // Stored in Stack memory
        String name = "xyz";

        System.out.println(name);
        System.out.println(companyName);
        System.out.println(this.salary);
    }

    public static void main(String[] args) {

        // reference variable 'av'
        // Stored in Stack memory

        // object created using new
        // Stored in Heap memory
        AllVariables av = new AllVariables(5000);

        av.show();
    }
}