public class ConcatMethod {
    public static void main(String[] args) {
        //The concat() method appends (concatenate) a string to the end of another string.

        String str1 = "Learn ";
        String str2 = "Java";

        //Concatenate str1 and str2
        System.out.println(str1.concat(str2));

        //Concatenate str2 and str1
        System.out.println(str2.concat(str1));

        //Bye using + operator
        String s3 = "Hello ";
        String s4 = "Learners";

        // String s5 =s3.concat(s4); or
        String s5 = s3 + s4;
        //Both above statements will give you the same result
        System.out.println(s5);

        //Three strings are concatenated
        String message = "Welcome " + "to " + "Java.";
        System.out.println(message);

        // String Chapter is concatenated with the number 2
        String s = "Chapter" +2; // s becomes chapter 2
        System.out.println(s);

        //String supplement is concatenated with character B
        String s1 = "Supplement" + 'B';
        System.out.println(s1);

    }
}
