public class Fibonacci {

    public static long recursiveSolution(int n){
        if(n < 0) return -1;
        if(n <= 1) return n;

        return recursiveSolution(n -1) + recursiveSolution(n - 2);
    }

    public static long linearSolution(int n){
        if(n < 0) return -1;
        if(n <= 1) return n;

        long last = 0;
        long current = 1;
        long solution = 1;

        for(int i = 2; i <= n; i++){
            solution = current + last;
            last = current;
            current = solution;
        }

        return solution;
    }

    public static void printResult(int n, long result){
        if(result < 0) System.out.println("Valor inválido");
        else System.out.println("O "+n+"º elemento da sequencia de fibonacci é "+ result);
    }
}