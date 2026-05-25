package basics;

public class FinalVariable {

    static final double pi = 3.14;
    final String name;
//    final String name = "java";// throw error as it cannot be reassigned

    FinalVariable(String name) {
        this.name = name;
    }
    public static void main (String[] args) {
        FinalVariable fv = new FinalVariable("angular");
        System.out.println(fv.name);
        System.out.println(fv.pi);
    }

}
