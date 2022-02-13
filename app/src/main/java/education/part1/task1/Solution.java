package education.part1.task1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws Exception {
        System.out.println("Введите год: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int year = Integer.parseInt(reader.readLine());
        isYearLeap(year);

    }

    public static boolean isYearLeap(int a){
        if(( a % 4 ) != 0){
           // System.out.println(a + " - это обычный год");
            return false;
        }else if((( a % 4 ) == 0 ) & (( a % 100 ) != 0 )){
            //System.out.println(a + " - это высокосный год!");
            return true;
        }else if((( a % 4 ) == 0 ) & (( a % 400 ) == 0 )){
            //System.out.println(a + " - это высокосный год!");
            return true;
        }else{
            //System.out.println(a + " - это обычный год :(");
            return false;
        }
    }
}
