package demo;

public class ExceptionHandlingDemo {

    public static void main(String[] args) {
        demo();

    }
    private static void demo() throws ArithmeticException {
            System.out.println("Hello World");
            throw new ArithmeticException("Stop there");
            //int i = 1/0;
            //System.out.println("Completed");
    }
}
