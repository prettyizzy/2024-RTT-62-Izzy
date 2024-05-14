package playgroundddd;

public class BaySaidSo {
    public static void main(String[] args) {
        Student student1 = new Student("Paul");
        student1.changeName("Tom");
        Student student2 = new Student("Timmy");
        Student student3 = new Student("Pablito");
        System.out.println(student1.getName());

        System.out.println(student1.getName());
        System.out.println(student2.getName());
        System.out.println(student3.getName());
    }

}
