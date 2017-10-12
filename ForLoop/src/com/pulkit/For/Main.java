package com.pulkit.For;

public class Main {

    public static void main(String[] args) {
        double amount =2596.36;
        for (int i = 1; i <=10 ; i++) {
            System.out.println(amount + " interest is calculated at "+ i + " % " + String.format("%.3f",calculateInt(amount,i)));
        }
        System.out.println("***************************");

        for (int i = 8; i >=2 ; i--) {
            System.out.println(amount + " interest is calculated at "+ i + " % " + String.format("%.2f",calculateInt(amount,i)));
        }

        int count =0;
        for (int i = 10; i <=100 ; i++) {
            if(isPrime(i))
            {
                count++;
                System.out.println(i + " is a prime number");
            }
            if(count ==3)
            {
                break;
            }


        }
    }
    public static double calculateInt(double amt, double interest)
    {
        return (amt *(interest/100));
    }
    public static boolean isPrime(int n)
    {
        if(n ==1)
        {
            return false;
        }
        for (int i = 2; i < (long)Math.sqrt(n) ; i++) {
            System.out.println("long is "+ (long)Math.sqrt(n));
            System.out.println("Looping "+i);
            if(n%i ==0){
                return false;

            }
        }
        return true;
    }

}

