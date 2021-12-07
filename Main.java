import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	
	
	
	public static void main(String[] args) {
		String filePath = "records.csv";
		
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader(filePath));
			String line = "";
			
			while ((line = reader.readLine()) != null) {
				
			}
			
		} 
		catch (FileNotFoundException e) {
			System.out.println("Invalid file path: " + filePath);
		}
		catch (IOException e) {
			System.out.println("IOException error");
		}
		catch (Exception e) {
			System.out.println("Unknown error");
			System.out.println("Error code: " + e);
		}

	}
}