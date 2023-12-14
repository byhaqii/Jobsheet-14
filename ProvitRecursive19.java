import java.util.Scanner;

public class ProvitRecursive19 {
static double calcuateProfit(double balance ,int period){
    if (period == 0 ) {
        return balance;
    }
    else{
        return 1.11*calcuateProfit(balance, period-1);
    }
}
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Input balance ");
    double initialBalance = scan.nextInt();
    System.out.println("Input Investment period : ");
    int investPeriod = scan.nextInt();

    System.out.println("Balance after " +investPeriod+ "year = "+calcuateProfit(initialBalance, investPeriod));
}    
}