package practice_assignments.pa305_5_1;

public class PredictFutureTuition {
    public static void main(String[] args) {
        double tuition = 10000;
        double doubledTuition = 20000;
        int years = 0;

        while (tuition <= doubledTuition) {
            tuition *= 1.07;
            years++;
            System.out.println("In " + years + " year(s), the tuition will be: " +  tuition);
        }

        System.out.println("In " + years + " years, the tuition will have doubled.");
    }
}
