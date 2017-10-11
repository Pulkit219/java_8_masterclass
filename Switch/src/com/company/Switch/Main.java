package com.company.Switch;

public class Main {

    public static void main(String[] args) {
        int value =4;
        switch(value){
            case 1:
                System.out.println("value is 1");
                break;

            case 2:
                System.out.println("value is 2");
                break;

            case 3:
                System.out.println("value is 3");
                break;

            case 4:case 5:case 6:
            System.out.println("could be 3 or 3 o5 ");
            System.out.println("this is "+ value);
            break;

            default:
                System.out.println("default case");
                break;
// if break is missing from one of the statements then it's gonna drop down to next case until break is seen.

        }

        char letter ='A';

        switch (letter){
            case 'a':    // it is case sensitive
                System.out.println("found a ");
                break;

            case 'B':
                System.out.println("found b");
                break;

            case 'C':
                System.out.println("found c ");
                break;

            default:
                System.out.println("default case");


        }

        String word ="Apple";

        switch (word.toLowerCase()){  //to lower case can be done
            case "apple":    // it is case sensitive
                System.out.println("found apple ");
                break;

            case "Banana":
                System.out.println("found banana");
                break;

            case "Carrot":
                System.out.println("found carrot ");
                break;

            default:
                System.out.println("default case");


        }

    }
}
