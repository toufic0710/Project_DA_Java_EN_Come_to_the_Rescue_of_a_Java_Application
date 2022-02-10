package com.hemebiotech.analytics;

import java.util.Map;

/**
 * Sort symptoms the way we want
 * 
 * 
 * 
 */


public interface ISymptomSorter {
	/** 
	 * Associate a symptom and its number of occurence.
	 * 
	 * @return map in which each key is associated with its occurence value.
	 */
	Map<String, Integer> sortSymptoms ();
}
