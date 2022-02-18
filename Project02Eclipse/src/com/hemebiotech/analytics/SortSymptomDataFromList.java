package com.hemebiotech.analytics;

import java.util.TreeMap;
import java.util.List;
import java.util.Map;

/**
 * Sorting using TreeMap
 *
 */
public class SortSymptomDataFromList implements ISymptomSorter {

	private List<String> symptoms;

	/**
	 * 
	 * @param symptoms the list of symptoms,
	 * @return a Map           
	 */
	public SortSymptomDataFromList(List<String> symptoms) {
		this.symptoms = symptoms;
	}

	@Override
	public Map<String,Integer> sortSymptoms() {
		Map<String,Integer> result = new TreeMap<>();
		
		if (symptoms != null) {
			try {
                for(String symptom : symptoms){ 
                	Integer i = result.putIfAbsent(symptom, 1);
                	if (i!= null) {
                		result.put(symptom, i+1);
                	}
                	//result.merge(symptom, 1, (v1,v2)->v1+1);
                	
                    /*if (result.containsKey(symptom)){
                        int v = result.get(symptom);
                        result.put(symptom, v+1);  
                    }
                    else{
                        result.put(symptom, 1);
                    }*/
                    
                	
                	

        
                }
			} catch(ClassCastException|NullPointerException | IllegalArgumentException |UnsupportedOperationException e) {
				e.printStackTrace();
				}
			
		}
		
		return result;
	}

}

