import java.time.*;

class DateDisp
{
	public static void main(String[] args)
	{
		LocalDate ld1 = LocalDate.now();
		System.out.println("Today's Date: " + ld1);

		LocalDate ld2 = ld1.minusDays(10);
		System.out.println("Before 10 days Date: " + ld2);

		LocalDate ld3 = ld1.plusDays(10);
		System.out.println("After 10 days Date: " + ld3);
	}
}