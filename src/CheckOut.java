import java.util.Scanner;
public class CheckOut
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        boolean moreItems = false;
        double total = 0;
        do {
            double itemPrice = SafeInput.getRangedDouble(in, "What is the price of your item", .50, 10.00);
            total = total + itemPrice;
            moreItems = SafeInput.getYNConfirm(in, "Is there another item");
        } while (moreItems);
        System.out.printf("Your total is $%.2f%n", total);
    }
}
