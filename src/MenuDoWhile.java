import java.util.Scanner;
import java.util.Random;
public class MenuDoWhile {
    public static void main(String[] args){
        Scanner capture = new Scanner(System.in);
        System.out.println("Welcome to the system :)!!!\n");
        int option;

        do {
            System.out.print("Please enter one of the following options:\n1. See an special message.\n2. Get a random number between the interval number you want.\n3. Count how many even numbers are in a numeric interval you set up.\n4. Exit.\nPlease enter your option... ");
            option = capture.nextInt();
            if (option != 1 && option != 2 && option !=3 && option !=4){
                System.out.println("\n❌Error❌\nYou have not entered a valid option within the menu, please try again 🐼\n");
            }
            switch (option){
                case 1:
                    System.out.println("You are never too old to set another goal or to dream a new dream.\n -C.S Lewis");
                    break;
                case 2:
                    Random rand = new Random();
                    System.out.print("Enter the first number of the numeric interval to calculate the random number... ");
                    int min = capture.nextInt();
                    int max;
                    do {
                        System.out.print("Enter the second number of the numeric interval to calculate the random number, between "+min+" and: ");
                        max = capture.nextInt();
                        if (max < min){
                            System.out.println("\n❌Error❌\nThe second number should be greater than the number you entered before ("+min+ ") please try again 🐼\n");
                        }
                    }while (max <min);
                    int randomNumber = rand.nextInt(max- min +1)+ min;
                    System.out.println("The random number between "+min+" and "+max+" is "+randomNumber+"\n");
                    break;
                case 3:
                    int counter = 0;
                    System.out.print("Enter the first number of the numeric interval to calculate how many even numbers there might be: ");
                    int num1 = capture.nextInt();
                    System.out.print("Enter the second number of the numeric interval to calculate how many even numbers there are from "+num1+" to: ");
                    int num2 = capture.nextInt();
                    for (int i=num1; i<=num2; i++){
                        if (i%2 == 0){
                            System.out.println("\nThe number "+i+" is an even number🐼.");
                            counter = counter+1;
                        }
                    }
                    System.out.println("\nBetween "+num1+" and "+num2+" there are "+counter+" even numbers.\n");
                    break;
                case 4:
                    System.out.println("You have successfully exited the system, come back soon!! 🐼\n");
                    break;
            }
        }while (option !=4);
        capture.close();
    }
}