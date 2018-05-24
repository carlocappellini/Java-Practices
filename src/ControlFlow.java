import java.util.Scanner;

public class ControlFlow {
    public static void main(String[] args) {
//        int i = 5;

//        System.out.println(i);
//        while( i < 15){
//            i  = i+1;
//
//            System.out.println(i);
//
//
//        }
//        int j = 0;
//        do{
//
//
//            System.out.println(j = j+2);
//
//        } while (j < 100);
//
//


//        int i = 100;
//
//        System.out.println(i);
//        do{
//
//
//
//
//            i = i- 5;
//            System.out.println(i);
//
//
//
//
//
//        }while (i > 0);


//        for (int i = 0; i <= 100; i++) {
//
//
//
//            if(i % 5 == 0 && i % 3 == 0){
//                System.out.println("fizzBuzz" + " " + i);
//            }
//            if (i % 5 == 0) {
//                System.out.println("Buzz" + " " + i);
//            }
//
//            if (i % 3 == 0 ){
//                System.out.println("fizz" + " " + i);
//
//            }
//
//
//        }


//        System.out.println("what number would you like to go up to");
//
//
//        Scanner sc = new Scanner(System.in);
//        int input;
//
//
//        input = sc.nextInt();
//        System.out.println(input);
//
//        System.out.println("number | squared | cubed");
//
//        System.out.println("-------|---------|------|");
//       for(int i = 0; i <= input; i++){
//
//           System.out.println(i + "      |   " + (
//                   (i * i) + "     | " +
//                   (i * i * i)));
//
//       }


        Scanner sc = new Scanner(System.in);


        int input;

        String yes = "yes";


        do {
            String message = "What is your grade";
            System.out.println(message);
            input = sc.nextInt();

            if (input <= 100 && input >= 88) {
                System.out.println("grade A");


            }
            else if (input <= 87 && input >= 80) {
                System.out.println("grade b");
            }
           else if (input <= 79 && input >= 67) {
                System.out.println("grade c");

            }
           else if (input <= 66 && input >= 60) {

                System.out.println("grade d");

            }
            else if (input <= 59 && input >= 0) {
                System.out.println("grade f");

            } else {
                System.out.println("number out of reach");
            }


            System.out.println("you input this number " + input);


            System.out.println("would you like to continue");
            yes = sc.next();
        } while (yes.equals("y"));


    }

}
