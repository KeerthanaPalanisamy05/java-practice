package basics.methodOverloading;

public class SubStringEx {
    public static void main (String[] args) {
        String name = "Java";
        System.out.println(name.substring(0));
        System.out.println(name.substring(2));//va
        //beginindex == length of string then ""
        System.out.println(name.substring(4));//""
        //begin Index == endIndex then ""
        System.out.println(name.substring(2,2));//""
        //end index not included
        System.out.println(name.substring(1,3));//av
        // -ve index/beginIndex or EndIndex >> length of string then StringIndexOutOfBoundsException
        System.out.println(name.substring(1,7));//error
    }
}
//| `charAt()`            | `substring()`           |
//| --------------------- | ----------------------- |
//| Returns one character | Returns a String        |
//| Return type: `char`   | Return type: `String`   |
//| Uses one index        | Uses one or two indexes |
