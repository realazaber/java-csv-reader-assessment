import java.io.BufferedReader;
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
			
			//Keep track of which line is being read.
			int lineCounter = 0;
			
			//Loop over each line if the line is not null.
			while ((line = reader.readLine()) != null) {
				
				if (lineCounter == 0) {
					//If it is the first line then 
					//just print "records:"
					System.out.println("records:");
				}
				else {				
					//Split each line with , into an array.
					String[] columns = line.split(",");
					
					//Print out line details and use array index to return
					//specific values.
					System.out.println("- name: " + columns[0] + " " + columns[1]);
					System.out.println("  details: In division " + columns[3] + 
									   "  from " + columns[2] + 
									   "  performing " + columns[5]);
				}
				lineCounter++;												
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