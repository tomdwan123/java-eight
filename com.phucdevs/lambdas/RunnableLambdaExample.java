package lambdas;

public class RunnableLambdaExample {

    public static void main(String[] args) {

        /*
         * Prior java 8
         */
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Runnable 1");
            }
        };

        /*
         * java 8 lambda
         */
        Runnable runnableLambda1 = () -> {
            System.out.println("Inside Runnable 2");
        };

        Runnable runnableLambda2 = () -> System.out.println("Inside Runnable 3");

        Runnable runnableLambda3 = () -> {
            System.out.println("Inside Runnable 5.1");
            System.out.println("Inside Runnable 5.2");
        };

        new Thread(runnable).start();
        new Thread(runnableLambda1).start();
        new Thread(runnableLambda2).start();
        new Thread(() -> System.out.println("Inside Runnable 4")).start();
        new Thread(runnableLambda3).start();
    }
}
