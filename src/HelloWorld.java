import java.util.Scanner;

public class HelloWorld {


    public static void main(String[] args) {
        System.out.println("hello World");

//        int myFavoriteNumber = 3;
//        System.out.println(myFavoriteNumber);
//        String myString = "";
//        double myNumber = 3.14;
//
//        System.out.println(myNumber);

        {
            int x = 2;
            System.out.println(x++);
            System.out.println(x);
        }

        {
            int x = 4;
            System.out.println(++x);
            System.out.println(x);

        }


        {
            int x = 4;
            x = x + 5;
            System.out.println(x);

        }
        {
            int x = 3;
            int y =4;
            y = y * x;

            System.out.println(y);
        }
        {
            int x = 10;
            int y = 2;
            x = x/ y;
            y = y - x;

            System.out.println(x);
            System.out.println(y);
        }
        {
            String userInput;
            Scanner sc = new Scanner(System.in);

            System.out.println("enter something");
            userInput = sc.nextLine();
            System.out.println("---->  " + userInput + " <----");
        }
    }
}