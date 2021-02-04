import scala.io.StdIn
object Hello
{
	def main(args:Array[String]): Unit =
	{
		println("Enter a number");
		var num : Int = scala.io.StdIn.readInt();
		println("Hello World..."+num);
	}
}