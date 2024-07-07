public class CompareTo {
    public static void main(String[] args) {
        //The compareTo() method compares two strings lexicographically.

        //The comparison is based on the Unicode value of each character in the strings.

        //The method returns 0 if the string is equal to the other string.
        // A value less than 0 is returned if the string is less than the other string
        // (less characters) and a value greater than 0 if the string is greater than the other string
        // (more characters).

        String s1 = "hello";
        String s2 = "hello";
        String s3 = "hemlo";
        String s4 = "flag";
        System.out.println(s1.compareTo(s2)); // 0 because both are equal
        System.out.println(s1.compareTo(s3)); // -1 because "l" is the only one time lower than "m"
        System.out.println(s1.compareTo(s4)); // 2 because "h" is the 2 times greater than "f"

        //The above program shows the comparison between the various Strings. Notice:
        //if s1 > s2, it returns a positive number.
        //if s1 < s2, it returns a negative number.
        //if s1 == s2, it returns 0.

    }
}
