import java.util.Scanner;

public class StringExercise {
    public static void main(String[] args) {


        System.out.println(getPower(4,4));


        Scanner sc = new Scanner(System.in);

        String input;



        do {
            System.out.println("Ask me a question");
            input = sc.next();


            if (input.equals("bye") || input.isEmpty()) {
                System.out.println("Fine Be That Way!");

            } else if (input.endsWith("?") || input.contains("?")) {
                System.out.println("sure");
            } else if (input.endsWith("!") || Character.isUpperCase(input.charAt(0))  && !input.isEmpty()) {
                System.out.println("Whoa Chill Out!!!");


            } else {
                System.out.println("Whatever");
            }


            System.out.println("Anything Else?");
            input = sc.next();
        } while (input.equals("yes") || input.equalsIgnoreCase("y"));
        System.out.println("See ya");
    }
    public static long getPower(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else if (exponent == 1) {
            return base;
        } else if (exponent == 2) {
            return base * base;
        }
        return base * getPower(base, exponent -1) ;
    }

}
