package ie.dit;
import java.util.ArrayList;
import java.io.*;

public class Tune {
	
	private static int x;
	private static String title;
	private static String altTitle;
	private static String notation;
	
	//Accessors
	public int getx()
	{
		return x;
	}
	public String gettitle()
	{
		return title;
	}
	public String getaltTitle()
	{
		return altTitle;
	}
	public String getnotation()
	{
		return notation;
	}
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		for (String word:words)
		{
			if(altTitle != null) {
				sb.append(x + ", " + title + ", " + altTitle);
			}
			else {
				sb.append(x + ", " + title + ", ");
			}
		}
		
		return sb.toString();
	}
}

public class TuneBook {
	
	private ArrayList<String> Tune = new ArrayList<String>();
	
	//Constructor
	public TuneBook(String fileName)
	{
		this.x = x;
		this.title = title;
		this.altTitle = altTitle;
		this.notation = notation;
			
		String fileName = "hnj0.abc";
        String line = null;

        try {
            FileReader fileReader = 
                new FileReader(fileName);

            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
               if (line.startsWith("T:"))
			   {
				   String s = line.subString(2);
				   title = s;
			   }
            }   

            bufferedReader.close();         
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileName + "'");
        }
	}
}