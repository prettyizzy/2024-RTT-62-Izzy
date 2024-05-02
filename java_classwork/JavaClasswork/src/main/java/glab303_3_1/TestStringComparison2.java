package glab303_3_1;

public class TestStringComparison2 {
    public static void main(String[] args) {
        String s1 = "Perscholas";
        String s2 = "Perscholas";
        String s3 = new String("Perscholas");

        //true (because both refer to same instance)
        System.out.println(s1 == s2);

        //false(because s3 refers to instance created in nonpool)
        System.out.println(s1 == s3);
    }
}
