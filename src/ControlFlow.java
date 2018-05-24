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


        System.out.println("what number would you like to go up to");


        Scanner sc = new Scanner(System.in);
        int input;


        input = sc.nextInt();
        System.out.println(input);

        System.out.println("number | squared | cubed");

        System.out.println("-------|---------|------|");
       for(int i = 0; i <= input; i++){

           System.out.println(i + "      |   " + (
                   (i * i) + "     | " +
                   (i * i * i)));

       }






    }
}
