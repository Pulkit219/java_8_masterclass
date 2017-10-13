package com.pulkit.While;

public class Main {

    public static void main(String[] args) {
	int count =1;

	while(count!=6){
        System.out.println(count);
        count++;
    }
     //OR
        System.out.println("**************");
     while(true){
	    if(count == 9){
	        break;
        }
         System.out.println(count);
         count++;
     }
        System.out.println("***************");
     do {
         System.out.println("DOing one time exec"+ count);
         count++;
     }
     while (count !=14);

        System.out.println("******************");

     int num=5;
     int range =20;
     int counter=0;

     while (num<=range){
         if(!isEven(num)){
             num++;

         }
         else{
             System.out.println("even number " + num);
             num++;
             counter++;
             if(counter==5){
                 break;
             }
         }

     }
        System.out.println(counter +" are even numbers");

    }

    public static boolean isEven(int n){
        if(n%2 ==0)
        {
            return true;
        };
        return false;
    }
}
