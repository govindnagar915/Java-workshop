// write a program calculate simpel interest and
// all the value will be given by user
public class Si {

	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		
		System.out.println("Enter principal Amount:");
		int p = sc.nextInt();
		
		System.out.println("Enter interest rate:");
		int r =sc.nextInt();
		
		System.out.println("Enter time period :");
		int t =sc.nextInt();
		
		float i=(p*r*t)/100;
		System.out.println("simple Insterst is :"+i);
	}

}
