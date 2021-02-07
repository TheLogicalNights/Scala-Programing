// Problem Statement : Accept one number from user and check whether it is divisible by 5 or not

object divisible
{
  def main(args: Array[String]) : Unit = 
  {
    var iNo = 0;
    println("Enter a number");
    iNo = scala.io.StdIn.readInt();
    if((iNo%5)==0)
    {
      println(iNo+" is divisible by 5");
    }
    else
    {
      println(iNo+" is not divisible by 5");
    }
  }
}