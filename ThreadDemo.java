
class FibonacciThread1 extends Thread{
    int pos;
    public FibonacciThread1(int pos){
        this.pos = pos;
        this.setName("Thread 1");
        this.start();
    }

    @Override
    public void run() {
        int fib1 = 0, fib2 = 1;
        int fibonacci = 0;

        for (int i = 2; i <= pos; i++) {
        fibonacci = fib1 + fib2;
        fib1 = fib2;
        fib2 = fibonacci;
        }

        System.out.println("The Fibonacci number at position " + pos + " is: " + fibonacci);

    }
}


class FibonacciThread2 extends Thread{
    int pos,numberOfPositions;
    public FibonacciThread2(int pos, int numberOfPositions){
        this.pos = pos;
        this.numberOfPositions = numberOfPositions;
        this.setName("Thread 1");
        this.start();
    }

    @Override
    public void run() {
        int prevNum = 0, currNum = 1, nextNum;

        for (int i = 1; i <= numberOfPositions; i++) {
            if (i >= pos) {
                try{
                this.sleep(2000);
                }catch(InterruptedException e){
                    System.out.println(e);
                }
                System.out.print(currNum + " ");
            }
            nextNum = prevNum + currNum;
            prevNum = currNum;
            currNum = nextNum;
        }
    }
}
public class ThreadDemo {

    public static void main(String[] args) {
        FibonacciThread1 fib1 = new FibonacciThread1(2);
        System.out.println();
        FibonacciThread2 fib2 = new FibonacciThread2(2, 10);


        
    }
}
