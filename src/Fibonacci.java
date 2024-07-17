public class Fibonacci {

    public static int recursiveSolution(int n){

        return 0;
    }

    public static int linearSolution(int n){
        if(n < 1) return -1;
        if(n == 1) return n;

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
}