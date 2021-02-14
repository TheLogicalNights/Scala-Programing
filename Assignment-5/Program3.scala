// Problem Statement : Write a program which accept two numbers and check whether numbers are equal or not. 

object Test
{
    def main(args:Array[String]) : Unit = 
    {
        var iNo1:Int = 0;
        var iNo2:Int = 0;
        println("Enter first number");
        iNo1 = scala.io.StdIn.readInt();
        println("Enter second number");
        iNo2 = scala.io.StdIn.readInt();
        if(iNo1==iNo2)
        {
            println("Equal.....");
        }
        else
        {
            println("Not Equal.....");
        }
    }
}