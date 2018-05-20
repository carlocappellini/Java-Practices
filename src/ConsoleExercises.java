import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.setOut;

public class ConsoleExercises {
    public static void main(String[] args) {
        int userInt;
        String userInput;
        String userInput2;
        String userInput3;
        String userInput4;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        userInt = sc.nextInt();
        System.out.println("you entered" + userInt);


        System.out.println("enter 3 words");
        userInput = sc.nextLine();
        userInput2 = sc.nextLine();
        userInput3 = sc.nextLine();
        userInput4 = sc.nextLine();




        System.out.println(userInput +" "+ userInput2 +" "+ userInput3 +" "+ userInput4);


        {


            double width;
            double length;

            Scanner scan = new Scanner(System.in);

            System.out.println(" please enter width");

            width = scan.nextInt();
            System.out.println(width);

            System.out.println("Please enter length");
            length = scan.nextInt();
            System.out.println(length);



            System.out.println("you area is "  + " " + ( width * length));

            System.out.println("and your perimeter is "+ " " + (width*2) + (length*2));;



        }

    }



}



