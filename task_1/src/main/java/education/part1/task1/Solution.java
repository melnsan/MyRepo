package education.part1.task1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws Exception {
        System.out.println("You are going to determine if year is leap?");
        System.out.println("Please enter year:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int y = Integer.parseInt(reader.readLine());
        Solution object = new Solution();
        boolean year = object.isYearLeap(y);
        if(year){
            System.out.println(y + " is leap year!");
        }else {
            System.out.println(y + " is not leap year ");
        }
    }

    public boolean isYearLeap(int a){
        boolean x;
       if(( a % 4 ) != 0){
           x = false;
        }else if(a % 100 != 0){
           x =  true;
        }else if(a % 400 == 0){
           x =  true;
        }else{
           x =  false;
        }
       return x;
    }
}
