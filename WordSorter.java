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
		ArrayList[]sorted = new ArrayList[26];
		for (int x = 0; x < sorted.length; x++)
		{
			sorted[x] = new ArrayList <String>();
		}//end for
		

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
			for(int q = 0; q < words.size(); q++)
			{
				if(word.equals(words.get(q)))
				{
					words.remove(word);
				}//end if
			}//end for
			for(String temp: words)
			{
				sorted[temp.compareTo("a")].add(word);
			}//end for each
		}//end while
		int choice = 0;
		while(choice != 6)
		{
			System.out.println("Hello, you have the following options:");
			System.out.println("1. Print out all words starting with a specific letter  ");
			System.out.println("2. Print out all words ");
			System.out.println("3. Print out the total number of unique words  ");
			System.out.println("4. Search and determine if a word is in the article  ");
			System.out.println("5. Remove a word from the data structure  ");
			System.out.println("6. Exit");
			choice = in.nextInt();
			if(choice == 1)
			{

			}
			if(choice == 2)
			{

			}
			if(choice == 3)
			{

			}
			if(choice == 4)
			{

			}
			if(choice == 5)
			{

			}
		}//end while
		
		
	}//end main
}//end class