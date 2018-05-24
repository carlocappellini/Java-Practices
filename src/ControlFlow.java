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


        for (int i = 0; i <= 100; i++) {



            if(i % 5 == 0 && i % 3 == 0){
                System.out.println("fizzBuzz" + " " + i);
            }
            if (i % 5 == 0) {
                System.out.println("Buzz" + " " + i);
            }

            if (i % 3 == 0 ){
                System.out.println("fizz" + " " + i);

            }


        }

    }
}
