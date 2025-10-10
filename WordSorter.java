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
		ArrayList <String> words = new ArrayList <String>();
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
			word = word.toLowerCase();
			System.out.println(word);
			words.add(word);
				
			
			
		}//end while
		for(int q = words.size()-1; q > 1; q--)
		{
			for(int w = q - 1; w > 0; w--)
			{
				if(words.get(q).equals(words.get(w)))
				{
					words.remove(q);
				}//end if
			}//end for
		}//end for

		ArrayList[]sorted = new ArrayList[26];
		for(int x = 0; x < sorted.length; x++)
		{
			sorted[x] = new ArrayList<String>();
			for(ArrayList temp: sorted)
			{
				temp.add(words.get(x).compareTo("a"), words.get(x));

				System.out.println(words.get(x));
			}//end for each
		}//end for
	}//end main
}//end class