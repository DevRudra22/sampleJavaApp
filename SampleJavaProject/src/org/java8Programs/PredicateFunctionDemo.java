package org.java8Programs;

import java.util.Calendar;
import java.util.function.Predicate;

public class PredicateFunctionDemo {

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		int YEAR = now.get(Calendar.YEAR);
		int MONTH = now.get(Calendar.MONTH)+1;
		int arr[] = {YEAR, MONTH};
		Predicate<Integer> p = y -> y == 0;
		Predicate<Integer> p1 = m -> m == 0;
		//System.out.println(m1(p.and(p1), arr));
		if(m1(p.and(p1), arr)==false) {
			System.out.println("False");
		}
	}
private static boolean m1(Predicate<Integer> and, int[] arr) {
	boolean ret = false ;
	for(int arr1: arr) {
		if(and.test(arr1))
			ret = true;
	}
	return ret;
	}
}
