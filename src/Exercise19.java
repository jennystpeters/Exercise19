import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

public class Exercise19 {
    public static void main(String[] args) {

        char cont = 'y';

        Scanner entry = new Scanner(System.in);

        while(cont == 'y') {

            System.out.print("Enter a number: ");
            int firstNum = entry.nextInt();

            System.out.print("Enter another number: ");
            int secondNum = entry.nextInt();

            System.out.println(sumUp(entry, firstNum, secondNum));

            System.out.print("Would you like to continue (y/n)? ");
            entry.nextLine();
            cont = entry.nextLine().charAt(0);
        }
        System.out.println("Goodbye!");
    }

    private static String sumUp(Scanner entry, int firstNum, int secondNum) {
        int sum = 0;

        if (secondNum < firstNum) {
            firstNum = firstNum * secondNum;
            secondNum = firstNum / secondNum;
            firstNum = firstNum / secondNum;
        }

        for (int i = firstNum; i <= secondNum; i++) {
            sum = sum + i;
        }

        String result = "The sum of all the numbers from " + firstNum + " to " + secondNum + " is " + sum + ".";

        return result;
    }
}
