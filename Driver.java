import java.util.Scanner;


public class Driver 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(Driver.class.getResourceAsStream("input.dat"));
		String fileContents = "";
		while(input.hasNextLine())
		{
			fileContents += input.nextLine();
		}
		System.out.println(fileContents);
	}
}
