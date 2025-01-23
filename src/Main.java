import java.util.*;

public class Main {
    public static void main(String[] args){
        List<Integer> list  = List.of(1,3,0,4,12);
        Map<String, Integer> New = FindAvr(list);
        Boolean ans = Palin(122111);
        Boolean ans1 = Palin("ama");
        System.out.println(ans);
        System.out.println(ans1);
        System.out.println(New);
    }
    public static Boolean Palin(int number){
        String str  = String.valueOf(number);

        return PalHelper(number,0,str.length()-1);
    }
    public static Boolean Palin(String number){
        return PalHelper(number,0,number.length()-1);
    }
    public static Boolean PalHelper(String str,int left,int right){
        String number = String.valueOf(str);
        if (left >= right){
            return true;
        }
        if (number.charAt(left)!=number.charAt(right)){
            return false;
        }
        return PalHelper(str,left +1,right-1);
    }

    public static Boolean PalHelper(int str,int left,int right){
        String number = String.valueOf(str);
        if (left >= right){
            return true;
        }
        if (number.charAt(left)!=number.charAt(right)){
            return false;
        }
        return PalHelper(str,left +1,right-1);
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
        int second_max = Integer.MIN_VALUE;
        int second_min = Integer.MAX_VALUE;
        for ( int number:numbers){
            if (number>second_max & number < Max){
                second_max = number;
            }
            if (number<second_min & number > Min){
                second_min = number;

            }
        }
        slovar.put("second_max",second_max);
        slovar.put("Second_min",second_min);
        return slovar;
    }

}