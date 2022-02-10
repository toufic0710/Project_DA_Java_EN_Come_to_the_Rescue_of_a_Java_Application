package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

/*Main file which imports everything.
*
*
*
* entry : filepath
*@returns nothing (output file created)
*/

public class Main {
	public static void main(String args[]) throws Exception {
		
		AnalyticsCounter counter = new AnalyticsCounter(); 
		
		System.out.println("Reading symptoms from file symptoms.txt");
		List<String> symptoms = counter.read("symptoms.txt");
		System.out.println(symptoms.size() + " symptoms read.");
		
		System.out.println("Sorting and counting symptoms in a map");
		Map<String, Integer> sorted = counter.sortAndCount(symptoms);
		
		System.out.println("Writing result in output.txt");
		counter.write(sorted, "output.txt");
		System.out.println("Done");
	}
}
