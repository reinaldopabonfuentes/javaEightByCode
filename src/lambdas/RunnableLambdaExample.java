package lambdas;

public class RunnableLambdaExample {
    public static void main(String[] args) {
        /*
        * Prior to Java 8
        * Using an anonymous class
        * */
        Runnable runnable = new Runnable(){
            @Override
            public void run(){
                System.out.println("Inside runnable 1");
            }
        };

        new Thread(runnable).start();

        /*
        * java 8 Lambda
        *
        * */
        // () -> {}; Syntax of Lambda
        Runnable runnableLambda = () -> {
            System.out.println("Inside Runnable 2");
        };

        Runnable runnableLambda1 = () -> System.out.println("Inside Runnable 3"); // Creates a var and then pass it around

        new Thread(runnableLambda).start();
        new Thread(runnableLambda1).start();



        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Runnable 3.1");
            }
        });
        new Thread( () -> System.out.println("Inside Runnable 4") ).start();
    }


}
