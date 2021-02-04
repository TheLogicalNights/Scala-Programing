// Problem Statement :- Write a program to count uppercase letters in a string and convert it to Lowercase and display the new String.
object Program1
{
	def main(args:Array[String]): Unit =								//function header of main function return value is Unit(Void)
	{
		val str:String = scala.io.StdIn.readLine("Enter a string\n");	//Accepting one string
		var cnt = 0;													//Counter for capital count
		for(c <- str)													//Loop header
		{
			if(c>='A' && c<='Z')										//Condition check for the capital character
			{
				cnt+=1;
			}
		}
		println("Number of capital characters are : "+cnt);				//printing capital count
		val lower:String = str.map(c => c.toLower);						//converting string to Lowercase
		println(lower);													//printing new string
	}
}