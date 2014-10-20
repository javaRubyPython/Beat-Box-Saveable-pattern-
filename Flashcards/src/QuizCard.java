import java.io.*;
public class QuizCard implements Serializable{
	String question;
	String answer;
	public QuizCard(String question, String answer){
		this.question = question;
		this.answer = answer;
	}
	String getQuestion()
	{
		return question;
    }
	String getAnswer(){
		return answer;
	}
	
	public static void main(String[] args)
	{
		 try{
		 File myFile = new File("File.txt");
    	 FileReader fileReader = new FileReader(myFile); 
    	 BufferedReader reader = new BufferedReader(fileReader); 
         String line = null;  
         while ((line = reader.readLine()) != null) {  
             System.out.println(line);
         }  
         reader.close();  

     } catch(Exception ex) {  
         System.out.println("couldn't read the card file");  
         ex.printStackTrace();  
     } 
    	
	}
}
