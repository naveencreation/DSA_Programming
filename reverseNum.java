import java.util.*;
public class reverseNum {
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the Number You need to Reverse: ");
        int number = obj.nextInt();
        // Using Math
        int remainder =0;
        int result =0;
        while(number >0) {
            remainder = number % 10;
            result = result* 10 + remainder;
            number = number / 10;
        }
        System.out.println(result);
    }
}
