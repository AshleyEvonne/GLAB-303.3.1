public class stringCompares {
    public static void main(String[] args) {
        //It is used in authentication (by equals() method), sorting (by compareTo() method), and reference matching (by == operator) etc.
        //There are three ways to compare String in Java:
        //By Using equals() Method.
        //By Using == Operator.
        //By compareTo() Method

        //equals() method
        String s1 = "PerScholas";
        String s2 = "PerScholas";
        String s3 =new String("PerScholas");
        String s4 = "Teksystem";

        System.out.println(s1.equals(s2)); //true
        System.out.println(s1.equals(s3)); //true
        System.out.println(s1.equals(s4)); // false

        // == operator method
        String str1 = "Perscholas";
        String str2 = "perscholas";
        String str3 =new String("Perscholas");

        System.out.println(str1==str2); // true because both refer to same instance
        System.out.println(str1==str3); // false because str3 refers to instance created in nonpool

        //The String class's compareTo() method compares values lexicographically. It returns an integer value that describes if the first string is less than, equal to, or greater than the second string.
        //// return 0 if this string is the same as another;
        //// <0 if lexicographically less than another; or >0


        //compareTo() Method
        String S1="Perscholas";
        String S2="Perscholas";
        String S3="Perschola";
        String S4="PerscholasX";
        System.out.println(S1.compareTo(S2)); //0
        System.out.println(S1.compareTo(S3)); // 1(because s1>s3)
        System.out.println(S1.compareTo(S4)); // -1(because s1<s4 )


    }
}
