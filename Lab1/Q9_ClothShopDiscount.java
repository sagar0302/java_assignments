import java.util.Scanner;

public class ClothShopDiscount 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the purchase amount: ");
        double salesAmount = sc.nextDouble();

        double discountPercentage = 0.0;

        if (salesAmount <= 1000) 
	{
            discountPercentage = 10.0;
        } 
	else if (salesAmount > 1000 && salesAmount <= 1500) 
	{
            discountPercentage = 12.0;
        } 
	else 
	{
            discountPercentage = 15.0;
        }

        double discountAmount = (salesAmount * discountPercentage) / 100.0;

        double netAmount = salesAmount - discountAmount;

        System.out.println("Total Purchase Amount : Rs. " + salesAmount);
        System.out.println("Discount (" + discountPercentage + "%)     : Rs. " + discountAmount);
        System.out.println("Net Amount Payable    : Rs. " + netAmount);

	}
}