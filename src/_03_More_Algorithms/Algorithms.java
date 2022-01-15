package _03_More_Algorithms;

import java.util.List;

/*
 * Write your methods in this class
 */
public class Algorithms {

	public static String multiply(int num1, int num2) {
		int mult = num1 * num2;
		String multi = "" + num1 + " x " + num2 + " = " + mult;

		return multi;
	}

	static boolean isPrime(int n) {
		if (n <= 1)
			return false;
		for (int i = 2; i < n; i++)
			if (n % i == 0)
				return false;

		return true;
	}

	public static boolean isSquare(int n) {
		for (int i = 0; i < n / 2 + 2; i++) {
			if (i * i == n) {
				return true;
			}
		}
		return false;
	}

	public static boolean isCube(int n) {
		for (int i = 0; i < n / 3 + 2; i++) {
			if (i * i * i == n) {
				return true;
			}
		}
		return false;
	}

	public static int findBrokenEgg(List<String> eggs) {
		for (int i = 0; i < eggs.size(); i++) {
			if (eggs.get(i).equals("cracked")) {
				return i;
			}
		}
		return -1;
	}

	public static int countPearls(List<Boolean> oysters) {
		int pearl = 0;
		for (int i = 0; i < oysters.size(); i++) {
			if (oysters.get(i) == true) {
				pearl += 1;
			}
		}
		return pearl;
	}

	public static Double findTallest(List<Double> peeps) {
   	Double tallest = peeps.get(0);
    for( int i = 0; i < peeps.size(); i++ ) {
    	if(tallest < peeps.get(i)) {
               tallest = peeps.get(i);
            }
        }
       return tallest;
   }
	public static String findLongestWord(List<String> words) {
   	 	int longest = words.get(0).length();
   	 	int wordo = 0;
		for( int i = 0; i < words.size(); i++ ) {
            if( words.get(i).length() > longest ) {
                longest = words.get(i).length();
                wordo = i;
            }
        }
       return words.get(wordo);
   }
}
