// Problem Statement : Write a program to read two strings.Remove the occurence of second string in first string.
object Program3
{
	def main(args: Array[String]): Unit = 											//function header of main function return value is Unit(Void)
	{
		val str1:String = scala.io.StdIn.readLine("Enter first string\n");			//Accepting first string
		val str2:String = scala.io.StdIn.readLine("Enter second string\n");			//Accepting second string

		val newstr:String = str1.replaceAll(str2,"");								//replacind occurence of second string from first string
		print(newstr);																//printing new string
	}
}