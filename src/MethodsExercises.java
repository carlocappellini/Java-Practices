public class MethodsExercises {

    public static void main(String[] args) {
        addition(5, 5);
        substraction(9, 5);
        System.out.println( multiplication(2,20));
        division(40, 2);


    }


    public static double addition(double x, double y) {
        System.out.println(x + y);
        return x + y;

    }

    public static double substraction(double x, double y) {
        System.out.println(x - y);
        return x - y;
    }

    public static double multiplication(double x, double y) {
        if (x == 0 || y == 0) {
            return 0;
        }

        else if( x < 0 ) {
            return - x + multiplication(x, y + 1);
        }

        else {
            return x + multiplication(x, y - 1);
        }

}





    public static double division(double x, double y) {
        System.out.println(x / y);
        return x / y;
    }

}