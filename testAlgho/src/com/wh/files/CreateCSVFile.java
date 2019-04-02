package com.wh.files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.FileSystemNotFoundException;
import static com.wh.utilities.Utilities.ranAFP;
import static com.wh.utilities.Utilities.randDaylyWorkHours;
import static com.wh.utilities.Utilities.randRut;
import static com.wh.utilities.Utilities.randWages;
import static com.wh.utilities.Utilities.ranIsapre;

import com.wh.utilities.Utilities;

public class CreateCSVFile {

	public static void main(String[] args) throws IOException {
		
		try{
			File file = new File("D://datos.csv");
			
			FileWriter fw = new FileWriter(file);
		
			String separator = System.getProperty("line.separator");
			
			/**
			 * randRut()
			 * randDaylyWorkHours()
			 * randWages()
			 * ranIsapre()
			 * ranAFP()
			 */
			Utilities.randRut();
			Utilities.randDaylyWorkHours();
			Utilities.randWages();
			Utilities.ranIsapre();
			Utilities.ranAFP();
			
			
			for(int i =0;i<10;i++){
				fw.write(randRut()+","+randDaylyWorkHours()+","+randWages()+","+ranIsapre()+","+ranAFP()+separator);
			}
			
			fw.close();
			
		}catch(IOException e1){
			throw e1;
			
		}
		catch(FileSystemNotFoundException e){
			throw e;
		}
			
		
	}
	
}
