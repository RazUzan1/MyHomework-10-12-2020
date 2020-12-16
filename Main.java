package com.company;

public class Main {
    //targil1
    public static void main (String [] args) {

        //System.out.println(pow(2,0));
        //System.out.println(palindrome(222));
        System.out.println(binary(10));
    }

    //targil 1
    public static int pow(int a, int b) {
        if (b == 1) {
            return a;
        }
        if (b == 0) {
            {
                return 0;
            }


        }
        return pow(a, b - 1) * a;
    }

    //targil 2
    //num=222
    public static boolean palindrome(int num){
        int x,sum=0,num1;

        num1=num;
        while(num > 0){
            x = num % 10;
             //System.out.println(x);
            sum = (sum * 10) + x;
            //System.out.println(sum);

            palindrome(num /= 10);
           // System.out.println(num);
        }
        if(num1 == sum)
            return true;
        else
            return false;

    }


    //targil 3
      private static String binary(int num){
        if (num == 0){
            return "0";
        }
        if (num == 1) {
            return "1";
        }
        else

            return binary(num/2) + num % 2;

      }
}









