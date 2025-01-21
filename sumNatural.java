import java.util.*;
public class sumNatural {
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int number = obj.nextInt();

        // Method using Loops
        int sum =0;
        for(int i =1;i<=number;i++){
            sum+=i;
        }
        System.out.println("Loop Based"+ sum);

        // Using Formula sum = (n*(n+1))/2
        int result = (number*(number+1))/2;
        System.out.println("Formula Based:"+ result);
    }
}
