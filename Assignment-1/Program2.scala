// Problem Statement :-Accept one character from user and count number of occurences of that character
object Program2
{
	def main(args:Array[String]): Unit = 									//function header of main function return value is Unit(Void)
	{
		var cnt = 0;
		val str:String = scala.io.StdIn.readLine("Enter a string\n");		//Accepting one string
		println("Enter character");
		var ch:Char = scala.io.StdIn.readChar();							//Accepting one character
		for(c <- str)														//Loop header
		{
			if(ch == c)														//condition to check entered character and character in string is equal or not
			{
				cnt+=1;
			}
		}
		println("Number of occurence of character is : "+cnt);				//printing count of occurences
	}
}