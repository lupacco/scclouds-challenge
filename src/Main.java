public class Main {
    public static void main(String[] args) {

        int n = 11;

        System.out.println("Solução Linear:");
        int resultLinear = Fibonacci.linearSolution(n);
        if(resultLinear < 0) System.out.println("Valor inválido");
        else System.out.println("O "+n+"º elemento da sequencia de fibonacci é "+ resultLinear);
    }
}

