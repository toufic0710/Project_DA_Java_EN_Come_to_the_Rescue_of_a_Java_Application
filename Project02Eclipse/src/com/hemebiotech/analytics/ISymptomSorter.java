package com.hemebiotech.analytics;

import java.util.Map;

/**
 * Sort symptoms needed
 * 
 * 
 * 
 */


public interface ISymptomSorter {
	/**
	 * Take a list in entry
	 * 
	 * @return map in which each key is associated with its occurence value.
	 */
	Map<String, Integer> sortSymptoms ();
}
