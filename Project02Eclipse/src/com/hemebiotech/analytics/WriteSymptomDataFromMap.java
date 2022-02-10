package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Simple e implementation
 *
 */
public class WriteSymptomDataFromMap implements ISymptomWriter {

	private Map<String,Integer> symptoms;
	private String filepath;
	
	/**
	 * 
	 * @param symptoms a Map in which each symptom is a key and is asociated to its occurence value.
	 * @return nothing
	 */
	public WriteSymptomDataFromMap (Map<String,Integer> symptoms, String filepath) {
		this.symptoms = symptoms;
		this.filepath = filepath;
	}
	
	@Override
	public void WriteSymptoms() {  
		try {
            FileWriter writer = new FileWriter (filepath);
			for(Entry<String, Integer> e : symptoms.entrySet()){
                writer.write(e.getKey() + "," + e.getValue() + "\n");    
                }
			writer.close(); 
            
		} catch (IOException e) {
			e.printStackTrace();
		}
		}
}


