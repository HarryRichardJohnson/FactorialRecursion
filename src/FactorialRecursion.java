import java.util.Scanner;

/**
 * Created by HarryJohnson on 30/06/2016.
 */
public class FactorialRecursion {

    public static int findFactorial(int i, int result){
        result *= i;
        if(i > 1){
            result = findFactorial((i - 1), result);
        }else if (i == 0){
            result = 1;
        }
            return result;
    }



    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a positive integer to find the factorial of:");
        int input = keyboard.nextInt();
        int result = 1;
        result = findFactorial(input, result);
        System.out.println(result);
    }
}