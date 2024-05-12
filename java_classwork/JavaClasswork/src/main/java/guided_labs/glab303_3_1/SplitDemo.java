package guided_labs.glab303_3_1;
import java.util.Arrays;

public class SplitDemo {
    public static void main(String[] args) {
        String vowels = "a::b::c::d:e";

        // splits the string at "::"; storing the result in an array of strings
        String[] result = vowels.split("::");

        // converting array to string and printing it
        System.out.println("result = " + Arrays.toString(result));
    }
}
