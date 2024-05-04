package classexamples;

public class StringExample {
    public static void main(String[] args) {
        String str = "String!";

        System.out.println("The length of the string = " + str.length());

        //you don't need to do all of this because java does it for you
        String lol = new String("Stuff!");


        //String are immutable; thus, they cannot be changed.

        String str2 = str.toUpperCase();

        System.out.println(str2);
        System.out.println(str.equals(str2));

        String filename = "Hello.java";


        System.out.println("The file name is " + filename + " and the length is " + filename.length());
        System.out.println("The period is at index " + filename.indexOf('k'));
    }
}
