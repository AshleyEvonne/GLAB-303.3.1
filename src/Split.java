import java.util.Arrays;

public class Split {
    public static void main(String[] args) {
        String vowels = "a::b::c::d:e";

        //splitting the string at "::"
        //storing the result in an array of strings
        String[] result = vowels.split("::");

        //converting array to string and printing it
        System.out.println("result = " + Arrays.toString(result));
        //Here, we split the string at ::  Since the limit parameter is not passed, the returned array contains all the substrings.
    }
}
