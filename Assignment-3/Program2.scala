// Problem Statement : Accept one number from user and print that number of * on screen.

object Pattern
{
    def main(args:Array[String]) : Unit =
    {
        var iNo = 0;
        println("Enter a number");
        iNo = scala.io.StdIn.readInt();
        while(iNo>0)
        {
            print("*\t");
            iNo-=1;
        }
        println();
    }
}