
public class RunnableDemo {
    public static void main(String[] args) {

        // !! - Write an anonymous Runnable class here
        //It can just print out "Anonymous run" or similar
        Runnable anonRun = new Runnable() {
          public void run() {
            System.out.println("am i running?");
          }
        };

        anonRun.run();

        // !! - Write a lambda function here
        //It can also print out something like "Lambda run"
        Runnable lambdaRun = () -> {
          System.out.println("can i run?");
        };

        lambdaRun.run();

    }
}

//class myProgram implements Runnable {
//  public void run() {
//    System.out.println("and i run, i run so far away...");
//  }
//}
