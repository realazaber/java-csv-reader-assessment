import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
	
	
	
	public static void main(String[] args) {
		String filePath = "records.csv";
		
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader(filePath));
			
		} catch (FileNotFoundException e) {
			System.out.println("Invalid file path: " + filePath);
		}

	}
}