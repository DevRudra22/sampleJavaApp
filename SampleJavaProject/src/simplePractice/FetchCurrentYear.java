package simplePractice;

import java.util.Calendar;
import java.util.Scanner;

public class FetchCurrentYear {

	static Calendar cal = Calendar.getInstance();
	static int Month = cal.get(Calendar.MONTH)+1;
	static int selectedMon ;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter selected month: ");
		selectedMon = sc.nextInt();
		System.out.println("Selected month is: "+getCurrentMonth(selectedMon));
	}

	private static int getCurrentMonth(int selectedMon) {
		if(selectedMon > Month) 
			selectedMon = Month;
		return selectedMon;
	}

}
