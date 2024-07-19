import java.util.ArrayList;
import java.util.List;

public class Prime {

    public static boolean isPrime(int number){
        int divisors = 0;

        for(int i = 1; i <= number; i++){
            if(number % i == 0) divisors += 1;
        }

        return divisors <= 2;
    }

    public static List<Integer> returnPrimesLinear(int n){
        List<Integer> result = new ArrayList<>();

        for(int i = 1; i <= n; i++){
            if(isPrime(i)) result.add(i);
        }

        return result;
    }
}
