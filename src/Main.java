import java.util.*;

public class Main {
    public static void main(String[] args){
        List<Integer> list  = List.of(1,2,3,3,4);
        Map<String, Integer> New = FindAvr(list);
        System.out.println(New);
    }
    public static  Map<String, Integer> FindAvr(List<Integer> numbers){
        Map<String,Integer> slovar = new HashMap<>();
        int sum = 0;
        int len = 0;
        for ( int number:numbers){
            sum += number;
            len +=1;
        }
        int Max = Collections.max(numbers);
        int Min = Collections.min(numbers);
        slovar.put("Sum",sum);
        slovar.put("Avr",sum/len);
        slovar.put("max",Max);
        slovar.put("min",Min);
        return slovar;
    }

}