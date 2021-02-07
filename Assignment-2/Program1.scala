// Problem Statement : Program to devide two numbers

object Devide
{
    def main(args:Array[String]) : Unit = 
    {
        var iDivision = 0;
        println("Enter first number");
        var iNo1 = scala.io.StdIn.readInt();
        println("Enter second number");
        var iNo2 = scala.io.StdIn.readInt();

        if(iNo2==0)
        {
            println("Error : Unable to devide with zero....");
        }
        else
        {
          iDivision = iNo1/iNo2;
          println("Division of "+iNo1+" and "+iNo2+" is : "+iDivision);
        }
    }
}