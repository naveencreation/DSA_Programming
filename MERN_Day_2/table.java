import java.util.*;
public class table {
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter The Table You Need: ");
        int number = obj.nextInt();
        for(int i =1;i<=10;i++){
            System.out.println(number+" * "+ i+" = "+number*i);
        }
    }
}
