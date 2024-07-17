public class Fibonacci {

    public static int recursiveSolution(int n){
        if(n < 0) return -1;
        if(n <= 1) return n;

        return 0;
    }

    public static int linearSolution(int n){
        if(n < 0) return -1;
        if(n <= 1) return n;

        int last = 0;
        int current = 1;
        int solution = 1;

        for(int i = 2; i <= n; i++){
            solution = current + last;
            last = current;
            current = solution;
        }

        return solution;
    }

    public static void printResult(int n, int result){
        if(result < 0) System.out.println("Valor inválido");
        else System.out.println("O "+n+"º elemento da sequencia de fibonacci é "+ result);
    }
}