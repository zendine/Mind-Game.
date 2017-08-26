package nyc.c4q;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Hey There!!!!.");
            System.out.println("Welcome to The Mind Mestry!.");
            System.out.println("My mission is to show you how I can guess your age by providing me with your name and your favorite number.");

            System.out.println("Go ahead anf enter your name: ");

            String input = scanner.next();
            System.out.println("Excelent.");
            System.out.println("Pick a number from 1 to 4: ");
            int num = scanner.nextInt();

            switch (num) {
                case 1:

                    System.out.println("Your age is your father's age % 2.");
                    break;


            }if(num == 2){
                System.out.println("Too bad I do not have time for YOU!!!!!!!");

            }


            while(num > 2 && num < 4){
                System.out.println("That number is TOTALY not aproprate for you. Sea YA!!!!!??!!!??!!!! ");
                num++;
            }



            for(int i = 4; i > 3; i--){
                System.out.println("Your feet stinks like OWWWWWWWWWWWWW!!!!.");
                System.out.println(" ^-^ ^-^");
                System.out.println("   ^-^");

            }


        }
}
