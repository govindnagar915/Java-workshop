//Print the no . of weeks and remaining days from total no.of days.
public class WeeksDays {
	
	    public static void main(String[] args) {
	        int totalDays = 45;

	        int weeks = totalDays / 7;
	        int days = totalDays % 7;

	        System.out.println("Weeks = " + weeks);
	        System.out.println("Remaining Days = " + days);
	    }
	}
