// Problem Statement : Write a program which accept one number from user and check whether that number is greater than 100 or not.

object Test
{
    def main(args:Array[String]) : Unit = 
    {
        var iNo = 0;
        println("Enter a number");
        iNo = scala.io.StdIn.readInt();
        if(iNo>100)
        {
            println("Greater than 100");
        }
        else
        {
            println("Smaller than 100");
        }
    }
}