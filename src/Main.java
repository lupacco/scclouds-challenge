public class Main {
    public static void main(String[] args) {

        int n = 30;

        System.out.println("Solução Linear:");
        int resultLinear = Fibonacci.linearSolution(n);
        Fibonacci.printResult(n, resultLinear);

        System.out.println("Solução Recursiva:");
        int resultRecursive = Fibonacci.recursiveSolution(n);
        Fibonacci.printResult(n, resultRecursive);
    }
}

