//Meade Havenstein, Pd. 6, 10/9/25
//Objective: 
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
public class WordSorter 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in); 
		try
		{
			in = new Scanner(new File("article.txt"));	
		}
		catch(Exception e)
		{
			System.out.println("Cannot find file... Exiting Program");
			return;
		}	
		String word = "";
		while(in.hasNext())
		{
			word = in.next();
			word = word.replace(",", "");
			word = word.replace("(tm)", "");
			word = word.replace(")", "");
			word = word.replace("(", "");
			word = word.replace(".", "");
			word = word.replace("'s", "");
			word = word.replace(":", "");
			word = word.replace("!", "");
			word = word.replace("?", "");
			word = word.replace("'", "");
			word.toLowerCase();
			System.out.println(word);
			
			
		}//end while
		ArrayList <String> words = new ArrayList <String>();
		String temp = "";
		for(int i = 0; i < words.size() - 1; i++)
		{
			for(int x = i + 1; x < words.size(); x++)
			{
				if(words.get(i).compareTo(words.get(x)) > 0)
				{
					temp = words.get(i);
					words.remove(i);
					words.add(i + 1, temp);
					i--;
				}
			}//end for
		}//end for
	}//end main
}//end class