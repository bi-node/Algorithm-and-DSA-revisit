package lesson1.first;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
    public static void main(String[] args) {

        List<Integer> result=primeFactors(10);
        System.out.println(result);

    }

    public static List<Integer> primeFactors(int n)
    {
        List<Integer> result =new ArrayList<>();
        int factor=2;
        int x=n;
        while(x>1){
            if(x%factor==0) {
                result.add(factor);
                x/=factor;

            }
            else
            {
                factor++;
            }


        }


        return result;
    }



}
