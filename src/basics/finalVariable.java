package basics;

public class finalVariable {

    static final double pi = 3.14;
    final String name;
//    final String name = "java";// throw error as it cannot be reassigned

    finalVariable(String name) {
        this.name = name;
    }
    public static void main (String[] args) {
        finalVariable fv = new finalVariable("angular");
        System.out.println(fv.name);
        System.out.println(fv.pi);
    }

}
