package genericLibrary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {
	public static String getProperty(String key) {
		//step1:get the java representation of physical file
		FileInputStream fis=null;
		try {
			fis = new FileInputStream("./src/main/resources/CommonData.properties");
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
		//step2:create the object of properties class
		Properties pObj = new Properties();
		
		
		//step3: load key and values to the properties object
		
		try {
			pObj.load(fis);
		} catch(IOException e) {
			
///			e.printStackTrace();
			
		}
		//step4:Get the property
		return pObj.getProperty(key);
	}
	
	public static void main(String[] args) {
		System.out.println(getProperty("browser"));
	}
	
	//changes for github

}
