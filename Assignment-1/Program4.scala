// Problem Statement :- Create an array of strings and read string from user.Display all the elements of array containing given string
object Program4
{
	def main(args: Array[String]): Unit =							//function header of main function return value is Unit(Void) 
	{
		var i = 0;
		println("How many elements do you want ?");
		var no:Int = scala.io.StdIn.readInt();						//Accepting number of strings or size of an array
		var arr:Array[String] = new Array[String](no);				//Creating an array of string of perticular size(no)
		for(i <- 0 to (no-1))
		{
			println("Enter "+(i+1)+" string");
			arr(i) = scala.io.StdIn.readLine();						//Accepting strings and storing it into array 
		}
		println("-------------Entered array is-------------");
		for(i <- 0 to (no-1))
		{
			println(arr(i));										//printing array of strings
		}
	}
}