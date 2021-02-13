// Problem Statement :  Accept on number from user if number is less than 10 then print “Hello” otherwise print “Demo”

object Test
{
    def main(args:Array[String]) : Unit =
    {
        var iNo = 0;
        println("Enter a number");
        iNo = scala.io.StdIn.readInt();
        if(iNo<10)
        {
          println("Hello");
        }
        else
        {
          println("Demo");
        }
    }
}