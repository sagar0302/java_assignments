import java.time.*;

class AgeYear
{
	public static void main(String[] args)
	{
		LocalDate ld1 = LocalDate.now();
		System.out.println("Today's Date: " + ld1);

		LocalDate ld2 = LocalDate.of(2003,02,03);
		System.out.println("Date of Birth: " + ld2);

		System.out.println("Age is: " + Period.between(ld2, ld1).getYears() + " Years");
	}
}