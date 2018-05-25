import java.util.Scanner;

public class StringExercise {
    public static void main(String[] args) {






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
}
