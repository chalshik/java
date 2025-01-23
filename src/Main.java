import java.util.*;

public class Main {
    public static void main(String[] args){
        List<Integer> list  = List.of(1, 3, 0, 4, 12);
        Map<String, Integer> New = FindAvr(list);
        Boolean ans = Palin(122111);
        Boolean ans1 = Palin("ama");
        System.out.println(ans);
        System.out.println(ans1);
        System.out.println(New);
    }


    public static Boolean Palin(Object input){
        String str = String.valueOf(input);
        return PalHelper(str, 0, str.length() - 1);
    }


    public static Boolean PalHelper(String str, int left, int right){
        if (left >= right){
            return true;
        }
        if (str.charAt(left) != str.charAt(right)){
            return false;
        }
        return PalHelper(str, left + 1, right - 1);
    }


    public static Map<String, Integer> FindAvr(List<Integer> numbers){
        Map<String, Integer> stats = new HashMap<>();
        int sum = 0;
        int len = numbers.size();
        for (int number : numbers){
            sum += number;
        }
        int max = Collections.max(numbers);
        int min = Collections.min(numbers);
        stats.put("Sum", sum);
        stats.put("Avg", sum / len);
        stats.put("max", max);
        stats.put("min", min);

        int secondMax = Integer.MIN_VALUE;
        int secondMin = Integer.MAX_VALUE;
        for (int number : numbers){
            if (number > secondMax && number < max){
                secondMax = number;
            }
            if (number < secondMin && number > min){
                secondMin = number;
            }
        }
        stats.put("second_max", secondMax == Integer.MIN_VALUE ? null : secondMax);
        stats.put("second_min", secondMin == Integer.MAX_VALUE ? null : secondMin);

        return stats;
    }
}
