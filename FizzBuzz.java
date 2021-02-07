import java.util.Scanner;
//Author: Simon Hausmaninger
// Version: 1
public class FizzBuzz
{
    public static void main(String[] args)
    {
        //variables we will be using
        Scanner scan = new Scanner(System.in);
        int fizz;
        int buzz;

        System.out.println("Enter Fizz Number (integer 1-100): ");
        fizz = scan.nextInt();
        while(fizz < 1 || fizz > 100)
        {
            System.out.println("Invalid! (Out of Range)");
            System.out.println("Enter Fizz Number (integer 1-100): ");
            fizz = scan.nextInt();
        }
        System.out.println("Enter Buzz Number (integer 1-100):");
        buzz = scan.nextInt();
        while(buzz == fizz)
        {
            System.out.println("Invalid! (Buzz Number cannot match Fizz Number)");
            System.out.println("Enter Buzz Number (integer 1-100):");
            buzz = scan.nextInt();
        }
        while(buzz < 1 || buzz > 100)
        {
            System.out.println("Invalid! (Out of Range)");
            System.out.println("Enter Buzz Number (integer 1-100):");
            buzz = scan.nextInt();
        }
    }
}
