import jdk.nashorn.internal.ir.IfNode;

import java.util.Scanner;

public class ControlStatementsAndLoops {

    public static void main(String[] args) {


//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Would you like to continue[y,n]");
//        String userInput = sc.next();
//
//        boolean confirm = userInput.equals("y");
//        System.out.println(userInput);
//        System.out.println(confirm);
//
//    }
//    {
//        boolean someBoolean = false;
//        boolean otherBoolean = true;
//
//
//        if (someBoolean){
//            System.out.println("some" + " " + someBoolean);
//        } else if(otherBoolean){
//            System.out.println("other" + " " + otherBoolean);
//        }
//        else{
//            System.out.println("nothing to return");
//    }
        {

            Scanner sc = new Scanner(System.in);


            System.out.println("enter a number 1 -4");
            int input;
            input = sc.nextInt();

//            int caseSwitch

            switch (input) {
                case 1:

                    System.out.println("case 1");
                    break;

                case 2:


                    System.out.println("case 2");
                    break;

                case 3:

                    System.out.println("case 3");
                    break;

                case 4:

                    System.out.println("case 4");
                    break;
                default:
                    System.out.println("default");
                    break;
            }
            {

                int number;
                System.out.println("enter a number 1-100");
                number = sc.nextInt();

                while (number <= 100) {
                    System.out.println(number);
                    break;
                }
                {


                    int i;


                    do {

                        System.out.println("put a number 20 or lower");
                        i = sc.nextInt();

                    } while (i >= 20);
                    System.out.println(i);
                }
                {
                    for (int i =0; i <= 10; i++){
                        System.out.println(i);
                    }
                }

            }

        }
    }
}