package basics.variables;

public class ObjectReference {
    int salary;

    ObjectReference(int salary) {
        this.salary = salary;
    }
    // copy constructor
    ObjectReference(ObjectReference other) {
        this.salary = other.salary;
    }

    void show() {
        System.out.println(salary);
    }
    public static void main(String[] args) {
        ObjectReference o1 = new ObjectReference(50);
        ObjectReference o2 = new ObjectReference(o1);// Copy constructor
        ObjectReference o3 = o1;
//        No new object is created.
//        Both obj1 and obj3 refer to the same object in Heap memory.

        ObjectReference o4 = new ObjectReference(70);// added this to avoid confusion on copy constructor

        o1.show();
        o2.show();
        o3.show();
        o4.show();
//        o1 ---> Object A (salary=50)
//        o3 ---> Object A (salary=50)
//        o2 ---> Object B (salary=50)// Copy Constructor

        //modify data using one reference
        o1.salary = 60;

        o1.show();//60
        o2.show();//50
        o3.show();//60

    }
}

//| Purpose        | Java Way                          |
//        | -------------- | --------------------------------- |
//        | Same reference | `obj2 = obj1`                     |
//        | Shallow copy   | copy constructor         |
//        | Deep copy      | manual deep copy / Gson / Jackson |
