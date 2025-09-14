import java.util.Scanner;

public class CheckEligibility 
{
    public static void main(String[] args) 
	{
        	Scanner scanner = new Scanner(System.in);

        	System.out.println("Enter the marks obtained in the three subjects:");

	        System.out.print("Mathematics: ");
        	int mathsMarks = scanner.nextInt();

        	System.out.print("Physics: ");
        	int physicsMarks = scanner.nextInt();

        	System.out.print("Chemistry: ");
        	int chemistryMarks = scanner.nextInt();

        	int totalMarks = mathsMarks + physicsMarks + chemistryMarks;
        	int totalMathsPhysics = mathsMarks + physicsMarks;

	        boolean isEligible1 = (mathsMarks >= 60 &&
         	                                physicsMarks >= 50 &&
                	                         chemistryMarks >= 40 &&
                        	                 totalMarks >= 200);

        	boolean isEligible2 = (totalMathsPhysics >= 150);

	        if (isEligible1 || isEligible2) 
		{
            		System.out.println("\nThe candidate is eligible!!");
        	} 
		else 
		{
            		System.out.println("\nThe candidate is not eligible!!");
        	}
    	}
}
