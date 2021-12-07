import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	
	
	
	public static void main(String[] args) {
	
		//Filepath
		String filePath = "records.csv";
		
			
		try {
			//Reader.
			BufferedReader reader = new BufferedReader(new FileReader(filePath));
			
			//Variable for temporarily storing each line.
			String line = "";
			
			//Loop over each line if the line is not null.
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
			
		} 
		
		//Handle Exceptions.
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