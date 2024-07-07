public class replace {
    public static void main(String[] args) {
        //The replace() method searches a string for a specified character,
        //and returns a new string where the specified character(s) are replaced.

        String str1 = "abc cba";

        // all occurrences of 'a' is replaced with 'z'
        System.out.println(str1.replace('a', 'z'));

        // all occurrences of 'L' is replaced with 'J'
        System.out.println("Lava".replace('L', 'J'));

        //Character not in the string
        System.out.println("Hello".replace('4', 'J'));

        //all occurrences of "C++" is replaced with "Java"
        System.out.println(str1.replace("C++", "Java"));

        //all occurrences of "aa" is replaced with "zz"
        System.out.println("aa bb aa zz".replace("aa","zz"));

        //substring not in the string
        System.out.println("Java".replace("C++", "C"));

        //: If the substring to be replaced is not in the string, replace() returns the original string.
    }
}
