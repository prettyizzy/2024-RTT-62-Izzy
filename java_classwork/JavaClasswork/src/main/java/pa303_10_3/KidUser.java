package pa303_10_3;

public class KidUser {
    protected int age;
    protected String bookType;


    //@Override
    public void registerAccount() {
        if (age <= 11) {
            System.out.println("You have successfully registered under a Kids Account.");
        } else {
            System.out.println("Sorry, age must be less than 12 to register as a kid.");
        }
    }

   // @Override
   // public void requestBook() {
   //     if (bookType == Kids){
   //         System.out.println("You have successfully registered under a Kids Account.");
    //    }

 //  }
}
