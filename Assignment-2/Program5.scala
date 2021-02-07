// Problem Statement : Accept one number from user and print that number of * on screen.

object PrintStar
{
  def main(args:Array[String]) : Unit = 
  {
    var iNo = 0;
    println("Enter a number");
    iNo = scala.io.StdIn.readInt();
    for(i<- 1 to iNo)
    {
      print("*\t");
    }
  }
}