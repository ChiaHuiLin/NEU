public class Main {
    public static void main(String[] args){
        System.out.println("Hello World");
        System.out.println(fib(10));

    }
    public static int fib(int n) {
        if (n <= 1) {
            return n;
        } else {
            n = fib(n-1) + fib(n-2);
            return n;
        }

    }
}
