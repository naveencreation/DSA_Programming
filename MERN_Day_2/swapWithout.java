public class swapWithout {
    public static void main(String args[]){
        int a = 5;
        int b = 10;

//  Using addition and subtraction
        a = a + b; // a = 15
        b = a - b; // b = 5
        a = a - b; // a = 10
        System.out.println("a = " + a + ", b = " + b);
    }
}
