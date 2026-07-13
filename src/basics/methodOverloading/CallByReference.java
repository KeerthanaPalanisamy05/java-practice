package basics.methodOverloading;
//The object's state changed because both references point to the same object.
class Student {
    String name;
}
public class CallByReference {

    static void change(Student s1) {
//        s1 = new Student();
        s1.name = "Java";
//        System.out.println(s1.name);//java
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.name = "avaJ";
        change(s);
        System.out.println(s.name);//Java

//        System.out.println(s.name);//avaJ

    }
}
// To overcome the object reference issue, create a seperate obj inside change method as s1
// and main will have seperate object as s