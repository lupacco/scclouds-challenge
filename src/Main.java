public class Main {
    public static void main(String[] args) {

        int n = 15;

        System.out.println("Solução Linear:");
        long resultLinear = Fibonacci.linearSolution(n);
        Fibonacci.printResult(n, resultLinear);

        System.out.println("Solução Recursiva:");
        long start = System.currentTimeMillis();
        long resultRecursive = Fibonacci.recursiveSolution(n);
        Fibonacci.printResult(n, resultRecursive);
        long end = System.currentTimeMillis();

        System.out.println("Tempo de execução: "+ (end - start));


        System.out.println("Solução linear primos:");
        System.out.println(Prime.returnPrimesLinear(50));

        System.out.println("Solução recursiva primos:");
        System.out.println(Prime.returnPrimesRecursive(50));



    }
}

