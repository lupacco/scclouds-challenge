import java.util.ArrayList;
import java.util.List;

public class Prime {

    public static boolean isPrimeLinear(int number){
        int divisors = 0;

        for(int i = 1; i <= number; i++){
            if(number % i == 0) divisors += 1;
        }

        return divisors <= 2;
    }

    public static List<Integer> returnPrimesLinear(int n){
        validateInput(n);
        List<Integer> result = new ArrayList<>();

        for(int i = 2; i <= n; i++){
            if(isPrimeLinear(i)) result.add(i);
        }

        return result;
    }

    public static boolean isPrimeRecursive(int number, int divider, int divisors){
        if(divisors > 2) return false;

        if(number % divider == 0) divisors += 1;

        if(divisors == 2 && number == divider) return true;

        return isPrimeRecursive(number, divider + 1, divisors);

    }

    public static List<Integer> returnPrimesRecursive(int n){
        validateInput(n);
        List<Integer> result = new ArrayList<>();

        for(int i = 2; i <= n; i++){
            if(isPrimeRecursive(i, 1, 0)) result.add(i);
        }

        return result;
    }

    private static void validateInput(int n){
        if(n <= 1) throw new IllegalArgumentException("n deve ser maior que 1");
    }
}
