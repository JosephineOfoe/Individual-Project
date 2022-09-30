import java.io.File; // import File class
import java.io.FileNotFoundException; // import FileNotFoundException class
import java.util.Scanner; // import the Scanner class 
import java.io.FileWriter; // import FileWriter class
import java.io.IOException; // import IOException class


public class Travelproblem { // an overall class named Travelproblem
  public static void main(String[] args){ // class method
    class Takeinput { // class for taking input from a file
        File file = new File("accra-winnipeg.txt"); } // file object
    try { //detecting any errors
      Scanner inputfile = new Scanner(file); // instance of the Scanner class
      while(inputfile.hasNextLine()) {
        System.out.println(inputfile.nextLine()); //display file content
      } 
      inputfile.close(); // close file 
    } 
      catch(FileNotFoundException fde) { // handle any errors
        fde.printStackTrace(); // display file contents to console

class Writeoutput {  // class for writing outputs to a file
}
    try {  // detecting any errors
      FileWriter outputfile = new FileWriter("accra-winnipeg_output.txt"); // writes to text file
      outputfile.write("Display flights and stops");
      outputfile.close();
      System.out.println("Successfully wrote to output text file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    } 
  }  
    {
    }
    
  }
}