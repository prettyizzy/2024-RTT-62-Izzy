package playgroundddd;

public class Student {
    private static String name;
    static final double PI = 3.14159; //use final so the var can't be overridden, static is so that it's only in
    // one place

    public Student(String name){ //string param
        /* this is the constructor
         * is the same name as the class
         * it only runs once per object (when you instantiate an object)
         * */
        this.name = name; //this.name = refers
    }

    public String getName(){ //getter:
        return name;
    }

    //
    public void changeName(String name){ //setter: allows you to chan
        this.name = name;
    }

}
