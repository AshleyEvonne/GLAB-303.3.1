public class Contains {
    public static void main(String[] args) {

        //The contains() method checks whether a string contains a sequence of characters.

        //Returns true if the characters exist and false if not.

        String str1 = "Learn Java";
        boolean result;

        //check if str1 contains "Java"
        result = str1.contains("Java");
        System.out.println(result); //true

        //check if str1 contains "Python"
        result = str1.contains("Python");
        System.out.println(result); //false

        //check if str1 contains ""
        result = str1.contains("");

        System.out.println(result); // true
    }
}
