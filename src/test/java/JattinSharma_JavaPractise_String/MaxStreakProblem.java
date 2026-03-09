package JattinSharma_JavaPractise_String;

import java.util.Arrays;
import java.util.List;

import org.testng.annotations.Test;

public class MaxStreakProblem {
	/*
	 * Jatin sharma sdet -> Day 17
	 */

	
	@Test
	public void handleMaxStreakProblem() {
		
		List<String> weekLogs = Arrays.asList("YYY","YNY","YYY","YYY","YYY");
		calculateMaxStreak(weekLogs);
		
		
	}

	public static void calculateMaxStreak(List<String> weekLogs) {
	
		int currentStrik = 0;
		int maxStreak = 0;
		
		for(String data: weekLogs) {
			System.out.println(data);
			if(!data.contains("N")) {
				currentStrik = currentStrik + 1;
				maxStreak = Math.max(currentStrik, maxStreak);
			}
			else {
				currentStrik = 0;
			}
		}
		System.out.println("Max Streak is : " + maxStreak);
	}
	
}
