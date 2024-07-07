public class Substring {
    public static void main(String[] args) {
        //The substring() method returns a substring from the string.

        //If the end argument is not specified then the substring will end at the end of the string.

        String str1 = "Java is fun";
        //extract substring from index 0 to 3
        System.out.println(str1.substring(0,4));

        // indexOf Method
        int result;

        //getting index of character 's'
        result = str1.indexOf('s');

        System.out.println(result); // 6

        // getting index of character 'J'
        result = str1.lastIndexOf('J');
        System.out.println(result); // 0

        // the last occurrence of 'a' is returned
        result = str1.lastIndexOf('a');
        System.out.println(result); // 3

        // character not in the string
        result = str1.lastIndexOf('j');
        System.out.println(result); // -1

        // getting the last occurrence of "ava"
        result = str1.lastIndexOf("ava");
        System.out.println(result); // 1

        // substring not in the string
        result = str1.lastIndexOf("java");
        System.out.println(result); // -1



    }
}
